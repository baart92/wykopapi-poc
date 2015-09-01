package pl.wykop.client.client;

import pl.wykop.client.client.api.TagsMgntFeatures;
import pl.wykop.client.client.model.RestResponse;
import pl.wykop.client.client.model.Credentials;

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
