package Model;

import enums.Role;

public class Staff extends Person {


    private double salary;
    private Role role;


    public Staff(String name, int age, double salary,Role role) {
        super(name, age);
        this.salary = salary;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
