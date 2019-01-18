package com.zhikexun.himsv4.pmsservice.opera_shiji;

/**
 * 添加合住人
 */
public class CombineShare {
    private Guest guest;
    private String guaranteeType;

    public CombineShare(Guest guest, String guaranteeType) {
        this.guest = guest;
        this.guaranteeType = guaranteeType;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
}
