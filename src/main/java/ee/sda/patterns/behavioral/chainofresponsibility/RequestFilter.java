package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public interface RequestFilter {

    void handle(Request request);
    void nextFilter(RequestFilter filter);

}
