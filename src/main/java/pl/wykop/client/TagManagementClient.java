package pl.wykop.client;

import pl.wykop.client.api.TagsMgntFeatures;
import pl.wykop.client.model.RestResponse;
import pl.wykop.client.model.Credentials;

public class TagManagementClient extends AuthorizedWykopApiClient implements TagsMgntFeatures {
    public TagManagementClient(Credentials credentials) {
        super(credentials);
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
