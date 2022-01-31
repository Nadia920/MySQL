/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;

import AllData.Client;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ClientTableInf extends AbstractTableModel {

    private int colnum = 9;
    private int rownum;

    private String[] colNames
            = {
                "Полное имя", "Номер паспорта", "Дата рождения", "Кто вы?", "Номер карты", "Место работы/учёбы",  "Дата становления клиентом банка", "Информация о вернутых средствах", "Номер телефона", 
            };
    private ArrayList<Client> modelTableClient;

    public ClientTableInf() {
    }

    public ClientTableInf(ArrayList<Client> str) {
        this.modelTableClient = str;
    }

    @Override
    public Object getValueAt(int rowindex, int columnindex) {
        Client data = modelTableClient.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getFullName();
            case 1:
                return data.getPassport();
            case 2:
                return data.getDate();
            case 3:
                return data.getWho();
            case 4:
                return data.getNumberCard();
            case 5:
                return data.getStartBank();
            case 6:
                return data.getPlace();
            case 7:
                return data.getInformation ();
            case 8:
                return data.getNumberPhone();

        }
        return "";
    }

    @Override
    public int getRowCount() {
        return modelTableClient.size();
    }

    @Override
    public int getColumnCount() {
        return colnum;
    }

    @Override
    public String getColumnName(int param) {
        switch (param) {
            case 0:
                return "Полное имя";
            case 1:
                return "Номер паспорта";
            case 2:
                return "Дата рождения";
            case 3:
                return "Кто вы?";
            case 4:
                return "Номер карты";
            case 5:
                return "Место работы/учёбы";
            case 6:
                return "Дата становления клиентом банка";
            case 7:
                return "Информация о вернутых средствах";
            case 8:
                return "Номер иелефона";
              
        }
        return "";
    }
}
