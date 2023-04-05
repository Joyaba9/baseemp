/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.basepluscommissionemployee;

/**
 *
 * @author EL GUARDIAN
 */
public class BasePlusCommissionEmployeeTest  {
   public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        

        employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString",employee.toString());
    }
}