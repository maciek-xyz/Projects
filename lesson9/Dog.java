package Lesson9;


public class Dog {
    private String breed;
    private String name;
    private boolean hungry;

    public Dog(String breed, String name, boolean hungry) {
        this.breed = breed;
        this.name = name;
        this.hungry = hungry;
    }

    @Execute(times = 2)
    public void eat(String food) {
        if (hungry = true) {
            System.out.println(name + " is eating " + food);
            hungry = false;
        } else{
            System.out.println(name + " is not hungry");
        }
    }

    @Execute(times = 7)
    public void play(String toy) {

        System.out.println(name + " is playing with " + toy);
    }


    public void sleep(int time) {
        System.out.println(name + " is going to sleep for " + time + " hours");
        hungry = true;
        System.out.println(name + " is hungry");

    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
