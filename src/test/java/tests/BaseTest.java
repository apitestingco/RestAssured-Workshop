package tests;

import actions.APIActions;
import actions.AssertActions;
import com.testingsumo.endpoints.Constants;
import com.testingsumo.payload.Repo;
import com.testingsumo.utils.DataUtils;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;

public class BaseTest {

    protected RequestSpecification repoSpec;
    protected AssertActions assertActions = new AssertActions();
    protected APIActions apiActions = new APIActions();
    protected Repo repo = new Repo();

    @BeforeMethod

    protected void setUpConfiguration() {

        repoSpec = new RequestSpecBuilder().setBaseUri(Constants.baseUrl).setConfig(newConfig()
                .logConfig(logConfig().blacklistHeader("Authorization")))
                .addHeader("Authorization", Constants.token)
                .setAccept("application/json").setContentType("application/json").build().log().all();
    }
}
