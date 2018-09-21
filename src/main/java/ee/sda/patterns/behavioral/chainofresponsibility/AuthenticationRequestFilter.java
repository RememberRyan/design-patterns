package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public class AuthenticationRequestFilter implements RequestFilter {


    private RequestFilter nextFilter;

    @Override
    public void handle(Request request) {
        String authorization = request.getHeaders().get("Authorization");
        if (authorization != null) {
            if (authorization.equals("Bearer 133314124")) {
                if (nextFilter != null) {
                    nextFilter.handle(request);
                }
            }
        }

        throw new UnsupportedOperationException("request is missing correct authorization header");
    }

    @Override
    public void nextFilter(RequestFilter filter) {
        this.nextFilter = filter;
    }
}
