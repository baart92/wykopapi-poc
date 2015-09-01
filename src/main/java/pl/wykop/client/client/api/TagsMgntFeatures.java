package pl.wykop.client.client.api;

import pl.wykop.client.client.model.RestResponse;

public interface TagsMgntFeatures {
    RestResponse<Void> startObservingTag(String tagName);

    RestResponse<Void> stopObservingTag(String tagName);

    RestResponse<Void> blockTag(String tagName);

    RestResponse<Void> unblockTag(String tagName);
}
