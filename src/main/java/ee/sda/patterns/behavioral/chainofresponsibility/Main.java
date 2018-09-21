package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AuthenticationRequestFilter authenticationRequestFilter
                = new AuthenticationRequestFilter();

        AuditLogRequestFilter auditLogRequestFilter = new AuditLogRequestFilter();

        auditLogRequestFilter.nextFilter(authenticationRequestFilter);

        // give first configured framework to our web server
        String url = "http://example.com";
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        headers.put("Authorization", "Bearer 133314124");

        auditLogRequestFilter.handle(new Request(url,headers));
    }
}
