package tests;

import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;

import org.testng.annotations.BeforeMethod;

import com.testingsumo.endpoints.APIConstants;
import com.testingsumo.payload.RequestPayloads;

import actions.APIActions;
import actions.AssertActions;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	protected RequestSpecification repoSpec;
	protected AssertActions assertActions = new AssertActions();
	protected APIActions apiActions = new APIActions();
	protected RequestPayloads requestPayload = new RequestPayloads();

	@BeforeMethod

	protected void setUpConfiguration() {

		repoSpec = new RequestSpecBuilder().setBaseUri(APIConstants.baseUrl)
				.setConfig(newConfig().logConfig(logConfig().blacklistHeader("Authorization")))
				.addHeader("Authorization", APIConstants.token).setAccept("application/json")
				.setContentType("application/json").build().log().all();
	}
}
