package com.zhikexun.himsv4.pmsservice.opera_shiji;

import java.util.List;

public class Document {
    private String guestNumber;//客人号
    private Boolean updateProfile;//是否更新至opera
    private String chineseFirstName;//中文名
    private String chineseLastName;//中文姓
    private String chineseName;//中文姓名
    private String phone;//手机
    private String email;//电子邮件
    private String nationality;// 国籍
    private String documentType;//证件类型
    private String documentNumber;//证件号码
    private String birthdate;//出生日期
    private String language;//语言
    private String lastName;//英文姓
    private String firstName;//英文名
    private String race;//名族
    private String gender;//性别
    private String address;//身份证地址
    private String documentPlaceOfIssue;//签收机关
    private String documentIssueDate;//有效期开始
    private String documentEffectiveDate;//有效期结束
    private String administrativeDivision;//行政区划
    private String comment;//备注
    private byte[] photo;//照片
    private byte[] photoHeader;//头像
    private String roomNumber;//房间号
    private GuestAddress guestAddress;// 客户地址
    private GuestType guestType;//客人类型
    private String guestServiceNumber;//客人流水号
    private String title;//称呼
    private String  IATANumber;//IATA 号
    private String workPhone;//工作联系电话
    private String fax;//传真
    private String area;//地区
    private String postCode;//邮编
    private String alternateAddress;//备用地址
    private List<MemberShip> memberShips;//客人所使用的会员卡
    private String country;//国家代码
    private String state;//省份代码
    private String city;//城市

    public Document(String guestNumber, Boolean updateProfile, String chineseFirstName, String chineseLastName, String chineseName, String phone, String email, String nationality, String documentType, String documentNumber, String birthdate, String language, String lastName, String firstName, String race, String gender, String address, String documentPlaceOfIssue, String documentIssueDate, String documentEffectiveDate, String administrativeDivision, String comment, byte[] photo, byte[] photoHeader, String roomNumber, GuestAddress guestAddress, GuestType guestType, String guestServiceNumber, String title, String IATANumber, String workPhone, String fax, String area, String postCode, String alternateAddress, List<MemberShip> memberShips, String country, String state, String city) {
        this.guestNumber = guestNumber;
        this.updateProfile = updateProfile;
        this.chineseFirstName = chineseFirstName;
        this.chineseLastName = chineseLastName;
        this.chineseName = chineseName;
        this.phone = phone;
        this.email = email;
        this.nationality = nationality;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.birthdate = birthdate;
        this.language = language;
        this.lastName = lastName;
        this.firstName = firstName;
        this.race = race;
        this.gender = gender;
        this.address = address;
        this.documentPlaceOfIssue = documentPlaceOfIssue;
        this.documentIssueDate = documentIssueDate;
        this.documentEffectiveDate = documentEffectiveDate;
        this.administrativeDivision = administrativeDivision;
        this.comment = comment;
        this.photo = photo;
        this.photoHeader = photoHeader;
        this.roomNumber = roomNumber;
        this.guestAddress = guestAddress;
        this.guestType = guestType;
        this.guestServiceNumber = guestServiceNumber;
        this.title = title;
        this.IATANumber = IATANumber;
        this.workPhone = workPhone;
        this.fax = fax;
        this.area = area;
        this.postCode = postCode;
        this.alternateAddress = alternateAddress;
        this.memberShips = memberShips;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public String getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(String guestNumber) {
        this.guestNumber = guestNumber;
    }

    public Boolean getUpdateProfile() {
        return updateProfile;
    }

    public void setUpdateProfile(Boolean updateProfile) {
        this.updateProfile = updateProfile;
    }

    public String getChineseFirstName() {
        return chineseFirstName;
    }

    public void setChineseFirstName(String chineseFirstName) {
        this.chineseFirstName = chineseFirstName;
    }

    public String getChineseLastName() {
        return chineseLastName;
    }

    public void setChineseLastName(String chineseLastName) {
        this.chineseLastName = chineseLastName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDocumentPlaceOfIssue() {
        return documentPlaceOfIssue;
    }

    public void setDocumentPlaceOfIssue(String documentPlaceOfIssue) {
        this.documentPlaceOfIssue = documentPlaceOfIssue;
    }

    public String getDocumentIssueDate() {
        return documentIssueDate;
    }

    public void setDocumentIssueDate(String documentIssueDate) {
        this.documentIssueDate = documentIssueDate;
    }

    public String getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    public void setDocumentEffectiveDate(String documentEffectiveDate) {
        this.documentEffectiveDate = documentEffectiveDate;
    }

    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getPhotoHeader() {
        return photoHeader;
    }

    public void setPhotoHeader(byte[] photoHeader) {
        this.photoHeader = photoHeader;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public GuestAddress getGuestAddress() {
        return guestAddress;
    }

    public void setGuestAddress(GuestAddress guestAddress) {
        this.guestAddress = guestAddress;
    }

    public GuestType getGuestType() {
        return guestType;
    }

    public void setGuestType(GuestType guestType) {
        this.guestType = guestType;
    }

    public String getGuestServiceNumber() {
        return guestServiceNumber;
    }

    public void setGuestServiceNumber(String guestServiceNumber) {
        this.guestServiceNumber = guestServiceNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIATANumber() {
        return IATANumber;
    }

    public void setIATANumber(String IATANumber) {
        this.IATANumber = IATANumber;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAlternateAddress() {
        return alternateAddress;
    }

    public void setAlternateAddress(String alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    public List<MemberShip> getMemberShips() {
        return memberShips;
    }

    public void setMemberShips(List<MemberShip> memberShips) {
        this.memberShips = memberShips;
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
}
