package tests;

import com.testingsumo.endpoints.Constants;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.config;
import static io.restassured.config.LogConfig.logConfig;

public class GetRepoTest extends BaseTest {

    private static Logger Log = LogManager.getLogger(GetRepoTest.class.getName());

    @Test()
    @Owner("Promode")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that Status code is 200 when we get GitHub Repo of User")
    public void testGetRepoOfUser() {
        Response response = RestAssured
                .given()
                .spec(repoSpec)
                .when()
                .get(Constants.baseUrl).andReturn();

        assertActions.verifyStatusCode(response,"200");
        Log.info(response.getBody().asString());
    }

}
