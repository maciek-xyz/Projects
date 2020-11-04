package Lesson7;

public class CatTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");

        cat.eat("milk");
        //System.out.println(cat.isHungry());
        //cat.isHungry();
        cat.eat("mouse");
        cat.sleep(6);
        cat.isHungry();
        cat.eat("mouse");
        cat.isHungry();
        cat.play("ball");






    }
}
