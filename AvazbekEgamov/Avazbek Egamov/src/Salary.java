public interface Salary {
    double salaryToPayEgamov(double hoursEgamov, double rateEgamov);

    default double salaryForOvertimeEgamov(double hoursEgamov, double rateEgamov) {
        double overtimeRateEgamov = rateEgamov * 1.5;
        double overtimeHoursEgamov = hoursEgamov - 40;
        if (overtimeHoursEgamov > 0) {
            return (40 * rateEgamov) + (overtimeHoursEgamov * overtimeRateEgamov);
        } else {
            return hoursEgamov * rateEgamov;
        }
    }

    static boolean shouldReceiveBonusEgamov(int yearsOfExperienceEgamov) {
        return yearsOfExperienceEgamov >= 5;
    }
}
