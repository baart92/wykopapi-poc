package pl.wykop.anotherpackage;

import pl.wykop.anotherpackage.api.EntryMgntFeatures;
import pl.wykop.anotherpackage.model.Credentials;
import pl.wykop.anotherpackage.model.Entry;
import pl.wykop.anotherpackage.model.RestResponse;

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
