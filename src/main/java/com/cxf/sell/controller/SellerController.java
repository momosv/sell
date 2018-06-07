package com.cxf.sell.controller;

import com.cxf.sell.VO.*;
import com.cxf.sell.controller.base.BasicController;
import com.cxf.sell.dataobject.*;
import com.cxf.sell.dataobject.base.BasicExample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SellerController extends BasicController {

/*    @Autowired
    private SellerService sellerService;*/

    @RequestMapping("/goods")
    public Object getGoodList(String sellerId) throws Exception {
        //获得类目
        BasicExample exa = new BasicExample(ProductCategoryVO.class);
        exa.createCriteria().andVarEqualTo("seller_id",sellerId);
        List<ProductCategoryVO> pList =  basicService.selectByExample(exa);
        Map<String,ProductCategoryVO> pMap = new HashMap<>();
        List<String> pIds= new ArrayList<>();
        for (ProductCategoryVO category : pList) {
            pIds.add(category.getCategoryId());
            pMap.put(category.getCategoryId(),category);
        }
        //获得商品
        BasicExample infoExa = new BasicExample(ProductInfoVO.class);
        infoExa.createCriteria().andVarIn("category_id",pIds);
        List<ProductInfoVO> infoList = basicService.selectByExample(infoExa);
        Map<String,ProductInfoVO> infoMap = new HashMap<>();
        List<String> infoIds= new ArrayList<>();
        for (ProductInfoVO info : infoList) {
            infoIds.add(info.getProductId());
            infoMap.put(info.getProductId(),info);
            ProductCategoryVO pVO= pMap.get(info.getCategoryId());
            if(null != pVO.getProductInfoVOList()){
                pVO.getProductInfoVOList().add(info);
            }else {
                List<ProductInfoVO> list = new ArrayList<>();
                list.add(info);
                pVO.setProductInfoVOList(list);
            }
        }
        //获得评论
        BasicExample rateExa = new BasicExample(RatingVO.class);
        rateExa.createCriteria().andVarIn("product_id",infoIds);
        List<RatingVO> rating = basicService.selectByExample(rateExa);
        for (RatingVO rate : rating) {
            ProductInfoVO pVO= infoMap.get(rate.getProductId());
            if(null != pVO.getRatings()){
                pVO.getRatings().add(rate);
            }else {
                List<RatingVO> list = new ArrayList<>();
                list.add(rate);
                pVO.setRatings(list);
            }
        }
        return  successMsg().add("goods",pList);

    }


    @RequestMapping("/ratings")
    public Object getSellerRating(String sellerId) throws Exception {
        BasicExample exa = new BasicExample(RatingVO.class);
        exa.createCriteria().andVarEqualTo("seller_id",sellerId);
        List<RatingVO> rList =  basicService.selectByExample(exa);
        return successMsg().add("ratings",rList);
    }

    @RequestMapping("/seller")
    public Object getSellerInfo(String sellerId) throws Exception {
        //获得商家详情
        SellerInfoVO seller = (SellerInfoVO) basicService.selectByPrimaryKey(SellerInfoVO.class,sellerId);
        if(seller == null){
            return failMsg("商家不存在");
        }
        //获取活动
        BasicExample exa = new BasicExample(SellerActivityVO.class);
        exa.createCriteria().andVarEqualTo("seller_id",sellerId);
        List<SellerActivityVO> sList =  basicService.selectByExample(exa);
        seller.setSupports(sList);
        return successMsg().add("seller",seller);
    }

}
