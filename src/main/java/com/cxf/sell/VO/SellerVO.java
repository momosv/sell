//package com.cxf.sell.VO;
//
//import com.cxf.sell.dataobject.SellerActivity;
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.math.BigDecimal;
//import java.util.List;
//
//@Entity
//@Table(name="sellerInfo")
//public class SellerVO {
//    @Id
//    private String sellerId;
//    private String sellerName;
//    private String sellerDescription;
//    private BigDecimal sellerScore;
//    private BigDecimal sellerServiceScore;
//    private BigDecimal sellerFoodScore;
//    private BigDecimal sellerRankRate;
//    private BigDecimal sellerMinPrice;
//    private BigDecimal sellerDeliveryPrice;
//    private BigDecimal sellerRatingCount;
//    private Integer sellerSellCount;
//    private String sellerBulletin;
//
//    @JsonProperty("supports")
//    private List<SellerActivity> sellerActivity;
//
//    public List<SellerActivity> getSellerActivity() {
//        return sellerActivity;
//    }
//
//    public void setSellerActivity(List<SellerActivity> sellerActivity) {
//        this.sellerActivity = sellerActivity;
//    }
//
//    public String getSellerId() {
//        return sellerId;
//    }
//
//    public void setSellerId(String sellerId) {
//        this.sellerId = sellerId;
//    }
//
//    public String getSellerName() {
//        return sellerName;
//    }
//
//    public void setSellerName(String sellerName) {
//        this.sellerName = sellerName;
//    }
//
//    public String getSellerDescription() {
//        return sellerDescription;
//    }
//
//    public void setSellerDescription(String sellerDescription) {
//        this.sellerDescription = sellerDescription;
//    }
//
//    public BigDecimal getSellerScore() {
//        return sellerScore;
//    }
//
//    public void setSellerScore(BigDecimal sellerScore) {
//        this.sellerScore = sellerScore;
//    }
//
//    public BigDecimal getSellerServiceScore() {
//        return sellerServiceScore;
//    }
//
//    public void setSellerServiceScore(BigDecimal sellerServiceScore) {
//        this.sellerServiceScore = sellerServiceScore;
//    }
//
//    public BigDecimal getSellerFoodScore() {
//        return sellerFoodScore;
//    }
//
//    public void setSellerFoodScore(BigDecimal sellerFoodScore) {
//        this.sellerFoodScore = sellerFoodScore;
//    }
//
//    public BigDecimal getSellerRankRate() {
//        return sellerRankRate;
//    }
//
//    public void setSellerRankRate(BigDecimal sellerRankRate) {
//        this.sellerRankRate = sellerRankRate;
//    }
//
//    public BigDecimal getSellerMinPrice() {
//        return sellerMinPrice;
//    }
//
//    public void setSellerMinPrice(BigDecimal sellerMinPrice) {
//        this.sellerMinPrice = sellerMinPrice;
//    }
//
//    public BigDecimal getSellerDeliveryPrice() {
//        return sellerDeliveryPrice;
//    }
//
//    public void setSellerDeliveryPrice(BigDecimal sellerDeliveryPrice) {
//        this.sellerDeliveryPrice = sellerDeliveryPrice;
//    }
//
//    public BigDecimal getSellerRatingCount() {
//        return sellerRatingCount;
//    }
//
//    public void setSellerRatingCount(BigDecimal sellerRatingCount) {
//        this.sellerRatingCount = sellerRatingCount;
//    }
//
//    public Integer getSellerSellCount() {
//        return sellerSellCount;
//    }
//
//    public void setSellerSellCount(Integer sellerSellCount) {
//        this.sellerSellCount = sellerSellCount;
//    }
//
//    public String getSellerBulletin() {
//        return sellerBulletin;
//    }
//
//    public void setSellerBulletin(String sellerBulletin) {
//        this.sellerBulletin = sellerBulletin;
//    }
//}
