package com.cxf.sell.dataobject;

import com.cxf.sell.dataobject.base.IBaseDBPO;
import com.cxf.sell.utils.RegexUtils;

import java.util.Date;

public class Rating   extends IBaseDBPO {
    @Override
    public String _getTableName() {
        String name= RegexUtils.humpToLine2(this.getClass().getSimpleName());
        name=name.substring(1);
        return name;
    }

    @Override
    public String _getPKColumnName() {
        return "rating_Id";
    }

    @Override
    public String _getPKValue() {
        return ratingId;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.ratingId = (String) var1;
    }

    private String ratingId;

    private String productId;

    private String sellerId;

    private String buyerName;

    private Date rateTime;

    private Integer rateType;

    private String rateText;

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId == null ? null : ratingId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public Date getRateTime() {
        return rateTime;
    }

    public void setRateTime(Date rateTime) {
        this.rateTime = rateTime;
    }

    public Integer getRateType() {
        return rateType;
    }

    public void setRateType(Integer rateType) {
        this.rateType = rateType;
    }

    public String getRateText() {
        return rateText;
    }

    public void setRateText(String rateText) {
        this.rateText = rateText == null ? null : rateText.trim();
    }
}