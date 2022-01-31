/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Payment;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class PaymentsTableInf extends AbstractTableModel {

    private int colnum = 5;
    private int rownum;

    private String[] colNames
            = {
                "ID платежа", "Номер карты", "Информация о платеже", "Сумма", "Статус"
            };
    private ArrayList<Payment> modelTablePayments;

    public PaymentsTableInf() {
    }

    public PaymentsTableInf(ArrayList<Payment> str) {
        this.modelTablePayments = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Payment data = modelTablePayments.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getCard();
            case 1:
                return data.getInformation();
            case 2:
                return data.getAmount();
            case 3:
                return data.getStatus();

        }
        return "";
    }

    @Override
    public int getRowCount() {
        return modelTablePayments.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }

    @Override
    public String getColumnName(int param) {
        switch (param) {
            case 0:
                return "ID заявки";
            case 1:
                return "Описание заявки";
            case 2:
                return "статус заявки";
            case 3:
                return "Исполнение заявки";
            case 4:
                return "Номер паспорта";
        }
        return "";
    }
}
