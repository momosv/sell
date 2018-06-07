package com.cxf.sell.VO;

import com.cxf.sell.dataobject.base.IBaseDBPO;
import com.cxf.sell.utils.RegexUtils;

import java.util.List;

public class SellerInfoVO extends IBaseDBPO {
    @Override
    public String _getTableName() {
        return "seller_info";
    }

    @Override
    public String _getPKColumnName() {
        return "id";
    }

    @Override
    public String _getPKValue() {
        return id;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.id = (String) var1;
    }

    private String id;

    private String account;

    private String password;

    private String name;

    private String description;

    private Double score;

    private Double serviceScore;

    private Double foodService;

    private Double rankScore;

    private Double minPrice;

    private Double deliveryPrice;

    private Integer ratingCount;

    private Integer sellCount;

    private String bulletin;

    private String extraInfos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Double serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Double getFoodService() {
        return foodService;
    }

    public void setFoodService(Double foodService) {
        this.foodService = foodService;
    }

    public Double getRankScore() {
        return rankScore;
    }

    public void setRankScore(Double rankScore) {
        this.rankScore = rankScore;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    public String getBulletin() {
        return bulletin;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin == null ? null : bulletin.trim();
    }

    public String getExtraInfos() {
        return extraInfos;
    }

    public void setExtraInfos(String extraInfos) {
        this.extraInfos = extraInfos == null ? null : extraInfos.trim();
    }


    private List<SellerActivityVO> supports;

    public List<SellerActivityVO> getSupports() {
        return supports;
    }

    public void setSupports(List<SellerActivityVO> supports) {
        this.supports = supports;
    }
}