package Lesson8;

public class BeerTester {
    public static void main(String[] args) {
        Beer beer1 = new Beer("Heineken","light",5,0.5);
        Beer beer2 = new Beer("Carlsberg", "light", 5, 0.5);
        Beer beer3 = new Beer("Pilsner Urquell", "light", 5.20, 0.5);
        Beer beer4 = beer1;

        System.out.println(beer1 == beer2);
        System.out.println(beer1 == beer3);

        System.out.println("=======EQUALS========");
        System.out.println(beer1.equals(beer2));
        System.out.println(beer1.equals(beer3));
        System.out.println(beer2.equals(null));
        System.out.println(beer4.equals(beer1));

        System.out.println("=======HASHCODE=======");
        System.out.println(beer1.hashCode());
        System.out.println(beer2.hashCode());
        System.out.println(beer3.hashCode());

    }
}
