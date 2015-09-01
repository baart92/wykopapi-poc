package pl.wykop.client.client.model;

public final class Credentials {
    private final String appKey;
    private final String secret;

    public Credentials(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getSecret() {
        return secret;
    }
}
