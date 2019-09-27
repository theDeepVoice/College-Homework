package java_homework.java_work02;

import MyTest.Tiger;

public class Bird implements Animal {
    public void moveMethod(){
        System.out.println("Fly!");
    }

    public void liveMethod(){
        System.out.println("eat bug!");
    }

    public static void main(String[] args) {
        Animal[] a = new Animal[10];

        a[1] = new Tiger();
        a[2] = new MyTest.Bird();

        System.out.println(a[1].toString());
        System.out.println(a[2].toString());
    }
}
