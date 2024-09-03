import java.util.List;

import domains.SalaryOffer;
import domains.SalaryRange;
import services.SalaryAdjustmentService;
import services.SalaryAdjustmentStrategy;
import services.SalaryAdjustmentStrategyFactory;

public class odtManager {
	public static void main(String[] args) {
        // Define a salary range
        SalaryRange range = new SalaryRange(60000, 100000, "California", "ENG", "Senior");

        // Create a salary offer for a Financial Manager working on weekends
        SalaryOffer offer = new SalaryOffer(75000, "California", "ENG", "Senior", false, "fin", true, true);

        // Get the appropriate strategies for the Financial LOB
        List<SalaryAdjustmentStrategy> strategies = SalaryAdjustmentStrategyFactory.getStrategiesForLOB(offer.getLineOfBusiness());

        // Use the SalaryAdjustmentService with the appropriate strategies
        SalaryOffer finalOffer = new SalaryAdjustmentService(offer, range, strategies)
            .applyAdjustments()  // Apply all adjustments
            .getFinalOffer();    // Get the final adjusted offer

        // Output the final salary offer
        System.out.println("Final Salary Offer: " + finalOffer.getOfferedSalary());
    }
}
