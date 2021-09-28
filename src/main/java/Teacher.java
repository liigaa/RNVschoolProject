public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    //to create a new teacher object on initialization with the provided value


    Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        salaryEarned = 0;

    }

    //Methods for setting and getting

    //Method to set a salary for the teacher

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void receiveSalary(){
        salaryEarned +=salary;
        School.updateTotalMoneySpend(salary);
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }
}
