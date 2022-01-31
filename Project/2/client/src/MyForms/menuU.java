/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyForms;

import AllData.Loans;
import AllData.Payment;
import ClientWork.SocketStream;
import MyForms.AddCard;
import TableModels.LoansTableInf;
import TableModels.PaymentsTableInf;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class menuU extends javax.swing.JFrame {

    /*private JLabel jLabel1;
    private JRadioButton addCard;
    private JRadioButton Erip;
    private JRadioButton NumberCard;
    private JRadioButton BalanceCard;
    private JRadioButton PaymentCard;
    private JRadioButton LastPayments;
    private JRadioButton PaymentsMade;
    private JRadioButton SelectedPayments;
    private JRadioButton OrderReferenceCredit;
    private JRadioButton OrderCard;
    private JRadioButton YourCredit;
    private JButton jButton1;
    private JRadioButton Delete;
    private JRadioButton NoErip;
    private JRadioButton OpenDeposit;
    private JRadioButton TakeCredit;
    private JRadioButton OrderAccount;*/
    /**
     * Creates new form menuU
     */
    public menuU() {
        initComponents();
    }
    SocketStream socketstream = new SocketStream();
    String size = null;
    String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addCard = new javax.swing.JRadioButton();
        Erip = new javax.swing.JRadioButton();
        NumberCard = new javax.swing.JRadioButton();
        BalanceCard = new javax.swing.JRadioButton();
        LastPayments = new javax.swing.JRadioButton();
        SelectedPayments = new javax.swing.JRadioButton();
        OrderAccount = new javax.swing.JRadioButton();
        OrderCard = new javax.swing.JRadioButton();
        TakeCredit = new javax.swing.JRadioButton();
        YourCredit = new javax.swing.JRadioButton();
        OpenDeposit = new javax.swing.JRadioButton();
        NoErip = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Delete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Выберите, что Вы хотите сделать");

        addCard.setText("Добавить карту");
        addCard.setToolTipText("");
        addCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardActionPerformed(evt);
            }
        });

        Erip.setText("Действовать через систему расчёта Ерип");

        NumberCard.setText("посмотреть номер карты");

        BalanceCard.setText("Посмотреть баланс карты ");

        LastPayments.setText("Посмотреть свои платежи");
        LastPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastPaymentsActionPerformed(evt);
            }
        });

        SelectedPayments.setText("Посмотреть избранные платежи");

        OrderAccount.setText("Оформить заявку на счёт");
        OrderAccount.setToolTipText("");

        OrderCard.setText("Заказать карту");

        TakeCredit.setText("Взять кредит или овердрафт");

        YourCredit.setText("Посмотреть данные о своих кредитах и другом ");

        OpenDeposit.setText("Открыть вклад ");

        NoErip.setText("Действовать не через систему расчёта Ерип");

        jButton1.setText("Выбрать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Delete.setText("Удалить карту ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LastPayments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BalanceCard, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Erip, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectedPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCard)
                            .addComponent(NumberCard, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YourCredit)
                    .addComponent(OpenDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TakeCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderCard, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoErip, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumberCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BalanceCard))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OrderAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OrderCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(YourCredit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LastPayments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SelectedPayments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Erip))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(TakeCredit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoErip)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (addCard.isSelected()) {
            socketstream.sendInt(15);
            this.setVisible(false);
            AddCard add = new AddCard();
            add.setVisible(true);
            add.setLocationRelativeTo(null);
            /*try {
                socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
        if (NumberCard.isSelected()) {
            socketstream.sendInt(16);
            //socketstream.getString();
            this.setVisible(false);
            getNumber get = new getNumber();
            get.setVisible(true);
            get.setLocationRelativeTo(null);
        }
        if (BalanceCard.isSelected()) {
            socketstream.sendInt(17);
            this.setVisible(false);
            getBalance get = new getBalance();
            get.setVisible(true);
            get.setLocationRelativeTo(null);

        }
        if (LastPayments.isSelected()) {
              socketstream.sendInt(18);
            functionLastPayments();
        }
        if (SelectedPayments.isSelected()) {
            socketstream.sendInt(13);
            functionSelectedPayments();

        }

        if (OrderAccount.isSelected()) {
            socketstream.sendInt(19);
            this.setVisible(false);
            Order get = new Order();
            get.setVisible(true);
            get.setLocationRelativeTo(null);

        }
        if (OrderCard.isSelected()) {
            socketstream.sendInt(20);
            this.setVisible(false);
            Order get = new Order();
            get.setVisible(true);
            get.setLocationRelativeTo(null);

        }
        if (YourCredit.isSelected()) {
            socketstream.sendInt(21);
            try {
                functionYourCredit();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (TakeCredit.isSelected()) {
            socketstream.sendInt(22);
            //functionTakeCredit();
            this.setVisible(false);
            takeALoan get = new takeALoan();
            get.setVisible(true);
            get.setLocationRelativeTo(null);
        }
        if (OpenDeposit.isSelected()) {
            socketstream.sendInt(23);
            this.setVisible(false);
            Deposit deposit = new Deposit();
            deposit.setVisible(true);
            deposit.setLocationRelativeTo(null);
        }
        if (Erip.isSelected()) {
            socketstream.sendInt(24);
            this.setVisible(false);
            PaymentRandom get = new PaymentRandom();
            get.setVisible(true);
            get.setLocationRelativeTo(null);
        }
        if (NoErip.isSelected()) {
            socketstream.sendInt(25);
            
            this.setVisible(false);
            NoErip get = new NoErip();
            get.setVisible(true);
            get.setLocationRelativeTo(null);
        }
        if (Delete.isSelected()) {
            socketstream.sendInt(26);
            this.setVisible(false);
            DeleteCard get = new DeleteCard();
            get.setVisible(true);
            get.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    void functionLastPayments() {
        Integer id = 0;
        socketstream.sendInt(10);
        /*try {
            size = socketstream.getString();
        } catch (IOException ex) {
            Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Payment> paym = new ArrayList<Payment>();
        for (int i = 0; i < Integer.parseInt(size); i++) {
            try {
                id = socketstream.getInt();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Payment payObj = new Payment(id, str1, str2, str3, str4);
            paym.add(payObj);
        }
        PaymentsTableInf str = new PaymentsTableInf(paym);*/
        this.setVisible(false);
        FormPayments formPayments = new FormPayments();
        formPayments.setVisible(true);
        formPayments.setLocationRelativeTo(null);

    }

    void functionSelectedPayments() {
        Integer id = 0;
       /* try {
            size = socketstream.getString();
        } catch (IOException ex) {
            Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Payment> paym = new ArrayList<Payment>();
        for (int i = 0; i < Integer.parseInt(size); i++) {
            try {
                id = socketstream.getInt();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            Payment payObj = new Payment(id, str1, str2, str3, str4);
            paym.add(payObj);
        }
        PaymentsTableInf str = new PaymentsTableInf(paym);*/
        this.setVisible(false);
        FormPayments formPayments = new FormPayments();
        formPayments.setVisible(true);
        formPayments.setLocationRelativeTo(null);

    }

    void functionYourCredit() throws IOException {
       Integer id = 0;
        /*try {
            size = socketstream.getString();
        } catch (IOException ex) {
            Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Loans> loans = new ArrayList<Loans>();
        for (int i = 0; i < Integer.parseInt(size); i++) {
            try {
                id = socketstream.getInt();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str5 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str6 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str7 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str8 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str9 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            Loans loansObj = new Loans(id, str1, str2, str3, str4, str5, str6, str7, str8, str9);
            loans.add(loansObj);
        }
        LoansTableInf str = new LoansTableInf(loans);*/
        this.setVisible(false);
        GetYourCredit get = new GetYourCredit();
        get.setVisible(true);
        get.setLocationRelativeTo(null);
        String numberPassport = get.getCredit();
        this.setVisible(false);
        FormLoans formLoans = new FormLoans();
        formLoans.setVisible(true);
        formLoans.setLocationRelativeTo(null);
        formLoans.setLoansModel("SELECT * FROM loans WHERE `number_passport` = '"+numberPassport+"'");

    }

    void functionTakeCredit() {
       /* try {
            size = socketstream.getString();
        } catch (IOException ex) {
            Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < Integer.parseInt(size); i++) {
            try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str5 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str6 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str7 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str8 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                str9 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
    private void LastPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastPaymentsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BalanceCard;
    private javax.swing.JRadioButton Delete;
    private javax.swing.JRadioButton Erip;
    private javax.swing.JRadioButton LastPayments;
    private javax.swing.JRadioButton NoErip;
    private javax.swing.JRadioButton NumberCard;
    private javax.swing.JRadioButton OpenDeposit;
    private javax.swing.JRadioButton OrderAccount;
    private javax.swing.JRadioButton OrderCard;
    private javax.swing.JRadioButton SelectedPayments;
    private javax.swing.JRadioButton TakeCredit;
    private javax.swing.JRadioButton YourCredit;
    private javax.swing.JRadioButton addCard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
