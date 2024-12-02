package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.*;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
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

public interface UserApi {
  /**
   * Create a repository
   *
   * @param body (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/repos")
  Call<Repository> createCurrentUserRepo(
    @Body CreateRepoOption body
  );

  /**
   * Create a user-level variable
   *
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/actions/variables/{variablename}")
  Call<Void> createUserVariable(
    @Path("variablename") String variablename, @Body CreateVariableOption body
  );

  /**
   * Delete a secret in a user scope
   *
   * @param secretname name of the secret (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/actions/secrets/{secretname}")
  Call<Void> deleteUserSecret(
    @Path("secretname") String secretname
  );

  /**
   * Delete a user-level variable which is created by current doer
   *
   * @param variablename name of the variable (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/actions/variables/{variablename}")
  Call<Void> deleteUserVariable(
    @Path("variablename") String variablename
  );

  /**
   * Get user settings
   *
   * @return Call&lt;List&lt;UserSettings&gt;&gt;
   */
  @GET("user/settings")
  Call<List<UserSettings>> getUserSettings();


  /**
   * Get a user-level variable which is created by current doer
   *
   * @param variablename name of the variable (required)
   * @return Call&lt;ActionVariable&gt;
   */
  @GET("user/actions/variables/{variablename}")
  Call<ActionVariable> getUserVariable(
    @Path("variablename") String variablename
  );

