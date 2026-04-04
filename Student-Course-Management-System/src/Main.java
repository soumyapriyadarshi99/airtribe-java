import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.EnrollmentService;
import com.airtribe.learntrack.service.StudentService;

import java.util.Scanner;

public class Main {

    private static StudentService studentService = new StudentService();
    private static CourseService  courseService = new CourseService();
    private static EnrollmentService enrollmentService = new EnrollmentService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("\n===== STUDENT COURSE MENU =====");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            try{
                int choice =Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> studentMenu(sc);
                    case 2 -> courseMenu(sc);
                    case 3 -> enrollmentMenu(sc);
                    case 0 -> {
                        exit = true;
                        System.out.println("Exiting application...");
                    }
                    default -> System.out.println("Invalid Option.");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input! Enter a number.");
            }
        }
    }
    public static void studentMenu(Scanner scanner){
        System.out.println("\n--- Student Menu ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Deactivate Student");
        System.out.println("5. Update Student");
        System.out.println("0. Back");
        try{
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 ->{
                    System.out.print("First Name: ");
                    String first = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String last = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Batch: ");
                    String batch = scanner.nextLine();

                    studentService.addStudent(first, last, email, batch);
                }
                case 2 -> studentService.listAllStudents();
                case 3 ->{
                    int studentId = Integer.parseInt(scanner.nextLine());
                    System.out.println(studentService.findById(studentId).getDisplayName());
                }
                case 4 ->{
                    System.out.print("Enter ID: ");
                    studentService.deactiveStudent(Integer.parseInt(scanner.nextLine()));
                }

                case 5 ->{
                    System.out.print("Enter ID: ");
                    int updateId = Integer.parseInt(scanner.nextLine());

                    System.out.print("New First Name: ");
                    String newFirst = scanner.nextLine();

                    System.out.print("New Last Name: ");
                    String newLast = scanner.nextLine();

                    studentService.updateStudent(updateId, newFirst, newLast);
                }

                case 0 -> {
                    return;
                }

                default -> System.out.println("Invalid option");
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("Invalid input! Please enter a number.");
        }catch(EntityNotFoundException entityNotFoundException){
            System.out.println(entityNotFoundException.getMessage());
        }
    }
    private static void courseMenu(Scanner scanner) {
        System.out.println("\n--- Course Menu ---");
        System.out.println("1. Add Course");
        System.out.println("2. View All Courses");
        System.out.println("3. Toggle Course Status");
        System.out.println("0. Back");


        try {
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Course Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Duration (weeks): ");
                    int duration = Integer.parseInt(scanner.nextLine());

                    courseService.addCourse(name, desc, duration);
                    break;

                case 2:
                    courseService.listAllCourses();
                    break;

                case 3:
                    System.out.print("Enter Course ID: ");
                    courseService.toggleCourseStatus(Integer.parseInt(scanner.nextLine()));
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid option");
            }

        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    private static void enrollmentMenu(Scanner scanner) {
        System.out.println("\n--- Enrollment Menu ---");
        System.out.println("1. Enroll Student");
        System.out.println("2. View Enrollments for Student");
        System.out.println("3. Update Enrollment Status");
        System.out.println("0. Back");

        try {
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int sId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Course ID: ");
                    int cId = Integer.parseInt(scanner.nextLine());

                    enrollmentService.enroll(sId, cId);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    enrollmentService.listEnrollmentsForStudent(Integer.parseInt(scanner.nextLine()));
                    break;

                case 3:
                    System.out.print("Enrollment ID: ");
                    int eId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Status (ACTIVE/COMPLETED/CANCELLED): ");
                    String status = scanner.nextLine();

                    enrollmentService.updateStatus(eId, status);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid option");
            }

        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
}
