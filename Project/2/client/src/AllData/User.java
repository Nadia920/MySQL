package AllData;

public class User {
    private Integer ID;
    private String login;
    private String password;
    private String numberC;
    private String numberPas;
    public User (Integer id, String str1, String str2, String str3, String str4){
        this.setID(id);
        this.setLogin(str1);
        this.setPassword(str2);
        this.setNumber(str3);
        this.setPassport(str4);
    }
  
    
   
     public void setID (Integer id) {
        this.ID = id;
    }
     
      public void setLogin (String login) {
        this.login = login;
    }
      
     
    public void setPassword (String password) {
        this.password = password;
    }
    
    public void setNumber (String Number) {
        this.numberC = Number;
    }

      public void setPassport (String number_passport1) {
        this.numberPas = number_passport1;
    }

    public Integer getID () {
        return this.ID;
    } 
    
    public String getLogin () {
        return this.login;
    }
     public String getPassword () {
        return this.password;
    }
    public String getNumber () {
        return this.numberC;
    }

    public String getPassport () {
        return this.numberPas;
    }
}
