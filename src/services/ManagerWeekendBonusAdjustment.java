package services;

import domains.SalaryOffer;
import domains.SalaryRange;

public class ManagerWeekendBonusAdjustment implements SalaryAdjustmentStrategy {
    @Override
    public void applyAdjustment(SalaryOffer salaryOffer, SalaryRange salaryRange) {
        if ("FIN".equalsIgnoreCase(salaryOffer.getLineOfBusiness()) &&
            salaryOffer.worksOnWeekends() && salaryOffer.isManager()) {
            double adjustedSalary = salaryOffer.getOfferedSalary() * 1.08; // 8% increase
            System.out.println("Applying 8% weekend bonus for Financial Managers. Adjusted Salary: " + adjustedSalary);
            salaryOffer.setOfferedSalary(adjustedSalary);
            salaryOffer.setAdjustmentApplied(true); // Flag that this adjustment has been applied
        }
    }
}

