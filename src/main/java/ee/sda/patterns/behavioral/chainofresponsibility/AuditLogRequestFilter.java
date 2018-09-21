package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public class AuditLogRequestFilter implements RequestFilter {

    private RequestFilter nextFilter;

    @Override
    public void handle(Request request) {
        System.out.println(request);
        continueToNextIfNecessary(request);
    }

    @Override
    public void nextFilter(RequestFilter filter) {
        this.nextFilter = filter;
    }

    // TODO: fix DRY principle
    private void continueToNextIfNecessary(Request request) {
        if (nextFilter != null) {
            nextFilter.handle(request);
        }
    }
}
