/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Operations;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class OperationsTableInf extends AbstractTableModel {

    private int colnum = 3;
    private int rownum;

    private String[] colNames
            = {
                "ID операции", "Название услуги", "Номер паспорта"
            };
    private ArrayList<Operations> modelTableOperations;

    public OperationsTableInf() {
    }

    public OperationsTableInf(ArrayList<Operations> str) {
        this.modelTableOperations = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Operations data = modelTableOperations.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getID();
            case 1:
                return data.getName();
            case 2:
                return data.getPassport();

        }
        return "";
    }

    @Override
    public int getRowCount() {
        return modelTableOperations.size();
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
