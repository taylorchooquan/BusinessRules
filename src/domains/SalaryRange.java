package domains;

public class SalaryRange {
    private double minSalary;
    private double maxSalary;
    private String location;
    private String jobCode;
    private String jobGrade;

    // Constructor
    public SalaryRange(double minSalary, double maxSalary, String location, String jobCode, String jobGrade) {
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
        this.jobCode = jobCode;
        this.jobGrade = jobGrade;
    }

    // Getters and Setters
    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
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

    @Override
    public String toString() {
        return "SalaryRange [minSalary=" + minSalary + ", maxSalary=" + maxSalary +
                ", location=" + location + ", jobCode=" + jobCode + ", jobGrade=" + jobGrade + "]";
    }
}
