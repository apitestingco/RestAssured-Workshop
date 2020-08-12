package com.testingsumo.payload;

import com.google.gson.Gson;
import com.testingsumo.pojos.GitHubRepo;

public class Repo {

    protected Gson gson = new Gson( );

    public String getRepoCreatePayLoad() {
        GitHubRepo  gitHubRepo = new GitHubRepo();

        // Use DDT
        gitHubRepo.setName("testingsumo1"+Math.floor(Math.random()*100));
        gitHubRepo.setDescription("testingsumo1");
        gitHubRepo.setHomepage("testingsumo1");
        gitHubRepo.setPrivate(true);
        gitHubRepo.setHasWiki(true);
        gitHubRepo.setHasIssues(true);
        gitHubRepo.setHasProjects(true);
        return gson.toJson(gitHubRepo);
    }
}
