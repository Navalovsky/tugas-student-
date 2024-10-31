
import java.util.Scanner;

public class Driverperson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("teacher/Student");
        int pilihan = in.nextInt();

        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("age : ");
        int age = in.nextInt();

        if (pilihan == 1) {
            System.out.println("subject");
            String subject = in.nextLine();
            in.nextLine();

        } else if (pilihan == 2) {
            System.out.println("strudenNumber");
            int strudentNumber = in.nextInt();
            System.out.println("score");
            int score = in.nextInt();
            System.out.println("major");
            String major = in.nextLine();
            in.nextLine();
        }
        System.out.println("1. part time atau 2.full time ");
        int fullTimePartTime = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Gaji setahun?");
            int annualSalary = in.nextInt();
            System.out.println("nomor unit");
            String unit = in.nextLine();
            in.nextLine();

        } else if (pilihan == 2) {
            System.out.println("waktu bekera berapa lama?");
            int hourseworked = in.nextInt();
            System.out.println("set salary");
            in.nextInt();
        }
    }
}
