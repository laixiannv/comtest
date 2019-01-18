package com.zhikexun.himsv4.pmsservice.opera_shiji;

public class preAuthorization extends Request{
   private String  OTANumber;//渠道号 OTANumber * String Attribute
    private String  authorizationNam;//授权人 authorizationNam
    private String  transactionCode;//支付代码
    private String  authorizationCode;//授权码
    private String  cardNumber;//卡号
    private String   cardType ;//卡类型
    private Integer  amount;// 金额
    private String expirationDate;//有效期
    private String  operationNumber;//   操作流水号
    private String  invoiceNumber;// 账单号
    private String  referNumber;//参考号
    private String  terminalNumber;//终端机号

    public preAuthorization(String appId, String IMEI, String hotelId, String reservationNumber, String OTANumber, String authorizationNam, String transactionCode, String authorizationCode, String cardNumber, String cardType, Integer amount, String expirationDate, String operationNumber, String invoiceNumber, String referNumber, String terminalNumber) {
        super(appId, IMEI, hotelId, reservationNumber);
        this.OTANumber = OTANumber;
        this.authorizationNam = authorizationNam;
        this.transactionCode = transactionCode;
        this.authorizationCode = authorizationCode;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.amount = amount;
        this.expirationDate = expirationDate;
        this.operationNumber = operationNumber;
        this.invoiceNumber = invoiceNumber;
        this.referNumber = referNumber;
        this.terminalNumber = terminalNumber;
    }

    public String getOTANumber() {
        return OTANumber;
    }

    public void setOTANumber(String OTANumber) {
        this.OTANumber = OTANumber;
    }

    public String getAuthorizationNam() {
        return authorizationNam;
    }

    public void setAuthorizationNam(String authorizationNam) {
        this.authorizationNam = authorizationNam;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getReferNumber() {
        return referNumber;
    }

    public void setReferNumber(String referNumber) {
        this.referNumber = referNumber;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }
}
