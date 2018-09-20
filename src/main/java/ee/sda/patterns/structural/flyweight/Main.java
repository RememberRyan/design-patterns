package ee.sda.patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        WindowsFlyweightFactory flyweightFactory = new WindowsFlyweightFactory();



        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
        System.out.println(flyweightFactory.createWindow("good window"));
    }
}
