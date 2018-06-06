package com.cxf.sell.controller;

import com.cxf.sell.controller.base.BasicController;
import com.cxf.sell.dataobject.ProductCategory;
import com.cxf.sell.dataobject.ProductInfo;
import com.cxf.sell.dataobject.Rating;
import com.cxf.sell.dataobject.SellerInfo;
import com.cxf.sell.dataobject.base.BasicExample;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Object getSellerInfo(String sellerId) throws Exception {
        //获得类目
        BasicExample exa = new BasicExample(ProductCategory.class);
        exa.createCriteria().andVarEqualTo("seller_id",sellerId);
        List<ProductCategory> pList =  basicService.selectByExample(exa);
        List<String> pIds= new ArrayList<>();
        for (ProductCategory category : pList) {
            pIds.add(category.getCategoryId());
        }
        //获得商品
        BasicExample infoExa = new BasicExample(ProductInfo.class);
        infoExa.createCriteria().andVarIn("category_Id",pIds);
        List<ProductInfo> infoList = basicService.selectByExample(infoExa);
        Map<String,List<ProductInfo>> infoMap = new HashMap<>();
        List<String> infoIds= new ArrayList<>();
        for (ProductInfo info : infoList) {
            infoIds.add(info.getProductId());
            if(infoMap.containsKey(info.getCategoryId())){
                infoMap.get(info.getProductId()).add(info);
            }else {
                List<ProductInfo> l = new ArrayList<>();
                l.add(info);
                infoMap.put(info.getCategoryId(),l);
            }
        }
        //获得评论
        BasicExample rateExa = new BasicExample(Rating.class);
        infoExa.createCriteria().andVarIn("product_Id",infoIds);
        List<Rating> rating = basicService.selectByExample(infoExa);
        Map<String,List<Rating>> rateMap = new HashMap<>();
        for (Rating rate : rating) {
           if(rateMap.containsKey(rate.getProductId())){
               rateMap.get(rate.getProductId()).add(rate);
           }else {
               List<Rating> l = new ArrayList<>();
               l.add(rate);
               rateMap.put(rate.getProductId(),l);
           }
        }


        return  null;

    }


    @RequestMapping("/ratings")
    public Object getGoods(String sellerId) throws Exception {
        BasicExample exa = new BasicExample(SellerInfo.class);

        exa.createCriteria().andVarIn("seller_id",sellerId);

        List<Rating> rList =  basicService.selectByExample(exa);

        return successMsg().add("ratings",rList);
    }

}
