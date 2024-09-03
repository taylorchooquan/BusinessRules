package services;

import java.util.List;

import domains.SalaryOffer;
import domains.SalaryRange;

public class SalaryAdjustmentService {
    private SalaryOffer salaryOffer;
    private SalaryRange salaryRange;
    private List<SalaryAdjustmentStrategy> strategies;

    public SalaryAdjustmentService(SalaryOffer salaryOffer, SalaryRange salaryRange, List<SalaryAdjustmentStrategy> strategies) {
        this.salaryOffer = salaryOffer;
        this.salaryRange = salaryRange;
        this.strategies = strategies;
    }

    // Method to apply all strategies
    public SalaryAdjustmentService applyAdjustments() {
        for (SalaryAdjustmentStrategy strategy : strategies) {
            strategy.applyAdjustment(salaryOffer, salaryRange);
        }
        ensureSalaryWithinRange(); // Ensure salary is within range after adjustments
        return this;
    }

    // Method to ensure salary is within the range
    private void ensureSalaryWithinRange() {
        if (salaryOffer.getOfferedSalary() < salaryRange.getMinSalary()) {
            System.out.println("Offer is below the minimum range. Adjusting to minimum.");
            salaryOffer.setOfferedSalary(salaryRange.getMinSalary());
        } else if (salaryOffer.getOfferedSalary() > salaryRange.getMaxSalary()) {
            System.out.println("Offer is above the maximum range. Adjusting to maximum.");
            salaryOffer.setOfferedSalary(salaryRange.getMaxSalary());
        } else {
            System.out.println("Offer is within the range.");
        }
    }

    // Method to return the final adjusted offer
    public SalaryOffer getFinalOffer() {
        return salaryOffer;
    }
}



