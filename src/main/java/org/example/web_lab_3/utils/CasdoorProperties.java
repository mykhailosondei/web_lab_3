package org.example.web_lab_3.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "casdoor")
public class CasdoorProperties {
    public String getConnectEndpoint() {
        return connectEndpoint;
    }

    public void setConnectEndpoint(String connectEndpoint) {
        this.connectEndpoint = connectEndpoint;
    }

    private String connectEndpoint;

    public String getConnectClientId() {
        return connectClientId;
    }

    public void setConnectClientId(String connectClientId) {
        this.connectClientId = connectClientId;
    }

    public String getConnectClientSecret() {
        return connectClientSecret;
    }

    public void setConnectClientSecret(String connectClientSecret) {
        this.connectClientSecret = connectClientSecret;
    }

    private String connectClientId;
    private String connectClientSecret;
}
