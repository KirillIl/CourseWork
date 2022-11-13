public class Employee {
    private static int counter = 0;
    private final String name;
    public int id;
    private int salary;
    private int department;

    public Employee (String name, int salary, int department){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }
    public  int getId() {return id;}

    public String getName() {return this.name;}

    public int getSalary() {return this.salary;}

    public static int getCounter(){
        return counter;
    }

    public void setSalary(int salary) {this.salary = salary;}

    public int getDepartment() { return this.department;}

    public void setDepartment(int department) { this.department = department;}

    @Override
    public String toString(){
        return
                "id: " + id +
                        "; Сотрудник: " + name +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department +
                        ";";
    }

}
