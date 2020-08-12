package actions;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIActions {

    public <T> T getDataFromJsonPath(Response response, String jsonPath) {

        JsonPath jpath = response.jsonPath();
        return jpath.get(jsonPath);
    }
}
