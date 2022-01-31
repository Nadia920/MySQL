/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Loans;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class LoansTableInf extends AbstractTableModel {

    private int colnum = 10;
    private int rownum;

    private String[] colNames
            = {
                "ID заёма", "Имя взявшего", "Причина", "Сумма занятых средств", "Условия оплаты", "Процент", "Имя поручителя", "Дата рождения поручителя", "Номер паспорта", "Номер паспорта поручителя" 
            };
    private ArrayList<Loans> modelTableLoans;

    public LoansTableInf() {
    }

    public LoansTableInf(ArrayList<Loans> str) {
        this.modelTableLoans = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Loans data = modelTableLoans.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getID();
            case 1:
                return data.getNameBorrower();
            case 2:
                return data.getCause();
            case 3:
                return data.getAmount();
            case 4:
                return data.getTerm();
            case 5:
                return data.getPercent();
            case 6:
                return data.getNameGuarantor();
            case 7:
                return data.getDateGuarantor();
            case 8:
                return data.getNumberPassport();
            case 9:
                return data.getNumberGuarantor();

        }
        return "";
    }

    @Override
    public int getRowCount() {
        return modelTableLoans.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }

    @Override
    public String getColumnName(int param) {
        switch (param) {
            case 0:
                return "ID заёма";
            case 1:
                return "Имя взявшего";
            case 2:
                return "Причина";
            case 3:
                return "Сумма занятых средств";
            case 4:
                return "Условия оплаты";
            case 5:
                return "Процент";
            case 6:
                return "Имя поручителя";
            case 7:
                return "Дата рождения поручителя";
            case 8:
                return "Номер паспорта";
            case 9:
                return "Номер паспорта поручителя";
        }
        return "";
    }
}
