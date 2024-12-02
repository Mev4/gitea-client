package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.*;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.io.File;
import java.util.List;


/**
 * API tests for RepositoryApi
 */
public class RepositoryApiTest {

  private RepositoryApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(RepositoryApi.class);
  }


  /**
   * Accept a repo transfer
   */
  @Test
  public void acceptRepoTransferTest() {
    String owner = null;
    String repo = null;
    // Repository response = api.acceptRepoTransfer(owner, repo);

    // TODO: test validations
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
   * Fork a repository
   */
  @Test
  public void createForkTest() {
    String owner = null;
    String repo = null;
    CreateForkOption body = null;
    // Repository response = api.createFork(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a repo-level variable
   */
  @Test
  public void createRepoVariableTest() {
    String owner = null;
    String repo = null;
    String variablename = null;
    CreateVariableOption body = null;
    // Void response = api.createRepoVariable(owner, repo, variablename, body);

    // TODO: test validations
  }

  /**
   * Delete a secret in a repository
   */
  @Test
  public void deleteRepoSecretTest() {
    String owner = null;
    String repo = null;
    String secretname = null;
    // Void response = api.deleteRepoSecret(owner, repo, secretname);

    // TODO: test validations
  }

  /**
   * Delete a repo-level variable
   */
  @Test
  public void deleteRepoVariableTest() {
    String owner = null;
    String repo = null;
    String variablename = null;
    // ActionVariable response = api.deleteRepoVariable(owner, repo, variablename);

    // TODO: test validations
  }

  /**
   * Create a repository using a template
   */
  @Test
  public void generateRepoTest() {
    String templateOwner = null;
    String templateRepo = null;
    GenerateRepoOption body = null;
    // Repository response = api.generateRepo(templateOwner, templateRepo, body);

    // TODO: test validations
  }

  /**
   * Gets the tag object of an annotated tag (not lightweight tags)
   */
  @Test
  public void getAnnotatedTagTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    // AnnotatedTag response = api.getAnnotatedTag(owner, repo, sha);

    // TODO: test validations
  }

  /**
   * Gets the blob of a repository.
   */
  @Test
  public void getBlobTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    // GitBlobResponse response = api.getBlob(owner, repo, sha);

    // TODO: test validations
  }

  /**
   * Get a repo-level variable
   */
  @Test
  public void getRepoVariableTest() {
    String owner = null;
    String repo = null;
    String variablename = null;
    // ActionVariable response = api.getRepoVariable(owner, repo, variablename);

    // TODO: test validations
  }

  /**
   * Get repo-level variables list
   */
  @Test
  public void getRepoVariablesListTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<ActionVariable> response = api.getRepoVariablesList(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * Gets the tree of a repository.
   */
  @Test
  public void getTreeTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    Boolean recursive = null;
    Integer page = null;
    Integer perPage = null;
    // GitTreeResponse response = api.getTree(owner, repo, sha, recursive, page, perPage);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s action tasks
   */
  @Test
  public void listActionTasksTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // ActionTaskResponse response = api.listActionTasks(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s forks
   */
  @Test
  public void listForksTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Repository> response = api.listForks(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * Reject a repo transfer
   */
  @Test
  public void rejectRepoTransferTest() {
    String owner = null;
    String repo = null;
    // Repository response = api.rejectRepoTransfer(owner, repo);

    // TODO: test validations
  }

  /**
   * Add or Update a collaborator to a repository
   */
  @Test
  public void repoAddCollaboratorTest() {
    String owner = null;
    String repo = null;
    String collaborator = null;
    AddCollaboratorOption body = null;
    // Void response = api.repoAddCollaborator(owner, repo, collaborator, body);

    // TODO: test validations
  }

  /**
   * add a push mirror to the repository
   */
  @Test
  public void repoAddPushMirrorTest() {
    String owner = null;
    String repo = null;
    CreatePushMirrorOption body = null;
    // PushMirror response = api.repoAddPushMirror(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Add a team to a repository
   */
  @Test
  public void repoAddTeamTest() {
    String owner = null;
    String repo = null;
    String team = null;
    // Void response = api.repoAddTeam(owner, repo, team);

    // TODO: test validations
  }

  /**
   * Add a topic to a repository
   */
  @Test
  public void repoAddTopicTest() {
    String owner = null;
    String repo = null;
    String topic = null;
    // Void response = api.repoAddTopic(owner, repo, topic);

    // TODO: test validations
  }

  /**
   * Apply diff patch to repository
   */
  @Test
  public void repoApplyDiffPatchTest() {
    UpdateFileOptions body = null;
    String owner = null;
    String repo = null;
    // FileResponse response = api.repoApplyDiffPatch(body, owner, repo);

    // TODO: test validations
  }

  /**
   * Cancel the scheduled auto merge for the given pull request
   */
  @Test
  public void repoCancelScheduledAutoMergeTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.repoCancelScheduledAutoMerge(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Modify multiple files in a repository
   */
  @Test
  public void repoChangeFilesTest() {
    ChangeFilesOptions body = null;
    String owner = null;
    String repo = null;
    // FilesResponse response = api.repoChangeFiles(body, owner, repo);

    // TODO: test validations
  }

  /**
   * Check if a user is a collaborator of a repository
   */
  @Test
  public void repoCheckCollaboratorTest() {
    String owner = null;
    String repo = null;
    String collaborator = null;
    // Void response = api.repoCheckCollaborator(owner, repo, collaborator);

    // TODO: test validations
  }

  /**
   * Check if a team is assigned to a repository
   */
  @Test
  public void repoCheckTeamTest() {
    String owner = null;
    String repo = null;
    String team = null;
    // Team response = api.repoCheckTeam(owner, repo, team);

    // TODO: test validations
  }

  /**
   * Get commit comparison information
   */
  @Test
  public void repoCompareDiffTest() {
    String owner = null;
    String repo = null;
    String basehead = null;
    // Compare response = api.repoCompareDiff(owner, repo, basehead);

    // TODO: test validations
  }

  /**
   * Create a branch
   */
  @Test
  public void repoCreateBranchTest() {
    String owner = null;
    String repo = null;
    CreateBranchRepoOption body = null;
    // Branch response = api.repoCreateBranch(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a branch protections for a repository
   */
  @Test
  public void repoCreateBranchProtectionTest() {
    String owner = null;
    String repo = null;
    CreateBranchProtectionOption body = null;
    // BranchProtection response = api.repoCreateBranchProtection(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a file in a repository
   */
  @Test
  public void repoCreateFileTest() {
    CreateFileOptions body = null;
    String owner = null;
    String repo = null;
    String filepath = null;
    // FileResponse response = api.repoCreateFile(body, owner, repo, filepath);

    // TODO: test validations
  }

  /**
   * Create a hook
   */
  @Test
  public void repoCreateHookTest() {
    String owner = null;
    String repo = null;
    CreateHookOption body = null;
    // Hook response = api.repoCreateHook(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Add a key to a repository
   */
  @Test
  public void repoCreateKeyTest() {
    String owner = null;
    String repo = null;
    CreateKeyOption body = null;
    // DeployKey response = api.repoCreateKey(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a pull request
   */
  @Test
  public void repoCreatePullRequestTest() {
    String owner = null;
    String repo = null;
    CreatePullRequestOption body = null;
    // PullRequest response = api.repoCreatePullRequest(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a review to an pull request
   */
  @Test
  public void repoCreatePullReviewTest() {
    CreatePullReviewOptions body = null;
    String owner = null;
    String repo = null;
    Long index = null;
    // PullReview response = api.repoCreatePullReview(body, owner, repo, index);

    // TODO: test validations
  }

  /**
   * create review requests for a pull request
   */
  @Test
  public void repoCreatePullReviewRequestsTest() {
    PullReviewRequestOptions body = null;
    String owner = null;
    String repo = null;
    Long index = null;
    // List<PullReview> response = api.repoCreatePullReviewRequests(body, owner, repo, index);

    // TODO: test validations
  }

  /**
   * Create a release
   */
  @Test
  public void repoCreateReleaseTest() {
    String owner = null;
    String repo = null;
    CreateReleaseOption body = null;
    // Release response = api.repoCreateRelease(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a release attachment
   */
  @Test
  public void repoCreateReleaseAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    File attachment = null;
    String name = null;
    // Attachment response = api.repoCreateReleaseAttachment(owner, repo, id, attachment, name);

    // TODO: test validations
  }

  /**
   * Create a commit status
   */
  @Test
  public void repoCreateStatusTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    CreateStatusOption body = null;
    // CommitStatus response = api.repoCreateStatus(owner, repo, sha, body);

    // TODO: test validations
  }

  /**
   * Create a new git tag in a repository
   */
  @Test
  public void repoCreateTagTest() {
    String owner = null;
    String repo = null;
    CreateTagOption body = null;
    // Tag response = api.repoCreateTag(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a tag protections for a repository
   */
  @Test
  public void repoCreateTagProtectionTest() {
    String owner = null;
    String repo = null;
    CreateTagProtectionOption body = null;
    // TagProtection response = api.repoCreateTagProtection(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a wiki page
   */
  @Test
  public void repoCreateWikiPageTest() {
    String owner = null;
    String repo = null;
    CreateWikiPageOptions body = null;
    // WikiPage response = api.repoCreateWikiPage(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Delete a repository
   */
  @Test
  public void repoDeleteTest() {
    String owner = null;
    String repo = null;
    // Void response = api.repoDelete(owner, repo);

    // TODO: test validations
  }

  /**
   * Delete avatar
   */
  @Test
  public void repoDeleteAvatarTest() {
    String owner = null;
    String repo = null;
    // Void response = api.repoDeleteAvatar(owner, repo);

    // TODO: test validations
  }

  /**
   * Delete a specific branch from a repository
   */
  @Test
  public void repoDeleteBranchTest() {
    String owner = null;
    String repo = null;
    String branch = null;
    // Void response = api.repoDeleteBranch(owner, repo, branch);

    // TODO: test validations
  }

  /**
   * Delete a specific branch protection for the repository
   */
  @Test
  public void repoDeleteBranchProtectionTest() {
    String owner = null;
    String repo = null;
    String name = null;
    // Void response = api.repoDeleteBranchProtection(owner, repo, name);

    // TODO: test validations
  }

  /**
   * Delete a collaborator from a repository
   */
  @Test
  public void repoDeleteCollaboratorTest() {
    String owner = null;
    String repo = null;
    String collaborator = null;
    // Void response = api.repoDeleteCollaborator(owner, repo, collaborator);

    // TODO: test validations
  }

  /**
   * Delete a file in a repository
   */
  @Test
  public void repoDeleteFileTest() {
    DeleteFileOptions body = null;
    String owner = null;
    String repo = null;
    String filepath = null;
    // FileDeleteResponse response = api.repoDeleteFile(body, owner, repo, filepath);

    // TODO: test validations
  }

  /**
   * Delete a Git hook in a repository
   */
  @Test
  public void repoDeleteGitHookTest() {
    String owner = null;
    String repo = null;
    String id = null;
    // Void response = api.repoDeleteGitHook(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a hook in a repository
   */
  @Test
  public void repoDeleteHookTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Void response = api.repoDeleteHook(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a key from a repository
   */
  @Test
  public void repoDeleteKeyTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Void response = api.repoDeleteKey(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a specific review from a pull request
   */
  @Test
  public void repoDeletePullReviewTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // Void response = api.repoDeletePullReview(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * cancel review requests for a pull request
   */
  @Test
  public void repoDeletePullReviewRequestsTest() {
    PullReviewRequestOptions body = null;
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.repoDeletePullReviewRequests(body, owner, repo, index);

    // TODO: test validations
  }

  /**
   * deletes a push mirror from a repository by remoteName
   */
  @Test
  public void repoDeletePushMirrorTest() {
    String owner = null;
    String repo = null;
    String name = null;
    // Void response = api.repoDeletePushMirror(owner, repo, name);

    // TODO: test validations
  }

  /**
   * Delete a release
   */
  @Test
  public void repoDeleteReleaseTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Void response = api.repoDeleteRelease(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a release attachment
   */
  @Test
  public void repoDeleteReleaseAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    // Void response = api.repoDeleteReleaseAttachment(owner, repo, id, attachmentId);

    // TODO: test validations
  }

  /**
   * Delete a release by tag name
   */
  @Test
  public void repoDeleteReleaseByTagTest() {
    String owner = null;
    String repo = null;
    String tag = null;
    // Void response = api.repoDeleteReleaseByTag(owner, repo, tag);

    // TODO: test validations
  }

  /**
   * Delete a repository&#x27;s tag by name
   */
  @Test
  public void repoDeleteTagTest() {
    String owner = null;
    String repo = null;
    String tag = null;
    // Void response = api.repoDeleteTag(owner, repo, tag);

    // TODO: test validations
  }

  /**
   * Delete a specific tag protection for the repository
   */
  @Test
  public void repoDeleteTagProtectionTest() {
    String owner = null;
    String repo = null;
    Integer id = null;
    // Void response = api.repoDeleteTagProtection(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a team from a repository
   */
  @Test
  public void repoDeleteTeamTest() {
    String owner = null;
    String repo = null;
    String team = null;
    // Void response = api.repoDeleteTeam(owner, repo, team);

    // TODO: test validations
  }

  /**
   * Delete a topic from a repository
   */
  @Test
  public void repoDeleteTopicTest() {
    String owner = null;
    String repo = null;
    String topic = null;
    // Void response = api.repoDeleteTopic(owner, repo, topic);

    // TODO: test validations
  }

  /**
   * Delete a wiki page
   */
  @Test
  public void repoDeleteWikiPageTest() {
    String owner = null;
    String repo = null;
    String pageName = null;
    // Void response = api.repoDeleteWikiPage(owner, repo, pageName);

    // TODO: test validations
  }

  /**
   * Dismiss a review for a pull request
   */
  @Test
  public void repoDismissPullReviewTest() {
    DismissPullReviewOptions body = null;
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // PullReview response = api.repoDismissPullReview(body, owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Get a commit&#x27;s diff or patch
   */
  @Test
  public void repoDownloadCommitDiffOrPatchTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    String diffType = null;
    // String response = api.repoDownloadCommitDiffOrPatch(owner, repo, sha, diffType);

    // TODO: test validations
  }

  /**
   * Get a pull request diff or patch
   */
  @Test
  public void repoDownloadPullDiffOrPatchTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String diffType = null;
    Boolean binary = null;
    // String response = api.repoDownloadPullDiffOrPatch(owner, repo, index, diffType, binary);

    // TODO: test validations
  }

  /**
   * Edit a repository&#x27;s properties. Only fields that are set will be changed.
   */
  @Test
  public void repoEditTest() {
    String owner = null;
    String repo = null;
    EditRepoOption body = null;
    // Repository response = api.repoEdit(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Edit a branch protections for a repository. Only fields that are set will be changed
   */
  @Test
  public void repoEditBranchProtectionTest() {
    String owner = null;
    String repo = null;
    String name = null;
    EditBranchProtectionOption body = null;
    // BranchProtection response = api.repoEditBranchProtection(owner, repo, name, body);

    // TODO: test validations
  }

  /**
   * Edit a Git hook in a repository
   */
  @Test
  public void repoEditGitHookTest() {
    String owner = null;
    String repo = null;
    String id = null;
    EditGitHookOption body = null;
    // GitHook response = api.repoEditGitHook(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Edit a hook in a repository
   */
  @Test
  public void repoEditHookTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditHookOption body = null;
    // Hook response = api.repoEditHook(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Update a pull request. If using deadline only the date will be taken into account, and time of day ignored.
   */
  @Test
  public void repoEditPullRequestTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    EditPullRequestOption body = null;
    // PullRequest response = api.repoEditPullRequest(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Update a release
   */
  @Test
  public void repoEditReleaseTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditReleaseOption body = null;
    // Release response = api.repoEditRelease(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Edit a release attachment
   */
  @Test
  public void repoEditReleaseAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    EditAttachmentOptions body = null;
    // Attachment response = api.repoEditReleaseAttachment(owner, repo, id, attachmentId, body);

    // TODO: test validations
  }

  /**
   * Edit a tag protections for a repository. Only fields that are set will be changed
   */
  @Test
  public void repoEditTagProtectionTest() {
    String owner = null;
    String repo = null;
    Integer id = null;
    EditTagProtectionOption body = null;
    // TagProtection response = api.repoEditTagProtection(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Edit a wiki page
   */
  @Test
  public void repoEditWikiPageTest() {
    String owner = null;
    String repo = null;
    String pageName = null;
    CreateWikiPageOptions body = null;
    // WikiPage response = api.repoEditWikiPage(owner, repo, pageName, body);

    // TODO: test validations
  }

  /**
   * Get a repository
   */
  @Test
  public void repoGetTest() {
    String owner = null;
    String repo = null;
    // Repository response = api.repoGet(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a list of all commits from a repository
   */
  @Test
  public void repoGetAllCommitsTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    String path = null;
    Boolean stat = null;
    Boolean verification = null;
    Boolean files = null;
    Integer page = null;
    Integer limit = null;
    String not = null;
    // List<Commit> response = api.repoGetAllCommits(owner, repo, sha, path, stat, verification, files, page, limit, not);

    // TODO: test validations
  }

  /**
   * Get an archive of a repository
   */
  @Test
  public void repoGetArchiveTest() {
    String owner = null;
    String repo = null;
    String archive = null;
    // Void response = api.repoGetArchive(owner, repo, archive);

    // TODO: test validations
  }

  /**
   * Return all users that have write access and can be assigned to issues
   */
  @Test
  public void repoGetAssigneesTest() {
    String owner = null;
    String repo = null;
    // List<User> response = api.repoGetAssignees(owner, repo);

    // TODO: test validations
  }

  /**
   * Retrieve a specific branch from a repository, including its effective branch protection
   */
  @Test
  public void repoGetBranchTest() {
    String owner = null;
    String repo = null;
    String branch = null;
    // Branch response = api.repoGetBranch(owner, repo, branch);

    // TODO: test validations
  }

  /**
   * Get a specific branch protection for the repository
   */
  @Test
  public void repoGetBranchProtectionTest() {
    String owner = null;
    String repo = null;
    String name = null;
    // BranchProtection response = api.repoGetBranchProtection(owner, repo, name);

    // TODO: test validations
  }

  /**
   * Get a repository by id
   */
  @Test
  public void repoGetByIDTest() {
    Long id = null;
    // Repository response = api.repoGetByID(id);

    // TODO: test validations
  }

  /**
   * Get a commit&#x27;s combined status, by branch/tag/commit reference
   */
  @Test
  public void repoGetCombinedStatusByRefTest() {
    String owner = null;
    String repo = null;
    String ref = null;
    Integer page = null;
    Integer limit = null;
    // CombinedStatus response = api.repoGetCombinedStatusByRef(owner, repo, ref, page, limit);

    // TODO: test validations
  }

  /**
   * Get the merged pull request of the commit
   */
  @Test
  public void repoGetCommitPullRequestTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    // PullRequest response = api.repoGetCommitPullRequest(owner, repo, sha);

    // TODO: test validations
  }

  /**
   * Gets the metadata and contents (if a file) of an entry in a repository, or a list of entries if a dir
   */
  @Test
  public void repoGetContentsTest() {
    String owner = null;
    String repo = null;
    String filepath = null;
    String ref = null;
    // ContentsResponse response = api.repoGetContents(owner, repo, filepath, ref);

    // TODO: test validations
  }

  /**
   * Gets the metadata of all the entries of the root dir
   */
  @Test
  public void repoGetContentsListTest() {
    String owner = null;
    String repo = null;
    String ref = null;
    // List<ContentsResponse> response = api.repoGetContentsList(owner, repo, ref);

    // TODO: test validations
  }

  /**
   * Get the EditorConfig definitions of a file in a repository
   */
  @Test
  public void repoGetEditorConfigTest() {
    String owner = null;
    String repo = null;
    String filepath = null;
    String ref = null;
    // Void response = api.repoGetEditorConfig(owner, repo, filepath, ref);

    // TODO: test validations
  }

  /**
   * Get a Git hook
   */
  @Test
  public void repoGetGitHookTest() {
    String owner = null;
    String repo = null;
    String id = null;
    // GitHook response = api.repoGetGitHook(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get a hook
   */
  @Test
  public void repoGetHookTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Hook response = api.repoGetHook(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Returns the issue config for a repo
   */
  @Test
  public void repoGetIssueConfigTest() {
    String owner = null;
    String repo = null;
    // IssueConfig response = api.repoGetIssueConfig(owner, repo);

    // TODO: test validations
  }

  /**
   * Get available issue templates for a repository
   */
  @Test
  public void repoGetIssueTemplatesTest() {
    String owner = null;
    String repo = null;
    // List<IssueTemplate> response = api.repoGetIssueTemplates(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a repository&#x27;s key by id
   */
  @Test
  public void repoGetKeyTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // DeployKey response = api.repoGetKey(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get languages and number of bytes of code written
   */
  @Test
  public void repoGetLanguagesTest() {
    String owner = null;
    String repo = null;
    // Map<String, Long> response = api.repoGetLanguages(owner, repo);

    // TODO: test validations
  }

  /**
   * Gets the most recent non-prerelease, non-draft release of a repository, sorted by created_at
   */
  @Test
  public void repoGetLatestReleaseTest() {
    String owner = null;
    String repo = null;
    // Release response = api.repoGetLatestRelease(owner, repo);

    // TODO: test validations
  }

  /**
   * Get repo licenses
   */
  @Test
  public void repoGetLicensesTest() {
    String owner = null;
    String repo = null;
    // List<String> response = api.repoGetLicenses(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a note corresponding to a single commit from a repository
   */
  @Test
  public void repoGetNoteTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    Boolean verification = null;
    Boolean files = null;
    // Note response = api.repoGetNote(owner, repo, sha, verification, files);

    // TODO: test validations
  }

  /**
   * Get a pull request
   */
  @Test
  public void repoGetPullRequestTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // PullRequest response = api.repoGetPullRequest(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Get a pull request by base and head
   */
  @Test
  public void repoGetPullRequestByBaseHeadTest() {
    String owner = null;
    String repo = null;
    String base = null;
    String head = null;
    // PullRequest response = api.repoGetPullRequestByBaseHead(owner, repo, base, head);

    // TODO: test validations
  }

  /**
   * Get commits for a pull request
   */
  @Test
  public void repoGetPullRequestCommitsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Integer page = null;
    Integer limit = null;
    Boolean verification = null;
    Boolean files = null;
    // List<Commit> response = api.repoGetPullRequestCommits(owner, repo, index, page, limit, verification, files);

    // TODO: test validations
  }

  /**
   * Get changed files for a pull request
   */
  @Test
  public void repoGetPullRequestFilesTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String skipTo = null;
    String whitespace = null;
    Integer page = null;
    Integer limit = null;
    // List<ChangedFile> response = api.repoGetPullRequestFiles(owner, repo, index, skipTo, whitespace, page, limit);

    // TODO: test validations
  }

  /**
   * Get a specific review for a pull request
   */
  @Test
  public void repoGetPullReviewTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // PullReview response = api.repoGetPullReview(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Get a specific review for a pull request
   */
  @Test
  public void repoGetPullReviewCommentsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // List<PullReviewComment> response = api.repoGetPullReviewComments(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Get push mirror of the repository by remoteName
   */
  @Test
  public void repoGetPushMirrorByRemoteNameTest() {
    String owner = null;
    String repo = null;
    String name = null;
    // PushMirror response = api.repoGetPushMirrorByRemoteName(owner, repo, name);

    // TODO: test validations
  }

  /**
   * Get a file from a repository
   */
  @Test
  public void repoGetRawFileTest() {
    String owner = null;
    String repo = null;
    String filepath = null;
    String ref = null;
    // File response = api.repoGetRawFile(owner, repo, filepath, ref);

    // TODO: test validations
  }

  /**
   * Get a file or it&#x27;s LFS object from a repository
   */
  @Test
  public void repoGetRawFileOrLFSTest() {
    String owner = null;
    String repo = null;
    String filepath = null;
    String ref = null;
    // File response = api.repoGetRawFileOrLFS(owner, repo, filepath, ref);

    // TODO: test validations
  }

  /**
   * Get a release
   */
  @Test
  public void repoGetReleaseTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Release response = api.repoGetRelease(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get a release attachment
   */
  @Test
  public void repoGetReleaseAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    // Attachment response = api.repoGetReleaseAttachment(owner, repo, id, attachmentId);

    // TODO: test validations
  }

  /**
   * Get a release by tag name
   */
  @Test
  public void repoGetReleaseByTagTest() {
    String owner = null;
    String repo = null;
    String tag = null;
    // Release response = api.repoGetReleaseByTag(owner, repo, tag);

    // TODO: test validations
  }

  /**
   * Get repository permissions for a user
   */
  @Test
  public void repoGetRepoPermissionsTest() {
    String owner = null;
    String repo = null;
    String collaborator = null;
    // RepoCollaboratorPermission response = api.repoGetRepoPermissions(owner, repo, collaborator);

    // TODO: test validations
  }

  /**
   * Return all users that can be requested to review in this repo
   */
  @Test
  public void repoGetReviewersTest() {
    String owner = null;
    String repo = null;
    // List<User> response = api.repoGetReviewers(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a repository&#x27;s actions runner registration token
   */
  @Test
  public void repoGetRunnerRegistrationTokenTest() {
    String owner = null;
    String repo = null;
    // Void response = api.repoGetRunnerRegistrationToken(owner, repo);

    // TODO: test validations
  }

  /**
   * Get a single commit from a repository
   */
  @Test
  public void repoGetSingleCommitTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    Boolean stat = null;
    Boolean verification = null;
    Boolean files = null;
    // Commit response = api.repoGetSingleCommit(owner, repo, sha, stat, verification, files);

    // TODO: test validations
  }

  /**
   * Get the tag of a repository by tag name
   */
  @Test
  public void repoGetTagTest() {
    String owner = null;
    String repo = null;
    String tag = null;
    // Tag response = api.repoGetTag(owner, repo, tag);

    // TODO: test validations
  }

  /**
   * Get a specific tag protection for the repository
   */
  @Test
  public void repoGetTagProtectionTest() {
    String owner = null;
    String repo = null;
    Integer id = null;
    // TagProtection response = api.repoGetTagProtection(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get a wiki page
   */
  @Test
  public void repoGetWikiPageTest() {
    String owner = null;
    String repo = null;
    String pageName = null;
    // WikiPage response = api.repoGetWikiPage(owner, repo, pageName);

    // TODO: test validations
  }

  /**
   * Get revisions of a wiki page
   */
  @Test
  public void repoGetWikiPageRevisionsTest() {
    String owner = null;
    String repo = null;
    String pageName = null;
    Integer page = null;
    // WikiCommitList response = api.repoGetWikiPageRevisions(owner, repo, pageName, page);

    // TODO: test validations
  }

  /**
   * Get all wiki pages
   */
  @Test
  public void repoGetWikiPagesTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<WikiPageMetaData> response = api.repoGetWikiPages(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List an repo&#x27;s actions secrets
   */
  @Test
  public void repoListActionsSecretsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Secret> response = api.repoListActionsSecrets(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s activity feeds
   */
  @Test
  public void repoListActivityFeedsTest() {
    String owner = null;
    String repo = null;
    LocalDate date = null;
    Integer page = null;
    Integer limit = null;
    // List<Activity> response = api.repoListActivityFeeds(owner, repo, date, page, limit);

    // TODO: test validations
  }

  /**
   * Get specified ref or filtered repository&#x27;s refs
   */
  @Test
  public void repoListAllGitRefsTest() {
    String owner = null;
    String repo = null;
    // List<Reference> response = api.repoListAllGitRefs(owner, repo);

    // TODO: test validations
  }

  /**
   * List branch protections for a repository
   */
  @Test
  public void repoListBranchProtectionTest() {
    String owner = null;
    String repo = null;
    // List<BranchProtection> response = api.repoListBranchProtection(owner, repo);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s branches
   */
  @Test
  public void repoListBranchesTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Branch> response = api.repoListBranches(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s collaborators
   */
  @Test
  public void repoListCollaboratorsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.repoListCollaborators(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List the Git hooks in a repository
   */
  @Test
  public void repoListGitHooksTest() {
    String owner = null;
    String repo = null;
    // List<GitHook> response = api.repoListGitHooks(owner, repo);

    // TODO: test validations
  }

  /**
   * Get specified ref or filtered repository&#x27;s refs
   */
  @Test
  public void repoListGitRefsTest() {
    String owner = null;
    String repo = null;
    String ref = null;
    // List<Reference> response = api.repoListGitRefs(owner, repo, ref);

    // TODO: test validations
  }

  /**
   * List the hooks in a repository
   */
  @Test
  public void repoListHooksTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Hook> response = api.repoListHooks(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s keys
   */
  @Test
  public void repoListKeysTest() {
    String owner = null;
    String repo = null;
    Integer keyId = null;
    String fingerprint = null;
    Integer page = null;
    Integer limit = null;
    // List<DeployKey> response = api.repoListKeys(owner, repo, keyId, fingerprint, page, limit);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s pinned issues
   */
  @Test
  public void repoListPinnedIssuesTest() {
    String owner = null;
    String repo = null;
    // List<Issue> response = api.repoListPinnedIssues(owner, repo);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s pinned pull requests
   */
  @Test
  public void repoListPinnedPullRequestsTest() {
    String owner = null;
    String repo = null;
    // List<PullRequest> response = api.repoListPinnedPullRequests(owner, repo);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s pull requests
   */
  @Test
  public void repoListPullRequestsTest() {
    String owner = null;
    String repo = null;
    String state = null;
    String sort = null;
    Long milestone = null;
    List<Long> labels = null;
    String poster = null;
    Integer page = null;
    Integer limit = null;
    // List<PullRequest> response = api.repoListPullRequests(owner, repo, state, sort, milestone, labels, poster, page, limit);

    // TODO: test validations
  }

  /**
   * List all reviews for a pull request
   */
  @Test
  public void repoListPullReviewsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Integer page = null;
    Integer limit = null;
    // List<PullReview> response = api.repoListPullReviews(owner, repo, index, page, limit);

    // TODO: test validations
  }

  /**
   * Get all push mirrors of the repository
   */
  @Test
  public void repoListPushMirrorsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<PushMirror> response = api.repoListPushMirrors(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List release&#x27;s attachments
   */
  @Test
  public void repoListReleaseAttachmentsTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // List<Attachment> response = api.repoListReleaseAttachments(owner, repo, id);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s releases
   */
  @Test
  public void repoListReleasesTest() {
    String owner = null;
    String repo = null;
    Boolean draft = null;
    Boolean preRelease = null;
    Integer page = null;
    Integer limit = null;
    // List<Release> response = api.repoListReleases(owner, repo, draft, preRelease, page, limit);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s stargazers
   */
  @Test
  public void repoListStargazersTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.repoListStargazers(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * Get a commit&#x27;s statuses
   */
  @Test
  public void repoListStatusesTest() {
    String owner = null;
    String repo = null;
    String sha = null;
    String sort = null;
    String state = null;
    Integer page = null;
    Integer limit = null;
    // List<CommitStatus> response = api.repoListStatuses(owner, repo, sha, sort, state, page, limit);

    // TODO: test validations
  }

  /**
   * Get a commit&#x27;s statuses, by branch/tag/commit reference
   */
  @Test
  public void repoListStatusesByRefTest() {
    String owner = null;
    String repo = null;
    String ref = null;
    String sort = null;
    String state = null;
    Integer page = null;
    Integer limit = null;
    // List<CommitStatus> response = api.repoListStatusesByRef(owner, repo, ref, sort, state, page, limit);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s watchers
   */
  @Test
  public void repoListSubscribersTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.repoListSubscribers(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List tag protections for a repository
   */
  @Test
  public void repoListTagProtectionTest() {
    String owner = null;
    String repo = null;
    // List<TagProtection> response = api.repoListTagProtection(owner, repo);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s tags
   */
  @Test
  public void repoListTagsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Tag> response = api.repoListTags(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s teams
   */
  @Test
  public void repoListTeamsTest() {
    String owner = null;
    String repo = null;
    // List<Team> response = api.repoListTeams(owner, repo);

    // TODO: test validations
  }

  /**
   * Get list of topics that a repository has
   */
  @Test
  public void repoListTopicsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // TopicName response = api.repoListTopics(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * Merge a pull request
   */
  @Test
  public void repoMergePullRequestTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    MergePullRequestOption body = null;
    // Void response = api.repoMergePullRequest(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Migrate a remote git repository
   */
  @Test
  public void repoMigrateTest() {
    MigrateRepoOptions body = null;
    // Repository response = api.repoMigrate(body);

    // TODO: test validations
  }

  /**
   * Sync a mirrored repository
   */
  @Test
  public void repoMirrorSyncTest() {
    String owner = null;
    String repo = null;
    // Void response = api.repoMirrorSync(owner, repo);

    // TODO: test validations
  }

  /**
   * Returns if new Issue Pins are allowed
   */
  @Test
  public void repoNewPinAllowedTest() {
    String owner = null;
    String repo = null;
    // NewIssuePinsAllowed response = api.repoNewPinAllowed(owner, repo);

    // TODO: test validations
  }

  /**
   * Check if a pull request has been merged
   */
  @Test
  public void repoPullRequestIsMergedTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.repoPullRequestIsMerged(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Sync all push mirrored repository
   */
  @Test
  public void repoPushMirrorSyncTest() {
    String owner = null;
    String repo = null;
    // Void response = api.repoPushMirrorSync(owner, repo);

    // TODO: test validations
  }

  /**
   * Search for repositories
   */
  @Test
  public void repoSearchTest() {
    String q = null;
    Boolean topic = null;
    Boolean includeDesc = null;
    Long uid = null;
    Long priorityOwnerId = null;
    Long teamId = null;
    Long starredBy = null;
    Boolean _private = null;
    Boolean isPrivate = null;
    Boolean template = null;
    Boolean archived = null;
    String mode = null;
    Boolean exclusive = null;
    String sort = null;
    String order = null;
    Integer page = null;
    Integer limit = null;
    // SearchResults response = api.repoSearch(q, topic, includeDesc, uid, priorityOwnerId, teamId, starredBy, _private, isPrivate, template, archived, mode, exclusive, sort, order, page, limit);

    // TODO: test validations
  }

  /**
   * Get signing-key.gpg for given repository
   */
  @Test
  public void repoSigningKeyTest() {
    String owner = null;
    String repo = null;
    // String response = api.repoSigningKey(owner, repo);

    // TODO: test validations
  }

  /**
   * Submit a pending review to an pull request
   */
  @Test
  public void repoSubmitPullReviewTest() {
    SubmitPullReviewOptions body = null;
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // PullReview response = api.repoSubmitPullReview(body, owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Test a push webhook
   */
  @Test
  public void repoTestHookTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    String ref = null;
    // Void response = api.repoTestHook(owner, repo, id, ref);

    // TODO: test validations
  }

  /**
   * List a repo&#x27;s tracked times
   */
  @Test
  public void repoTrackedTimesTest() {
    String owner = null;
    String repo = null;
    String user = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Integer page = null;
    Integer limit = null;
    // List<TrackedTime> response = api.repoTrackedTimes(owner, repo, user, since, before, page, limit);

    // TODO: test validations
  }

  /**
   * Transfer a repo ownership
   */
  @Test
  public void repoTransferTest() {
    TransferRepoOption body = null;
    String owner = null;
    String repo = null;
    // Repository response = api.repoTransfer(body, owner, repo);

    // TODO: test validations
  }

  /**
   * Cancel to dismiss a review for a pull request
   */
  @Test
  public void repoUnDismissPullReviewTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // PullReview response = api.repoUnDismissPullReview(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Update avatar
   */
  @Test
  public void repoUpdateAvatarTest() {
    String owner = null;
    String repo = null;
    UpdateRepoAvatarOption body = null;
    // Void response = api.repoUpdateAvatar(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Update the priorities of branch protections for a repository.
   */
  @Test
  public void repoUpdateBranchProtectionPrioriesTest() {
    String owner = null;
    String repo = null;
    UpdateBranchProtectionPriories body = null;
    // Void response = api.repoUpdateBranchProtectionPriories(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Update a file in a repository
   */
  @Test
  public void repoUpdateFileTest() {
    UpdateFileOptions body = null;
    String owner = null;
    String repo = null;
    String filepath = null;
    // FileResponse response = api.repoUpdateFile(body, owner, repo, filepath);

    // TODO: test validations
  }

  /**
   * Merge PR&#x27;s baseBranch into headBranch
   */
  @Test
  public void repoUpdatePullRequestTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String style = null;
    // Void response = api.repoUpdatePullRequest(owner, repo, index, style);

    // TODO: test validations
  }

  /**
   * Replace list of topics for a repository
   */
  @Test
  public void repoUpdateTopicsTest() {
    String owner = null;
    String repo = null;
    RepoTopicOptions body = null;
    // Void response = api.repoUpdateTopics(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Returns the validation information for a issue config
   */
  @Test
  public void repoValidateIssueConfigTest() {
    String owner = null;
    String repo = null;
    // IssueConfigValidation response = api.repoValidateIssueConfig(owner, repo);

    // TODO: test validations
  }

  /**
   * search topics via keyword
   */
  @Test
  public void topicSearchTest() {
    String q = null;
    Integer page = null;
    Integer limit = null;
    // List<TopicResponse> response = api.topicSearch(q, page, limit);

    // TODO: test validations
  }

  /**
   * Create or Update a secret value in a repository
   */
  @Test
  public void updateRepoSecretTest() {
    String owner = null;
    String repo = null;
    String secretname = null;
    CreateOrUpdateSecretOption body = null;
    // Void response = api.updateRepoSecret(owner, repo, secretname, body);

    // TODO: test validations
  }

  /**
   * Update a repo-level variable
   */
  @Test
  public void updateRepoVariableTest() {
    String owner = null;
    String repo = null;
    String variablename = null;
    UpdateVariableOption body = null;
    // Void response = api.updateRepoVariable(owner, repo, variablename, body);

    // TODO: test validations
  }

  /**
   * Check if the current user is watching a repo
   */
  @Test
  public void userCurrentCheckSubscriptionTest() {
    String owner = null;
    String repo = null;
    // WatchInfo response = api.userCurrentCheckSubscription(owner, repo);

    // TODO: test validations
  }

  /**
   * Unwatch a repo
   */
  @Test
  public void userCurrentDeleteSubscriptionTest() {
    String owner = null;
    String repo = null;
    // Void response = api.userCurrentDeleteSubscription(owner, repo);

    // TODO: test validations
  }

  /**
   * Watch a repo
   */
  @Test
  public void userCurrentPutSubscriptionTest() {
    String owner = null;
    String repo = null;
    // WatchInfo response = api.userCurrentPutSubscription(owner, repo);

    // TODO: test validations
  }

  /**
   * List a user&#x27;s tracked times in a repo
   */
  @Test
  public void userTrackedTimesTest() {
    String owner = null;
    String repo = null;
    String user = null;
    // List<TrackedTime> response = api.userTrackedTimes(owner, repo, user);

    // TODO: test validations
  }
}
