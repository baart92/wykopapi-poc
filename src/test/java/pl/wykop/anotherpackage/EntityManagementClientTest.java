package pl.wykop.anotherpackage;

import pl.wykop.anotherpackage.model.Credentials;
import pl.wykop.anotherpackage.model.Entry;
import pl.wykop.anotherpackage.model.RestResponse;

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
