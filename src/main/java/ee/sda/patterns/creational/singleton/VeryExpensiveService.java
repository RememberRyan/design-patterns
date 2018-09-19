package ee.sda.patterns.creational.singleton;

public class VeryExpensiveService {


    // simulation of resource heavy service

    private static VeryExpensiveService instance;


    // changed to private, for factory method
    private VeryExpensiveService() {

    }

    // factory method
    public static VeryExpensiveService getInstance() {
        // if service is not initiated...
        if (instance == null) {

            // simulation of expensive creation
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // singleton instance
            instance = new VeryExpensiveService();
        }
        return instance;
    }
}