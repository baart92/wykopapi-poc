package pl.wykop.anotherpackage.api;

import pl.wykop.anotherpackage.model.AuthData;
import pl.wykop.anotherpackage.model.AuthDetails;
import pl.wykop.anotherpackage.model.RestResponse;

public interface AccessFeatures {
    RestResponse<AuthDetails> logIn(AuthData authData);

    RestResponse<Boolean> logOut();

    AuthDetails getAuthDetails();

    boolean isLogIn();
}
