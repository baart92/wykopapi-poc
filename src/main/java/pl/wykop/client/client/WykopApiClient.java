package pl.wykop.client.client;

import pl.wykop.client.client.model.RestResponse;
import pl.wykop.client.client.model.Credentials;

import java.util.List;

public abstract class WykopApiClient {
    public static final String WYKOP_API_URL = "http://a.wykop.pl/";

    private final RestClient restClient;
    private final Credentials credentials;

    public WykopApiClient(Credentials credentials) {
        this.credentials = credentials;
        this.restClient = new RestClient(WYKOP_API_URL);
    }

    <T> RestResponse<T> get(String subUrl, List<String> parameters, Class<T> responseClass) {
        return restClient.get(addCredentialsInfo(subUrl), parameters, responseClass);
    }

    <T> RestResponse<T> post(String subUrl, List<String> parameters, Class<T> responseClass) {
        return restClient.post(addCredentialsInfo(subUrl), parameters, responseClass);
    }

    private String addCredentialsInfo(String subUrl) {
        return credentials.getAppKey() + "," + subUrl;
    }
}
