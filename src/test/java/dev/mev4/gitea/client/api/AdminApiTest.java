package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.CreateHookOption;
import dev.mev4.gitea.client.model.CreateKeyOption;
import dev.mev4.gitea.client.model.CreateOrgOption;
import dev.mev4.gitea.client.model.CreateRepoOption;
import dev.mev4.gitea.client.model.CreateUserOption;
import dev.mev4.gitea.client.model.EditHookOption;
import dev.mev4.gitea.client.model.EditUserOption;
import dev.mev4.gitea.client.model.RenameUserOption;
import dev.mev4.gitea.client.model.UserBadgeOption;
import org.junit.Before;
import org.junit.Test;


/**
 * API tests for AdminApi
 */
public class AdminApiTest {

  private AdminApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(AdminApi.class);
  }


  /**
   * Add a badge to a user
   */
  @Test
  public void adminAddUserBadgesTest() {
    String username = null;
    UserBadgeOption body = null;
    // Void response = api.adminAddUserBadges(username, body);

    // TODO: test validations
  }

  /**
   * Adopt unadopted files as a repository
   */
  @Test
  public void adminAdoptRepositoryTest() {
    String owner = null;
    String repo = null;
    // Void response = api.adminAdoptRepository(owner, repo);

    // TODO: test validations
  }

  /**
   * Create a hook
   */
  @Test
  public void adminCreateHookTest() {
    CreateHookOption body = null;
    // Hook response = api.adminCreateHook(body);

    // TODO: test validations
  }

  /**
   * Create an organization
   */
  @Test
  public void adminCreateOrgTest() {
    CreateOrgOption body = null;
    String username = null;
    // Organization response = api.adminCreateOrg(body, username);

    // TODO: test validations
  }

  /**
   * Add a public key on behalf of a user
   */
  @Test
  public void adminCreatePublicKeyTest() {
    String username = null;
    CreateKeyOption body = null;
    // PublicKey response = api.adminCreatePublicKey(username, body);

    // TODO: test validations
  }

  /**
   * Create a repository on behalf of a user
   */
  @Test
  public void adminCreateRepoTest() {
    CreateRepoOption body = null;
    String username = null;
    // Repository response = api.adminCreateRepo(body, username);

    // TODO: test validations
  }

  /**
   * Create a user
   */
  @Test
  public void adminCreateUserTest() {
    CreateUserOption body = null;
    // User response = api.adminCreateUser(body);

    // TODO: test validations
  }

  /**
   * List cron tasks
   */
  @Test
  public void adminCronListTest() {
    Integer page = null;
    Integer limit = null;
    // List<Cron> response = api.adminCronList(page, limit);

    // TODO: test validations
  }

  /**
   * Run cron task
   */
  @Test
  public void adminCronRunTest() {
    String task = null;
    // Void response = api.adminCronRun(task);

    // TODO: test validations
  }

  /**
   * Delete a hook
   */
  @Test
  public void adminDeleteHookTest() {
    Long id = null;
    // Void response = api.adminDeleteHook(id);

    // TODO: test validations
  }

  /**
   * Delete unadopted files
   */
  @Test
  public void adminDeleteUnadoptedRepositoryTest() {
    String owner = null;
    String repo = null;
    // Void response = api.adminDeleteUnadoptedRepository(owner, repo);

    // TODO: test validations
  }

  /**
   * Delete a user
   */
  @Test
  public void adminDeleteUserTest() {
    String username = null;
    Boolean purge = null;
    // Void response = api.adminDeleteUser(username, purge);

    // TODO: test validations
  }

  /**
   * Remove a badge from a user
   */
  @Test
  public void adminDeleteUserBadgesTest() {
    String username = null;
    UserBadgeOption body = null;
    // Void response = api.adminDeleteUserBadges(username, body);

    // TODO: test validations
  }

  /**
   * Delete a user&#x27;s public key
   */
  @Test
  public void adminDeleteUserPublicKeyTest() {
    String username = null;
    Long id = null;
    // Void response = api.adminDeleteUserPublicKey(username, id);

    // TODO: test validations
  }

  /**
   * Update a hook
   */
  @Test
  public void adminEditHookTest() {
    Long id = null;
    EditHookOption body = null;
    // Hook response = api.adminEditHook(id, body);

    // TODO: test validations
  }

  /**
   * Edit an existing user
   */
  @Test
  public void adminEditUserTest() {
    String username = null;
    EditUserOption body = null;
    // User response = api.adminEditUser(username, body);

    // TODO: test validations
  }

  /**
   * List all emails
   */
  @Test
  public void adminGetAllEmailsTest() {
    Integer page = null;
    Integer limit = null;
    // List<Email> response = api.adminGetAllEmails(page, limit);

    // TODO: test validations
  }

  /**
   * List all organizations
   */
  @Test
  public void adminGetAllOrgsTest() {
    Integer page = null;
    Integer limit = null;
    // List<Organization> response = api.adminGetAllOrgs(page, limit);

    // TODO: test validations
  }

  /**
   * Get a hook
   */
  @Test
  public void adminGetHookTest() {
    Long id = null;
    // Hook response = api.adminGetHook(id);

    // TODO: test validations
  }

  /**
   * Get an global actions runner registration token
   */
  @Test
  public void adminGetRunnerRegistrationTokenTest() {
    // Void response = api.adminGetRunnerRegistrationToken();

    // TODO: test validations
  }

  /**
   * List system&#x27;s webhooks
   */
  @Test
  public void adminListHooksTest() {
    Integer page = null;
    Integer limit = null;
    // List<Hook> response = api.adminListHooks(page, limit);

    // TODO: test validations
  }

  /**
   * List a user&#x27;s badges
   */
  @Test
  public void adminListUserBadgesTest() {
    String username = null;
    // List<Badge> response = api.adminListUserBadges(username);

    // TODO: test validations
  }

  /**
   * Rename a user
   */
  @Test
  public void adminRenameUserTest() {
    RenameUserOption body = null;
    String username = null;
    // Void response = api.adminRenameUser(body, username);

    // TODO: test validations
  }

  /**
   * Search all emails
   */
  @Test
  public void adminSearchEmailsTest() {
    String q = null;
    Integer page = null;
    Integer limit = null;
    // List<Email> response = api.adminSearchEmails(q, page, limit);

    // TODO: test validations
  }

  /**
   * Search users according filter conditions
   */
  @Test
  public void adminSearchUsersTest() {
    Long sourceId = null;
    String loginName = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.adminSearchUsers(sourceId, loginName, page, limit);

    // TODO: test validations
  }

  /**
   * List unadopted repositories
   */
  @Test
  public void adminUnadoptedListTest() {
    Integer page = null;
    Integer limit = null;
    String pattern = null;
    // List<String> response = api.adminUnadoptedList(page, limit, pattern);

    // TODO: test validations
  }
}
