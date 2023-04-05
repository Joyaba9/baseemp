/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.basepluscommissionemployee;

/**
 *
 * @author EL GUARDIAN
 */
public class BasePlusCommissionEmployee {

    private CommissionEmployee commissionEmployee;
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
         String socialSecurityNumber, double grossSales, 
         double commissionRate, double baseSalary) {
      
      commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
      
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary() {return baseSalary;}

   // calculate earnings
   public double earnings() {return getBaseSalary() + commissionEmployee.earnings();}

   // return String representation of BasePlusCommissionEmployee
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         commissionEmployee.toString(), "base salary", getBaseSalary());   
   } 
}