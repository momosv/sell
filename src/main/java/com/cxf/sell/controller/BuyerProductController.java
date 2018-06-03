//package com.cxf.sell.controller;
//
//import com.cxf.sell.VO.ProductInfoVO;
//import com.cxf.sell.VO.ProductVO;
//import com.cxf.sell.VO.ResultVO;
//import com.cxf.sell.dataobject.ProductCategory;
//import com.cxf.sell.dataobject.ProductInfo;
//import com.cxf.sell.service.CategoryService;
//import com.cxf.sell.service.ProductService;
//import com.cxf.sell.utils.ResultVOUtils;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//
//@RestController /* 返回json格式 */
//@RequestMapping("/buyer/product")
//public class BuyerProductController {
//
//    @Autowired
//    private ProductService productService; /* 查询商品要用到ProductService */
//
//    @Autowired
//    private CategoryService categoryService;
//
//    @GetMapping("/list")
//    public ResultVO list() {
//        // 1.从数据库中查询所有的上架商品
//        List<ProductInfo> productInfoList =  productService.findUpAll();
//
//        // 2.从数据库中查询商品类目
//        // List<Integer> categoryTypeList = new ArrayList<>();
//        // 传统方法
//        // 遍历productInfoList，把每一个ProductInfo取出来
//        // for(ProductInfo productInfo : productInfoList) {
//        //     categoryTypeList.add(productInfo.getCategoryType());
//        // }
//        // 精简做法（java 8 lambda）
//        List<Integer> categoryTypeList =  productInfoList.stream()
//                .map(productInfo -> productInfo.getCategoryType())
//                .collect(Collectors.toList());
//        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
//
//        // 3.数据拼装
//        List<ProductVO> productVOList = new ArrayList<>();
//        // 首先遍历类目
//        for(ProductCategory productCategory : productCategoryList) {
//            ProductVO productVO = new ProductVO();
//            productVO.setCategoryType(productCategory.getCategoryType());
//            productVO.setCategoryName(productCategory.getCategoryName());
//
//            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
//            for (ProductInfo productInfo : productInfoList) {
//                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
//                    ProductInfoVO productInfoVO = new ProductInfoVO();
//                    // setter太过麻烦，所以用Spring自带的BeanUtils，把productInfo的属性复制到productInfoVO中
//                    BeanUtils.copyProperties(productInfo, productInfoVO);
//                    productInfoVOList.add(productInfoVO);
//                }
//            }
//            productVO.setProductInfoVOList(productInfoVOList);
//            productVOList.add(productVO);
//        }
//
//        // ResultVO resultVO = new ResultVO();
//        // ProductVO productVO = new ProductVO();
//        // ProductInfoVO productInfoVO = new ProductInfoVO();
//        // productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
//        // resultVO.setData(Arrays.asList(productVO));
//        // resultVO.setData(productVOList);
//        // resultVO.setCode(0);
//        // resultVO.setMsg("成功");
//        // return resultVO;
//        return ResultVOUtils.success(productVOList);
//    }
//}
