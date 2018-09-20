package ee.sda.patterns.structural.adapter.example2;

public class ActualSingleClickHandler implements ClickHandler {

    @Override
    public void handleSingleClick() {
        System.out.println("Handling a single click");
    }

    @Override
    public void handleDoubleClick() {
        // left blank on purpose
    }

    @Override
    public void handlelongClick() {
        // left blank on purpose
    }
}
