package tests;

import static org.hamcrest.Matchers.lessThan;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.testingsumo.endpoints.APIConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;

public class GetRepoTest extends BaseTest {

	private static Logger Log = LogManager.getLogger(GetRepoTest.class.getName());

	@Test()
	@Owner("Promode")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify that Status code is 200 when we get GitHub RequestPayloads of User")
	public void testGetRepoOfUser() {
		RestAssured.given().spec(repoSpec).when().get(APIConstants.getRepos).then().log().all().assertThat()
				.statusCode(200).time(lessThan(5L), TimeUnit.SECONDS);
	}

}
