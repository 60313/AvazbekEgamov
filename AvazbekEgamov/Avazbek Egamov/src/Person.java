public class Person {
    private String surnameEgamov;
    private String firstNameEgamov;
    private String streetEgamov;
    private String zipCodeEgamov;
    private String cityEgamov;

    public void initializeEgamov(String surnameEgamov, String firstNameEgamov, String streetEgamov, String zipCodeEgamov, String cityEgamov) {
        this.surnameEgamov = surnameEgamov;
        this.firstNameEgamov = firstNameEgamov;
        this.streetEgamov = streetEgamov;
        this.zipCodeEgamov = zipCodeEgamov;
        this.cityEgamov = cityEgamov;
    }

    public void printEgamov() {
        System.out.println("Surname: " + surnameEgamov);
        System.out.println("First Name: " + firstNameEgamov);
        System.out.println("Street: " + streetEgamov);
        System.out.println("Zip Code: " + zipCodeEgamov);
        System.out.println("City: " + cityEgamov);
    }
}