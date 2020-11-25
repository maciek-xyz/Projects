package Lesson8;

public class LaptopCloningTester {
    public static void main(String[] args) {
        HardDrive hdd = new HardDrive("HDD", "For laptops", 3000);
        Processor intel = new Processor("Intel core i7", 2, 4);
        Laptop asus = new Laptop("Asus",intel, hdd, 16, 3, 32);

        System.out.println(asus);

        Laptop asusClone = Laptop.copy(asus);
        System.out.println(asus.getName());
        System.out.println(asus.getHardDrive().getName());
        System.out.println(asus.getProcessor().getName());
        System.out.println(asus.getDisplaySize());
        System.out.println(asus.getWeight());
        System.out.println(asus.getRamAmount());

        System.out.println("============================");

        System.out.println(asusClone);
        System.out.println(asusClone.getName());
        System.out.println(asusClone.getHardDrive().getName());
        System.out.println(asusClone.getProcessor().getName());
        System.out.println(asusClone.getDisplaySize());
        System.out.println(asusClone.getWeight());
        System.out.println(asusClone.getRamAmount());


    }
}
