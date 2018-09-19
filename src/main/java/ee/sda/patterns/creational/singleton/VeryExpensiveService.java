package ee.sda.patterns.creational.singleton;

public class VeryExpensiveService {



    // simulation of resource heavy service

    // changed to private, for factory method
    private VeryExpensiveService() {

    }

    // factory method
    public static VeryExpensiveService getInstance(){
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new VeryExpensiveService();
    }
}
