package com.zhikexun.himsv4.pmsservice.opera_shiji;

import java.util.List;

/**
 * 用户表
 */
public class Guest {
private String name;//英文名
    private String chineseName;//中文名
    private String number;//客人号
    private String telephone;//固定电话号
    private String mobile;// 移动电话
    private String hotelId;//酒店代码
    private String guestNumber;//客人流水号
    private String confimationNumber;//确认序列号
    private String title;//称呼
    private String firstName;//名
    private String lastName;//姓
    private String gender;//性别

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(String guestNumber) {
        this.guestNumber = guestNumber;
    }

    public String getConfimationNumber() {
        return confimationNumber;
    }

    public void setConfimationNumber(String confimationNumber) {
        this.confimationNumber = confimationNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getIATANumber() {
        return IATANumber;
    }

    public void setIATANumber(String IATANumber) {
        this.IATANumber = IATANumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getIssuing() {
        return issuing;
    }

    public void setIssuing(String issuing) {
        this.issuing = issuing;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressOther() {
        return addressOther;
    }

    public void setAddressOther(String addressOther) {
        this.addressOther = addressOther;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public MemberShip getUsedMemberShip() {
        return usedMemberShip;
    }

    public void setUsedMemberShip(MemberShip usedMemberShip) {
        this.usedMemberShip = usedMemberShip;
    }

    public List<MemberShip> getMemberShips() {
        return memberShips;
    }

    public void setMemberShips(List<MemberShip> memberShips) {
        this.memberShips = memberShips;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    private String national;//民族
    private String guestType;//客人类型

    public Guest(String name, String chineseName, String number, String telephone, String mobile, String hotelId, String guestNumber, String confimationNumber, String title, String firstName, String lastName, String gender, String national, String guestType, String IATANumber, String documentNumber, String documentType, String issuing, String expirationDate, String email, String workPhone, String fax, String country, String state, String city, String postal, String address, String addressOther, String birthdate, MemberShip usedMemberShip, List<MemberShip> memberShips, String addressType) {
        this.name = name;
        this.chineseName = chineseName;
        this.number = number;
        this.telephone = telephone;
        this.mobile = mobile;
        this.hotelId = hotelId;
        this.guestNumber = guestNumber;
        this.confimationNumber = confimationNumber;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.national = national;
        this.guestType = guestType;
        this.IATANumber = IATANumber;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.issuing = issuing;
        this.expirationDate = expirationDate;
        this.email = email;
        this.workPhone = workPhone;
        this.fax = fax;
        this.country = country;
        this.state = state;
        this.city = city;
        this.postal = postal;
        this.address = address;
        this.addressOther = addressOther;
        this.birthdate = birthdate;
        this.usedMemberShip = usedMemberShip;
        this.memberShips = memberShips;
        AddressType = addressType;
    }

    private String IATANumber;//IATA号
    private String documentNumber;//证件号
    private String documentType;//证件类型
    private String issuing;//发证机关
    private String expirationDate;// 证件过期日期
    private String email;//邮箱
    private String workPhone;//工作电话
    private String fax;//    传真
    private String country;//国家
    private String state;//省份
    private String city;//地区
    private String postal;//邮编
    private String address;//地址
    private String addressOther;//备用地址
    private String birthdate;//生日
    private MemberShip usedMemberShip;//会员信息
    private List<MemberShip> memberShips;//会员信息卡列表
    private String AddressType;//地址信息

}
