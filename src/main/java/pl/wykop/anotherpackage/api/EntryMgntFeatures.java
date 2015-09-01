package pl.wykop.anotherpackage.api;

import pl.wykop.anotherpackage.model.Entry;
import pl.wykop.anotherpackage.model.RestResponse;

import java.util.List;

public interface EntryMgntFeatures {
    RestResponse<List<Entry>> getEntries(Integer page);

    RestResponse<Entry> getEntryWithId(Integer id);

    RestResponse<Void> deleteEntryWithId(Integer id);
}
