package tests;

import com.testingsumo.endpoints.Constants;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class PostCreateRepo extends BaseTest {

    private static Logger Log = LogManager.getLogger(PostCreateRepo.class.getName());

    @Test()
    @Owner("Promode")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that Status code is 200 when we Create a new GitHub Repo of User")
    public void testPostCreateRepoOfUser() {
        Response response = RestAssured
                .given()
                .spec(repoSpec)
                .when().body(repo.getRepoCreatePayLoad())
                .post(Constants.postBaseUrl).andReturn();

        assertActions.verifyStatusCode(response,"201");
        Log.info(response.getBody().asString());
    }

}
