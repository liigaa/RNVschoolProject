
import java.util.Scanner;


public class Main {
    School rnv = new School();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.schoolMenu();
    }


        void schoolMenu(){
        String userInput;
        
        do {
            System.out.println("\nWelcome to the RNV menu!");
            System.out.println("1.Add a new student to the school");
            System.out.println("2.Add a new teacher to the school");
            System.out.println("3.Get all students");
            System.out.println("4.Get all teachers");
            System.out.println("5.Pay all the teachers salary");
            System.out.println("6.Pay fees for a student with the students id");
            System.out.println("7.Get total money earned by the school");
            System.out.println("8.Get the school balance");
            System.out.println("\nPlease choose activity or enter quit to exit program. ");
            userInput = scanner.nextLine();

            switch (userInput){
                case "1":
                    addStudent();
                    break;
                case "2":
                    addTeacher();
                    break;
                case "3":
                    viewAllStudents();
                    break;
                case "4":
                    viewAllTeachers();
                    break;
                case "5":
                    paySalary();
                    break;
                case "6":
                    receiveStudentFee();
                    break;
                case "7":
                    totalMoneyEarned();
                    break;
                case "8":
                    schoolBalance();
                    break;
                default:
                    break;
            }
        } while (!userInput.equalsIgnoreCase("quit"));

    }

    void viewAllTeachers(){

        for (Teacher teacher: rnv.getTeachers()){
            System.out.println(teacher.getId() + "\t\t\t" + teacher.getName() +"\t\t\t" + teacher.getSalary());
        }
    }

    void addTeacher(){
        System.out.println("Enter ID");
        int id = intScanner.nextInt();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter salary");
        int salary = intScanner.nextInt();
        Teacher teacher = new Teacher(id, name, salary);
        rnv.addTeacher(teacher);

    }
    void addStudent(){
        System.out.println("Enter ID");
        int id = intScanner.nextInt();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter grade");
        int grade = intScanner.nextInt();
        Student student = new Student(id, name, grade);
        rnv.addStudents(student);
    }
    void viewAllStudents(){

        for (Student student: rnv.getStudents()){
            System.out.println(student.getId() +"\t\t\t" + student.getName() + "\t\t\t " +student.getGrade());
        }

    }
    void paySalary(){

      for (Teacher teacher: rnv.getTeachers()){
          teacher.receiveSalary();

          System.out.println(teacher.getName() + "  receive salary: " + teacher.getSalary() + " EUR");

      }System.out.println("School pay total salary for teachers " + rnv.getTotalMoneySpent() + " EUR");
    }

    void receiveStudentFee(){
        System.out.println("Enter student ID");
        int id = intScanner.nextInt();
        Student student = rnv.findById(id);
        System.out.println("Enter fees payed");
        int feesPaid = intScanner.nextInt();

        student.payFees(feesPaid);
        System.out.println(student.getId() + "\t" + student.getName() + " payed fees: " + student.getFeesPaid() + " EUR");

        }

        void totalMoneyEarned(){
            System.out.println("Total money earned by RNV: " + rnv.getTotalMoneyEarned() + " EUR");
        }

        void schoolBalance(){
            System.out.println("School balance " + rnv.getBalance() + " EUR");
        }

    }

