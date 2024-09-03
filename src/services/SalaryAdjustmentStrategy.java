package services;

import domains.SalaryOffer;
import domains.SalaryRange;

public interface SalaryAdjustmentStrategy {
    void applyAdjustment(SalaryOffer salaryOffer, SalaryRange salaryRange);
}

