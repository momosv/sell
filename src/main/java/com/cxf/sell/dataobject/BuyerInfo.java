package com.cxf.sell.dataobject;

import com.cxf.sell.dataobject.base.IBaseDBPO;
import com.cxf.sell.utils.RegexUtils;

public class BuyerInfo extends IBaseDBPO{

    //也就是“buyer_info”
    @Override
    public String _getTableName() {
        String name= RegexUtils.humpToLine2(this.getClass().getSimpleName());
        name=name.substring(1);
        return name;
    }

    @Override
    public String _getPKColumnName() {
        return "buyer_Id";
    }

    @Override
    public String _getPKValue() {
        return buyerId;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.buyerId = (String) var1;
    }
    private String buyerId;

    private String account;

    private String password;

    private String name;

    private String phone;

    private String address;

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId == null ? null : buyerId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String buyerName) {
        this.name = buyerName == null ? null : buyerName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String buyerPhone) {
        this.phone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String buyerAddress) {
        this.address = buyerAddress == null ? null : buyerAddress.trim();
    }

}