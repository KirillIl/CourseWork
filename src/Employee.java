import java.util.Objects;

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


    public String getName() {
        return name;
    }

    public int getSalary() {
                return salary;
    }

    public int getDepartment() {
        return department;
    }
    public  int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return
                "id: " + id +
                        "; Сотрудник: " + name +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department +
                        ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && getSalary() == employee.getSalary() && getDepartment() == employee.getDepartment() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getSalary(), getDepartment());
    }
}
