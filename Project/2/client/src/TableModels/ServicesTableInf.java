/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Services;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ServicesTableInf extends AbstractTableModel {

    private int colnum = 4;
    private int rownum;

    private String[] colNames
            = {
                "Название сервиса", "Описание сервиса", "CVV", "Кому предоставляется"
            };
    private ArrayList<Services> modelTableServices;

    public ServicesTableInf() {
    }

    public ServicesTableInf(ArrayList<Services> str) {
        this.modelTableServices = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Services data = modelTableServices.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getNumber_card();
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
        return modelTableServices.size();
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
