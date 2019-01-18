package com.zhikexun.himsv4.pmsservice.opera_shiji;

public class MemberShip {
    private String memberNumber;//  会员卡
    private String memberType;//  会员卡类型
    private String expirationDate;//  会员卡有效期

    public MemberShip(String memberNumber, String memberType, String expirationDate) {
        this.memberNumber = memberNumber;
        this.memberType = memberType;
        this.expirationDate = expirationDate;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
