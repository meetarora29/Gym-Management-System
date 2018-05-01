import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.sql.*;
import java.util.Date;

class Query {
    private static Query instance = null;
    private static Connection connection;
    private static Statement statement;

    private Query() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "meet", "meet");
            statement=connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Query getInstance() {
        if (instance == null)
            instance= new Query();
        return instance;
    }

    // Insertion Queries
    static void insert_trainer(String name, int age, String sex, int salary, Date last_paid) {
        java.sql.Date sqlDate= new java.sql.Date(last_paid.getTime());
        try {
            int res=statement.executeUpdate("INSERT INTO gym.Trainers (Name, Age, Sex, Salary, `Last Paid`) VALUES ('" + name +"'," + age + ",'" + sex + "'," + salary + ",'" + sqlDate +"')");
            if (res==-1)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insert_member(String name, int age, String sex, String phone, String plan, int trainer, Date plan_started) {
        java.sql.Date sql_planstarted= new java.sql.Date(plan_started.getTime());
        try {
            int res=statement.executeUpdate("INSERT INTO gym.Members (Name, Age, Sex, Phone, Plan, `Trainer ID`, `Plan Started`) VALUES ('" + name +"'," + age + ",'" + sex + "','" + phone + "','" + plan + "'," + trainer + ",'"+ sql_planstarted +"')");
            if (res==-1)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insert_equipment(String name, Date purchased_on, int cost, String body_part, String status) {
        java.sql.Date sql_purchased= new java.sql.Date(purchased_on.getTime());
        try {
            int res=statement.executeUpdate("INSERT INTO gym.Equipment (Name, `Purchased On`, Cost, Status) VALUES ('" + name +"','" + sql_purchased + "'," + cost + ",'" + body_part + "','"+ status +"')");
            if (res==-1)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insert_plan(String name, int duration, int cost) {
        try {
            int res=statement.executeUpdate("INSERT INTO gym.Plans (Name, `Duration (Days)`, Cost) VALUES ('" + name +"'," + duration + "," + cost +")");
            if (res==-1)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void insert_exercise(String name, String body_part, String equipment) {
        try {
            int res=statement.executeUpdate("INSERT INTO gym.Exercise (Name, `Body Part`, Equipment) VALUES ('" + name +"','" + body_part + "','" + equipment +"')");
            if (res==-1)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Deletion
    static void delete_entry(String relation, String name, int id) {
        try {
            String and="AND ID=" + id;
            if (relation.equals("Members") || relation.equals("Trainers")) {
            } else {
                and="";
            }
            int res=statement.executeUpdate("DELETE FROM gym." + relation + " WHERE Name='"+ name + "' " + and);
            if (res==0)
                System.out.println("Error Occurred");
            else {
//                Label label=new Label("Successfully Inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static Scene create_window() {
        Stage stage=new Stage();
        StackPane stackPane=new StackPane();
        Scene scene=new Scene(stackPane, 800, 800);
        stage.setScene(scene);
        return scene;
    }

    static void display_rows(ResultSet resultSet) throws SQLException {
        Stage stage=new Stage();

        TableView tableView=new TableView();
        tableView.setFixedCellSize(25);


        ObservableList<ObservableList> data = FXCollections.observableArrayList();

        ResultSetMetaData metaData=resultSet.getMetaData();
        int num_columns = metaData.getColumnCount();

        for (int i=0;i<num_columns;i++) {
            final int j = i;
            TableColumn col = new TableColumn(resultSet.getMetaData().getColumnName(i+1));
            col.setCellValueFactory((Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>) param -> new SimpleStringProperty(param.getValue().get(j).toString()));

            tableView.getColumns().addAll(col);
//            System.out.println("Column ["+i+"] ");
        }

        while (resultSet.next()) {
            ObservableList<String> row = FXCollections.observableArrayList();
            for (int i=1; i<=num_columns; i++) {
//                if (i>1)
//                    System.out.printf(", ");
//                String data = resultSet.getString(i);
//                System.out.printf("%s", data);
//                System.out.println(resultSet.getString(i));
                String value = resultSet.getString(i);
                if (resultSet.wasNull())
                    value="None";
                row.add(value);
            }
            data.addAll(row);
        }

        tableView.setItems(data);

        Scene scene = new Scene(tableView, 600, 280);
        stage.setScene(scene);

        stage.show();
    }

    // Display all rows
    static void print_all(String relation) {
        System.out.println(relation);
        try {
            ResultSet resultSet=statement.executeQuery("SELECT * FROM gym." + relation);
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_in_age_group(String relation, int lower, int upper) {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT ID, Name, Age FROM gym." + relation + " WHERE Age BETWEEN " + lower + " AND " + upper);
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_budget_plans(int budget) {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT Name, `Duration (Days)`, Cost FROM gym.Plans WHERE Cost <= "+budget);
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_equipment_status(String status) {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT Name, `Purchased On` FROM gym.Equipment WHERE Status = '"+ status + "'");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_total_salary_to_give() {
        try {
//            print_all("Trainers");
            ResultSet resultSet=statement.executeQuery("SELECT sum(Salary) AS Salary FROM gym.Trainers");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_members_with_plans_expired() {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT gym.Members.Name, DATE_ADD(`Plan Started`, INTERVAL `Duration (Days)` DAY) AS Expired FROM gym.Members INNER JOIN gym.Plans ON gym.Members.Plan = gym.Plans.Name HAVING Expired < CURDATE() ORDER BY Expired ASC");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_bodypart_machine(String machine) {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT E.`Body Part` FROM gym.Equipment AS M INNER JOIN gym.Exercise AS E ON M.Name = E.Equipment WHERE M.Name = '" + machine +"'");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_proloss(Date lower, Date upper) {
        java.sql.Date sql_lower= new java.sql.Date(lower.getTime());
        java.sql.Date sql_upper= new java.sql.Date(upper.getTime());
        try {
            ResultSet resultSet=statement.executeQuery("SELECT" +
                    "  (SELECT COALESCE(sum(J.Cost), 0) FROM gym.Members AS M INNER JOIN gym.Plans AS J ON M.Plan = J.Name WHERE (M.`Plan Started` >= '" + sql_lower + "' AND M.`Plan Started` <= '" + sql_upper + "')) -" +
                    "  (SELECT COALESCE(sum(Salary), 0) FROM gym.Trainers AS T WHERE (T.`Last Paid` >= '" + sql_lower + "' AND T.`Last Paid` <= '" + sql_upper + "')) -" +
                    "  (SELECT COALESCE(sum(E.Cost), 0) FROM gym.Equipment AS E WHERE (E.`Purchased On` >= '" + sql_lower + "' AND E.`Purchased On` <= '" + sql_upper + "')) AS `Profit Or Loss`");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void count_by_sex(int lower, int upper) {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT Sex, count(Sex) AS Count FROM gym.Members WHERE Age BETWEEN " + lower + " AND " + upper + " GROUP BY Sex");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void print_popular_trainer() {
        try {
            ResultSet resultSet=statement.executeQuery("SELECT T.Name, count(`Trainer ID`) as Count FROM gym.Trainers as T INNER JOIN gym.Members AS M ON T.ID = M.`Trainer ID` GROUP BY T.Name ORDER BY Count DESC LIMIT 1");
            display_rows(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
