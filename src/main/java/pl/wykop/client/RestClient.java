package pl.wykop.client;

import pl.wykop.client.model.RestResponse;

import java.util.List;

public class RestClient {
    private String baseUrl;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public <T> RestResponse<T> get(String subUrl, List<String> parameters, Class<T> responseClass) {
        return null;
    }

    public <T> RestResponse<T> post(String subUrl, List<String> parameters, Class<T> responseClass) {
        return null;
    }
    //itd. dla put, delete etc.
}
