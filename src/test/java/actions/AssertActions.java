package actions;

import static org.testng.Assert.assertEquals;

import io.restassured.response.Response;

public class AssertActions {

	public void verifyStatusCode(Response response) {
		assertEquals(String.valueOf(response.getStatusCode()).startsWith("20"), true,
				"value of status code is" + response.getStatusCode());
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
