/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Applications;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ApplicationsTableInf extends AbstractTableModel {

    private int colnum = 5;
    private int rownum;

    private String[] colNames
            = {
                "ID заявки", "Описание заявки", "Статус заявки", "Информация об исполнении", "Номер паспорта"
            };
    private ArrayList<Applications> modelTableApplications;

    public ApplicationsTableInf() {
    }

    public ApplicationsTableInf(ArrayList<Applications> str) {
        this.modelTableApplications = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Applications data = modelTableApplications.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getId();
            case 1:
                return data.getDirection();
            case 2:
                return data.getStatus();
            case 3:
                return data.getExecution();
            case 4:
                return data.getNumberPassport();

        }
        return "";
    }

    @Override
    public int getRowCount() {
        return modelTableApplications.size();
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
