package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public class AuthenticationRequestFilter implements RequestFilter {

    // constant value now changed to be FINAL
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String VALID_AUTHORIZATION_VALUE = "Bearer 133314124";
    private RequestFilter nextFilter;

    @Override
    public void handle(Request request) {
        validateAuthorizationHeader(request);
        continueToNextIfNecessary(request);
    }

    private void validateAuthorizationHeader(Request request) {
        String authorization = request.getHeaders().get(AUTHORIZATION_HEADER);
        if (isCorrect(authorization)) {
            throw new UnsupportedOperationException("request is missing correct authorization header");
        }
    }

    private boolean isCorrect(String authorization) {
        return authorization == null
                || !authorization.equals(VALID_AUTHORIZATION_VALUE);
    }

    private void continueToNextIfNecessary(Request request) {
        if (nextFilter != null) {
            nextFilter.handle(request);
        }
    }

    @Override
    public void nextFilter(RequestFilter filter) {
        this.nextFilter = filter;
    }
}
