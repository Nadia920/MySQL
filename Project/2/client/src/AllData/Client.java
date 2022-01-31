/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllData;

/**
 *
 * @author User
 */
public class Client {
    private String fullName;
    private String passport;
    private String date;
    private String who;
    private String numberCC;
    private String place;
    private String startBank;
    private String information;
    private String numberPhone;
    public Client(String str1,String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9){
        this.fullName = str1;
        this.passport = str2;
        this.date = str3;
        this.who = str4;
        this.numberCC = str5;
        this.place = str6;
        this.startBank = str7;
        this.information = str8;
        this.numberPhone = str9;
       
    }
    public String getFullName() {
        return this.fullName;
    } 
    
    public String getPassport () {
        return this.passport;
    }

    public String getDate () {
        return this.date;
    }

    public String getWho () {
        return this.who;
    }
     public String getNumberCard () {
        return this.numberCC;
    }
    public String getStartBank () {
        return this.startBank;
    } 
    
    public String getPlace () {
        return this.place;
    }

    public String getInformation () {
        return this.information;
    }

   public String getNumberPhone () {
        return this.numberPhone;
    } 
        public void setFullName(String   fullName) {
        this. fullName =   fullName;
    }
       public void setPassport(String passport) {
        this.passport = passport;
    }
        public void setDate(String date) {
        this.date = date;
    }
         public void setWho(String  who) {
        this. who =  who;
    }
       public void setNumberCard(String numberCard) {
        this.numberCC = numberCard;
    }
       public void setPlace(String place) {
        this.place = place;
    }
         public void setStartBank(String  startBank) {
        this.startBank =  startBank;
    }
       
       public void setInformation(String information) {
        this.information = information;
    }
        public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
        public String quotate(String content)
    {
     return "'" + content + "'";
    }
    
    
    
    
    
}
