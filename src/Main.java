import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Query query= Query.getInstance();

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
//        Query.print_bodypart_machine("b");

        // Get profit / loss
//        Query.print_proloss(new Date(), new Date());
    }
}
