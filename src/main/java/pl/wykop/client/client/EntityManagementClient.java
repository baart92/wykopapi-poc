package pl.wykop.client.client;

import pl.wykop.client.client.api.EntryMgntFeatures;
import pl.wykop.client.client.model.Entry;
import pl.wykop.client.client.model.RestResponse;
import pl.wykop.client.client.model.Credentials;

import java.util.List;

public class EntityManagementClient extends AuthorizedWykopApiClient implements EntryMgntFeatures {

    public EntityManagementClient(Credentials credentials) {
        super(credentials);
    }

    public RestResponse<List<Entry>> getEntries(Integer page) {
        return null;
    }

    public RestResponse<Entry> getEntryWithId(Integer id) {
        return null;
    }

    public RestResponse<Void> deleteEntryWithId(Integer id) {
        return null;
    }
}
