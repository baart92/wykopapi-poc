package pl.wykop.anotherpackage;

import pl.wykop.anotherpackage.model.RestResponse;

import java.util.ArrayList;
import java.util.List;

public class RestClientTest {
    public static void main(String[] args) {
        RestClient restClient = new RestClient("http://api.openweathermap.org/data/2.5/weather?q=");

        List<String> params = new ArrayList<String>();
        params.add("Wroclaw");
        RestResponse<WeatherResults> response = restClient.get("{}", params, WeatherResults.class);

        if (response.isErrorPresent()) {
            System.err.println(response.getErrorMessage());
        } else {
            System.out.println(response.getValue());
        }
    }
}
