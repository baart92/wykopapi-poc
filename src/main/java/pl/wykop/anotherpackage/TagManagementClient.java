package pl.wykop.anotherpackage;

import pl.wykop.anotherpackage.api.TagsMgntFeatures;
import pl.wykop.anotherpackage.model.Credentials;
import pl.wykop.anotherpackage.model.RestResponse;

public class TagManagementClient extends AuthorizedWykopApiClient implements TagsMgntFeatures {
    public TagManagementClient(String baseUrl, Credentials credentials) {
        super(baseUrl, credentials);
    }

    public RestResponse<Void> startObservingTag(String tagName) {
        return null;
    }

    public RestResponse<Void> stopObservingTag(String tagName) {
        return null;
    }

    public RestResponse<Void> blockTag(String tagName) {
        return null;
    }

    public RestResponse<Void> unblockTag(String tagName) {
        return null;
    }
}
