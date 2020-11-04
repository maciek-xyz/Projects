package Lesson7;

public class Cat {
    String name;
    boolean hungry;

    public Cat(String name){
        this.name = name;
        hungry = true;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }
    public void eat(String food) {
        if (hungry) {
            System.out.println(name + " is eating " + food);
            hungry = false;
        }
        else {
                System.out.println(name + " is not hungry");
            }
        }


    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }

    public void sleep(int time) {
        System.out.println(name + " is going to sleep for " + time + " hours");
        hungry = true;
        System.out.println(name + " is hungry");

    }



}
