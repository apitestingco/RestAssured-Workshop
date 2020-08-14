package com.testingsumo.endpoints;

import com.testingsumo.utils.DataUtils;

public class APIConstants {

	public final static String baseUrl = DataUtils.getTestData("TestData", "BaseUrl", "Value");
	public final static String createRepo = "/user/repos";
	public final static String getRepos = "/users/" + DataUtils.getTestData("TestData", "Username", "Value") + "/repos";

	public final static String token = DataUtils.getTestData("TestData", "Token", "Value");;

}
