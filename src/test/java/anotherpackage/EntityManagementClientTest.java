package anotherpackage;

import pl.wykop.client.EntityManagementClient;
import pl.wykop.client.model.RestResponse;
import pl.wykop.client.model.Credentials;
import pl.wykop.client.model.Entry;

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
