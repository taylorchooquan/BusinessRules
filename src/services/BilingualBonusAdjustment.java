package services;

import domains.SalaryOffer;
import domains.SalaryRange;

public class BilingualBonusAdjustment implements SalaryAdjustmentStrategy {
    @Override
    public void applyAdjustment(SalaryOffer salaryOffer, SalaryRange salaryRange) {
        // Only apply if no other adjustment has been made
        if (!salaryOffer.isAdjustmentApplied() && 
            "HR".equalsIgnoreCase(salaryOffer.getLineOfBusiness()) && salaryOffer.isBilingual()) {
            double adjustedSalary = salaryOffer.getOfferedSalary() * 1.07; // 7% increase
            System.out.println("Applying 7% bilingual increase for HR. Adjusted Salary: " + adjustedSalary);
            salaryOffer.setOfferedSalary(adjustedSalary);
            salaryOffer.setAdjustmentApplied(true); // Indicate that this adjustment has been applied
        }
    }
}



