package com.testingsumo.payload;

import com.google.gson.Gson;
import com.testingsumo.pojos.GitHubRepo;
import com.testingsumo.utils.TestUtils;

public class RequestPayloads {

	protected Gson gson = new Gson();

	public String getRepoCreatePayLoad() {
		GitHubRepo gitHubRepo = new GitHubRepo();

		// Use DTO
		gitHubRepo.setName(TestUtils.generateUniqueCode("testiingsumo"));
		gitHubRepo.setDescription("testingsumo1");
		gitHubRepo.setHomepage("testingsumo1");
		gitHubRepo.setPrivate(true);
		gitHubRepo.setHasWiki(true);
		gitHubRepo.setHasIssues(true);
		gitHubRepo.setHasProjects(true);
		return gson.toJson(gitHubRepo);
	}
}
