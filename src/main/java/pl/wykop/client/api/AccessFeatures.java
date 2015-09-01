package pl.wykop.client.api;

import pl.wykop.client.model.AuthData;
import pl.wykop.client.model.AuthDetails;
import pl.wykop.client.model.RestResponse;

public interface AccessFeatures {
    RestResponse<AuthDetails> logIn(AuthData authData);

    RestResponse<Boolean> logOut();

    AuthDetails getAuthDetails();

    boolean isLogIn();
}
