public class HeartRates {

    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName,String lastName,
    int birthMonth,int birthDay,int birthYear){

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public int getAge() {

        int currentYear = 2026;
        return currentYear - birthYear;
    }

    public int getMaxHeartRate() {

        return 220 - getAge();
    }

    public double getTargetMin() {

        return getMaxHeartRate() * 0.50;
    }

    public double getTargetMax() {

        return getMaxHeartRate() * 0.85;
    }
}