package services;

import domains.SalaryOffer;
import domains.SalaryRange;

public class CaliforniaHREmployeeAdjustment implements SalaryAdjustmentStrategy {
    @Override
    public void applyAdjustment(SalaryOffer salaryOffer, SalaryRange salaryRange) {
        if ("HR".equalsIgnoreCase(salaryOffer.getLineOfBusiness()) &&
            "California".equalsIgnoreCase(salaryOffer.getLocation())) {
            double adjustedSalary = salaryOffer.getOfferedSalary() * 1.10; // 10% increase
            System.out.println("Applying 10% increase for California HR employee. Adjusted Salary: " + adjustedSalary);
            salaryOffer.setOfferedSalary(adjustedSalary);
            // Indicate that this specific adjustment has been applied
            salaryOffer.setAdjustmentApplied(true); // Add a flag to indicate adjustment
        }
    }
}


