import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String sname = sc.nextLine();

        System.out.print("Enter roll no: ");
        long rollno = sc.nextLong();

        Student student = new Student(sname, rollno);
    }

}