public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] =new Employee("Либрович Сигизмунд Феликсович", 150_000, 1);
        employees[1] =new Employee("Лапшин Алексей", 150_000, 2);
        employees[3] =new Employee("Иванов Барри Тротович", 150_000, 2);
        employees[4] =new Employee("Гарри Джеймс Поттер", 10_000, 3);
        employees[5] =new Employee("Петров Григорий Евгеневич", 100_000, 1);
        employees[6] =new Employee("Роланд Холанд", 100_000, 3);
        employees[7] =new Employee("Том Джериевич", 1000_000, 3);
        employees[8] =new Employee("Прикол Приколыч", 1000_000, 2);
        printArray();
        System.out.println("Сумма зарплат работников " + sumSalaries());
        System.out.println("Сотрудник с минимальной зарплатой " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимально зарплатой " + findEmployeeWithMaxSalary());
        System.out.println("средняя зарплата сотрудников " + averageSalary());
        printFullNames();
    }
    public static  void printArray() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
    public static int sumSalaries(){
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMinSalary(){
        Employee result = employees[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;

    }

    public static Employee findEmployeeWithMaxSalary(){
        Employee result = employees[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;

    }

    public static int averageSalary(){
        int counterOfNotNullElements = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterOfNotNullElements++;
            }
        }
        return sumSalaries() / counterOfNotNullElements;
    }

    public  static void printFullNames(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

}