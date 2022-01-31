
package MyForms;

import ClientWork.SocketStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.util.ArrayList;
import AllData.Payment;
import TableModels.PaymentsTableInf;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
public class FormPayments extends javax.swing.JFrame{

    private TableModel payment;
     private java.sql.Statement stmt;
 ArrayList<String> str = new ArrayList<String>();
    public FormPayments() {

        try {
            //setApplicationsModel ();
            setPaymentModel("SELECT * FROM payments");
            System.out.println("fhgghg");
        } catch (IOException ex) {
            //Logger.getLogger(MainAdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
    }
    SocketStream socketstream = new SocketStream();
    public void setPaymentModel (String executeStr) throws IOException{
        ArrayList<Payment> payments = new ArrayList<Payment>();
        SocketStream socketstream = new SocketStream();
        socketstream.sendInt(6);
        socketstream.sendString(executeStr);
        int count = socketstream.getInt();

        for(int i = 0; i < count; i++){
            String id = socketstream.getString();
            String numberCard = socketstream.getString();
            String payment_information = socketstream.getString();
            String amount = socketstream.getString();
            String status = socketstream.getString();
            payments.add(new Payment(Integer.parseInt(id), numberCard, payment_information, amount, status));
        }
	payment = new PaymentsTableInf(payments);
    }

    public void ChangeTable(){
        getContentPane().removeAll();
        initComponents();
    }
    public void turnTo (int i){
        jTabbedPane1.setSelectedIndex(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FieldSortU = new javax.swing.JComboBox();
        SortU = new javax.swing.JButton();
        DescU = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        FieldFilter = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        From = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        To = new javax.swing.JTextField();
        SearchFilterU = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        FieldSearch = new javax.swing.JTextField();
        throwOff = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        barChart = new javax.swing.JButton();
        Inf = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("окно бухгалтера");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(payment);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Сортировка по");

        FieldSortU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "сбросить", "наименованию", "годовому проценту", "годовой цене", "месячному проценту", "месячной цене" }));

