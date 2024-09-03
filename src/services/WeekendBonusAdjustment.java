package services;

import domains.SalaryOffer;
import domains.SalaryRange;

public class WeekendBonusAdjustment implements SalaryAdjustmentStrategy {
    @Override
    public void applyAdjustment(SalaryOffer salaryOffer, SalaryRange salaryRange) {
        // Only apply if no other adjustment has been made
        if (!salaryOffer.isAdjustmentApplied() &&
            "FIN".equalsIgnoreCase(salaryOffer.getLineOfBusiness()) && salaryOffer.worksOnWeekends()) {
            double adjustedSalary = salaryOffer.getOfferedSalary() * 1.05; // 5% increase
            System.out.println("Applying 5% weekend bonus for Financial employees. Adjusted Salary: " + adjustedSalary);
            salaryOffer.setOfferedSalary(adjustedSalary);
            salaryOffer.setAdjustmentApplied(true);
        }
    }
}


