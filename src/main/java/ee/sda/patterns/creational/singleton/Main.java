package ee.sda.patterns.creational.singleton;

public class Main {

    // after refactoring it still takes some time
    public static void main(String[] args) {
        VeryExpensiveService veryExpensiveService1 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService2 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService3 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService4 = VeryExpensiveService.getInstance();
    }
}
