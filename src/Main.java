import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {
    public static void main(String[] args) {



        // Insertion Queries

//        Query.insert_trainer("Meet", 20, "Male", 10000, new Date());
//        Query.insert_member("Aakash", 20, "Male", "12345", "Basic", 4, new Date());
//        Query.insert_equipment("Bench", new Date(), 5000, "Chest", "Storage");
//        Query.insert_plan("Basic", 30, 1500);
//        Query.insert_exercise("Push ups", "Chest", null);

        // Delete Query

//        Query.delete_entry("Exercise", "Push Ups", 3);

        // Display all rows
//        Query.print_all("Plans");

        // Get name in certain age group
//        Query.print_in_age_group("Trainers", 18, 20);

        // Get plans in a budget
//        Query.print_budget_plans(1500);

        // Get equipment with status
//        Query.print_equipment_status("Storage");

        // Total salary to give
//        Query.print_total_salary_to_give();

        // Members with expired plans
//        Query.print_members_with_plans_expired();

        // Body part for machine
//        Query.print_bodypart_machine("bench");

        // Get profit / loss
//        Query.print_proloss(new Date(), new Date());

        // Get count of sex with age limits
//        Query.count_by_sex(20, 24);

        // Print popular trainer
//        Query.print_popular_trainer();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Query query= Query.getInstance();
        Query.print_all("Members");
    }
}
