/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Core i3 GTX750ti
 */
public class list {
    private String FirstName;
    private String LastName;
    private String LandPhone;
    private String MobilePhone;
    private String Mail;
    private String SocialID;
    private String Address;
    
    
    public list( String FirstName, String LastName,String LandPhone, String MobilePhone,String SocialID,String Mail,String Address)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.LandPhone=LandPhone;
        this.MobilePhone=MobilePhone;
        this.Mail=Mail;
        this.SocialID=SocialID;
        this.Address=Address;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public String getLandPhone()
    {
        return LandPhone;
    }
    public String getMobilePhone()
    {
        return MobilePhone;
    }
    public String getMail()
    {
        return Mail;
    }
    public String getSocialID()
    {
        return SocialID;
    }
    public String getAddress()
    {
        return Address;
    }
    
}
