package ServerWork;
import java.util.Scanner;
import java.io.*;//импорт пакета, содержащего классы для
// ввода/вывода
import java.net.*;//импорт пакета, содержащего классы для
// работы в сети
import Database.MyDatabase;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;
//Scanner in = new Scanner();
public class ServerWork {
    private BufferedReader in;
    private PrintWriter out;
    private MyDatabase database;
     /*BufferedReader stdin =
                    new BufferedReader(new InputStreamReader(System.in));//создание
//буферизированного символьного потока ввода
            ObjectOutputStream soos =
                    new ObjectOutputStream(clientSocket.getOutputStream());//создание
//потока вывода

            ObjectInputStream sois =
                    new ObjectInputStream(clientSocket.getInputStream());//создание
//потока ввода*/

            public ServerWork (BufferedReader in, PrintWriter out, MyDatabase database){
        this.in = in;
        this.out = out;
        this.database = database;
    }

    public void getId (int idOperation) throws IOException, SQLException{
         if (idOperation < 14){
            switch(idOperation){
            case 1:
                viewClients();//посмотреть карты и счета всех пользователей
                break;
            case 2:
                outputCardsTable();//Посмотреть заказы карт
                break;
            case 3:
                depositsAndLoans();//Вклады и займы
                break;
            case 4:
                ordersForNewAccount();//Заказы на новый счёт
                break;
             case 5:
                blockCard();//Заблокировать карту
                break;
             case 6:
                viewAllPayments();//Посмотреть все платежи по карте
                break;
             case 7:
                operations();
                break;
             case 8:
                services();
                break;
            case 9:
                SortFilter();
                break;
            case 10:
                outputDiagram();
                break;
            case 11:
                showUsers();
                break;
           }
         }
         else {
            switch(idOperation){

            case 15:
                addСard();//Добавить карту
                break;
            case 16:
                 viewСardNumber();//посмотреть номер карты
                break;
            case 17:
                viewСardBalance();//Посмотреть баланс карты
                break;
             case 18:
                viewRecentPayments();//Посмотреть последние платежи
                break;
            case 21:
                viewSelectedPayments();//Посмотреть избранные платежи
                break;
            case 23:
                applyForAnAccount();//Оформить заявку на счёт
                break;
            case 24:
                orderACard();//Заказать карту
                break;
            case 25:
                viewDetailsOfYourLoansAndOther();//Посмотреть данные о своих кредитах и другом
                break;
            case 26:
                takeALoanOrOverdraft();//Взять кредит или овердрафт
                break;
            case 27:
                openDeposit();//Открыть вклад
                break;
            case 28:
                operateThroughErip();//Действовать через систему расчёта Ерип
                break;
            case 29:
                noOperateThroughErip();//Действовать не через систему расчёта Ерип
                break;
            case 30:
                Delete();
                break;
            case 31:
                signingIn();
                break;
            case 32:
                registrationUser();
                break;
                case 33:
                outputApplicationTable();
                break;
                 case 34:
                EditClient();
                break;
                case 35:
                DeleteClient();
                break;
                case 36:
                AddClient();
                break;
                case 37:
                SortClient();
                break;
                
         }
         }

    }
    private void SortFilter() throws IOException, SQLException{
        try {
            String sqlString;
            String desc = "";
            if(in.readLine().equals("User")){
            sqlString = "SELECT * FROM payments ORDER BY ";
            }
            else {
            sqlString = "SELECT * FROM payments ORDER BY ";
            }
            if(Integer.parseInt(in.readLine()) == 1){
                desc = " DESC";
            }
            switch(Integer.parseInt(in.readLine())){
                case 0:
                    sqlString = "SELECT * FROM payments";
                    break;
                case 1:
                    sqlString += "numberCP "+desc;
                    break;
                case 2:
                    sqlString += "payment_information "+desc;
                    break;
                case 3:
                    sqlString += "amount "+desc;
                    break;
                case 4:
                    sqlString += "status "+desc;
                    break;
            }
        ResultSet result = database.select(sqlString);
        int countCl = 0;
        if(result.first()){
            do{
               countCl++;
            }while(result.next());
        }
        out.println(Integer.toString(countCl));
        result.first();

        for(int i = 0; i < countCl; i++){


            out.println(result.getString("number_card"));
                out.println(result.getString("validity"));
                out.println(result.getString("CVV"));
                out.println(result.getString("card_balance"));
            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
            
            
        } catch (IOException ex) {
            Logger.getLogger(ServerWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Delete() throws IOException {

        String number = in.readLine();
        /*cois.read(b)
        number = cois.read();
        in.read(number);*/

        database.delete("DELETE FROM cards WHERE `number_card` = '"+number+"'");
    }
    private void signingIn() throws IOException, SQLException{
        String login = in.readLine();
        String password = in.readLine();
        
        
        ResultSet result;
        result = database.select("select * from users where login = '"+login+"' and password = '"+password+"'");
        if(result.next()){
           
            out.println("0");
            /*if (login.equals("1234") && password.equals("1234") ){
            out.println("1");
            }
            else out.println("0");*/
        }else{
            if (login.equals("1234") && password.equals("1234") ){
            out.println("1");
            }
            else out.println("error");
        }
    }

    private void registrationUser() throws IOException, SQLException{
       
        String FullName = in.readLine();
        String passport = in.readLine();
        String time = in.readLine();
        String who = in.readLine();
        String place = in.readLine();
        String start = in.readLine();
        String inf = in.readLine();
        String phone = in.readLine();
        String card = in.readLine();
        String login = in.readLine();
        String password = in.readLine();
       
        int status = Integer.parseInt(in.readLine());
        String sqlString = "SELECT * FROM users where login='"+login+"'";
        ResultSet rs = database.select(sqlString);
        if(rs.next()){
            out.println("error");
        }else{
            out.println("ok");
        }
        database.insert("INSERT INTO cards VALUES ('"+card+"','1111', '111' , '10', 'Рабочая')");
        database.insert("INSERT INTO client VALUES ('"+FullName+"','"+passport+"', '"+time+"' , '"+who+"', '"+card+"', '"+place+"', '"+start+"', '"+inf+"' , '"+phone+"')");
        sqlString = "INSERT INTO users (login, password, number_card, number_passport) VALUES ('"+login+"','"+password+"', '"+card+"' , '"+passport+"')";
        database.insert(sqlString);
    }

    private void viewClients() throws SQLException, IOException {
        String str = in.readLine();
        
        ResultSet resultCl = database.select(str);
        
        int countCl = 0;
        if(resultCl.first()){
            do{
               countCl++;
            }while(resultCl.next());
        }
        System.out.println(countCl);
        out.println(countCl);
        resultCl.first();
        
        for(int i = 0; i < countCl; i++){


            out.println(resultCl.getString("Full_name"));
            out.println(resultCl.getString("number_passport"));
            out.println(resultCl.getString("date_of_birth"));
            out.println(resultCl.getString("who"));
            out.println(resultCl.getString("numberCC"));
            out.println(resultCl.getString("place_of_work"));
            out.println(resultCl.getString("date_start_bank_client"));
            out.println(resultCl.getString("information_about_returned_funds"));
            out.println(resultCl.getString("number_phone"));
            //out.println(Integer.toString(result.getInt("status")));
            resultCl.next();
            
        }
        return;
    }

    private void outputApplicationTable() throws IOException,SQLException{
        String executeStr = in.readLine();
        ResultSet result = database.select(executeStr);
        int countCl = 0;
        if(result.first()){
            do{
               countCl++;
            }while(result.next());
        }
        out.println(Integer.toString(countCl));
        result.first();

        for(int i = 0; i < countCl; i++){


            out.println(result.getInt("id_application"));
                out.println(result.getString("direction_application"));
                out.println(result.getString("status_applicatio"));
                out.println(result.getString("execution_application"));
                out.println(result.getString("number_passport"));
            result.next();
        }
    }
    private void outputCardsTable() throws IOException,SQLException{
        String executeStr = in.readLine();
        ResultSet result = database.select(executeStr);
        int countCl = 0;
        if(result.first()){
            do{
               countCl++;
            }while(result.next());
        }
        out.println(Integer.toString(countCl));
        result.first();

        for(int i = 0; i < countCl; i++){


                out.println(result.getString("number_card"));
                out.println(result.getString("validity"));
                out.println(result.getString("CVV"));
                out.println(result.getString("card_balance"));
                out.println(result.getString("status_card"));
            result.next();
        }
    }
    private void viewCard() throws SQLException{//
        /*ResultSet resultCD = database.select("SELECT * FROM cards");
        int countCD = 0;
        if(resultCD.first()){
            do{
               countCD++;
            }while(resultCD.next());
        }
        out.println(Integer.toString(countCD));
        resultCD.first();
         Vector<String> data = new Vector();
        for(int i = 0; i < countCD; i++){
            data.addElement(resultCD.getString("number_card"));
            data.addElement(resultCD.getString("validity"));
            data.addElement(resultCD.getString("CVV"));
            data.addElement(resultCD.getString("card_balance"));

            //out.println(Integer.toString(result.getInt("status")));
            resultCD.next();
        }
        return (data);*/
        ResultSet result = database.select("SELECT * FROM cards");
        int countCl = 0;
        if(result.first()){
            do{
               countCl++;
            }while(result.next());
        }
        out.println(Integer.toString(countCl));
        result.first();

        for(int i = 0; i < countCl; i++){


            out.println(result.getString("number_card"));
                out.println(result.getString("validity"));
                out.println(result.getString("CVV"));
                out.println(result.getString("card_balance"));
            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
        //out.println(result.lenght);



    }

    public void depositsAndLoans() throws SQLException{//
        ResultSet resultL = database.select("SELECT * FROM loans");
        int countL = 0;
        if(resultL.first()){
            do{
               countL++;
            }while(resultL.next());
        }
        out.println(Integer.toString(countL));
        resultL.first();

        for(int i = 0; i < countL; i++){
        out.println(resultL.getString("idloans"));
        out.println(resultL.getString("name_borrower"));
        out.println(resultL.getString("cause"));
        out.println(resultL.getString("amount_commas_funds"));
        out.println(resultL.getString("payment_term"));
        out.println(resultL.getString("percent"));
        out.println(resultL.getString("name_quarantor"));
        out.println(resultL.getString("date_birth_quarantor"));
        out.println(resultL.getString("numberCL"));
        out.println(resultL.getString("number_passportGuarantor"));
        
            //out.println(Integer.toString(result.getInt("status")));
            resultL.next();
        }
        //return (data);
    }

    private void  ordersForNewAccount() throws SQLException, IOException{//
        String executeStr = in.readLine();
        ResultSet resultA = database.select(executeStr);
        int countA = 0;
        if(resultA.first()){
            do{
               countA++;
            }while(resultA.next());
        }
        out.println(Integer.toString(countA));
        resultA.first();

        for(int i = 0; i < countA; i++){
              out.println(resultA.getString("id_application"));
              out.println(resultA.getString("numberPA"));
              out.println(resultA.getString("direction_application"));
              out.println(resultA.getString("status_application"));
              out.println(resultA.getString("execution_information"));

            resultA.next();
        }

    }

    public void blockCard() throws SQLException, IOException{
        //String number;
        //in.read(number);
        String number = in.readLine();
        //cois.readObject(text.toString());
        //String text = (String)cois.readObject();
        database.select ("Update cards SET status_card = 'block' WHERE `number_card` = '"+number+"'");

    }

     private void  viewAllPayments () throws SQLException, IOException{
        String str = in.readLine();
        ResultSet result = database.select(str);
        int countA = 0;
        if(result.first()){
            do{
               countA++;
            }while(result.next());
        }
        out.println(Integer.toString(countA));
        result.first();

        for(int i = 0; i < countA; i++){
            out.println(result.getString("idpayment"));
            out.println(result.getString("numberCP"));
            out.println(result.getString("payment_information"));
            out.println(result.getString("amount"));
            out.println(result.getString("status"));
            result.next();
        }
     }

     private void  addСard() throws IOException {

        String number = in.readLine();
        String validity = in.readLine();
        String CVV = in.readLine();
        String cardBalance = in.readLine();
        database.insert("INSERT INTO cards (number_card, validity, CVV, card_balance, status_card) "
                + "VALUES ('"+number+"','"+validity+"'," + "'"+CVV+"','"+cardBalance+"', 'Рабочая')");
        
     }

     private void  viewСardNumber() throws IOException{
        String numberPassport = in.readLine();
        ResultSet result = database.select ("SELECT number_card FROM client WHERE `number_passport` = '"+numberPassport+"'");
        out.println(result);
     }

     private void  viewСardBalance() throws IOException{
        String numbercard = in.readLine();
        ResultSet result = database.select ("SELECT card_balance FROM cards WHERE `number_card = '"+numbercard+"'");
        out.println(result);
     }
     

     private void  viewRecentPayments() throws IOException, SQLException{
        String card = in.readLine();
        ResultSet result = database.select("SELECT * FROM payments WHERE `number_card`='"+card+"'");
        int count = 0;
        int sum =0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("number_card"));
            out.println(result.getString("account_number"));
            out.println(result.getString("payment_information"));
            out.println(result.getString("amount"));
            out.println(result.getString("status"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
     }


     private void  viewSelectedPayments() throws IOException, SQLException{
        String card = in.readLine();
        ResultSet result = database.select("SELECT * FROM payments WHERE `number_card`='"+card+"' and `status` LIKE '%сохраннённый%'");
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("number_card"));
            out.println(result.getString("account_number"));
            out.println(result.getString("payment_information"));
            out.println(result.getString("amount"));
            out.println(result.getString("status"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
     }


     private void  applyForAnAccount() throws IOException, SQLException{
        String numberPassport = in.readLine();
        String direction = in.readLine();

        String status = "Срок выполнения 1 неделя: ";
        String execution = "Выполнено";
         database.insert("INSERT INTO applications (direction_application, status_application, execution_information, number_passport) "
                + "VALUES ('"+direction+"','"+status+"'," + "'"+direction+"','"+numberPassport+"')");
     }

     private void  orderACard() throws IOException{
         String numberPassport = in.readLine();
        String direction = in.readLine();

        String status = "Срок действия: " + in.readLine();
        String execution = "Выполнено";
         database.insert("INSERT INTO applications (direction_application, status_application, execution_information, number_passport) "
                + "VALUES ('"+direction+"','"+status+"'," + "'"+direction+"','"+numberPassport+"')");
     }

     private void takeALoanOrOverdraft() throws IOException{
        String name = in.readLine();
        String cause = in.readLine();

        String amount = in.readLine();
        String paymentterm = "12 месяцев по 100 рублей";
        String percent = "30%";
         String guarantor = in.readLine();
         String guarantorDate = in.readLine();
        String numberPassport = in.readLine();
        Integer number = Integer.parseInt(in.readLine());
        if(number == 1){
         database.insert("INSERT INTO loans (name_borrower, cause, amount_commas_funds, payment_term, percent, name_guarantor, date_birth_guarantor, number_passport) "
                + "VALUES ('"+name+"','"+cause+"'," + "'"+amount+"','"+paymentterm+"','"+percent+"','"+guarantor+"','"+guarantorDate+"','"+numberPassport+"')");
        }
        if(number == 2){
         database.insert("INSERT INTO loans (name_borrower, cause, amount_commas_funds, payment_term, percent, name_guarantor, date_birth_guarantor, number_passport) "
                 + "VALUES ('"+name+"','"+cause+"'," + "'"+amount+"','"+paymentterm+"','"+percent+"','"+guarantor+"','"+guarantorDate+"','"+numberPassport+"')");
        }
        }

     private void viewDetailsOfYourLoansAndOther() throws IOException, SQLException{
        String numberPassport = in.readLine();
        ResultSet result = database.select ("SELECT * FROM loans WHERE `number_passport` = '"+numberPassport+"'");
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
       
        for(int i = 0; i < count; i++){


            out.println(result.getString("name_borrower"));
            out.println(result.getString("cause"));
            out.println(result.getString("amount_commas_funds"));
            out.println(result.getString("payment_term"));
            out.println(result.getString("percent"));
            out.println(result.getString("name_guarantor"));
            out.println(result.getString("date_birth_guarantor"));
            out.println(result.getString("information_about_returned_funds"));
            out.println(result.getString("number_passport"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }

     }

     private void openDeposit() throws IOException{
        String numberPassport = in.readLine();
        String direction = in.readLine();

        String status = "Срок действия: " + in.readLine();
        String execution = "Выполнено";
         database.insert("INSERT INTO applications (direction_application, status_application, execution_information, number_passport) "
                + "VALUES ('"+direction+"','"+status+"'," + "'"+direction+"','"+numberPassport+"')");
     }

     private void operateThroughErip() throws IOException{
        String numberCard = in.readLine();
        String personalAccount = in.readLine();
        String Amount = in.readLine();
        String status = "Успешно";
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");


     }

     private void noOperateThroughErip() throws IOException{
        Integer choose = Integer.parseInt(in.readLine());
        String numberCard = in.readLine();
        String Amount = in.readLine();
        String status = "Успешно";
        String personalAccount;
        switch(choose){
        case 1:
        personalAccount = "Белтелеком" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
        case 2:
        personalAccount = "Образование и развитие" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
        case 3:
        personalAccount = "Различные действия с банками" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
        case 4:
        personalAccount = "Куфар" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
         case 5:
        personalAccount = "Штрафы гаи" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
         case 6:
        personalAccount = "Перевод с карты на карту" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
         case 7:
        personalAccount = "Билеты бжд" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
         case 8:
        personalAccount = "Перевод по реквизитам" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
         case 9:
        personalAccount = "Погашение кредитов" + in.readLine();
        database.insert("INSERT INTO payments (number_card, account_number, payment_information, amount, status) "
                + "VALUES ('"+numberCard+"','"+numberCard+"'," + "'"+personalAccount+"','"+Amount+"','"+status+"')");
        break;
        }
     }

      void operations()throws IOException, SQLException{
        String str = in.readLine();
        ResultSet result = database.select(str);
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("id_operation"));
            out.println(result.getString("nameS"));
            out.println(result.getString("numberPO"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
      }
      
      void outputDiagram() throws SQLException{
          ResultSet result = database.select("SELECT *, SUM(amount) AS summa FROM payments JOIN client ON payments.numberCP = client.numberCC GROUP BY Full_name");
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("Full_name"));
            out.println(result.getString("summa"));
            result.next();
        }
      }
      void services() throws SQLException, IOException{
        String str = in.readLine();
        ResultSet result = database.select(str);
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("name_service"));
            out.println(result.getString("description"));
            out.println(result.getString("CVV"));
            out.println(result.getString("who_is_provided"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
      }
      void showUsers() throws IOException, SQLException{
        String str = in.readLine();
        ResultSet result = database.select(str);
        int count = 0;
        if(result.first()){
            do{
               count++;
            }while(result.next());
        }
        out.println(Integer.toString(count));
        result.first();
        for(int i = 0; i < count; i++){
            out.println(result.getString("iduser"));
            out.println(result.getString("login"));
            out.println(result.getString("password"));
            out.println(result.getString("numberC"));
            out.println(result.getString("numberPas"));

            //out.println(Integer.toString(result.getInt("status")));
            result.next();
        }
      }
      void DeleteClient() throws IOException{
        String str = in.readLine();
        database.delete(str);
      }
      void EditClient() throws IOException {
          String str;
          str = in.readLine();
          System.out.println(str);
          database.update(str);
          /*str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);
          str = in.readLine();
          database.update(str);*/
      }
      void AddClient() throws IOException{
          String str = in.readLine();
          database.insert(str);
      }
      void SortClient() throws IOException, SQLException{
          String str = "SELECT * FROM client ";
          String name = in.readLine();
          if(name.equals("Сбросить")){}
          else {
          str = str + "ORDER BY " + name;
          }
          Integer who = Integer.parseInt(in.readLine());
          
          if (who == 1){
              str = str + " DESC";
          }
          if (who == 0){
              str = str + " ASC";
          }
          database.select(str);
        ResultSet resultCl = database.select(str);
        
        int countCl = 0;
        if(resultCl.first()){
            do{
               countCl++;
            }while(resultCl.next());
        }
        System.out.println(countCl);
        out.println(countCl);
        resultCl.first();
        
        for(int i = 0; i < countCl; i++){


            out.println(resultCl.getString("Full_name"));
            out.println(resultCl.getString("number_passport"));
            out.println(resultCl.getString("date_of_birth"));
            out.println(resultCl.getString("who"));
            out.println(resultCl.getString("number_card"));
            out.println(resultCl.getString("place_of_work"));
            out.println(resultCl.getString("date_start_bank_client"));
            out.println(resultCl.getString("information_about_returned_funds"));
            out.println(resultCl.getString("number_phone"));
            //out.println(Integer.toString(result.getInt("status")));
            resultCl.next();
            
        }
      }
}
