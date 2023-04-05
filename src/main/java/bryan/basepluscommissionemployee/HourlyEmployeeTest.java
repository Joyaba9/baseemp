/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.basepluscommissionemployee;

/**
 *
 * @author EL GUARDIAN
 */
public class HourlyEmployeeTest  {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Bryan", "Joya", "123-45-6789", 40.0, 35.0);

        System.out.printf("%s:%n%s%n", "Employee information obtained by toString", employee.toString());
        System.out.printf("%s: $%.2f%n", "Earnings", employee.earnings());
    }
}