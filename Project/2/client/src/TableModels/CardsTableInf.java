/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModels;


import AllData.Cards;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author User
 */
public class CardsTableInf extends AbstractTableModel{
    private int colnum=5;
 private int rownum;
 
 private String[] colNames = 
 {
   "Номер карты","Срок действия","CVV код","Баланс карты","Статус карты"
 };
 
 private  ArrayList<Cards> tablecards;
 public CardsTableInf(){}
 public CardsTableInf(ArrayList<Cards> str) 
 {
  this.tablecards = str;
 }
   
 @Override
 public Object getValueAt(int rowindex, int columnindex) 
 {
  /*String[] row = ResultSets.get(rowindex);
  return row[columnindex];*/
     Cards data = tablecards.get(rowindex);
        switch (columnindex) {
            case 0:
                return data.getNumberCard();
            case 1:
                return data.getValidity();
            case 2:
                return data.getCVV();
            case 3:
                return data.getCardBalance();
            case 4:
                return data.getStatus();

        }
        return "";
 }

 @Override
 public int getRowCount() 
 {
  return tablecards.size();
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
                return "Номер карты";
            case 1:
                return "Срок действия";
            case 2:
                return "CVV код";
            case 3:
                return "Баланс карты";
            case 4:
                return "Статус карты";
        }
        return "";
    }
}