        SortU.setText("Сортировать");
        SortU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SortUMouseClicked(evt);
            }
        });

        DescU.setText("Обратный порядок");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DescU)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(FieldSortU, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SortU, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldSortU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SortU))
                .addGap(18, 18, 18)
                .addComponent(DescU)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Сортировка", jPanel1);

        FieldFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "сбросить", "годовому проценту", "годовой цене", "месячному проценту", "месячной цене" }));

        jLabel2.setText("от");

        jLabel3.setText("до");

        SearchFilterU.setText("Поиск");
        SearchFilterU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchFilterUMouseClicked(evt);
            }
        });
        SearchFilterU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFilterUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FieldFilter, 0, 146, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(SearchFilterU, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(SearchFilterU)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Фильтрация", jPanel2);

        jLabel4.setText("Введите наименование:");

        throwOff.setText("Сбросить");
        throwOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                throwOffMouseClicked(evt);
            }
        });

        Search.setText("Поиск");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(FieldSearch))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(throwOff, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(throwOff)
                    .addComponent(Search))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Поиск", jPanel3);

        jButton1.setText("Удалить информацию");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Выйти");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton7.setText("Создать отчет");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Построить круговую диаграмму");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        barChart.setText("Создать столбцовую диаграмму");
        barChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barChartActionPerformed(evt);
            }
        });

        Inf.setText("Добавить информацию");
        Inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfActionPerformed(evt);
            }
        });

        jButton3.setText("Изменить информацию");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barChart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Inf)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barChart)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SocketStream socketstream = new SocketStream();
        socketstream.sendString("END");
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        SigningInFrame SigningIn = new SigningInFrame();
        SigningIn.setVisible(true);
        SigningIn.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Необходимо выбрать запись!",
                        "Ошибка!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String name = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        //ViewPaymentRandom view = new ViewPaymentRandom(name);
        //view.setVisible(true);
        //view.setLocationRelativeTo(null);
        return;
    }//GEN-LAST:event_jButton1MouseClicked

    private void SortUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SortUMouseClicked
        socketstream.sendInt(7);
        socketstream.sendString("User");

        if(DescU.isSelected()){
            socketstream.sendInt(1);
        }
        else{
            socketstream.sendInt(0);
        }
        switch(FieldSortU.getSelectedIndex()){
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
        //TableChange();
        turnTo (1);
        int i=0;
        String str1, str2,str3,str4;
        try {
            while(i < socketstream.getInt())
            {
                str1 = socketstream.getString();
                str2 = socketstream.getString();
                str3 = socketstream.getString();
                str4 = socketstream.getString();
                
            }
            //PaymentsTableInf(str1,str2,str3,str4);
        } catch (IOException ex) {
            Logger.getLogger(FormPayments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SortUMouseClicked

    private void SearchFilterUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFilterUMouseClicked
        socketstream.sendInt(2);
        String min = From.getText();
        String max = To.getText();
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

                JOptionPane.showMessageDialog(null, "Не все поля заполнены!",
                    "Ошибка!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!checkString(min) || !checkString(max) || Double.parseDouble(min) > Double.parseDouble(max)){
                JOptionPane.showMessageDialog(null, "Введены неверные данные!",
                    "Ошибка!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            sqlString = "SELECT * FROM depreciation WHERE "+str+">="+min+" AND "+str+"<="+max;
        }
        // setPaymentModel (sqlString);
        socketstream.sendString(sqlString);
        ChangeTable();
        turnTo (1);
        //jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_SearchFilterUMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        socketstream.sendInt(3);
        String number_card = FieldSearch.getText();
        if(number_card.length() == 0){
            JOptionPane.showMessageDialog(null, "Необходимо ввести данные для поиска!",
                "!!!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String sqlString = "SELECT * FROM depreciation WHERE number_card='"+number_card+"'";
        //setPaymentModel (sqlString);
        socketstream.sendString(sqlString);
        ChangeTable();
        turnTo (1);
        //jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_SearchMouseClicked

    private void throwOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_throwOffMouseClicked
        String sqlString = "SELECT * FROM depreciation";
        //setDepreciationModel (sqlString);
        ChangeTable();
        turnTo (2);
    }//GEN-LAST:event_throwOffMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int count = jTable1.getRowCount();
        if(count == 0){
            JOptionPane.showMessageDialog(null, "Отсутствуют данные для отчета!",
                        "Ошибка!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileOutputStream("otchet.txt"));
            String header = "Наименование\t\tГодовой процент\t\tГодовая стоимость\t\tМесячный процент\t\tМесячная стоимость";
            writer.println(header);
            for (int i = 0; i < count; i++){
                String name = (String)jTable1.getValueAt(i, 0);
                float dd1 = (float)jTable1.getValueAt(i, 1);
                float dd2 = (float)jTable1.getValueAt(i, 2);
                float dd3 = (float)jTable1.getValueAt(i, 3);
                float dd4 = (float)jTable1.getValueAt(i, 4);
                String textStr = name+"\t\t\t"+dd1+"\t\t\t"+dd2+"\t\t\t"+dd3+"\t\t\t\t"+dd4;
                writer.println(textStr);
            }
            writer.close();

        } catch (IOException ex) {
            Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Отчет составлен.",
                        "Создание отчета",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        int count = jTable1.getRowCount();
        if(count == 0){
            JOptionPane.showMessageDialog(null, "Отсутствуют данные!",
                        "Ошибка!",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        DefaultPieDataset pie = new DefaultPieDataset();
        for (int i = 0; i < count; i++){
            String name = (String)jTable1.getValueAt(i, 0);
            float dd2 = (float)jTable1.getValueAt(i, 2);
            pie.setValue(name, new Float (dd2));
        }
        JFreeChart chart = ChartFactory.createPieChart("Диаграмма годовой стоимости амортизации", pie, true, true, true);
        PiePlot P =(PiePlot)chart.getPlot();
        ChartFrame frame = new ChartFrame("Амортизация", chart);
        frame.setVisible(true);
        frame.setSize(600, 500);
    }//GEN-LAST:event_jButton8MouseClicked

    private void barChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barChartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barChartActionPerformed

    private void InfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfActionPerformed
        // TODO add your handling code here:

        String str1,str2,str3,str4,size = null;
         Integer i=0;
        try {
                size = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (i <  Integer.parseInt(size)){
                try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);

            }
                try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }

                i++;

            }
    }//GEN-LAST:event_InfActionPerformed

    private void SearchFilterUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFilterUActionPerformed
        // TODO add your handling code here:
        ArrayList<Payment> payments = new ArrayList<>();
        socketstream.sendInt(6);
        String min = From.getText();
        String max = To.getText();
        String sqlString = "";
        String str = "";
       
        int choise = FieldFilter.getSelectedIndex();
        switch (choise) {
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
        if (choise > 0) {
            if (min.length() == 0 || max.length() == 0) {

                JOptionPane.showMessageDialog(null, "Не все поля заполнены!",
                        "Ошибка!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!checkString(min) || !checkString(max) || Double.parseDouble(min) > Double.parseDouble(max)) {
                JOptionPane.showMessageDialog(null, "Введены неверные данные!",
                        "Ошибка!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            sqlString = "SELECT * FROM payments WHERE " + str + ">=" + min + " AND " + str + "<=" + max;
        }
        // setPaymentModel (sqlString);
        socketstream.sendString(sqlString);
        int count = 0;
        try {
            count = socketstream.getInt();
        } catch (IOException ex) {
            Logger.getLogger(FormPayments.class.getName()).log(Level.SEVERE, null, ex);
        }

        for(int i = 0; i < count; i++){
            Integer id;
            String numberCard;
            String payment_information;
            try {
             id = socketstream.getInt();
            
                numberCard = socketstream.getString();
             
                payment_information = socketstream.getString();
            String amount = socketstream.getString();
            String status = socketstream.getString();
            payments.add(new Payment(id, numberCard, payment_information, amount, status));
            } catch (IOException ex) {
                Logger.getLogger(FormPayments.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	payment = new PaymentsTableInf(payments);
        
    }//GEN-LAST:event_SearchFilterUActionPerformed

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
   public void getResultFromPayments()
    {
     /*ResultSet rs = null;
     try
     {
      rs = stmt.executeQuery("SELECT * FROM doctor");
     }
     catch(SQLException e){}
     return rs;*/
         String str1,str2,str3,str4,size = null;
         Integer i=0;
         ArrayList<String[]> str = new ArrayList();
        try {
                size = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (i <  Integer.parseInt(size)){
                try {
                str1 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);

            }
                try {
                str2 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                str3 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }
                try {
                str4 = socketstream.getString();
            } catch (IOException ex) {
                Logger.getLogger(menuA.class.getName()).log(Level.SEVERE, null, ex);
            }

                i++;

            }
            
             //initComponents();
             
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DescU;
    private javax.swing.JComboBox FieldFilter;
    private javax.swing.JTextField FieldSearch;
    private javax.swing.JComboBox FieldSortU;
    private javax.swing.JTextField From;
    private javax.swing.JButton Inf;
    private javax.swing.JButton Search;
    private javax.swing.JButton SearchFilterU;
    private javax.swing.JButton SortU;
    private javax.swing.JTextField To;
    private javax.swing.JButton barChart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton throwOff;
    // End of variables declaration//GEN-END:variables

    
}
