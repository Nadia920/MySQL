package AllData;

public class Payment {
    private Integer id;
    private String numberCP;
    private String payment_information;
    private String amount;
    private String status;
    public Payment() {}

    public Payment(Integer id, String number_card, String payment_information, String amount, String status) {
        
         this.setID(id);
         this.setCard(number_card);
         this.setInformation(payment_information);
         this.setAmount(amount);
         this.setStatus(status);
        //System.out.println("яяя" + payment_information);
    }

    public Payment(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Payment(String str1, String str2, String str3, String str4, String str5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public static class Builder {
        private final Payment newPayment;

        public Builder() {
            newPayment = new Payment();
        }

        public Payment build(){
            return newPayment;
        }

    }

    @Override
    public String toString() {
        //System.out.println(payment_information);
        return "Платёж\n" +
                "Карта: " + numberCP + '\n' +
                "Информация о платеже: " + payment_information + '\n' +
                "Сумма: " + amount + '\n' +
                "Статус: " + status + '\n' + '\n';

    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    public String getCard() {
        return numberCP;
    }

    public void setCard(String number_card) {
        this.numberCP = number_card;
    }

    public String getInformation() {
        return payment_information;
    }

    public void setInformation(String payment_information) {
        this.payment_information = payment_information;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
