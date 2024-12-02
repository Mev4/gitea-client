package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.Badge;
import dev.mev4.gitea.client.model.CreateHookOption;
import dev.mev4.gitea.client.model.CreateKeyOption;
import dev.mev4.gitea.client.model.CreateOrgOption;
import dev.mev4.gitea.client.model.CreateRepoOption;
import dev.mev4.gitea.client.model.CreateUserOption;
import dev.mev4.gitea.client.model.Cron;
import dev.mev4.gitea.client.model.EditHookOption;
import dev.mev4.gitea.client.model.EditUserOption;
import dev.mev4.gitea.client.model.Email;
import dev.mev4.gitea.client.model.Hook;
import dev.mev4.gitea.client.model.Organization;
import dev.mev4.gitea.client.model.PublicKey;
import dev.mev4.gitea.client.model.RenameUserOption;
import dev.mev4.gitea.client.model.Repository;
import dev.mev4.gitea.client.model.User;
import dev.mev4.gitea.client.model.UserBadgeOption;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface AdminApi {
  /**
   * Add a badge to a user
   *
   * @param username username of user (required)
   * @param body     (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users/{username}/badges")
  Call<Void> adminAddUserBadges(
    @Path("username") String username, @Body UserBadgeOption body
  );

  /**
   * Adopt unadopted files as a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @POST("admin/unadopted/{owner}/{repo}")
  Call<Void> adminAdoptRepository(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Create a hook
   *
   * @param body (required)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/hooks")
  Call<Hook> adminCreateHook(
    @Body CreateHookOption body
  );

  /**
   * Create an organization
   *
   * @param body     (required)
   * @param username username of the user that will own the created organization (required)
   * @return Call&lt;Organization&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users/{username}/orgs")
  Call<Organization> adminCreateOrg(
    @Body CreateOrgOption body, @Path("username") String username
  );

  /**
   * Add a public key on behalf of a user
   *
   * @param username username of the user (required)
   * @param body     (optional)
   * @return Call&lt;PublicKey&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users/{username}/keys")
  Call<PublicKey> adminCreatePublicKey(
    @Path("username") String username, @Body CreateKeyOption body
  );

  /**
   * Create a repository on behalf of a user
   *
   * @param body     (required)
   * @param username username of the user. This user will own the created repository (required)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users/{username}/repos")
  Call<Repository> adminCreateRepo(
    @Body CreateRepoOption body, @Path("username") String username
  );

  /**
   * Create a user
   *
   * @param body (optional)
   * @return Call&lt;User&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users")
  Call<User> adminCreateUser(
    @Body CreateUserOption body
  );

  /**
   * List cron tasks
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Cron&gt;&gt;
   */
  @GET("admin/cron")
  Call<List<Cron>> adminCronList(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Run cron task
   *
   * @param task task to run (required)
   * @return Call&lt;Void&gt;
   */
  @POST("admin/cron/{task}")
  Call<Void> adminCronRun(
    @Path("task") String task
  );

  /**
   * Delete a hook
   *
   * @param id id of the hook to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("admin/hooks/{id}")
  Call<Void> adminDeleteHook(
    @Path("id") Long id
  );

  /**
   * Delete unadopted files
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("admin/unadopted/{owner}/{repo}")
  Call<Void> adminDeleteUnadoptedRepository(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Delete a user
   *
   * @param username username of user to delete (required)
   * @param purge    purge the user from the system completely (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("admin/users/{username}")
  Call<Void> adminDeleteUser(
    @Path("username") String username, @Query("purge") Boolean purge
  );

  /**
   * Remove a badge from a user
   *
   * @param username username of user (required)
   * @param body     (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("admin/users/{username}/badges")
  Call<Void> adminDeleteUserBadges(
    @Path("username") String username, @Body UserBadgeOption body
  );

  /**
   * Delete a user&#x27;s public key
   *
   * @param username username of user (required)
   * @param id       id of the key to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("admin/users/{username}/keys/{id}")
  Call<Void> adminDeleteUserPublicKey(
    @Path("username") String username, @Path("id") Long id
  );

  /**
   * Update a hook
   *
   * @param id   id of the hook to update (required)
   * @param body (optional)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("admin/hooks/{id}")
  Call<Hook> adminEditHook(
    @Path("id") Long id, @Body EditHookOption body
  );

  /**
   * Edit an existing user
   *
   * @param username username of user to edit (required)
   * @param body     (optional)
   * @return Call&lt;User&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("admin/users/{username}")
  Call<User> adminEditUser(
    @Path("username") String username, @Body EditUserOption body
  );

  /**
   * List all emails
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Email&gt;&gt;
   */
  @GET("admin/emails")
  Call<List<Email>> adminGetAllEmails(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List all organizations
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Organization&gt;&gt;
   */
  @GET("admin/orgs")
  Call<List<Organization>> adminGetAllOrgs(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a hook
   *
   * @param id id of the hook to get (required)
   * @return Call&lt;Hook&gt;
   */
  @GET("admin/hooks/{id}")
  Call<Hook> adminGetHook(
    @Path("id") Long id
  );

  /**
   * Get an global actions runner registration token
   *
   * @return Call&lt;Void&gt;
   */
  @GET("admin/runners/registration-token")
  Call<Void> adminGetRunnerRegistrationToken();


  /**
   * List system&#x27;s webhooks
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Hook&gt;&gt;
   */
  @GET("admin/hooks")
  Call<List<Hook>> adminListHooks(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a user&#x27;s badges
   *
   * @param username username of user (required)
   * @return Call&lt;List&lt;Badge&gt;&gt;
   */
  @GET("admin/users/{username}/badges")
  Call<List<Badge>> adminListUserBadges(
    @Path("username") String username
  );

  /**
   * Rename a user
   *
   * @param body     (required)
   * @param username existing username of user (required)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("admin/users/{username}/rename")
  Call<Void> adminRenameUser(
    @Body RenameUserOption body, @Path("username") String username
  );

  /**
   * Search all emails
   *
   * @param q     keyword (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Email&gt;&gt;
   */
  @GET("admin/emails/search")
  Call<List<Email>> adminSearchEmails(
    @Query("q") String q, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Search users according filter conditions
   *
   * @param sourceId  ID of the user&#x27;s login source to search for (optional)
   * @param loginName user&#x27;s login name to search for (optional)
   * @param page      page number of results to return (1-based) (optional)
   * @param limit     page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("admin/users")
  Call<List<User>> adminSearchUsers(
    @Query("source_id") Long sourceId, @Query("login_name") String loginName, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List unadopted repositories
   *
   * @param page    page number of results to return (1-based) (optional)
   * @param limit   page size of results (optional)
   * @param pattern pattern of repositories to search for (optional)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("admin/unadopted")
  Call<List<String>> adminUnadoptedList(
    @Query("page") Integer page, @Query("limit") Integer limit, @Query("pattern") String pattern
  );

}
