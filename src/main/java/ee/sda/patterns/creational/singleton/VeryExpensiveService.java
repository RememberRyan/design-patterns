package ee.sda.patterns.creational.singleton;

public class VeryExpensiveService {



    // simulation of resource heavy service

    public VeryExpensiveService() {
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
