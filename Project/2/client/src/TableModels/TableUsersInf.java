/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;
import AllData.User;
import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author User
 */
public class TableUsersInf extends AbstractTableModel{
 private int colnum=5;
 private int rownum;
 
 /*private String[] colNames = 
 {
   "iduser","login","password","number_card","number_passport"
 };*/
 
 private  ArrayList<User> modelTableUser;
    
 public TableUsersInf(ArrayList<User> str) 
 {
    modelTableUser = str;
 }
   
 @Override
 public Object getValueAt(int rowindex, int columnindex) 
 {
   User data = modelTableUser.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getID();
            case 1:
                return data.getNumber();
            case 2:
                return data.getLogin();
            case 3:
                return data.getPassword();

        }
        return "";
 }

 @Override
 public int getRowCount() 
 {
  return modelTableUser.size();
 }

 @Override
 public int getColumnCount() 
 {
  return colnum;
 }

 @Override
 public String getColumnName(int param)
 {
  switch (param) {
            case 0:
                return "ID";
            case 1:
                return "Логин";
            case 2:
                return "Пароль";
            case 3:
                return "Номер паспорта";
        }
        return "";
 }
}
