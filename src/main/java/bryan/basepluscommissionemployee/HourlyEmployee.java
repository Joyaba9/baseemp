/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.basepluscommissionemployee;

/**
 *
 * @author EL GUARDIAN
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                           double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be nonnegative");
        }

        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }

        this.wage = wage;
        this.hours = hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0 and 168");
        }

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be nonnegative");
        }

        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double earnings() {
        if (hours <= 40.0) {
            return wage * hours;
        } else {
            return 40.0 * wage + (hours - 40.0) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f", super.toString(),
                "wage per hour", getWage(), "hours worked", getHours());
    }
}