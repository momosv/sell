//package com.cxf.sell.service.impl;
//
//import com.cxf.sell.dataobject.ProductInfo;
//import com.cxf.sell.dto.CartDTO;
//import com.cxf.sell.enums.ProductStatusEnum;
//import com.cxf.sell.enums.ResultEnum;
//import com.cxf.sell.exception.SellException;
//import com.cxf.sell.repository.ProductInfoRepository;
//import com.cxf.sell.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    private ProductInfoRepository repository;
//
//    @Override
//    public ProductInfo findOne(String productId) {
//        return repository.findOne(productId);
//    }
//
//    @Override
//    public List<ProductInfo> findUpAll() {
//        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
//    }
//
//    @Override
//    public Page<ProductInfo> findAll(Pageable pageable) {
//        return repository.findAll(pageable);
//    }
//
//    @Override
//    public ProductInfo save(ProductInfo productInfo) {
//        return repository.save(productInfo);
//    }
//
//    @Override
//    @Transactional
//    public void increaseStock(List<CartDTO> cartDTOList) {
//        for (CartDTO cartDTO : cartDTOList) {
//            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
//            if (productInfo == null) {
//                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
//            }
//            // 增加库存
//            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
//            productInfo.setProductStock(result);
//            repository.save(productInfo);
//        }
//    }
//
//    @Override
//    @Transactional
//    public void decreaseStock(List<CartDTO> cartDTOList) {
//        // 遍历购物车，看库存够不够，够的话就减掉
//        for (CartDTO cartDTO: cartDTOList) {
//            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
//            if (productInfo == null) {
//                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
//            }
//            // 减少库存
//            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
//            // 后续用Redis锁机制防止多线程导致的“超卖”问题
//            if (result < 0){
//                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
//            }
//            productInfo.setProductStock(result);
//            repository.save(productInfo);
//        }
//    }
//}
