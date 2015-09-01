package pl.wykop.anotherpackage.api;

import pl.wykop.anotherpackage.model.RestResponse;

public interface TagsMgntFeatures {
    RestResponse<Void> startObservingTag(String tagName);

    RestResponse<Void> stopObservingTag(String tagName);

    RestResponse<Void> blockTag(String tagName);

    RestResponse<Void> unblockTag(String tagName);
}
