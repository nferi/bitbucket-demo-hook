package com.atlassian.bitbucket.server.examples;

import javax.annotation.Nonnull;

import com.atlassian.bitbucket.hook.repository.PreRepositoryHook;
import com.atlassian.bitbucket.hook.repository.PreRepositoryHookContext;
import com.atlassian.bitbucket.hook.repository.RepositoryHookRequest;
import com.atlassian.bitbucket.hook.repository.RepositoryHookResult;

public class DemoHook implements PreRepositoryHook<RepositoryHookRequest> {
	@Nonnull
	@Override
	public RepositoryHookResult preUpdate(@Nonnull PreRepositoryHookContext preRepositoryHookContext, @Nonnull RepositoryHookRequest repositoryHookRequest) {
		RepositoryHookResult.Builder builder = new RepositoryHookResult.Builder();
		builder.veto("This is the 1st summary", "This is the 1st details text written as long long long long long long long long long content");
		builder.veto("This is the 2nd summary", "This is the 2nd details text written as long long long long long long long long long content");
		builder.veto("This is the 3rd summary", "This is the 3rd details text written as long long long long long long long long long content");
		return builder.build();
	}
}
