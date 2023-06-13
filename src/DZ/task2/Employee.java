package DZ.task2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     */
    public abstract double calculateSalary();

     @Override
     public int compareTo(Employee o) {
     int res = surname.compareTo(o.surname);
     if (res == 0)
        return Double.compare(calculateSalary(), o.calculateSalary());
     else
        return res;
     }
}
