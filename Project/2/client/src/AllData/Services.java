/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllData;

/**
 *
 * @author User
 */
public class Services {
    private String number_card;
    private String payment_information;
    private String amount;
    private String status;
    public Services(String number_card,String payment_information, String amount, String status){
        this.setNumber_card(number_card);
        this.setInformation(payment_information);
        this.setAmount(amount);
        this.setStatus(status);
    }
    public String getNumber_card(){return number_card;}
    public String getInformation(){return payment_information;}
    public String getAmount(){return amount;}
    public String getStatus(){return status;}
     

    
    
    public void setNumber_card (String number_card) {
        this.number_card = number_card;
    }
      
     
    public void setInformation (String payment_information) {
        this.payment_information = payment_information;
    }
    
    public void setAmount (String amount) {
        this.amount = amount;
    }

      public void setStatus (String status1) {
        this.status = status1;
    }
}
