package pl.wykop.client;

import pl.wykop.client.client.model.RestResponse;
import pl.wykop.client.client.EntityManagementClient;
import pl.wykop.client.client.model.Credentials;
import pl.wykop.client.client.model.Entry;

public class EntityManagementClientTest {
    public static void main(String[] args) {
        EntityManagementClient client = new EntityManagementClient(new Credentials("appKey", "secret"));
        RestResponse<Entry> restResponse = client.getEntryWithId(1);
        if (restResponse.isErrorPresent()) {
            System.err.println(restResponse.getErrorMessage());
        } else {
            System.out.println(restResponse.getValue());
        }
    }
}
