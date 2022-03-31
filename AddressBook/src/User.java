 
public class User {
    private String fname;
    private String lname;
    private String landPhone;
    private String mobilePhone;
    private String mail;
    private String SocialID;
    private String address;
    
    //alt+ins : generate constructor

    public User(String fname, String lname, String landPhone, String mobilePhone, String mail, String SocialID, String address) {
        this.fname = fname;
        this.lname = lname;
        this.landPhone = landPhone;
        this.mobilePhone = mobilePhone;
        this.mail = mail;
        this.SocialID = SocialID;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLandPhone() {
        return landPhone;
    }

    public void setLandPhone(String landPhone) {
        this.landPhone = landPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSocialID() {
        return SocialID;
    }

    public void setSocialID(String SocialID) {
        this.SocialID = SocialID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
