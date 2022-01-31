/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllData;

/**
 *
 * @author User
 */
public class Operations {
    private Integer id;
    private String nameS;
    private String numberPO;
    public Operations(Integer id, String str1,String str2){
         this.setID(id);
         this.setName(str1);
         this.setPassport(str2);
    }
    public Integer getID () {
        return this.id;
    } 
    
    public String getName () {
        return this.nameS;
    }

    public String getPassport () {
        return this.numberPO;
    }
     public void setID(Integer id) {
        this.id = id;
    }
      public void setName(String  name) {
        this. nameS =  name;
    }
       public void setPassport(String passport) {
        this.numberPO = passport;
    }
}
