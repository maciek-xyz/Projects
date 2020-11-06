package Lesson7;

public class MobilePhoneTester {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("Samsung", "Galaxy", 1000, 500);
        mobilePhone.installApplication("Google Maps", 100);
        mobilePhone.use("Sims", 4);
        mobilePhone.installApplication("Pokemon Go", 250);
        mobilePhone.installApplication("Tinder", 500);
        mobilePhone.use("Snapchat", 8);
        mobilePhone.use("Instagram", 7);
        mobilePhone.use("Angry Birds", 1);
        mobilePhone.charge();
        mobilePhone.use("Snapchat", 8);

    }
}
