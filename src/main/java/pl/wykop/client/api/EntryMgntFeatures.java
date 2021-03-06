package pl.wykop.client.api;

import pl.wykop.client.model.Entry;
import pl.wykop.client.model.RestResponse;

import java.util.List;

public interface EntryMgntFeatures {
    RestResponse<List<Entry>> getEntries(Integer page);

    RestResponse<Entry> getEntryWithId(Integer id);

    RestResponse<Void> deleteEntryWithId(Integer id);
}
