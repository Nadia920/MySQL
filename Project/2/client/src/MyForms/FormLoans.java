package MyForms;
import AllData.Applications;
import AllData.Payment;
import AllData.Loans;
import TableModels.LoansTableInf;
import ClientWork.SocketStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class FormLoans extends javax.swing.JFrame {
    private TableModel loan;
    //private TableModel capital;
    private TableModel users;
    //private MyDBConnection mdbc;
     private java.sql.Statement stmt;

     ArrayList<String> str = new ArrayList<String>();
     public FormLoans() {
       try {
            //setApplicationsModel ();
            setLoansModel("SELECT * FROM loans");
        } catch (IOException ex) {
            //Logger.getLogger(MainAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

         
        initComponents();
    }
     
     
    SocketStream socketstream = new SocketStream();

    public void setLoansModel (String executeStr) throws IOException{
        ArrayList<Loans> loans = new ArrayList<Loans>();
        socketstream.sendInt(3);
        socketstream.sendString(executeStr);
        int count = socketstream.getInt();
        for(int i = 0; i < count; i++){
            Integer idLoans = socketstream.getInt();
            String nameBorrow = socketstream.getString();
            String cause = socketstream.getString();
            String amount = socketstream.getString();
            String term = socketstream.getString();
            String percent = socketstream.getString();
            String nameGuarantor = socketstream.getString();
            String dateGuarantor = socketstream.getString();
            String numberpassport = socketstream.getString();
            String numberGusrantor = socketstream.getString();
            loans.add(new Loans(idLoans, nameBorrow, cause, amount, term, percent, nameGuarantor, dateGuarantor, numberpassport, numberGusrantor));
        }
	//payment = new PaymentsTableInf(payments);
        loan = new LoansTableInf(loans);
    }
    public void TableChange(){
        getContentPane().removeAll();
        initComponents();
    }
    public void turnTo (int i){
        jTabbedPane1.setSelectedIndex(i);
    }


    /*public void setUserModel () throws IOException{
        ArrayList<User> users = new ArrayList<User>();
        SocketStream socketstream = new SocketStream();
        socketstream.sendInt(8);
        int count = socketstream.getInt();
        for(int i = 0; i < count; i++){
            String login = socketstream.getString();
            String password = socketstream.getString();
            String number_card = socketstream.getString();
            users.add(new User(login, password, number_card));
        }
	//this.users = new UsersTableModel(users);
    }*/



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FieldSort = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        Sort = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        FieldFilter = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        FieldSearch = new javax.swing.JTextField();
        resetSearch = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        ButtonDetails = new javax.swing.JButton();
        ButtonCreateReport = new javax.swing.JButton();
        ButtonPieChart = new javax.swing.JButton();
        ButtonBarChart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("??????????????????????????");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable3.setModel(loan);
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane2.setName(""); // NOI18N

        jLabel1.setText("???????????????????? ????:");

        FieldSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "????????????????", "????????????????????????", "???????????????? ????????????????", "?????????????? ????????", "?????????????????? ????????????????", "???????????????? ????????" }));

        jCheckBox1.setText("???????????????? ??????????????");

        Sort.setText("??????????????????????");
        Sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SortMouseClicked(evt);
            }
        });
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FieldSort, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sort))
                    .addComponent(jCheckBox1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sort))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("????????????????????", jPanel4);

        FieldFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "????????????????", "?????????????? ??????????????", "?????????????? ????????", "???????????????? ??????????????", "???????????????? ????????" }));

        jLabel2.setText("????");

        jLabel3.setText("????");

        jButton9.setText("??????????????????????");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FieldFilter, 0, 154, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(23, 23, 23))
        );

        jTabbedPane2.addTab("????????????????????", jPanel5);

        jLabel4.setText("?????????????? ????????????????????????:");

        resetSearch.setText("????????????????");
        resetSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetSearchMouseClicked(evt);
            }
        });

        Search.setText("??????????");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(resetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(FieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetSearch)
                    .addComponent(Search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("??????????", jPanel6);

        ButtonDetails.setText("??????????????????");
        ButtonDetails.setActionCommand("");
        ButtonDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDetailsMouseClicked(evt);
            }
        });

        ButtonCreateReport.setText("?????????????? ??????????");
        ButtonCreateReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCreateReportMouseClicked(evt);
            }
        });

        ButtonPieChart.setText("?????????????????? ???????????????? ??????????????????");
        ButtonPieChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPieChartMouseClicked(evt);
            }
        });

        ButtonBarChart.setText("?????????????????? ???????????????????? ?????????????????? ");

        jButton3.setText("?????????????? ????????????????????");

        jButton4.setText("???????????????? ????????????????????");

        jButton2.setText("???????????????? ????????????????????");

        Exit.setText("??????????");
        Exit.setActionCommand("");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCreateReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPieChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBarChart, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonCreateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(ButtonPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonBarChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Exit))
                            .addComponent(jTabbedPane2))
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("???????????? ????????????????", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(647, 647, 647))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("??????????????");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SocketStream socketstream = new SocketStream();
        socketstream.sendString("END");
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        this.setVisible(false);
        SigningInFrame SigningIn = new SigningInFrame();
        SigningIn.setVisible(true);
        SigningIn.setLocationRelativeTo(null);
    }//GEN-LAST:event_ExitMouseClicked

    private void ButtonPieChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPieChartMouseClicked
        int count = jTable3.getRowCount();
        if(count == 0){
            JOptionPane.showMessageDialog(null, "?????????????????????? ????????????!",
                "????????????!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DefaultPieDataset pie = new DefaultPieDataset();
        for (int i = 0; i < count; i++){
            String name = (String)jTable3.getValueAt(i, 0);
            float dd = (float)jTable3.getValueAt(i, 2);
            pie.setValue(name, new Float (dd));
        }
        JFreeChart chart = ChartFactory.createPieChart("?????????????????? ???????????????? ???? ??????", pie, true, true, true);
        PiePlot P =(PiePlot)chart.getPlot();
        ChartFrame frame = new ChartFrame("??????????????????????", chart);
        frame.setVisible(true);
        frame.setSize(600, 500);
    }//GEN-LAST:event_ButtonPieChartMouseClicked

    private void ButtonCreateReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCreateReportMouseClicked
        int count = jTable3.getRowCount();
        if(count == 0){
            JOptionPane.showMessageDialog(null, "?????????????????????? ???????????? ?????? ????????????!",
                "????????????!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream("otchet.txt"));
            String header = "????????????????????????\t\t?????????????? ??????????????\t\t?????????????? ??????????????????\t\t???????????????? ??????????????\t\t???????????????? ??????????????????";
            writer.println(header);
            for (int i = 0; i < count; i++){
                String name = (String)jTable3.getValueAt(i, 0);
                float d1 = (float)jTable3.getValueAt(i, 1);
                float d2 = (float)jTable3.getValueAt(i, 2);
                float d3 = (float)jTable3.getValueAt(i, 3);
                float d4 = (float)jTable3.getValueAt(i, 4);
                String text = name+"\t\t\t"+d1+"\t\t\t"+d2+"\t\t\t"+d3+"\t\t\t\t"+d4;
                writer.println(text);
            }
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(FormLoans.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "?????????? ??????????????????.",
            "???????????????? ????????????",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ButtonCreateReportMouseClicked

    private void ButtonDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDetailsMouseClicked
        if(jTable3.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "???????????????????? ?????????????? ????????????!",
                "????????????!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String name = (String)jTable3.getValueAt(jTable3.getSelectedRow(), 0);
        ViewPayment view = new ViewPayment();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        return;
    }//GEN-LAST:event_ButtonDetailsMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        socketstream.sendInt(3);
        String number_card = FieldSearch.getText();
        if(number_card.length() == 0){
            JOptionPane.showMessageDialog(null, "???????????????????? ???????????? ???????????? ?????? ????????????!",
                "!!!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String sqlString = "SELECT * FROM depreciation WHERE number_card='"+number_card+"'";
        //setPaymentModel (sqlString);
        socketstream.sendString(sqlString);
        TableChange();
        turnTo (1);
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_SearchMouseClicked

    private void resetSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetSearchMouseClicked
        String sqlString = "SELECT * FROM payments";
        try {
            setLoansModel (sqlString);
        } catch (IOException ex) {
            Logger.getLogger(FormLoans.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableChange();
        turnTo (1);
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_resetSearchMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        socketstream.sendInt(2);
        String min = from.getText();
        String max = to.getText();
        String sqlString = "";
        String str = "";
        int choise = FieldFilter.getSelectedIndex();
        switch(choise){
            case 0:
            sqlString = "SELECT * FROM payments";
            System.out.println(123);
            break;
            case 1:
            str = "number_card";
            break;
            case 2:
            str = "amount";
            break;
            
        }
        if(choise > 0){
            if(min.length() == 0 || max.length() == 0){

                JOptionPane.showMessageDialog(null, "???? ?????? ???????? ??????????????????!",
                    "????????????!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!checkString(min) || !checkString(max) || Double.parseDouble(min) > Double.parseDouble(max)){
                JOptionPane.showMessageDialog(null, "?????????????? ???????????????? ????????????!",
                    "????????????!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            sqlString = "SELECT * FROM depreciation WHERE "+str+">="+min+" AND "+str+"<="+max;
        }
        // setPaymentModel (sqlString);
        socketstream.sendString(sqlString);
        TableChange();
        turnTo (1);
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton9MouseClicked

    private void SortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SortMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SortMouseClicked

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton9ActionPerformed








///////////////////////////????????????????????///////////////////////////
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {
        socketstream.sendInt(7);
        socketstream.sendString("Admin");
        if(jCheckBox1.isSelected()){
            socketstream.sendInt(1);
        }
        else{
            socketstream.sendInt(0);
        }
        switch(FieldSort.getSelectedIndex()){
            case 0:
                socketstream.sendInt(0);
                break;
            case 1:
                socketstream.sendInt(1);
                break;
            case 2:
                socketstream.sendInt(2);
                break;
            case 3:
                socketstream.sendInt(3);
                break;
            case 4:
                socketstream.sendInt(4);
                break;
        }
        TableChange();
        turnTo (1);
    }



        public boolean checkString(String string) {
         if (string == null || string.length() == 0) return false;

         int i = 0;
         if (string.charAt(0) == '-') {
            if (string.length() == 1) {
               return false;
            }
            i = 1;
         }
         int punktAmt = 0;
         char c;
         for (; i < string.length(); i++) {
             c = string.charAt(i);
             if (!((c >= '0' && c <= '9')||c=='.')) {
                 return false;
             }
             if(c=='.'){
                 punktAmt++;
             }
         }
         if(punktAmt > 1)
             return false;
         return true;
     }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormLoans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBarChart;
    private javax.swing.JButton ButtonCreateReport;
    private javax.swing.JButton ButtonDetails;
    private javax.swing.JButton ButtonPieChart;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox FieldFilter;
    private javax.swing.JTextField FieldSearch;
    private javax.swing.JComboBox FieldSort;
    private javax.swing.JButton Search;
    private javax.swing.JButton Sort;
    private javax.swing.JTextField from;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton resetSearch;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