  /**
   * Get the user-level list of variables which is created by current doer
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;ActionVariable&gt;&gt;
   */
  @GET("user/actions/variables")
  Call<List<ActionVariable>> getUserVariablesList(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a Token to verify
   *
   * @return Call&lt;String&gt;
   */
  @GET("user/gpg_key_token")
  Call<String> getVerificationToken();


  /**
   * Create or Update a secret value in a user scope
   *
   * @param secretname name of the secret (required)
   * @param body       (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("user/actions/secrets/{secretname}")
  Call<Void> updateUserSecret(
    @Path("secretname") String secretname, @Body CreateOrUpdateSecretOption body
  );

  /**
   * Update user settings
   *
   * @param body (optional)
   * @return Call&lt;List&lt;UserSettings&gt;&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("user/settings")
  Call<List<UserSettings>> updateUserSettings(
    @Body UserSettingsOptions body
  );

  /**
   * Update a user-level variable which is created by current doer
   *
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("user/actions/variables/{variablename}")
  Call<Void> updateUserVariable(
    @Path("variablename") String variablename, @Body UpdateVariableOption body
  );

  /**
   * Add email addresses
   *
   * @param body (optional)
   * @return Call&lt;List&lt;Email&gt;&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/emails")
  Call<List<Email>> userAddEmail(
    @Body CreateEmailOption body
  );

  /**
   * Block a user
   *
   * @param username user to block (required)
   * @param note     optional note for the block (optional)
   * @return Call&lt;Void&gt;
   */
  @PUT("user/blocks/{username}")
  Call<Void> userBlockUser(
    @Path("username") String username, @Query("note") String note
  );

  /**
   * Check if one user is following another user
   *
   * @param username username of following user (required)
   * @param target   username of followed user (required)
   * @return Call&lt;Void&gt;
   */
  @GET("users/{username}/following/{target}")
  Call<Void> userCheckFollowing(
    @Path("username") String username, @Path("target") String target
  );

  /**
   * Check if a user is blocked by the authenticated user
   *
   * @param username user to check (required)
   * @return Call&lt;Void&gt;
   */
  @GET("user/blocks/{username}")
  Call<Void> userCheckUserBlock(
    @Path("username") String username
  );

  /**
   * Create a hook
   *
   * @param body (required)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/hooks")
  Call<Hook> userCreateHook(
    @Body CreateHookOption body
  );

  /**
   * creates a new OAuth2 application
   *
   * @param body (required)
   * @return Call&lt;OAuth2Application&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/applications/oauth2")
  Call<OAuth2Application> userCreateOAuth2Application(
    @Body CreateOAuth2ApplicationOptions body
  );

  /**
   * Create an access token
   *
   * @param username username of user (required)
   * @param body     (optional)
   * @return Call&lt;AccessToken&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("users/{username}/tokens")
  Call<AccessToken> userCreateToken(
    @Path("username") String username, @Body CreateAccessTokenOption body
  );

  /**
   * Check whether a user is followed by the authenticated user
   *
   * @param username username of followed user (required)
   * @return Call&lt;Void&gt;
   */
  @GET("user/following/{username}")
  Call<Void> userCurrentCheckFollowing(
    @Path("username") String username
  );

  /**
   * Whether the authenticated is starring the repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @GET("user/starred/{owner}/{repo}")
  Call<Void> userCurrentCheckStarring(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Unfollow a user
   *
   * @param username username of user to unfollow (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/following/{username}")
  Call<Void> userCurrentDeleteFollow(
    @Path("username") String username
  );

  /**
   * Remove a GPG key
   *
   * @param id id of key to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/gpg_keys/{id}")
  Call<Void> userCurrentDeleteGPGKey(
    @Path("id") Long id
  );

  /**
   * Delete a public key
   *
   * @param id id of key to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/keys/{id}")
  Call<Void> userCurrentDeleteKey(
    @Path("id") Long id
  );

  /**
   * Unstar the given repo
   *
   * @param owner owner of the repo to unstar (required)
   * @param repo  name of the repo to unstar (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/starred/{owner}/{repo}")
  Call<Void> userCurrentDeleteStar(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a GPG key
   *
   * @param id id of key to get (required)
   * @return Call&lt;GPGKey&gt;
   */
  @GET("user/gpg_keys/{id}")
  Call<GPGKey> userCurrentGetGPGKey(
    @Path("id") Long id
  );

  /**
   * Get a public key
   *
   * @param id id of key to get (required)
   * @return Call&lt;PublicKey&gt;
   */
  @GET("user/keys/{id}")
  Call<PublicKey> userCurrentGetKey(
    @Path("id") Long id
  );

  /**
   * List the authenticated user&#x27;s followers
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("user/followers")
  Call<List<User>> userCurrentListFollowers(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the users that the authenticated user is following
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("user/following")
  Call<List<User>> userCurrentListFollowing(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the authenticated user&#x27;s GPG keys
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;GPGKey&gt;&gt;
   */
  @GET("user/gpg_keys")
  Call<List<GPGKey>> userCurrentListGPGKeys(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the authenticated user&#x27;s public keys
   *
   * @param fingerprint fingerprint of the key (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;PublicKey&gt;&gt;
   */
  @GET("user/keys")
  Call<List<PublicKey>> userCurrentListKeys(
    @Query("fingerprint") String fingerprint, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the repos that the authenticated user owns
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("user/repos")
  Call<List<Repository>> userCurrentListRepos(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * The repos that the authenticated user has starred
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("user/starred")
  Call<List<Repository>> userCurrentListStarred(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List repositories watched by the authenticated user
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("user/subscriptions")
  Call<List<Repository>> userCurrentListSubscriptions(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Create a GPG key
   *
   * @param body (optional)
   * @return Call&lt;GPGKey&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/gpg_keys")
  Call<GPGKey> userCurrentPostGPGKey(
    @Body CreateGPGKeyOption body
  );

  /**
   * Create a public key
   *
   * @param body (optional)
   * @return Call&lt;PublicKey&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/keys")
  Call<PublicKey> userCurrentPostKey(
    @Body CreateKeyOption body
  );

  /**
   * Follow a user
   *
   * @param username username of user to follow (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("user/following/{username}")
  Call<Void> userCurrentPutFollow(
    @Path("username") String username
  );

  /**
   * Star the given repo
   *
   * @param owner owner of the repo to star (required)
   * @param repo  name of the repo to star (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("user/starred/{owner}/{repo}")
  Call<Void> userCurrentPutStar(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List the current user&#x27;s tracked times
   *
   * @param page   page number of results to return (1-based) (optional)
   * @param limit  page size of results (optional)
   * @param since  Only show times updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before Only show times updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @return Call&lt;List&lt;TrackedTime&gt;&gt;
   */
  @GET("user/times")
  Call<List<TrackedTime>> userCurrentTrackedTimes(
    @Query("page") Integer page, @Query("limit") Integer limit, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before
  );

  /**
   * delete an access token
   *
   * @param username username of user (required)
   * @param token    token to be deleted, identified by ID and if not available by name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/{username}/tokens/{token}")
  Call<Void> userDeleteAccessToken(
    @Path("username") String username, @Path("token") String token
  );

  /**
   * Delete Avatar
   *
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/avatar")
  Call<Void> userDeleteAvatar();


  /**
   * Delete email addresses
   *
   * @param body (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("user/emails")
  Call<Void> userDeleteEmail(
    @Body DeleteEmailOption body
  );

  /**
   * Delete a hook
   *
   * @param id id of the hook to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/hooks/{id}")
  Call<Void> userDeleteHook(
    @Path("id") Long id
  );

  /**
   * delete an OAuth2 Application
   *
   * @param id token to be deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/applications/oauth2/{id}")
  Call<Void> userDeleteOAuth2Application(
    @Path("id") Long id
  );

  /**
   * Update a hook
   *
   * @param id   id of the hook to update (required)
   * @param body (optional)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("user/hooks/{id}")
  Call<Hook> userEditHook(
    @Path("id") Long id, @Body EditHookOption body
  );

  /**
   * Get a user
   *
   * @param username username of user to get (required)
   * @return Call&lt;User&gt;
   */
  @GET("users/{username}")
  Call<User> userGet(
    @Path("username") String username
  );

  /**
   * Get the authenticated user
   *
   * @return Call&lt;User&gt;
   */
  @GET("user")
  Call<User> userGetCurrent();


  /**
   * Get a user&#x27;s heatmap
   *
   * @param username username of user to get (required)
   * @return Call&lt;List&lt;UserHeatmapData&gt;&gt;
   */
  @GET("users/{username}/heatmap")
  Call<List<UserHeatmapData>> userGetHeatmapData(
    @Path("username") String username
  );

  /**
   * Get a hook
   *
   * @param id id of the hook to get (required)
   * @return Call&lt;Hook&gt;
   */
  @GET("user/hooks/{id}")
  Call<Hook> userGetHook(
    @Path("id") Long id
  );

  /**
   * get an OAuth2 Application
   *
   * @param id Application ID to be found (required)
   * @return Call&lt;OAuth2Application&gt;
   */
  @GET("user/applications/oauth2/{id}")
  Call<OAuth2Application> userGetOAuth2Application(
    @Path("id") Long id
  );

  /**
   * List the authenticated user&#x27;s oauth2 applications
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;OAuth2Application&gt;&gt;
   */
  @GET("user/applications/oauth2")
  Call<List<OAuth2Application>> userGetOauth2Application(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get an user&#x27;s actions runner registration token
   *
   * @return Call&lt;Void&gt;
   */
  @GET("user/actions/runners/registration-token")
  Call<Void> userGetRunnerRegistrationToken();


  /**
   * Get list of all existing stopwatches
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;StopWatch&gt;&gt;
   */
  @GET("user/stopwatches")
  Call<List<StopWatch>> userGetStopWatches(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the authenticated user&#x27;s access tokens
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;AccessToken&gt;&gt;
   */
  @GET("users/{username}/tokens")
  Call<List<AccessToken>> userGetTokens(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a user&#x27;s activity feeds
   *
   * @param username        username of user (required)
   * @param onlyPerformedBy if true, only show actions performed by the requested user (optional)
   * @param date            the date of the activities to be found (optional)
   * @param page            page number of results to return (1-based) (optional)
   * @param limit           page size of results (optional)
   * @return Call&lt;List&lt;Activity&gt;&gt;
   */
  @GET("users/{username}/activities/feeds")
  Call<List<Activity>> userListActivityFeeds(
    @Path("username") String username, @Query("only-performed-by") Boolean onlyPerformedBy, @Query("date") LocalDate date, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List users blocked by the authenticated user
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("user/blocks")
  Call<List<User>> userListBlocks(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the authenticated user&#x27;s email addresses
   *
   * @return Call&lt;List&lt;Email&gt;&gt;
   */
  @GET("user/emails")
  Call<List<Email>> userListEmails();


  /**
   * List the given user&#x27;s followers
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("users/{username}/followers")
  Call<List<User>> userListFollowers(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the users that the given user is following
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("users/{username}/following")
  Call<List<User>> userListFollowing(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the given user&#x27;s GPG keys
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;GPGKey&gt;&gt;
   */
  @GET("users/{username}/gpg_keys")
  Call<List<GPGKey>> userListGPGKeys(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the authenticated user&#x27;s webhooks
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Hook&gt;&gt;
   */
  @GET("user/hooks")
  Call<List<Hook>> userListHooks(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the given user&#x27;s public keys
   *
   * @param username    username of user (required)
   * @param fingerprint fingerprint of the key (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;PublicKey&gt;&gt;
   */
  @GET("users/{username}/keys")
  Call<List<PublicKey>> userListKeys(
    @Path("username") String username, @Query("fingerprint") String fingerprint, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the repos owned by the given user
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("users/{username}/repos")
  Call<List<Repository>> userListRepos(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * The repos that the given user has starred
   *
   * @param username username of user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("users/{username}/starred")
  Call<List<Repository>> userListStarred(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the repositories watched by a user
   *
   * @param username username of the user (required)
   * @param page     page number of results to return (1-based) (optional)
   * @param limit    page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("users/{username}/subscriptions")
  Call<List<Repository>> userListSubscriptions(
    @Path("username") String username, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List all the teams a user belongs to
   *
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @GET("user/teams")
  Call<List<Team>> userListTeams(
    @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Search for users
   *
   * @param q     keyword (optional)
   * @param uid   ID of the user to search for (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @GET("users/search")
  Call<InlineResponse2001> userSearch(
    @Query("q") String q, @Query("uid") Long uid, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Unblock a user
   *
   * @param username user to unblock (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("user/blocks/{username}")
  Call<Void> userUnblockUser(
    @Path("username") String username
  );

  /**
   * Update Avatar
   *
   * @param body (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("user/avatar")
  Call<Void> userUpdateAvatar(
    @Body UpdateUserAvatarOption body
  );

  /**
   * update an OAuth2 Application, this includes regenerating the client secret
   *
   * @param body (required)
   * @param id   application to be updated (required)
   * @return Call&lt;OAuth2Application&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("user/applications/oauth2/{id}")
  Call<OAuth2Application> userUpdateOAuth2Application(
    @Body CreateOAuth2ApplicationOptions body, @Path("id") Long id
  );

  /**
   * Verify a GPG key
   *
   * @return Call&lt;GPGKey&gt;
   */
  @POST("user/gpg_key_verify")
  Call<GPGKey> userVerifyGPGKey();


}
