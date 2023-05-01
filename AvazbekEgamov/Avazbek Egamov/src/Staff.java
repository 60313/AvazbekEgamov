public class Staff extends Person implements Salary{
    private String educationEgamov;
    private String positionEgamov;
    private int yearsOfExperienceEgamov;
    private double hoursEgamov;
    private double rateEgamov;


    public void initialize1Egamov(String surnameEgamov,
                            String firstNameEgamov,
                            String streetEgamov,
                            String zipCodeEgamov,
                            String cityEgamov,
                            String educationEgamov,
                            String positionEgamov,
                            int yearsOfExperienceEgamov,
                            double hoursEgamov,
                            double rateEgamov
    ) {
        super.initializeEgamov(surnameEgamov, firstNameEgamov, streetEgamov, zipCodeEgamov, cityEgamov);
        this.educationEgamov = educationEgamov;
        this.positionEgamov = positionEgamov;
        this.yearsOfExperienceEgamov = yearsOfExperienceEgamov;
        this.hoursEgamov = hoursEgamov;
        this.rateEgamov =rateEgamov;
    }

    public void print1Egamov() {
        super.printEgamov();
        System.out.println("Education: " + educationEgamov);
        System.out.println("Position: " + positionEgamov);
        System.out.println("Years Of Experience: " + yearsOfExperienceEgamov);
        System.out.println("Hours: " + hoursEgamov);
        System.out.println("Rate: " + rateEgamov);
        System.out.println("Salary To Pay: "+ salaryToPayEgamov(hoursEgamov, rateEgamov));
        System.out.println("Salary For Overtime: "+ salaryForOvertimeEgamov(hoursEgamov, rateEgamov));
        System.out.println("Should Receive Bonus: "+ Salary.shouldReceiveBonusEgamov(yearsOfExperienceEgamov));
    }


    @Override
    public double salaryToPayEgamov(double hoursEgamov, double rateEgamov) {
        return hoursEgamov * rateEgamov;
    }
}