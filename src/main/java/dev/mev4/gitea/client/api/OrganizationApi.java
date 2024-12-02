package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.*;
import org.threeten.bp.LocalDate;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface OrganizationApi {
  /**
   * Create a repository in an organization
   *
   * @param org  name of organization (required)
   * @param body (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/repos")
  Call<Repository> createOrgRepo(
    @Path("org") String org, @Body CreateRepoOption body
  );

  /**
   * Create a repository in an organization
   *
   * @param org  name of organization (required)
   * @param body (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("org/{org}/repos")
  Call<Repository> createOrgRepoDeprecated(
    @Path("org") String org, @Body CreateRepoOption body
  );

  /**
   * Create an org-level variable
   *
   * @param org          name of the organization (required)
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/actions/variables/{variablename}")
  Call<Void> createOrgVariable(
    @Path("org") String org, @Path("variablename") String variablename, @Body CreateVariableOption body
  );

  /**
   * Delete a secret in an organization
   *
   * @param org        name of organization (required)
   * @param secretname name of the secret (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/actions/secrets/{secretname}")
  Call<Void> deleteOrgSecret(
    @Path("org") String org, @Path("secretname") String secretname
  );

  /**
   * Delete an org-level variable
   *
   * @param org          name of the organization (required)
   * @param variablename name of the variable (required)
   * @return Call&lt;ActionVariable&gt;
   */
  @DELETE("orgs/{org}/actions/variables/{variablename}")
  Call<ActionVariable> deleteOrgVariable(
    @Path("org") String org, @Path("variablename") String variablename
  );

  /**
   * Get an org-level variable
   *
   * @param org          name of the organization (required)
   * @param variablename name of the variable (required)
   * @return Call&lt;ActionVariable&gt;
   */
  @GET("orgs/{org}/actions/variables/{variablename}")
  Call<ActionVariable> getOrgVariable(
    @Path("org") String org, @Path("variablename") String variablename
  );

  /**
   * Get an org-level variables list
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;ActionVariable&gt;&gt;
   */
  @GET("orgs/{org}/actions/variables")
  Call<List<ActionVariable>> getOrgVariablesList(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Add a team member
   *
   * @param id       id of the team (required)
   * @param username username of the user to add (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("teams/{id}/members/{username}")
  Call<Void> orgAddTeamMember(
    @Path("id") Long id, @Path("username") String username
  );

  /**
   * Add a repository to a team
   *
   * @param id   id of the team (required)
   * @param org  organization that owns the repo to add (required)
   * @param repo name of the repo to add (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("teams/{id}/repos/{org}/{repo}")
  Call<Void> orgAddTeamRepository(
    @Path("id") Long id, @Path("org") String org, @Path("repo") String repo
  );

  /**
   * Conceal a user&#x27;s membership
   *
   * @param org      name of the organization (required)
   * @param username username of the user (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/public_members/{username}")
  Call<Void> orgConcealMember(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * Create an organization
   *
   * @param body (required)
   * @return Call&lt;Organization&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs")
  Call<Organization> orgCreate(
    @Body CreateOrgOption body
  );

  /**
   * Create a hook
   *
   * @param body (required)
   * @param org  name of the organization (required)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/hooks")
  Call<Hook> orgCreateHook(
    @Body CreateHookOption body, @Path("org") String org
  );

  /**
   * Create a label for an organization
   *
   * @param org  name of the organization (required)
   * @param body (optional)
   * @return Call&lt;Label&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/labels")
  Call<Label> orgCreateLabel(
    @Path("org") String org, @Body CreateLabelOption body
  );

  /**
   * Create a team
   *
   * @param org  name of the organization (required)
   * @param body (optional)
   * @return Call&lt;Team&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/teams")
  Call<Team> orgCreateTeam(
    @Path("org") String org, @Body CreateTeamOption body
  );

  /**
   * Delete an organization
   *
   * @param org organization that is to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}")
  Call<Void> orgDelete(
    @Path("org") String org
  );

  /**
   * Delete Avatar
   *
   * @param org name of the organization (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/avatar")
  Call<Void> orgDeleteAvatar(
    @Path("org") String org
  );

  /**
   * Delete a hook
   *
   * @param org name of the organization (required)
   * @param id  id of the hook to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/hooks/{id}")
  Call<Void> orgDeleteHook(
    @Path("org") String org, @Path("id") Long id
  );

  /**
   * Delete a label
   *
   * @param org name of the organization (required)
   * @param id  id of the label to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/labels/{id}")
  Call<Void> orgDeleteLabel(
    @Path("org") String org, @Path("id") Long id
  );

  /**
   * Remove a member from an organization
   *
   * @param org      name of the organization (required)
   * @param username username of the user (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/members/{username}")
  Call<Void> orgDeleteMember(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * Delete a team
   *
   * @param id id of the team to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("teams/{id}")
  Call<Void> orgDeleteTeam(
    @Path("id") Long id
  );

  /**
   * Edit an organization
   *
   * @param body (required)
   * @param org  name of the organization to edit (required)
   * @return Call&lt;Organization&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("orgs/{org}")
  Call<Organization> orgEdit(
    @Body EditOrgOption body, @Path("org") String org
  );

  /**
   * Update a hook
   *
   * @param org  name of the organization (required)
   * @param id   id of the hook to update (required)
   * @param body (optional)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("orgs/{org}/hooks/{id}")
  Call<Hook> orgEditHook(
    @Path("org") String org, @Path("id") Long id, @Body EditHookOption body
  );

  /**
   * Update a label
   *
   * @param org  name of the organization (required)
   * @param id   id of the label to edit (required)
   * @param body (optional)
   * @return Call&lt;Label&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("orgs/{org}/labels/{id}")
  Call<Label> orgEditLabel(
    @Path("org") String org, @Path("id") Long id, @Body EditLabelOption body
  );

  /**
   * Edit a team
   *
   * @param id   id of the team to edit (required)
   * @param body (optional)
   * @return Call&lt;Team&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("teams/{id}")
  Call<Team> orgEditTeam(
    @Path("id") Integer id, @Body EditTeamOption body
  );

  /**
   * Get an organization
   *
   * @param org name of the organization to get (required)
   * @return Call&lt;Organization&gt;
   */
  @GET("orgs/{org}")
  Call<Organization> orgGet(
    @Path("org") String org
  );

  /**
   * Get list of organizations
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @GET("orgs")
  Call<List<Organization>> orgGetAll(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a hook
   *
   * @param org name of the organization (required)
   * @param id  id of the hook to get (required)
   * @return Call&lt;Hook&gt;
   */
  @GET("orgs/{org}/hooks/{id}")
  Call<Hook> orgGetHook(
    @Path("org") String org, @Path("id") Long id
  );

  /**
   * Get a single label
   *
   * @param org name of the organization (required)
   * @param id  id of the label to get (required)
   * @return Call&lt;Label&gt;
   */
  @GET("orgs/{org}/labels/{id}")
  Call<Label> orgGetLabel(
    @Path("org") String org, @Path("id") Long id
  );

  /**
   * Get an organization&#x27;s actions runner registration token
   *
   * @param org name of the organization (required)
   * @return Call&lt;Void&gt;
   */
  @GET("orgs/{org}/actions/runners/registration-token")
  Call<Void> orgGetRunnerRegistrationToken(
    @Path("org") String org
  );

  /**
   * Get a team
   *
   * @param id id of the team to get (required)
   * @return Call&lt;Team&gt;
   */
  @GET("teams/{id}")
  Call<Team> orgGetTeam(
    @Path("id") Long id
  );

  /**
   * Get user permissions in organization
   *
   * @param username username of user (required)
   * @param org      name of the organization (required)
   * @return Call&lt;OrganizationPermissions&gt;
   */
  @GET("users/{username}/orgs/{org}/permissions")
  Call<OrganizationPermissions> orgGetUserPermissions(
    @Path("username") String username, @Path("org") String org
  );

  /**
   * Check if a user is a member of an organization
   *
   * @param org      name of the organization (required)
   * @param username username of the user (required)
   * @return Call&lt;Void&gt;
   */
  @GET("orgs/{org}/members/{username}")
  Call<Void> orgIsMember(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * Check if a user is a public member of an organization
   *
   * @param org      name of the organization (required)
   * @param username username of the user (required)
   * @return Call&lt;Void&gt;
   */
  @GET("orgs/{org}/public_members/{username}")
  Call<Void> orgIsPublicMember(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * List an organization&#x27;s actions secrets
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Secret&gt;&gt;
   */
  @GET("orgs/{org}/actions/secrets")
  Call<List<Secret>> orgListActionsSecrets(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s activity feeds
   *
   * @param org   name of the org (required)
   * @param date  the date of the activities to be found (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Activity&gt;&gt;
   */
  @GET("orgs/{org}/activities/feeds")
  Call<List<Activity>> orgListActivityFeeds(
    @Path("org") String org, @Query("date") LocalDate date, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the current user&#x27;s organizations
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @GET("user/orgs")
  Call<List<Organization>> orgListCurrentUserOrgs(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s webhooks
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Hook&gt;&gt;
   */
  @GET("orgs/{org}/hooks")
  Call<List<Hook>> orgListHooks(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s labels
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @GET("orgs/{org}/labels")
  Call<List<Label>> orgListLabels(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s members
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("orgs/{org}/members")
  Call<List<User>> orgListMembers(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s public members
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("orgs/{org}/public_members")
  Call<List<User>> orgListPublicMembers(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s repos
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("orgs/{org}/repos")
  Call<List<Repository>> orgListRepos(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a team&#x27;s activity feeds
   *
   * @param id    id of the team (required)
   * @param date  the date of the activities to be found (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Activity&gt;&gt;
   */
  @GET("teams/{id}/activities/feeds")
  Call<List<Activity>> orgListTeamActivityFeeds(
    @Path("id") Long id, @Query("date") LocalDate date, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a particular member of team
   *
   * @param id       id of the team (required)
   * @param username username of the member to list (required)
   * @return Call&lt;User&gt;
   */
  @GET("teams/{id}/members/{username}")
  Call<User> orgListTeamMember(
    @Path("id") Long id, @Path("username") String username
  );

  /**
   * List a team&#x27;s members
   *
   * @param id    id of the team (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("teams/{id}/members")
  Call<List<User>> orgListTeamMembers(
    @Path("id") Long id, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a particular repo of team
   *
   * @param id   id of the team (required)
   * @param org  organization that owns the repo to list (required)
   * @param repo name of the repo to list (required)
   * @return Call&lt;Repository&gt;
   */
  @GET("teams/{id}/repos/{org}/{repo}")
  Call<Repository> orgListTeamRepo(
    @Path("id") Long id, @Path("org") String org, @Path("repo") String repo
  );

  /**
   * List a team&#x27;s repos
   *
   * @param id    id of the team (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("teams/{id}/repos")
  Call<List<Repository>> orgListTeamRepos(
    @Path("id") Long id, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an organization&#x27;s teams
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @GET("orgs/{org}/teams")
  Call<List<Team>> orgListTeams(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a user&#x27;s organizations
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @GET("users/{username}/orgs")
  Call<List<Organization>> orgListUserOrgs(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Publicize a user&#x27;s membership
   *
   * @param org      name of the organization (required)
   * @param username username of the user (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("orgs/{org}/public_members/{username}")
  Call<Void> orgPublicizeMember(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * Remove a team member
   *
   * @param id       id of the team (required)
   * @param username username of the user to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("teams/{id}/members/{username}")
  Call<Void> orgRemoveTeamMember(
    @Path("id") Long id, @Path("username") String username
  );

  /**
   * Remove a repository from a team
   * This does not delete the repository, it only removes the repository from the team.
   *
   * @param id   id of the team (required)
   * @param org  organization that owns the repo to remove (required)
   * @param repo name of the repo to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("teams/{id}/repos/{org}/{repo}")
  Call<Void> orgRemoveTeamRepository(
    @Path("id") Long id, @Path("org") String org, @Path("repo") String repo
  );

  /**
   * Update Avatar
   *
   * @param org  name of the organization (required)
   * @param body (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("orgs/{org}/avatar")
  Call<Void> orgUpdateAvatar(
    @Path("org") String org, @Body UpdateUserAvatarOption body
  );

  /**
   * Block a user
   *
   * @param org      name of the organization (required)
   * @param username user to block (required)
   * @param note     optional note for the block (optional)
   * @return Call&lt;Void&gt;
   */
  @PUT("orgs/{org}/blocks/{username}")
  Call<Void> organizationBlockUser(
    @Path("org") String org, @Path("username") String username, @Query("note") String note
  );

  /**
   * Check if a user is blocked by the organization
   *
   * @param org      name of the organization (required)
   * @param username user to check (required)
   * @return Call&lt;Void&gt;
   */
  @GET("orgs/{org}/blocks/{username}")
  Call<Void> organizationCheckUserBlock(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * List users blocked by the organization
   *
   * @param org   name of the organization (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("orgs/{org}/blocks")
  Call<List<User>> organizationListBlocks(
    @Path("org") String org, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Unblock a user
   *
   * @param org      name of the organization (required)
   * @param username user to unblock (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("orgs/{org}/blocks/{username}")
  Call<Void> organizationUnblockUser(
    @Path("org") String org, @Path("username") String username
  );

  /**
   * Search for teams within an organization
   *
   * @param org         name of the organization (required)
   * @param q           keywords to search (optional)
   * @param includeDesc include search within team description (defaults to true) (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @GET("orgs/{org}/teams/search")
  Call<InlineResponse200> teamSearch(
    @Path("org") String org, @Query("q") String q, @Query("include_desc") Boolean includeDesc, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Create or Update a secret value in an organization
   *
   * @param org        name of organization (required)
   * @param secretname name of the secret (required)
   * @param body       (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("orgs/{org}/actions/secrets/{secretname}")
  Call<Void> updateOrgSecret(
    @Path("org") String org, @Path("secretname") String secretname, @Body CreateOrUpdateSecretOption body
  );

  /**
   * Update an org-level variable
   *
   * @param org          name of the organization (required)
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("orgs/{org}/actions/variables/{variablename}")
  Call<Void> updateOrgVariable(
    @Path("org") String org, @Path("variablename") String variablename, @Body UpdateVariableOption body
  );

}
