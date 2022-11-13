public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printEmployees(){
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }

    public static int calaulateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees){
            sum+= employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        if ( employees[0] == null){
            throw new RuntimeException();
        }
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if (employee!= null && employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if (employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary(){
        return calaulateTotalSalary() / Employee.getCounter();
    }

    public static void printFullNames(){
        for (Employee employee : employees){
            System.out.println(employee.getName());
        }
    }
    public static void main(String[] args){
        employees = new Employee[]{
                new Employee("Либрович Сигизмунд Феликсович", 150_000, 1),
                new Employee("Лапшин Алексей", 150_000, 2),
                null,
                new Employee("Иванов Барри Тротович", 150_000, 2),
                new Employee("Гарри Джеймс Поттер", 100_000, 3),
                new Employee("Петров Григорий Евгеневич", 100_000, 1),
                new Employee("Роланд Холанд", 100_000, 3),
                new Employee("Том Джериевич", 1000_000, 3),
                new Employee("Прикол Приколыч", 1000_000, 2)
        };
        employees[0] = new Employee("Либрович Сигизмунд Феликсович", 150_000, 1);
        printFullNames();
        printEmployees();
        System.out.println("avg = " + calculateAverageSalary());
        System.out.println("----high---");
    }
}