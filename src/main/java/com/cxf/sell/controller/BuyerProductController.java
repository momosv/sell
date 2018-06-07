//package com.cxf.sell.controller;
//
//import com.cxf.sell.VO.ProductVO;
//import com.cxf.sell.VO.ResultVO;
//import com.cxf.sell.dataobject.ProductCategory;
//import com.cxf.sell.dataobject.ProductInfo;
//import com.cxf.sell.dataobject.base.BasicExample;
//import com.cxf.sell.service.BasicService;
//
//import com.cxf.sell.utils.ResultVOUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.*;
//
//
//@RestController /* 返回json格式 */
//@RequestMapping("/buyer/product")
//public class BuyerProductController {
//
//    @Autowired
//    private BasicService basicService;
//
//    @GetMapping("/list")
//    public ResultVO list(String sellerId) throws Exception {
//        //查询类目
//        BasicExample typeExa = new BasicExample(ProductCategory.class);
//        typeExa.createCriteria().andVarEqualTo("seller_id",sellerId);//seller_id 是Product_Category  表对应的字段名
//        List<ProductVO> productCategoryList =  basicService.selectByExample(typeExa);//ProductVO 的字段和数据库表保持驼峰 下划线转换一直，会自动set值
//        //根据类目找到对应的商品
//        List<String> cateIds = new ArrayList<>();
//        for (ProductVO category : productCategoryList) {
//            category.getCategoryId();
//        }
//        BasicExample example = new BasicExample(ProductInfo.class);
//        BasicExample.Criteria criteria= example.createCriteria();//构造查询条件
//        criteria.andVarIn("category_id",cateIds);
//        List<ProductInfoVO> productInfoList =  basicService.selectByExample(example);
//        Map<String,List<ProductInfoVO>> infoMap = new HashMap<>();//key:categoryId
//        //循环封装info
//        for (ProductInfoVO info : productInfoList) {
//            if(infoMap.containsKey(info.getCategoryId())){
//                infoMap.get(info.getCategoryId()).add(info);
//            }else {
//                List<ProductInfoVO> productInfoVOList = new ArrayList<>();
//                productInfoVOList.add(info);
//                infoMap.get(info.getCategoryId()).add(info);
//            }
//        }
//        //封装输出
//        for (ProductVO vo : productCategoryList) {
//            vo.setProductInfoVOList(infoMap.get(vo.getCategoryId()));
//        }
//        return ResultVOUtils.success(productCategoryList);
//    }
//}
