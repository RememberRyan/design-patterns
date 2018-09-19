package ee.sda.patterns.creational.singleton;

public class Main {

    // now with the single instance it runs even faster
    public static void main(String[] args) {
        VeryExpensiveService veryExpensiveService1 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService2 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService3 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService4 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService5 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService6 = VeryExpensiveService.getInstance();
        VeryExpensiveService veryExpensiveService7 = VeryExpensiveService.getInstance();
    }
}
