package ee.sda.patterns.creational.singleton;

public class Main {

    // every time this service runs it takes 2 seconds
    public static void main(String[] args) {
        VeryExpensiveService veryExpensiveService1 = new VeryExpensiveService();
        VeryExpensiveService veryExpensiveService2 = new VeryExpensiveService();
        VeryExpensiveService veryExpensiveService3 = new VeryExpensiveService();
        VeryExpensiveService veryExpensiveService4 = new VeryExpensiveService();
    }
}
