package actions;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class AssertActions {

    public void verifyStatusCode(Response response, String expectedStatus) {
        switch (expectedStatus) {
            case "200": {
                assertEquals(response.statusCode( ), 200);
                break;
            }
            case "201": {
                assertEquals(response.statusCode( ), 201);
                break;
            }
            default: {
                System.out.println("Invalid Status!");
                break;
            }
        }
    }

    public void verifyResponseBody(String actual, String expected, String description) {
        assertEquals(actual, expected, description);

    }

    public void verifyResponseBody(float actual, float expected, String description) {
        assertEquals(actual, expected, description);

    }

    public void verifyResponseBody(int actual, int expected, String description) {
        assertEquals(actual, expected, description);

    }

    public void verifyResponseBody(double actual, double expected, String description) {
        assertEquals(actual, expected, description);

    }

    public void verifyResponseBody(boolean actual, boolean expected, String description) {
        assertEquals(actual, expected, description);

    }

}
