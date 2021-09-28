public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    //To create a new student object with the provided values when initializing
    //Each students school fees is 30,000 usd

    //this is constructor
    Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade = grade;
        feesPaid=0;
        totalFees=30000;
    }
     public void setGrade(int grade) {
        this.grade = grade;
    }
    public void payFees(int feeToPay){
        //add fees to the total amount of fees paid every time the method is called
        //"this" keyword refers to the current object
        this.feesPaid=this.feesPaid + feeToPay;
        School.updateTotalMoneyEarned(feeToPay);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }



}
