package com.zhikexun.himsv4.pmsservice.opera_shiji;

import java.util.List;

/**
 * 预支付时需要传入的参数
 */
public class PrePayment {
    private String appId;//手机 App 应用的编号，必填
    private String IMEI;// 在 GJE 注册的酒店，必填
    private String hotelId;//在 GJE 注册的酒店，必填
    private String reservationNumber;//此编号表示通过中央预订系统或酒店普通预订生成的订单的订单号
    private String prePaymentType;//支付方式
    private Integer amount;//支付金额
    private PostChargeType postChargeType;//款项类型
    private String paymentCode;//付款代码
    private String description;//款项描述
    private String OTANumber;//渠道号
    private List<PostingItem> itemList;//消费时用，（消费抛帐时必填

    public PrePayment(String appId, String IMEI, String hotelId, String reservationNumber, String prePaymentType, Integer amount, PostChargeType postChargeType, String paymentCode, String description, String OTANumber, List<PostingItem> itemList) {

        this.appId = appId;
        this.IMEI = IMEI;
        this.hotelId = hotelId;
        this.reservationNumber = reservationNumber;
        this.prePaymentType = prePaymentType;
        this.amount = amount;
        this.postChargeType = postChargeType;
        this.paymentCode = paymentCode;
        this.description = description;
        this.OTANumber = OTANumber;
        this.itemList = itemList;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getPrePaymentType() {
        return prePaymentType;
    }

    public void setPrePaymentType(String prePaymentType) {
        this.prePaymentType = prePaymentType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public PostChargeType getPostChargeType() {
        return postChargeType;
    }

    public void setPostChargeType(PostChargeType postChargeType) {
        this.postChargeType = postChargeType;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOTANumber() {
        return OTANumber;
    }

    public void setOTANumber(String OTANumber) {
        this.OTANumber = OTANumber;
    }

    public List<PostingItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<PostingItem> itemList) {
        this.itemList = itemList;
    }
}
