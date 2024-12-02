package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.CreateAccessTokenOption;
import dev.mev4.gitea.client.model.CreateEmailOption;
import dev.mev4.gitea.client.model.CreateGPGKeyOption;
import dev.mev4.gitea.client.model.CreateHookOption;
import dev.mev4.gitea.client.model.CreateKeyOption;
import dev.mev4.gitea.client.model.CreateOAuth2ApplicationOptions;
import dev.mev4.gitea.client.model.CreateOrUpdateSecretOption;
import dev.mev4.gitea.client.model.CreateRepoOption;
import dev.mev4.gitea.client.model.CreateVariableOption;
import dev.mev4.gitea.client.model.DeleteEmailOption;
import dev.mev4.gitea.client.model.EditHookOption;
import dev.mev4.gitea.client.model.UpdateUserAvatarOption;
import dev.mev4.gitea.client.model.UpdateVariableOption;
import dev.mev4.gitea.client.model.UserSettingsOptions;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;


/**
 * API tests for UserApi
 */
public class UserApiTest {

  private UserApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(UserApi.class);
  }


  /**
   * Create a repository
   */
  @Test
  public void createCurrentUserRepoTest() {
    CreateRepoOption body = null;
    // Repository response = api.createCurrentUserRepo(body);

    // TODO: test validations
  }

  /**
   * Create a user-level variable
   */
  @Test
  public void createUserVariableTest() {
    String variablename = null;
    CreateVariableOption body = null;
    // Void response = api.createUserVariable(variablename, body);

    // TODO: test validations
  }

  /**
   * Delete a secret in a user scope
   */
  @Test
  public void deleteUserSecretTest() {
    String secretname = null;
    // Void response = api.deleteUserSecret(secretname);

    // TODO: test validations
  }

  /**
   * Delete a user-level variable which is created by current doer
   */
  @Test
  public void deleteUserVariableTest() {
    String variablename = null;
    // Void response = api.deleteUserVariable(variablename);

    // TODO: test validations
  }

  /**
   * Get user settings
   */
  @Test
  public void getUserSettingsTest() {
    // List<UserSettings> response = api.getUserSettings();

    // TODO: test validations
  }

  /**
   * Get a user-level variable which is created by current doer
   */
  @Test
  public void getUserVariableTest() {
    String variablename = null;
    // ActionVariable response = api.getUserVariable(variablename);

    // TODO: test validations
  }

  /**
   * Get the user-level list of variables which is created by current doer
   */
  @Test
  public void getUserVariablesListTest() {
    Integer page = null;
    Integer limit = null;
    // List<ActionVariable> response = api.getUserVariablesList(page, limit);

    // TODO: test validations
  }

  /**
   * Get a Token to verify
   */
  @Test
  public void getVerificationTokenTest() {
    // String response = api.getVerificationToken();

    // TODO: test validations
  }

  /**
   * Create or Update a secret value in a user scope
   */
  @Test
  public void updateUserSecretTest() {
    String secretname = null;
    CreateOrUpdateSecretOption body = null;
    // Void response = api.updateUserSecret(secretname, body);

    // TODO: test validations
  }

  /**
   * Update user settings
   */
  @Test
  public void updateUserSettingsTest() {
    UserSettingsOptions body = null;
    // List<UserSettings> response = api.updateUserSettings(body);

    // TODO: test validations
  }

  /**
   * Update a user-level variable which is created by current doer
   */
  @Test
  public void updateUserVariableTest() {
    String variablename = null;
    UpdateVariableOption body = null;
    // Void response = api.updateUserVariable(variablename, body);

    // TODO: test validations
  }

  /**
   * Add email addresses
   */
  @Test
  public void userAddEmailTest() {
    CreateEmailOption body = null;
    // List<Email> response = api.userAddEmail(body);

    // TODO: test validations
  }

  /**
   * Block a user
   */
  @Test
  public void userBlockUserTest() {
    String username = null;
    String note = null;
    // Void response = api.userBlockUser(username, note);

    // TODO: test validations
  }

  /**
   * Check if one user is following another user
   */
  @Test
  public void userCheckFollowingTest() {
    String username = null;
    String target = null;
    // Void response = api.userCheckFollowing(username, target);

    // TODO: test validations
  }

  /**
   * Check if a user is blocked by the authenticated user
   */
  @Test
  public void userCheckUserBlockTest() {
    String username = null;
    // Void response = api.userCheckUserBlock(username);

    // TODO: test validations
  }

  /**
   * Create a hook
   */
  @Test
  public void userCreateHookTest() {
    CreateHookOption body = null;
    // Hook response = api.userCreateHook(body);

    // TODO: test validations
  }

  /**
   * creates a new OAuth2 application
   */
  @Test
  public void userCreateOAuth2ApplicationTest() {
    CreateOAuth2ApplicationOptions body = null;
    // OAuth2Application response = api.userCreateOAuth2Application(body);

    // TODO: test validations
  }

  /**
   * Create an access token
   */
  @Test
  public void userCreateTokenTest() {
    String username = null;
    CreateAccessTokenOption body = null;
    // AccessToken response = api.userCreateToken(username, body);

    // TODO: test validations
  }

  /**
   * Check whether a user is followed by the authenticated user
   */
  @Test
  public void userCurrentCheckFollowingTest() {
    String username = null;
    // Void response = api.userCurrentCheckFollowing(username);

    // TODO: test validations
  }

  /**
   * Whether the authenticated is starring the repo
   */
  @Test
  public void userCurrentCheckStarringTest() {
    String owner = null;
    String repo = null;
    // Void response = api.userCurrentCheckStarring(owner, repo);

    // TODO: test validations
  }

  /**
   * Unfollow a user
   */
  @Test
  public void userCurrentDeleteFollowTest() {
    String username = null;
    // Void response = api.userCurrentDeleteFollow(username);

    // TODO: test validations
  }

  /**
   * Remove a GPG key
   */
  @Test
  public void userCurrentDeleteGPGKeyTest() {
    Long id = null;
    // Void response = api.userCurrentDeleteGPGKey(id);

    // TODO: test validations
  }

  /**
   * Delete a public key
   */
  @Test
  public void userCurrentDeleteKeyTest() {
    Long id = null;
    // Void response = api.userCurrentDeleteKey(id);

    // TODO: test validations
  }

  /**
   * Unstar the given repo
   */
  @Test
  public void userCurrentDeleteStarTest() {
    String owner = null;
    String repo = null;
    // Void response = api.userCurrentDeleteStar(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a GPG key
   */
  @Test
  public void userCurrentGetGPGKeyTest() {
    Long id = null;
    // GPGKey response = api.userCurrentGetGPGKey(id);

    // TODO: test validations
  }

  /**
   * Get a public key
   */
  @Test
  public void userCurrentGetKeyTest() {
    Long id = null;
    // PublicKey response = api.userCurrentGetKey(id);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s followers
   */
  @Test
  public void userCurrentListFollowersTest() {
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.userCurrentListFollowers(page, limit);

    // TODO: test validations
  }

  /**
   * List the users that the authenticated user is following
   */
  @Test
  public void userCurrentListFollowingTest() {
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.userCurrentListFollowing(page, limit);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s GPG keys
   */
  @Test
  public void userCurrentListGPGKeysTest() {
    Integer page = null;
    Integer limit = null;
    // List<GPGKey> response = api.userCurrentListGPGKeys(page, limit);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s public keys
   */
  @Test
  public void userCurrentListKeysTest() {
    String fingerprint = null;
    Integer page = null;
    Integer limit = null;
    // List<PublicKey> response = api.userCurrentListKeys(fingerprint, page, limit);

    // TODO: test validations
  }

  /**
   * List the repos that the authenticated user owns
   */
  @Test
  public void userCurrentListReposTest() {
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userCurrentListRepos(page, limit);

    // TODO: test validations
  }

  /**
   * The repos that the authenticated user has starred
   */
  @Test
  public void userCurrentListStarredTest() {
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userCurrentListStarred(page, limit);

    // TODO: test validations
  }

  /**
   * List repositories watched by the authenticated user
   */
  @Test
  public void userCurrentListSubscriptionsTest() {
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userCurrentListSubscriptions(page, limit);

    // TODO: test validations
  }

  /**
   * Create a GPG key
   */
  @Test
  public void userCurrentPostGPGKeyTest() {
    CreateGPGKeyOption body = null;
    // GPGKey response = api.userCurrentPostGPGKey(body);

    // TODO: test validations
  }

  /**
   * Create a public key
   */
  @Test
  public void userCurrentPostKeyTest() {
    CreateKeyOption body = null;
    // PublicKey response = api.userCurrentPostKey(body);

    // TODO: test validations
  }

  /**
   * Follow a user
   */
  @Test
  public void userCurrentPutFollowTest() {
    String username = null;
    // Void response = api.userCurrentPutFollow(username);

    // TODO: test validations
  }

  /**
   * Star the given repo
   */
  @Test
  public void userCurrentPutStarTest() {
    String owner = null;
    String repo = null;
    // Void response = api.userCurrentPutStar(owner, repo);

    // TODO: test validations
  }

  /**
   * List the current user&#x27;s tracked times
   */
  @Test
  public void userCurrentTrackedTimesTest() {
    Integer page = null;
    Integer limit = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    // List<TrackedTime> response = api.userCurrentTrackedTimes(page, limit, since, before);

    // TODO: test validations
  }

  /**
   * delete an access token
   */
  @Test
  public void userDeleteAccessTokenTest() {
    String username = null;
    String token = null;
    // Void response = api.userDeleteAccessToken(username, token);

    // TODO: test validations
  }

  /**
   * Delete Avatar
   */
  @Test
  public void userDeleteAvatarTest() {
    // Void response = api.userDeleteAvatar();

    // TODO: test validations
  }

  /**
   * Delete email addresses
   */
  @Test
  public void userDeleteEmailTest() {
    DeleteEmailOption body = null;
    // Void response = api.userDeleteEmail(body);

    // TODO: test validations
  }

  /**
   * Delete a hook
   */
  @Test
  public void userDeleteHookTest() {
    Long id = null;
    // Void response = api.userDeleteHook(id);

    // TODO: test validations
  }

  /**
   * delete an OAuth2 Application
   */
  @Test
  public void userDeleteOAuth2ApplicationTest() {
    Long id = null;
    // Void response = api.userDeleteOAuth2Application(id);

    // TODO: test validations
  }

  /**
   * Update a hook
   */
  @Test
  public void userEditHookTest() {
    Long id = null;
    EditHookOption body = null;
    // Hook response = api.userEditHook(id, body);

    // TODO: test validations
  }

  /**
   * Get a user
   */
  @Test
  public void userGetTest() {
    String username = null;
    // User response = api.userGet(username);

    // TODO: test validations
  }

  /**
   * Get the authenticated user
   */
  @Test
  public void userGetCurrentTest() {
    // User response = api.userGetCurrent();

    // TODO: test validations
  }

  /**
   * Get a user&#x27;s heatmap
   */
  @Test
  public void userGetHeatmapDataTest() {
    String username = null;
    // List<UserHeatmapData> response = api.userGetHeatmapData(username);

    // TODO: test validations
  }

  /**
   * Get a hook
   */
  @Test
  public void userGetHookTest() {
    Long id = null;
    // Hook response = api.userGetHook(id);

    // TODO: test validations
  }

  /**
   * get an OAuth2 Application
   */
  @Test
  public void userGetOAuth2ApplicationTest() {
    Long id = null;
    // OAuth2Application response = api.userGetOAuth2Application(id);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s oauth2 applications
   */
  @Test
  public void userGetOauth2ApplicationTest() {
    Integer page = null;
    Integer limit = null;
    // List<OAuth2Application> response = api.userGetOauth2Application(page, limit);

    // TODO: test validations
  }

  /**
   * Get an user&#x27;s actions runner registration token
   */
  @Test
  public void userGetRunnerRegistrationTokenTest() {
    // Void response = api.userGetRunnerRegistrationToken();

    // TODO: test validations
  }

  /**
   * Get list of all existing stopwatches
   */
  @Test
  public void userGetStopWatchesTest() {
    Integer page = null;
    Integer limit = null;
    // List<StopWatch> response = api.userGetStopWatches(page, limit);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s access tokens
   */
  @Test
  public void userGetTokensTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<AccessToken> response = api.userGetTokens(username, page, limit);

    // TODO: test validations
  }

  /**
   * List a user&#x27;s activity feeds
   */
  @Test
  public void userListActivityFeedsTest() {
    String username = null;
    Boolean onlyPerformedBy = null;
    LocalDate date = null;
    Integer page = null;
    Integer limit = null;
    // List<Activity> response = api.userListActivityFeeds(username, onlyPerformedBy, date, page, limit);

    // TODO: test validations
  }

  /**
   * List users blocked by the authenticated user
   */
  @Test
  public void userListBlocksTest() {
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.userListBlocks(page, limit);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s email addresses
   */
  @Test
  public void userListEmailsTest() {
    // List<Email> response = api.userListEmails();

    // TODO: test validations
  }

  /**
   * List the given user&#x27;s followers
   */
  @Test
  public void userListFollowersTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.userListFollowers(username, page, limit);

    // TODO: test validations
  }

  /**
   * List the users that the given user is following
   */
  @Test
  public void userListFollowingTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.userListFollowing(username, page, limit);

    // TODO: test validations
  }

  /**
   * List the given user&#x27;s GPG keys
   */
  @Test
  public void userListGPGKeysTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<GPGKey> response = api.userListGPGKeys(username, page, limit);

    // TODO: test validations
  }

  /**
   * List the authenticated user&#x27;s webhooks
   */
  @Test
  public void userListHooksTest() {
    Integer page = null;
    Integer limit = null;
    // List<Hook> response = api.userListHooks(page, limit);

    // TODO: test validations
  }

  /**
   * List the given user&#x27;s public keys
   */
  @Test
  public void userListKeysTest() {
    String username = null;
    String fingerprint = null;
    Integer page = null;
    Integer limit = null;
    // List<PublicKey> response = api.userListKeys(username, fingerprint, page, limit);

    // TODO: test validations
  }

  /**
   * List the repos owned by the given user
   */
  @Test
  public void userListReposTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userListRepos(username, page, limit);

    // TODO: test validations
  }

  /**
   * The repos that the given user has starred
   */
  @Test
  public void userListStarredTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userListStarred(username, page, limit);

    // TODO: test validations
  }

  /**
   * List the repositories watched by a user
   */
  @Test
  public void userListSubscriptionsTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.userListSubscriptions(username, page, limit);

    // TODO: test validations
  }

  /**
   * List all the teams a user belongs to
   */
  @Test
  public void userListTeamsTest() {
    Integer page = null;
    Integer limit = null;
    // List<Team> response = api.userListTeams(page, limit);

    // TODO: test validations
  }

  /**
   * Search for users
   */
  @Test
  public void userSearchTest() {
    String q = null;
    Long uid = null;
    Integer page = null;
    Integer limit = null;
    // InlineResponse2001 response = api.userSearch(q, uid, page, limit);

    // TODO: test validations
  }

  /**
   * Unblock a user
   */
  @Test
  public void userUnblockUserTest() {
    String username = null;
    // Void response = api.userUnblockUser(username);

    // TODO: test validations
  }

  /**
   * Update Avatar
   */
  @Test
  public void userUpdateAvatarTest() {
    UpdateUserAvatarOption body = null;
    // Void response = api.userUpdateAvatar(body);

    // TODO: test validations
  }

  /**
   * update an OAuth2 Application, this includes regenerating the client secret
   */
  @Test
  public void userUpdateOAuth2ApplicationTest() {
    CreateOAuth2ApplicationOptions body = null;
    Long id = null;
    // OAuth2Application response = api.userUpdateOAuth2Application(body, id);

    // TODO: test validations
  }

  /**
   * Verify a GPG key
   */
  @Test
  public void userVerifyGPGKeyTest() {
    // GPGKey response = api.userVerifyGPGKey();

    // TODO: test validations
  }
}
