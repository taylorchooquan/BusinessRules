package domains;

public class SalaryOffer {
    private double offeredSalary;
    private String location;
    private String jobCode;
    private String jobGrade;
    private boolean isBilingual;
    private String lineOfBusiness;
    private boolean worksOnWeekends; // New field to indicate weekend work
    private boolean isManager;       // New field to indicate if the employee is a manager
    private boolean adjustmentApplied; // Flag to indicate if an adjustment has been made

    // Constructor
    public SalaryOffer(double offeredSalary, String location, String jobCode, String jobGrade, 
                       boolean isBilingual, String lineOfBusiness, boolean worksOnWeekends, boolean isManager) {
        this.offeredSalary = offeredSalary;
        this.location = location;
        this.jobCode = jobCode;
        this.jobGrade = jobGrade;
        this.isBilingual = isBilingual;
        this.lineOfBusiness = lineOfBusiness;
        this.worksOnWeekends = worksOnWeekends;
        this.isManager = isManager;
        this.adjustmentApplied = false; // Initialize to false
    }

    // Getters and Setters for all fields

    public double getOfferedSalary() {
        return offeredSalary;
    }

    public void setOfferedSalary(double offeredSalary) {
        this.offeredSalary = offeredSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(String jobGrade) {
        this.jobGrade = jobGrade;
    }

    public boolean isBilingual() {
        return isBilingual;
    }

    public void setBilingual(boolean isBilingual) {
        this.isBilingual = isBilingual;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public boolean worksOnWeekends() {
        return worksOnWeekends;
    }

    public void setWorksOnWeekends(boolean worksOnWeekends) {
        this.worksOnWeekends = worksOnWeekends;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    public boolean isAdjustmentApplied() {
        return adjustmentApplied;
    }

    public void setAdjustmentApplied(boolean adjustmentApplied) {
        this.adjustmentApplied = adjustmentApplied;
    }

    @Override
    public String toString() {
        return "SalaryOffer [offeredSalary=" + offeredSalary +
                ", location=" + location + ", jobCode=" + jobCode +
                ", jobGrade=" + jobGrade + ", isBilingual=" + isBilingual +
                ", lineOfBusiness=" + lineOfBusiness + 
                ", worksOnWeekends=" + worksOnWeekends +
                ", isManager=" + isManager + "]";
    }
}

