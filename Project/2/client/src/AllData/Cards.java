/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllData;

/**
 *
 * @author User
 */
public class Cards {
    
    private String numberCard;
    private String validity;
    private String cVV;
    private String cardBalance;
    private String status;

    public Cards(String numberCardNew, String validityNew, String cVVNew, String cardBalanceNew, String statusNew) {
        this.numberCard = numberCardNew;
        this.validity = validityNew;
        this.cVV = cVVNew;
        this.cardBalance = cardBalanceNew;
        this.status = statusNew;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public void setCVV(String cVV) {
        this.cVV = cVV;
    }

    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void setStatus(String numberPassport) {
        this.status = status;
    }

    public String getNumberCard() {
        return this.numberCard;
    }

    public String getValidity() {
        return this.validity;
    }

    public String getCVV() {
        return this.cVV;
    }

    public String getCardBalance() {
        return this.cardBalance;
    }

    public String getStatus() {
        return this.status;
    }
}
