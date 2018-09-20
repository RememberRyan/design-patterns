package ee.sda.patterns.structural.adapter.example2;

public class BetterSingleClickHandler extends ClickHandlerAdapter {

    // only the override we are interested in
    @Override
    public void handleSingleClick() {
        super.handleSingleClick();
    }

}
