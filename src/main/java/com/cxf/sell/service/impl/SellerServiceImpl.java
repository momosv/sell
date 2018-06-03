//package com.cxf.sell.service.impl;
//
//import com.cxf.sell.VO.SellerVO;
//import com.cxf.sell.dataobject.SellerActivity;
//import com.cxf.sell.repository.SellerInfoRepository;
//import com.cxf.sell.service.SellerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SellerServiceImpl implements SellerService {
//
//    @Autowired
//    private SellerInfoRepository sellerDao;
//
//    @Override
//    public SellerVO getSeller(String id) {
//      SellerVO seller =  sellerDao.findBySellerId(id);
//      if(null != seller) {
//          List<SellerActivity> act = sellerDao.findActBySellerId(id);
//          seller.setSellerActivity(act);
//      }
//      return seller;
//    }
//}
