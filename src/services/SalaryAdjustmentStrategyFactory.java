package services;

import java.util.ArrayList;
import java.util.List;

public class SalaryAdjustmentStrategyFactory {

    public static List<SalaryAdjustmentStrategy> getStrategiesForLOB(String lob) {
        List<SalaryAdjustmentStrategy> strategies = new ArrayList<>();
        
        switch (lob.toUpperCase()) {
            case "HR":
                strategies.add(new CaliforniaHREmployeeAdjustment());
                strategies.add(new BilingualBonusAdjustment());
                break;
            case "FIN":
                strategies.add(new ManagerWeekendBonusAdjustment()); // Specific manager rule first
                strategies.add(new WeekendBonusAdjustment());
                break;
            // Add other LOB-specific strategies here...
        }
        return strategies;
    }
}
