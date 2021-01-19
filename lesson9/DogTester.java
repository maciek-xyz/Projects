package Lesson9;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DogTester {
    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = Dog.class;
        Annotation annotation;

        for(Method method : clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(Execute.class)){
                annotation = method.getAnnotation(Execute.class);
                Execute execute = (Execute) annotation;
                System.out.println(method.getName() + ": " + execute.times());
            }
        }

        Dog dog = new Dog("Amstaff", "Azor", true);

        for (int i = 0; i < 7; i++) {
            dog.play("ball");
        }
        for (int i = 0; i < 2; i++) {
            dog.eat("Cookie");
        }
    }
}
