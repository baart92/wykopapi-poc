package pl.wykop.anotherpackage;

import pl.wykop.anotherpackage.api.AccessFeatures;
import pl.wykop.anotherpackage.model.AuthData;
import pl.wykop.anotherpackage.model.AuthDetails;
import pl.wykop.anotherpackage.model.Credentials;
import pl.wykop.anotherpackage.model.RestResponse;

import java.util.List;

public abstract class AuthorizedWykopApiClient extends WykopApiClient implements AccessFeatures {
    public AuthorizedWykopApiClient(Credentials credentials) {
        super(credentials);
    }

    @Override
    public <T> RestResponse<T> get(String subUrl, List<String> parameters, Class<T> responseClass) {
        String targetUrl = subUrl + authPostfix();
        return super.get(targetUrl, parameters, responseClass);
    }

    @Override
    public <T> RestResponse<T> post(String subUrl, List<String> parameters, Class<T> responseClass) {
        String targetUrl = subUrl + authPostfix();
        return super.post(targetUrl, parameters, responseClass);
    }

    public RestResponse<AuthDetails> logIn(AuthData authData) {
        return null;
    }

    public RestResponse<Boolean> logOut() {
        return null;
    }

    public AuthDetails getAuthDetails() {
        return null;
    }

    public boolean isLogIn() {
        return false;
    }

    private String authPostfix() {
        AuthDetails authDetails = getAuthDetails();
        // przemapuj authDetails na koncowke adresu z loginem i userkey i zwroc
        return null;
    }
}
