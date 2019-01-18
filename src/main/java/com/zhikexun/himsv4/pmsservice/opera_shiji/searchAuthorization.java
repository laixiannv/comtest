package com.zhikexun.himsv4.pmsservice.opera_shiji;

import java.util.List;

/**
 * 查询预授权
 */
public class searchAuthorization extends Request {
    private String OTANumber;// 渠道号
    private List<String> authorizationStatus;//预授权状态
    private List<String>  authorizationCodes;//授权码
    private List<String>  transactionCodes;//支付代码
    private List<String> cardNumbers;//卡号
    private List<String> amounts;//金额
    private List<String> expirationDates;//有效期

    public searchAuthorization(String appId, String IMEI, String hotelId, String reservationNumber, String OTANumber, List<String> authorizationStatus, List<String> authorizationCodes, List<String> transactionCodes, List<String> cardNumbers, List<String> amounts, List<String> expirationDates) {
        super(appId, IMEI, hotelId, reservationNumber);
        this.OTANumber = OTANumber;
        this.authorizationStatus = authorizationStatus;
        this.authorizationCodes = authorizationCodes;
        this.transactionCodes = transactionCodes;
        this.cardNumbers = cardNumbers;
        this.amounts = amounts;
        this.expirationDates = expirationDates;
    }

    public String getOTANumber() {
        return OTANumber;
    }

    public void setOTANumber(String OTANumber) {
        this.OTANumber = OTANumber;
    }

    public List<String> getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(List<String> authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public List<String> getAuthorizationCodes() {
        return authorizationCodes;
    }

    public void setAuthorizationCodes(List<String> authorizationCodes) {
        this.authorizationCodes = authorizationCodes;
    }

    public List<String> getTransactionCodes() {
        return transactionCodes;
    }

    public void setTransactionCodes(List<String> transactionCodes) {
        this.transactionCodes = transactionCodes;
    }

    public List<String> getCardNumbers() {
        return cardNumbers;
    }

    public void setCardNumbers(List<String> cardNumbers) {
        this.cardNumbers = cardNumbers;
    }

    public List<String> getAmounts() {
        return amounts;
    }

    public void setAmounts(List<String> amounts) {
        this.amounts = amounts;
    }

    public List<String> getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(List<String> expirationDates) {
        this.expirationDates = expirationDates;
    }
}
