package pl.wykop.client;

import pl.wykop.client.api.EntryMgntFeatures;
import pl.wykop.client.model.Entry;
import pl.wykop.client.model.RestResponse;
import pl.wykop.client.model.Credentials;

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
