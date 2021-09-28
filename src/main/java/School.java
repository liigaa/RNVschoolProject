import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        totalMoneySpent = 0;
        totalMoneyEarned = 0;

    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents(){

        return students;
    }

    public int getTotalMoneyEarned() {

        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {

        return totalMoneySpent;
    }
//Method for adding
    public void addTeacher (Teacher teacher){

        this.teachers.add(teacher);
    }
    public void addStudents (Student student) {

        this.students.add(student);
    }
//    public void updateTotalMoneyEarned (int moneyEarned) {
//        totalMoneyEarned +=moneyEarned;
//    }
//    public void updateTotalMoneySpend (int moneySpent){
//        totalMoneySpent += moneySpent;
//    }

    //the static keyword indicates that the member belongs to the type itself and not an instance of that type
    //Only one instance of the static member is created which
    public static void updateTotalMoneyEarned (int moneyEarned) {
        totalMoneyEarned +=moneyEarned;
    }
    public static void updateTotalMoneySpend (int moneySpent){
        totalMoneySpent += moneySpent;
    }

    public int getBalance() {
        return totalMoneyEarned - totalMoneySpent;
    }

    public Student findById(int id){
        for (Student student: students){
            if(id == student.getId()) {
                return student;
            }
        }return null;
    }
}
