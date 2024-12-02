package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.CreateHookOption;
import dev.mev4.gitea.client.model.CreateLabelOption;
import dev.mev4.gitea.client.model.CreateOrUpdateSecretOption;
import dev.mev4.gitea.client.model.CreateOrgOption;
import dev.mev4.gitea.client.model.CreateRepoOption;
import dev.mev4.gitea.client.model.CreateTeamOption;
import dev.mev4.gitea.client.model.CreateVariableOption;
import dev.mev4.gitea.client.model.EditHookOption;
import dev.mev4.gitea.client.model.EditLabelOption;
import dev.mev4.gitea.client.model.EditOrgOption;
import dev.mev4.gitea.client.model.EditTeamOption;
import dev.mev4.gitea.client.model.UpdateUserAvatarOption;
import dev.mev4.gitea.client.model.UpdateVariableOption;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;


/**
 * API tests for OrganizationApi
 */
public class OrganizationApiTest {

  private OrganizationApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(OrganizationApi.class);
  }


  /**
   * Create a repository in an organization
   */
  @Test
  public void createOrgRepoTest() {
    String org = null;
    CreateRepoOption body = null;
    // Repository response = api.createOrgRepo(org, body);

    // TODO: test validations
  }

  /**
   * Create a repository in an organization
   */
  @Test
  public void createOrgRepoDeprecatedTest() {
    String org = null;
    CreateRepoOption body = null;
    // Repository response = api.createOrgRepoDeprecated(org, body);

    // TODO: test validations
  }

  /**
   * Create an org-level variable
   */
  @Test
  public void createOrgVariableTest() {
    String org = null;
    String variablename = null;
    CreateVariableOption body = null;
    // Void response = api.createOrgVariable(org, variablename, body);

    // TODO: test validations
  }

  /**
   * Delete a secret in an organization
   */
  @Test
  public void deleteOrgSecretTest() {
    String org = null;
    String secretname = null;
    // Void response = api.deleteOrgSecret(org, secretname);

    // TODO: test validations
  }

  /**
   * Delete an org-level variable
   */
  @Test
  public void deleteOrgVariableTest() {
    String org = null;
    String variablename = null;
    // ActionVariable response = api.deleteOrgVariable(org, variablename);

    // TODO: test validations
  }

  /**
   * Get an org-level variable
   */
  @Test
  public void getOrgVariableTest() {
    String org = null;
    String variablename = null;
    // ActionVariable response = api.getOrgVariable(org, variablename);

    // TODO: test validations
  }

  /**
   * Get an org-level variables list
   */
  @Test
  public void getOrgVariablesListTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<ActionVariable> response = api.getOrgVariablesList(org, page, limit);

    // TODO: test validations
  }

  /**
   * Add a team member
   */
  @Test
  public void orgAddTeamMemberTest() {
    Long id = null;
    String username = null;
    // Void response = api.orgAddTeamMember(id, username);

    // TODO: test validations
  }

  /**
   * Add a repository to a team
   */
  @Test
  public void orgAddTeamRepositoryTest() {
    Long id = null;
    String org = null;
    String repo = null;
    // Void response = api.orgAddTeamRepository(id, org, repo);

    // TODO: test validations
  }

  /**
   * Conceal a user&#x27;s membership
   */
  @Test
  public void orgConcealMemberTest() {
    String org = null;
    String username = null;
    // Void response = api.orgConcealMember(org, username);

    // TODO: test validations
  }

  /**
   * Create an organization
   */
  @Test
  public void orgCreateTest() {
    CreateOrgOption body = null;
    // Organization response = api.orgCreate(body);

    // TODO: test validations
  }

  /**
   * Create a hook
   */
  @Test
  public void orgCreateHookTest() {
    CreateHookOption body = null;
    String org = null;
    // Hook response = api.orgCreateHook(body, org);

    // TODO: test validations
  }

  /**
   * Create a label for an organization
   */
  @Test
  public void orgCreateLabelTest() {
    String org = null;
    CreateLabelOption body = null;
    // Label response = api.orgCreateLabel(org, body);

    // TODO: test validations
  }

  /**
   * Create a team
   */
  @Test
  public void orgCreateTeamTest() {
    String org = null;
    CreateTeamOption body = null;
    // Team response = api.orgCreateTeam(org, body);

    // TODO: test validations
  }

  /**
   * Delete an organization
   */
  @Test
  public void orgDeleteTest() {
    String org = null;
    // Void response = api.orgDelete(org);

    // TODO: test validations
  }

  /**
   * Delete Avatar
   */
  @Test
  public void orgDeleteAvatarTest() {
    String org = null;
    // Void response = api.orgDeleteAvatar(org);

    // TODO: test validations
  }

  /**
   * Delete a hook
   */
  @Test
  public void orgDeleteHookTest() {
    String org = null;
    Long id = null;
    // Void response = api.orgDeleteHook(org, id);

    // TODO: test validations
  }

  /**
   * Delete a label
   */
  @Test
  public void orgDeleteLabelTest() {
    String org = null;
    Long id = null;
    // Void response = api.orgDeleteLabel(org, id);

    // TODO: test validations
  }

  /**
   * Remove a member from an organization
   */
  @Test
  public void orgDeleteMemberTest() {
    String org = null;
    String username = null;
    // Void response = api.orgDeleteMember(org, username);

    // TODO: test validations
  }

  /**
   * Delete a team
   */
  @Test
  public void orgDeleteTeamTest() {
    Long id = null;
    // Void response = api.orgDeleteTeam(id);

    // TODO: test validations
  }

  /**
   * Edit an organization
   */
  @Test
  public void orgEditTest() {
    EditOrgOption body = null;
    String org = null;
    // Organization response = api.orgEdit(body, org);

    // TODO: test validations
  }

  /**
   * Update a hook
   */
  @Test
  public void orgEditHookTest() {
    String org = null;
    Long id = null;
    EditHookOption body = null;
    // Hook response = api.orgEditHook(org, id, body);

    // TODO: test validations
  }

  /**
   * Update a label
   */
  @Test
  public void orgEditLabelTest() {
    String org = null;
    Long id = null;
    EditLabelOption body = null;
    // Label response = api.orgEditLabel(org, id, body);

    // TODO: test validations
  }

  /**
   * Edit a team
   */
  @Test
  public void orgEditTeamTest() {
    Integer id = null;
    EditTeamOption body = null;
    // Team response = api.orgEditTeam(id, body);

    // TODO: test validations
  }

  /**
   * Get an organization
   */
  @Test
  public void orgGetTest() {
    String org = null;
    // Organization response = api.orgGet(org);

    // TODO: test validations
  }

  /**
   * Get list of organizations
   */
  @Test
  public void orgGetAllTest() {
    Integer page = null;
    Integer limit = null;
    // List<Organization> response = api.orgGetAll(page, limit);

    // TODO: test validations
  }

  /**
   * Get a hook
   */
  @Test
  public void orgGetHookTest() {
    String org = null;
    Long id = null;
    // Hook response = api.orgGetHook(org, id);

    // TODO: test validations
  }

  /**
   * Get a single label
   */
  @Test
  public void orgGetLabelTest() {
    String org = null;
    Long id = null;
    // Label response = api.orgGetLabel(org, id);

    // TODO: test validations
  }

  /**
   * Get an organization&#x27;s actions runner registration token
   */
  @Test
  public void orgGetRunnerRegistrationTokenTest() {
    String org = null;
    // Void response = api.orgGetRunnerRegistrationToken(org);

    // TODO: test validations
  }

  /**
   * Get a team
   */
  @Test
  public void orgGetTeamTest() {
    Long id = null;
    // Team response = api.orgGetTeam(id);

    // TODO: test validations
  }

  /**
   * Get user permissions in organization
   */
  @Test
  public void orgGetUserPermissionsTest() {
    String username = null;
    String org = null;
    // OrganizationPermissions response = api.orgGetUserPermissions(username, org);

    // TODO: test validations
  }

  /**
   * Check if a user is a member of an organization
   */
  @Test
  public void orgIsMemberTest() {
    String org = null;
    String username = null;
    // Void response = api.orgIsMember(org, username);

    // TODO: test validations
  }

  /**
   * Check if a user is a public member of an organization
   */
  @Test
  public void orgIsPublicMemberTest() {
    String org = null;
    String username = null;
    // Void response = api.orgIsPublicMember(org, username);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s actions secrets
   */
  @Test
  public void orgListActionsSecretsTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<Secret> response = api.orgListActionsSecrets(org, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s activity feeds
   */
  @Test
  public void orgListActivityFeedsTest() {
    String org = null;
    LocalDate date = null;
    Integer page = null;
    Integer limit = null;
    // List<Activity> response = api.orgListActivityFeeds(org, date, page, limit);

    // TODO: test validations
  }

  /**
   * List the current user&#x27;s organizations
   */
  @Test
  public void orgListCurrentUserOrgsTest() {
    Integer page = null;
    Integer limit = null;
    // List<Organization> response = api.orgListCurrentUserOrgs(page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s webhooks
   */
  @Test
  public void orgListHooksTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<Hook> response = api.orgListHooks(org, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s labels
   */
  @Test
  public void orgListLabelsTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<Label> response = api.orgListLabels(org, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s members
   */
  @Test
  public void orgListMembersTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.orgListMembers(org, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s public members
   */
  @Test
  public void orgListPublicMembersTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.orgListPublicMembers(org, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s repos
   */
  @Test
  public void orgListReposTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.orgListRepos(org, page, limit);

    // TODO: test validations
  }

  /**
   * List a team&#x27;s activity feeds
   */
  @Test
  public void orgListTeamActivityFeedsTest() {
    Long id = null;
    LocalDate date = null;
    Integer page = null;
    Integer limit = null;
    // List<Activity> response = api.orgListTeamActivityFeeds(id, date, page, limit);

    // TODO: test validations
  }

  /**
   * List a particular member of team
   */
  @Test
  public void orgListTeamMemberTest() {
    Long id = null;
    String username = null;
    // User response = api.orgListTeamMember(id, username);

    // TODO: test validations
  }

  /**
   * List a team&#x27;s members
   */
  @Test
  public void orgListTeamMembersTest() {
    Long id = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.orgListTeamMembers(id, page, limit);

    // TODO: test validations
  }

  /**
   * List a particular repo of team
   */
  @Test
  public void orgListTeamRepoTest() {
    Long id = null;
    String org = null;
    String repo = null;
    // Repository response = api.orgListTeamRepo(id, org, repo);

    // TODO: test validations
  }

  /**
   * List a team&#x27;s repos
   */
  @Test
  public void orgListTeamReposTest() {
    Long id = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.orgListTeamRepos(id, page, limit);

    // TODO: test validations
  }

  /**
   * List an organization&#x27;s teams
   */
  @Test
  public void orgListTeamsTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<Team> response = api.orgListTeams(org, page, limit);

    // TODO: test validations
  }

  /**
   * List a user&#x27;s organizations
   */
  @Test
  public void orgListUserOrgsTest() {
    String username = null;
    Integer page = null;
    Integer limit = null;
    // List<Organization> response = api.orgListUserOrgs(username, page, limit);

    // TODO: test validations
  }

  /**
   * Publicize a user&#x27;s membership
   */
  @Test
  public void orgPublicizeMemberTest() {
    String org = null;
    String username = null;
    // Void response = api.orgPublicizeMember(org, username);

    // TODO: test validations
  }

  /**
   * Remove a team member
   */
  @Test
  public void orgRemoveTeamMemberTest() {
    Long id = null;
    String username = null;
    // Void response = api.orgRemoveTeamMember(id, username);

    // TODO: test validations
  }

  /**
   * Remove a repository from a team
   * <p>
   * This does not delete the repository, it only removes the repository from the team.
   */
  @Test
  public void orgRemoveTeamRepositoryTest() {
    Long id = null;
    String org = null;
    String repo = null;
    // Void response = api.orgRemoveTeamRepository(id, org, repo);

    // TODO: test validations
  }

  /**
   * Update Avatar
   */
  @Test
  public void orgUpdateAvatarTest() {
    String org = null;
    UpdateUserAvatarOption body = null;
    // Void response = api.orgUpdateAvatar(org, body);

    // TODO: test validations
  }

  /**
   * Block a user
   */
  @Test
  public void organizationBlockUserTest() {
    String org = null;
    String username = null;
    String note = null;
    // Void response = api.organizationBlockUser(org, username, note);

    // TODO: test validations
  }

  /**
   * Check if a user is blocked by the organization
   */
  @Test
  public void organizationCheckUserBlockTest() {
    String org = null;
    String username = null;
    // Void response = api.organizationCheckUserBlock(org, username);

    // TODO: test validations
  }

  /**
   * List users blocked by the organization
   */
  @Test
  public void organizationListBlocksTest() {
    String org = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.organizationListBlocks(org, page, limit);

    // TODO: test validations
  }

  /**
   * Unblock a user
   */
  @Test
  public void organizationUnblockUserTest() {
    String org = null;
    String username = null;
    // Void response = api.organizationUnblockUser(org, username);

    // TODO: test validations
  }

  /**
   * Search for teams within an organization
   */
  @Test
  public void teamSearchTest() {
    String org = null;
    String q = null;
    Boolean includeDesc = null;
    Integer page = null;
    Integer limit = null;
    // InlineResponse200 response = api.teamSearch(org, q, includeDesc, page, limit);

    // TODO: test validations
  }

  /**
   * Create or Update a secret value in an organization
   */
  @Test
  public void updateOrgSecretTest() {
    String org = null;
    String secretname = null;
    CreateOrUpdateSecretOption body = null;
    // Void response = api.updateOrgSecret(org, secretname, body);

    // TODO: test validations
  }

  /**
   * Update an org-level variable
   */
  @Test
  public void updateOrgVariableTest() {
    String org = null;
    String variablename = null;
    UpdateVariableOption body = null;
    // Void response = api.updateOrgVariable(org, variablename, body);

    // TODO: test validations
  }
}
