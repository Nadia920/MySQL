/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllData;

/**
 *
 * @author User
 */
public class Loans {
    Integer id;
    String nameBorrower;
    String cause;
    String amount;
    String term;
    String percent;
    String nameGuarantor;
    String dateGuarantor;
    String numberCL;
    String numberGuarantor;
    public Loans(Integer id, String str1,String str2,String str3, String str4, String str5,String str6 ,String str7, String str8,  String str9){
     this.setID(id);
     this.setNameBorrower(str1);
     this.setCause(str2);
     this.setAmount(str3);
     this.setTerm(str4);
     this.setPercent(str5);
     this.setNameGuarantor(str6);
     this.setDateGuarantor(str7);
     this.setNumberPassport(str8);
     this.setNumberGuarantor(str9);
    }
    public Integer getID(){return id;}
    public String getNameBorrower(){return nameBorrower;}
    public String getCause(){return cause;}
    public String getAmount(){return amount;}
    public String getTerm(){return term;}
    public String getPercent(){return percent;}
    public String getNameGuarantor(){return nameGuarantor;}
    public String getDateGuarantor(){return dateGuarantor;}
    public String getNumberPassport(){return numberCL;}
    public String getNumberGuarantor(){return numberGuarantor;}
     public void setID(Integer id) {
        this.id = id;
    }
      public void setNameBorrower(String  nameBorrower) {
        this. nameBorrower =  nameBorrower;
    }
       public void setCause(String cause) {
        this.cause = cause;
    }
         public void setAmount(String  amount) {
        this.amount =  amount;
    }
       public void setTerm(String term) {
        this.term= term;
    }
         public void setPercent(String  percent) {
        this. percent =  percent;
    }
       public void setNameGuarantor(String nameGuarantor) {
        this.nameGuarantor = nameGuarantor;
    }
         public void setDateGuarantor(String  dateGuarantor) {
        this. dateGuarantor =  dateGuarantor;
    }
       public void setNumberPassport(String numberPassport) {
        this.numberCL = numberPassport;
    }
       public void setNumberGuarantor(String numberGuarantor) {
        this.numberGuarantor = numberGuarantor;
    }
    
}
