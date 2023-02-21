import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Add workers and salary workers to the ArrayList
        workers.add(new Worker("Calvin", "Yeboah", "000001", "Mr.", 2004, 35.34));
        workers.add(new Worker("Micheal", "Yeboah", "000002", "Mr.", 2000, 36.45));
        workers.add(new Worker("Johnson", "Klein", "000003", "Mr.", 1999, 30.50));
        workers.add(new SalaryWorker("Essein", "CDot", "000004", "Mr.", 2000, 27.43, 50000));
        workers.add(new SalaryWorker("Neymar", "Junior", "000005", "Mr.", 2002, 24.45, 36000));
        workers.add(new SalaryWorker("Mbappe", "Kleain", "000006", "Mr.", 1998, 40.59, 100000));

        // Simulate three weeks and display weekly pay
        int[] weeklyHours = {40, 50, 40};
        String[] weeks = {"Week 1", "Week 2", "Week 3"};

        for (int i = 0; i < weeklyHours.length; i++) {
            System.out.println(weeks[i]);
            for (Worker worker : workers) {
                System.out.println(worker.displayWeeklyPay(weeklyHours[i]));
            }
            System.out.println();
        }
    }
}
