package com.cxf.sell.repository;

import com.cxf.sell.dataobject.SellerInfo;

public interface SellerInfoMapper {
    SellerInfo selectByPrimaryKey(String id);
}