package pl.wykop.client.client.api;

import pl.wykop.client.client.model.AuthData;
import pl.wykop.client.client.model.AuthDetails;
import pl.wykop.client.client.model.RestResponse;

public interface AccessFeatures {
    RestResponse<AuthDetails> logIn(AuthData authData);

    RestResponse<Boolean> logOut();

    AuthDetails getAuthDetails();

    boolean isLogIn();
}
