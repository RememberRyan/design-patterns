package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public class AuthenticationRequestFilter implements RequestFilter {

    // constant value now changed to be FINAL
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String VALID_AUTHORIZATION_VALUE = "Bearer 133314124";
    private RequestFilter nextFilter;

    @Override
    public void handle(Request request) {
        String authorization = request.getHeaders().get(AUTHORIZATION_HEADER);
        // merging previous two if statements, further refactoring
        if (authorization != null
            &&
            // remove magic string by extracting it to a constant, also
             authorization.equals(VALID_AUTHORIZATION_VALUE)) {
                if (nextFilter != null) {
                    nextFilter.handle(request);
                }
            }

        throw new UnsupportedOperationException("request is missing correct authorization header");
    }

    @Override
    public void nextFilter(RequestFilter filter) {
        this.nextFilter = filter;
    }
}
