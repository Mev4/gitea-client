package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.*;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
import java.util.Map;

public interface RepositoryApi {
  /**
   * Accept a repo transfer
   *
   * @param owner owner of the repo to transfer (required)
   * @param repo  name of the repo to transfer (required)
   * @return Call&lt;Repository&gt;
   */
  @POST("repos/{owner}/{repo}/transfer/accept")
  Call<Repository> acceptRepoTransfer(
    @Path("owner") String owner, @Path("repo") String repo
  );

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
   * Fork a repository
   *
   * @param owner owner of the repo to fork (required)
   * @param repo  name of the repo to fork (required)
   * @param body  (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/forks")
  Call<Repository> createFork(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateForkOption body
  );

  /**
   * Create a repo-level variable
   *
   * @param owner        name of the owner (required)
   * @param repo         name of the repository (required)
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/actions/variables/{variablename}")
  Call<Void> createRepoVariable(
    @Path("owner") String owner, @Path("repo") String repo, @Path("variablename") String variablename, @Body CreateVariableOption body
  );

  /**
   * Delete a secret in a repository
   *
   * @param owner      owner of the repository (required)
   * @param repo       name of the repository (required)
   * @param secretname name of the secret (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/actions/secrets/{secretname}")
  Call<Void> deleteRepoSecret(
    @Path("owner") String owner, @Path("repo") String repo, @Path("secretname") String secretname
  );

  /**
   * Delete a repo-level variable
   *
   * @param owner        name of the owner (required)
   * @param repo         name of the repository (required)
   * @param variablename name of the variable (required)
   * @return Call&lt;ActionVariable&gt;
   */
  @DELETE("repos/{owner}/{repo}/actions/variables/{variablename}")
  Call<ActionVariable> deleteRepoVariable(
    @Path("owner") String owner, @Path("repo") String repo, @Path("variablename") String variablename
  );

  /**
   * Create a repository using a template
   *
   * @param templateOwner name of the template repository owner (required)
   * @param templateRepo  name of the template repository (required)
   * @param body          (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{template_owner}/{template_repo}/generate")
  Call<Repository> generateRepo(
    @Path("template_owner") String templateOwner, @Path("template_repo") String templateRepo, @Body GenerateRepoOption body
  );

  /**
   * Gets the tag object of an annotated tag (not lightweight tags)
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param sha   sha of the tag. The Git tags API only supports annotated tag objects, not lightweight tags. (required)
   * @return Call&lt;AnnotatedTag&gt;
   */
  @GET("repos/{owner}/{repo}/git/tags/{sha}")
  Call<AnnotatedTag> getAnnotatedTag(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha
  );

  /**
   * Gets the blob of a repository.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param sha   sha of the commit (required)
   * @return Call&lt;GitBlobResponse&gt;
   */
  @GET("repos/{owner}/{repo}/git/blobs/{sha}")
  Call<GitBlobResponse> getBlob(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha
  );

  /**
   * Get a repo-level variable
   *
   * @param owner        name of the owner (required)
   * @param repo         name of the repository (required)
   * @param variablename name of the variable (required)
   * @return Call&lt;ActionVariable&gt;
   */
  @GET("repos/{owner}/{repo}/actions/variables/{variablename}")
  Call<ActionVariable> getRepoVariable(
    @Path("owner") String owner, @Path("repo") String repo, @Path("variablename") String variablename
  );

  /**
   * Get repo-level variables list
   *
   * @param owner name of the owner (required)
   * @param repo  name of the repository (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;ActionVariable&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/actions/variables")
  Call<List<ActionVariable>> getRepoVariablesList(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Gets the tree of a repository.
   *
   * @param owner     owner of the repo (required)
   * @param repo      name of the repo (required)
   * @param sha       sha of the commit (required)
   * @param recursive show all directories and files (optional)
   * @param page      page number; the &#x27;truncated&#x27; field in the response will be true if there are still more items after this page, false if the last page (optional)
   * @param perPage   number of items per page (optional)
   * @return Call&lt;GitTreeResponse&gt;
   */
  @GET("repos/{owner}/{repo}/git/trees/{sha}")
  Call<GitTreeResponse> getTree(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Query("recursive") Boolean recursive, @Query("page") Integer page, @Query("per_page") Integer perPage
  );

  /**
   * List a repository&#x27;s action tasks
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results, default maximum page size is 50 (optional)
   * @return Call&lt;ActionTaskResponse&gt;
   */
  @GET("repos/{owner}/{repo}/actions/tasks")
  Call<ActionTaskResponse> listActionTasks(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s forks
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Repository&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/forks")
  Call<List<Repository>> listForks(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Reject a repo transfer
   *
   * @param owner owner of the repo to transfer (required)
   * @param repo  name of the repo to transfer (required)
   * @return Call&lt;Repository&gt;
   */
  @POST("repos/{owner}/{repo}/transfer/reject")
  Call<Repository> rejectRepoTransfer(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Add or Update a collaborator to a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param collaborator username of the collaborator to add (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/collaborators/{collaborator}")
  Call<Void> repoAddCollaborator(
    @Path("owner") String owner, @Path("repo") String repo, @Path("collaborator") String collaborator, @Body AddCollaboratorOption body
  );

  /**
   * add a push mirror to the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;PushMirror&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/push_mirrors")
  Call<PushMirror> repoAddPushMirror(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreatePushMirrorOption body
  );

  /**
   * Add a team to a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param team  team name (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("repos/{owner}/{repo}/teams/{team}")
  Call<Void> repoAddTeam(
    @Path("owner") String owner, @Path("repo") String repo, @Path("team") String team
  );

  /**
   * Add a topic to a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param topic name of the topic to add (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("repos/{owner}/{repo}/topics/{topic}")
  Call<Void> repoAddTopic(
    @Path("owner") String owner, @Path("repo") String repo, @Path("topic") String topic
  );

  /**
   * Apply diff patch to repository
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;FileResponse&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/diffpatch")
  Call<FileResponse> repoApplyDiffPatch(
    @Body UpdateFileOptions body, @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Cancel the scheduled auto merge for the given pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request to merge (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/pulls/{index}/merge")
  Call<Void> repoCancelScheduledAutoMerge(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Modify multiple files in a repository
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;FilesResponse&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/contents")
  Call<FilesResponse> repoChangeFiles(
    @Body ChangeFilesOptions body, @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Check if a user is a collaborator of a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param collaborator username of the collaborator (required)
   * @return Call&lt;Void&gt;
   */
  @GET("repos/{owner}/{repo}/collaborators/{collaborator}")
  Call<Void> repoCheckCollaborator(
    @Path("owner") String owner, @Path("repo") String repo, @Path("collaborator") String collaborator
  );

  /**
   * Check if a team is assigned to a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param team  team name (required)
   * @return Call&lt;Team&gt;
   */
  @GET("repos/{owner}/{repo}/teams/{team}")
  Call<Team> repoCheckTeam(
    @Path("owner") String owner, @Path("repo") String repo, @Path("team") String team
  );

  /**
   * Get commit comparison information
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param basehead compare two branches or commits (required)
   * @return Call&lt;Compare&gt;
   */
  @GET("repos/{owner}/{repo}/compare/{basehead}")
  Call<Compare> repoCompareDiff(
    @Path("owner") String owner, @Path("repo") String repo, @Path("basehead") String basehead
  );

  /**
   * Create a branch
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Branch&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/branches")
  Call<Branch> repoCreateBranch(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateBranchRepoOption body
  );

  /**
   * Create a branch protections for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;BranchProtection&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/branch_protections")
  Call<BranchProtection> repoCreateBranchProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateBranchProtectionOption body
  );

  /**
   * Create a file in a repository
   *
   * @param body     (required)
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the file to create (required)
   * @return Call&lt;FileResponse&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/contents/{filepath}")
  Call<FileResponse> repoCreateFile(
    @Body CreateFileOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath
  );

  /**
   * Create a hook
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/hooks")
  Call<Hook> repoCreateHook(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateHookOption body
  );

  /**
   * Add a key to a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;DeployKey&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/keys")
  Call<DeployKey> repoCreateKey(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateKeyOption body
  );

  /**
   * Create a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;PullRequest&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls")
  Call<PullRequest> repoCreatePullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreatePullRequestOption body
  );

  /**
   * Create a review to an pull request
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @return Call&lt;PullReview&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls/{index}/reviews")
  Call<PullReview> repoCreatePullReview(
    @Body CreatePullReviewOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * create review requests for a pull request
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @return Call&lt;List&lt;PullReview&gt;&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls/{index}/requested_reviewers")
  Call<List<PullReview>> repoCreatePullReviewRequests(
    @Body PullReviewRequestOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Create a release
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Release&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/releases")
  Call<Release> repoCreateRelease(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateReleaseOption body
  );

  /**
   * Create a release attachment
   *
   * @param owner      owner of the repo (required)
   * @param repo       name of the repo (required)
   * @param id         id of the release (required)
   * @param attachment (optional)
   * @param name       name of the attachment (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Multipart
  @POST("repos/{owner}/{repo}/releases/{id}/assets")
  Call<Attachment> repoCreateReleaseAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Part("attachment\"; filename=\"attachment") RequestBody attachment, @Query("name") String name
  );

  /**
   * Create a release attachment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the release (required)
   * @param body  (optional)
   * @param name  name of the attachment (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Multipart
  @POST("repos/{owner}/{repo}/releases/{id}/assets")
  Call<Attachment> repoCreateReleaseAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body IdAssetsBody2 body, @Query("name") String name
  );

  /**
   * Create a commit status
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param sha   sha of the commit (required)
   * @param body  (optional)
   * @return Call&lt;CommitStatus&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/statuses/{sha}")
  Call<CommitStatus> repoCreateStatus(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Body CreateStatusOption body
  );

  /**
   * Create a new git tag in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Tag&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/tags")
  Call<Tag> repoCreateTag(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateTagOption body
  );

  /**
   * Create a tag protections for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;TagProtection&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/tag_protections")
  Call<TagProtection> repoCreateTagProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateTagProtectionOption body
  );

  /**
   * Create a wiki page
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;WikiPage&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/wiki/new")
  Call<WikiPage> repoCreateWikiPage(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateWikiPageOptions body
  );

  /**
   * Delete a repository
   *
   * @param owner owner of the repo to delete (required)
   * @param repo  name of the repo to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}")
  Call<Void> repoDelete(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Delete avatar
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/avatar")
  Call<Void> repoDeleteAvatar(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Delete a specific branch from a repository
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param branch branch to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/branches/{branch}")
  Call<Void> repoDeleteBranch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("branch") String branch
  );

  /**
   * Delete a specific branch protection for the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param name  name of protected branch (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/branch_protections/{name}")
  Call<Void> repoDeleteBranchProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("name") String name
  );

  /**
   * Delete a collaborator from a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param collaborator username of the collaborator to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/collaborators/{collaborator}")
  Call<Void> repoDeleteCollaborator(
    @Path("owner") String owner, @Path("repo") String repo, @Path("collaborator") String collaborator
  );

  /**
   * Delete a file in a repository
   *
   * @param body     (required)
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the file to delete (required)
   * @return Call&lt;FileDeleteResponse&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/contents/{filepath}")
  Call<FileDeleteResponse> repoDeleteFile(
    @Body DeleteFileOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath
  );

  /**
   * Delete a Git hook in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to get (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/hooks/git/{id}")
  Call<Void> repoDeleteGitHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id
  );

  /**
   * Delete a hook in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/hooks/{id}")
  Call<Void> repoDeleteHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Delete a key from a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the key to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/keys/{id}")
  Call<Void> repoDeleteKey(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Delete a specific review from a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/pulls/{index}/reviews/{id}")
  Call<Void> repoDeletePullReview(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * cancel review requests for a pull request
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/pulls/{index}/requested_reviewers")
  Call<Void> repoDeletePullReviewRequests(
    @Body PullReviewRequestOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * deletes a push mirror from a repository by remoteName
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param name  remote name of the pushMirror (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/push_mirrors/{name}")
  Call<Void> repoDeletePushMirror(
    @Path("owner") String owner, @Path("repo") String repo, @Path("name") String name
  );

  /**
   * Delete a release
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the release to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/releases/{id}")
  Call<Void> repoDeleteRelease(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Delete a release attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the release (required)
   * @param attachmentId id of the attachment to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/releases/{id}/assets/{attachment_id}")
  Call<Void> repoDeleteReleaseAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId
  );

  /**
   * Delete a release by tag name
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param tag   tag name of the release to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/releases/tags/{tag}")
  Call<Void> repoDeleteReleaseByTag(
    @Path("owner") String owner, @Path("repo") String repo, @Path("tag") String tag
  );

  /**
   * Delete a repository&#x27;s tag by name
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param tag   name of tag to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/tags/{tag}")
  Call<Void> repoDeleteTag(
    @Path("owner") String owner, @Path("repo") String repo, @Path("tag") String tag
  );

  /**
   * Delete a specific tag protection for the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of protected tag (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/tag_protections/{id}")
  Call<Void> repoDeleteTagProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Integer id
  );

  /**
   * Delete a team from a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param team  team name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/teams/{team}")
  Call<Void> repoDeleteTeam(
    @Path("owner") String owner, @Path("repo") String repo, @Path("team") String team
  );

  /**
   * Delete a topic from a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param topic name of the topic to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/topics/{topic}")
  Call<Void> repoDeleteTopic(
    @Path("owner") String owner, @Path("repo") String repo, @Path("topic") String topic
  );

  /**
   * Delete a wiki page
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param pageName name of the page (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/wiki/page/{pageName}")
  Call<Void> repoDeleteWikiPage(
    @Path("owner") String owner, @Path("repo") String repo, @Path("pageName") String pageName
  );

  /**
   * Dismiss a review for a pull request
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;PullReview&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls/{index}/reviews/{id}/dismissals")
  Call<PullReview> repoDismissPullReview(
    @Body DismissPullReviewOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Get a commit&#x27;s diff or patch
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param sha      SHA of the commit to get (required)
   * @param diffType whether the output is diff or patch (required)
   * @return Call&lt;String&gt;
   */
  @GET("repos/{owner}/{repo}/git/commits/{sha}.{diffType}")
  Call<String> repoDownloadCommitDiffOrPatch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Path("diffType") String diffType
  );

  /**
   * Get a pull request diff or patch
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param index    index of the pull request to get (required)
   * @param diffType whether the output is diff or patch (required)
   * @param binary   whether to include binary file changes. if true, the diff is applicable with &#x60;git apply&#x60; (optional)
   * @return Call&lt;String&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}.{diffType}")
  Call<String> repoDownloadPullDiffOrPatch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("diffType") String diffType, @Query("binary") Boolean binary
  );

  /**
   * Edit a repository&#x27;s properties. Only fields that are set will be changed.
   *
   * @param owner owner of the repo to edit (required)
   * @param repo  name of the repo to edit (required)
   * @param body  Properties of a repo that you can edit (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}")
  Call<Repository> repoEdit(
    @Path("owner") String owner, @Path("repo") String repo, @Body EditRepoOption body
  );

  /**
   * Edit a branch protections for a repository. Only fields that are set will be changed
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param name  name of protected branch (required)
   * @param body  (optional)
   * @return Call&lt;BranchProtection&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/branch_protections/{name}")
  Call<BranchProtection> repoEditBranchProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("name") String name, @Body EditBranchProtectionOption body
  );

  /**
   * Edit a Git hook in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to get (required)
   * @param body  (optional)
   * @return Call&lt;GitHook&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/hooks/git/{id}")
  Call<GitHook> repoEditGitHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id, @Body EditGitHookOption body
  );

  /**
   * Edit a hook in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    index of the hook (required)
   * @param body  (optional)
   * @return Call&lt;Hook&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/hooks/{id}")
  Call<Hook> repoEditHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditHookOption body
  );

  /**
   * Update a pull request. If using deadline only the date will be taken into account, and time of day ignored.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request to edit (required)
   * @param body  (optional)
   * @return Call&lt;PullRequest&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/pulls/{index}")
  Call<PullRequest> repoEditPullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body EditPullRequestOption body
  );

  /**
   * Update a release
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the release to edit (required)
   * @param body  (optional)
   * @return Call&lt;Release&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/releases/{id}")
  Call<Release> repoEditRelease(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditReleaseOption body
  );

  /**
   * Edit a release attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the release (required)
   * @param attachmentId id of the attachment to edit (required)
   * @param body         (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/releases/{id}/assets/{attachment_id}")
  Call<Attachment> repoEditReleaseAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId, @Body EditAttachmentOptions body
  );

  /**
   * Edit a tag protections for a repository. Only fields that are set will be changed
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of protected tag (required)
   * @param body  (optional)
   * @return Call&lt;TagProtection&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/tag_protections/{id}")
  Call<TagProtection> repoEditTagProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Integer id, @Body EditTagProtectionOption body
  );

  /**
   * Edit a wiki page
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param pageName name of the page (required)
   * @param body     (optional)
   * @return Call&lt;WikiPage&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/wiki/page/{pageName}")
  Call<WikiPage> repoEditWikiPage(
    @Path("owner") String owner, @Path("repo") String repo, @Path("pageName") String pageName, @Body CreateWikiPageOptions body
  );

  /**
   * Get a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Repository&gt;
   */
  @GET("repos/{owner}/{repo}")
  Call<Repository> repoGet(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a list of all commits from a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param sha          SHA or branch to start listing commits from (usually &#x27;master&#x27;) (optional)
   * @param path         filepath of a file/dir (optional)
   * @param stat         include diff stats for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param verification include verification for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param files        include a list of affected files for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param page         page number of results to return (1-based) (optional)
   * @param limit        page size of results (ignored if used with &#x27;path&#x27;) (optional)
   * @param not          commits that match the given specifier will not be listed. (optional)
   * @return Call&lt;List&lt;Commit&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/commits")
  Call<List<Commit>> repoGetAllCommits(
    @Path("owner") String owner, @Path("repo") String repo, @Query("sha") String sha, @Query("path") String path, @Query("stat") Boolean stat, @Query("verification") Boolean verification, @Query("files") Boolean files, @Query("page") Integer page, @Query("limit") Integer limit, @Query("not") String not
  );

  /**
   * Get an archive of a repository
   *
   * @param owner   owner of the repo (required)
   * @param repo    name of the repo (required)
   * @param archive the git reference for download with attached archive format (e.g. master.zip) (required)
   * @return Call&lt;Void&gt;
   */
  @GET("repos/{owner}/{repo}/archive/{archive}")
  Call<Void> repoGetArchive(
    @Path("owner") String owner, @Path("repo") String repo, @Path("archive") String archive
  );

  /**
   * Return all users that have write access and can be assigned to issues
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/assignees")
  Call<List<User>> repoGetAssignees(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Retrieve a specific branch from a repository, including its effective branch protection
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param branch branch to get (required)
   * @return Call&lt;Branch&gt;
   */
  @GET("repos/{owner}/{repo}/branches/{branch}")
  Call<Branch> repoGetBranch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("branch") String branch
  );

  /**
   * Get a specific branch protection for the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param name  name of protected branch (required)
   * @return Call&lt;BranchProtection&gt;
   */
  @GET("repos/{owner}/{repo}/branch_protections/{name}")
  Call<BranchProtection> repoGetBranchProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("name") String name
  );

  /**
   * Get a repository by id
   *
   * @param id id of the repo to get (required)
   * @return Call&lt;Repository&gt;
   */
  @GET("repositories/{id}")
  Call<Repository> repoGetByID(
    @Path("id") Long id
  );

  /**
   * Get a commit&#x27;s combined status, by branch/tag/commit reference
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param ref   name of branch/tag/commit (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;CombinedStatus&gt;
   */
  @GET("repos/{owner}/{repo}/commits/{ref}/status")
  Call<CombinedStatus> repoGetCombinedStatusByRef(
    @Path("owner") String owner, @Path("repo") String repo, @Path("ref") String ref, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get the merged pull request of the commit
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param sha   SHA of the commit to get (required)
   * @return Call&lt;PullRequest&gt;
   */
  @GET("repos/{owner}/{repo}/commits/{sha}/pull")
  Call<PullRequest> repoGetCommitPullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha
  );

  /**
   * Gets the metadata and contents (if a file) of an entry in a repository, or a list of entries if a dir
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the dir, file, symlink or submodule in the repo (required)
   * @param ref      The name of the commit/branch/tag. Default the repository’s default branch (usually master) (optional)
   * @return Call&lt;ContentsResponse&gt;
   */
  @GET("repos/{owner}/{repo}/contents/{filepath}")
  Call<ContentsResponse> repoGetContents(
    @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath, @Query("ref") String ref
  );

  /**
   * Gets the metadata of all the entries of the root dir
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param ref   The name of the commit/branch/tag. Default the repository’s default branch (usually master) (optional)
   * @return Call&lt;List&lt;ContentsResponse&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/contents")
  Call<List<ContentsResponse>> repoGetContentsList(
    @Path("owner") String owner, @Path("repo") String repo, @Query("ref") String ref
  );

  /**
   * Get the EditorConfig definitions of a file in a repository
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath filepath of file to get (required)
   * @param ref      The name of the commit/branch/tag. Default the repository’s default branch (usually master) (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("repos/{owner}/{repo}/editorconfig/{filepath}")
  Call<Void> repoGetEditorConfig(
    @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath, @Query("ref") String ref
  );

  /**
   * Get a Git hook
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to get (required)
   * @return Call&lt;GitHook&gt;
   */
  @GET("repos/{owner}/{repo}/hooks/git/{id}")
  Call<GitHook> repoGetGitHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id
  );

  /**
   * Get a hook
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to get (required)
   * @return Call&lt;Hook&gt;
   */
  @GET("repos/{owner}/{repo}/hooks/{id}")
  Call<Hook> repoGetHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Returns the issue config for a repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;IssueConfig&gt;
   */
  @GET("repos/{owner}/{repo}/issue_config")
  Call<IssueConfig> repoGetIssueConfig(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get available issue templates for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;IssueTemplate&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issue_templates")
  Call<List<IssueTemplate>> repoGetIssueTemplates(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a repository&#x27;s key by id
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the key to get (required)
   * @return Call&lt;DeployKey&gt;
   */
  @GET("repos/{owner}/{repo}/keys/{id}")
  Call<DeployKey> repoGetKey(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Get languages and number of bytes of code written
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Map&lt;String, Long&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/languages")
  Call<Map<String, Long>> repoGetLanguages(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Gets the most recent non-prerelease, non-draft release of a repository, sorted by created_at
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Release&gt;
   */
  @GET("repos/{owner}/{repo}/releases/latest")
  Call<Release> repoGetLatestRelease(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get repo licenses
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/licenses")
  Call<List<String>> repoGetLicenses(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a note corresponding to a single commit from a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param sha          a git ref or commit sha (required)
   * @param verification include verification for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param files        include a list of affected files for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @return Call&lt;Note&gt;
   */
  @GET("repos/{owner}/{repo}/git/notes/{sha}")
  Call<Note> repoGetNote(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Query("verification") Boolean verification, @Query("files") Boolean files
  );

  /**
   * Get a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request to get (required)
   * @return Call&lt;PullRequest&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}")
  Call<PullRequest> repoGetPullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Get a pull request by base and head
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param base  base of the pull request to get (required)
   * @param head  head of the pull request to get (required)
   * @return Call&lt;PullRequest&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{base}/{head}")
  Call<PullRequest> repoGetPullRequestByBaseHead(
    @Path("owner") String owner, @Path("repo") String repo, @Path("base") String base, @Path("head") String head
  );

  /**
   * Get commits for a pull request
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param index        index of the pull request to get (required)
   * @param page         page number of results to return (1-based) (optional)
   * @param limit        page size of results (optional)
   * @param verification include verification for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param files        include a list of affected files for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @return Call&lt;List&lt;Commit&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/commits")
  Call<List<Commit>> repoGetPullRequestCommits(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("page") Integer page, @Query("limit") Integer limit, @Query("verification") Boolean verification, @Query("files") Boolean files
  );

  /**
   * Get changed files for a pull request
   *
   * @param owner      owner of the repo (required)
   * @param repo       name of the repo (required)
   * @param index      index of the pull request to get (required)
   * @param skipTo     skip to given file (optional)
   * @param whitespace whitespace behavior (optional)
   * @param page       page number of results to return (1-based) (optional)
   * @param limit      page size of results (optional)
   * @return Call&lt;List&lt;ChangedFile&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/files")
  Call<List<ChangedFile>> repoGetPullRequestFiles(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("skip-to") String skipTo, @Query("whitespace") String whitespace, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a specific review for a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;PullReview&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/reviews/{id}")
  Call<PullReview> repoGetPullReview(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Get a specific review for a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;List&lt;PullReviewComment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/reviews/{id}/comments")
  Call<List<PullReviewComment>> repoGetPullReviewComments(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Get push mirror of the repository by remoteName
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param name  remote name of push mirror (required)
   * @return Call&lt;PushMirror&gt;
   */
  @GET("repos/{owner}/{repo}/push_mirrors/{name}")
  Call<PushMirror> repoGetPushMirrorByRemoteName(
    @Path("owner") String owner, @Path("repo") String repo, @Path("name") String name
  );

  /**
   * Get a file from a repository
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the file to get, it should be \&quot;{ref}/{filepath}\&quot;. If there is no ref could be inferred, it will be treated as the default branch (required)
   * @param ref      The name of the commit/branch/tag. Default the repository’s default branch (optional)
   * @return Call&lt;File&gt;
   */
  @GET("repos/{owner}/{repo}/raw/{filepath}")
  Call<ResponseBody> repoGetRawFile(
    @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath, @Query("ref") String ref
  );

  /**
   * Get a file or it&#x27;s LFS object from a repository
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the file to get, it should be \&quot;{ref}/{filepath}\&quot;. If there is no ref could be inferred, it will be treated as the default branch (required)
   * @param ref      The name of the commit/branch/tag. Default the repository’s default branch (optional)
   * @return Call&lt;File&gt;
   */
  @GET("repos/{owner}/{repo}/media/{filepath}")
  Call<ResponseBody> repoGetRawFileOrLFS(
    @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath, @Query("ref") String ref
  );

  /**
   * Get a release
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the release to get (required)
   * @return Call&lt;Release&gt;
   */
  @GET("repos/{owner}/{repo}/releases/{id}")
  Call<Release> repoGetRelease(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Get a release attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the release (required)
   * @param attachmentId id of the attachment to get (required)
   * @return Call&lt;Attachment&gt;
   */
  @GET("repos/{owner}/{repo}/releases/{id}/assets/{attachment_id}")
  Call<Attachment> repoGetReleaseAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId
  );

  /**
   * Get a release by tag name
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param tag   tag name of the release to get (required)
   * @return Call&lt;Release&gt;
   */
  @GET("repos/{owner}/{repo}/releases/tags/{tag}")
  Call<Release> repoGetReleaseByTag(
    @Path("owner") String owner, @Path("repo") String repo, @Path("tag") String tag
  );

  /**
   * Get repository permissions for a user
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param collaborator username of the collaborator (required)
   * @return Call&lt;RepoCollaboratorPermission&gt;
   */
  @GET("repos/{owner}/{repo}/collaborators/{collaborator}/permission")
  Call<RepoCollaboratorPermission> repoGetRepoPermissions(
    @Path("owner") String owner, @Path("repo") String repo, @Path("collaborator") String collaborator
  );

  /**
   * Return all users that can be requested to review in this repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/reviewers")
  Call<List<User>> repoGetReviewers(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a repository&#x27;s actions runner registration token
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @GET("repos/{owner}/{repo}/actions/runners/registration-token")
  Call<Void> repoGetRunnerRegistrationToken(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get a single commit from a repository
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param sha          a git ref or commit sha (required)
   * @param stat         include diff stats for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param verification include verification for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @param files        include a list of affected files for every commit (disable for speedup, default &#x27;true&#x27;) (optional)
   * @return Call&lt;Commit&gt;
   */
  @GET("repos/{owner}/{repo}/git/commits/{sha}")
  Call<Commit> repoGetSingleCommit(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Query("stat") Boolean stat, @Query("verification") Boolean verification, @Query("files") Boolean files
  );

  /**
   * Get the tag of a repository by tag name
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param tag   name of tag (required)
   * @return Call&lt;Tag&gt;
   */
  @GET("repos/{owner}/{repo}/tags/{tag}")
  Call<Tag> repoGetTag(
    @Path("owner") String owner, @Path("repo") String repo, @Path("tag") String tag
  );

  /**
   * Get a specific tag protection for the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the tag protect to get (required)
   * @return Call&lt;TagProtection&gt;
   */
  @GET("repos/{owner}/{repo}/tag_protections/{id}")
  Call<TagProtection> repoGetTagProtection(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Integer id
  );

  /**
   * Get a wiki page
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param pageName name of the page (required)
   * @return Call&lt;WikiPage&gt;
   */
  @GET("repos/{owner}/{repo}/wiki/page/{pageName}")
  Call<WikiPage> repoGetWikiPage(
    @Path("owner") String owner, @Path("repo") String repo, @Path("pageName") String pageName
  );

  /**
   * Get revisions of a wiki page
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param pageName name of the page (required)
   * @param page     page number of results to return (1-based) (optional)
   * @return Call&lt;WikiCommitList&gt;
   */
  @GET("repos/{owner}/{repo}/wiki/revisions/{pageName}")
  Call<WikiCommitList> repoGetWikiPageRevisions(
    @Path("owner") String owner, @Path("repo") String repo, @Path("pageName") String pageName, @Query("page") Integer page
  );

  /**
   * Get all wiki pages
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;WikiPageMetaData&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/wiki/pages")
  Call<List<WikiPageMetaData>> repoGetWikiPages(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an repo&#x27;s actions secrets
   *
   * @param owner owner of the repository (required)
   * @param repo  name of the repository (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Secret&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/actions/secrets")
  Call<List<Secret>> repoListActionsSecrets(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s activity feeds
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param date  the date of the activities to be found (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Activity&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/activities/feeds")
  Call<List<Activity>> repoListActivityFeeds(
    @Path("owner") String owner, @Path("repo") String repo, @Query("date") LocalDate date, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get specified ref or filtered repository&#x27;s refs
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;Reference&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/git/refs")
  Call<List<Reference>> repoListAllGitRefs(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List branch protections for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;BranchProtection&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/branch_protections")
  Call<List<BranchProtection>> repoListBranchProtection(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List a repository&#x27;s branches
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Branch&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/branches")
  Call<List<Branch>> repoListBranches(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s collaborators
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/collaborators")
  Call<List<User>> repoListCollaborators(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List the Git hooks in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;GitHook&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/hooks/git")
  Call<List<GitHook>> repoListGitHooks(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get specified ref or filtered repository&#x27;s refs
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param ref   part or full name of the ref (required)
   * @return Call&lt;List&lt;Reference&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/git/refs/{ref}")
  Call<List<Reference>> repoListGitRefs(
    @Path("owner") String owner, @Path("repo") String repo, @Path("ref") String ref
  );

  /**
   * List the hooks in a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Hook&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/hooks")
  Call<List<Hook>> repoListHooks(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s keys
   *
   * @param owner       owner of the repo (required)
   * @param repo        name of the repo (required)
   * @param keyId       the key_id to search for (optional)
   * @param fingerprint fingerprint of the key (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;DeployKey&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/keys")
  Call<List<DeployKey>> repoListKeys(
    @Path("owner") String owner, @Path("repo") String repo, @Query("key_id") Integer keyId, @Query("fingerprint") String fingerprint, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repo&#x27;s pinned issues
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;Issue&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/pinned")
  Call<List<Issue>> repoListPinnedIssues(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List a repo&#x27;s pinned pull requests
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;PullRequest&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/pinned")
  Call<List<PullRequest>> repoListPinnedPullRequests(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List a repo&#x27;s pull requests
   *
   * @param owner     Owner of the repo (required)
   * @param repo      Name of the repo (required)
   * @param state     State of pull request (optional, default to open)
   * @param sort      Type of sort (optional)
   * @param milestone ID of the milestone (optional)
   * @param labels    Label IDs (optional)
   * @param poster    Filter by pull request author (optional)
   * @param page      Page number of results to return (1-based) (optional, default to 1)
   * @param limit     Page size of results (optional)
   * @return Call&lt;List&lt;PullRequest&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls")
  Call<List<PullRequest>> repoListPullRequests(
    @Path("owner") String owner, @Path("repo") String repo, @Query("state") String state, @Query("sort") String sort, @Query("milestone") Long milestone, @Query("labels") List<Long> labels, @Query("poster") String poster, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List all reviews for a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;PullReview&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/reviews")
  Call<List<PullReview>> repoListPullReviews(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get all push mirrors of the repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;PushMirror&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/push_mirrors")
  Call<List<PushMirror>> repoListPushMirrors(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List release&#x27;s attachments
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the release (required)
   * @return Call&lt;List&lt;Attachment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/releases/{id}/assets")
  Call<List<Attachment>> repoListReleaseAttachments(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * List a repo&#x27;s releases
   *
   * @param owner      owner of the repo (required)
   * @param repo       name of the repo (required)
   * @param draft      filter (exclude / include) drafts, if you dont have repo write access none will show (optional)
   * @param preRelease filter (exclude / include) pre-releases (optional)
   * @param page       page number of results to return (1-based) (optional)
   * @param limit      page size of results (optional)
   * @return Call&lt;List&lt;Release&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/releases")
  Call<List<Release>> repoListReleases(
    @Path("owner") String owner, @Path("repo") String repo, @Query("draft") Boolean draft, @Query("pre-release") Boolean preRelease, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repo&#x27;s stargazers
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/stargazers")
  Call<List<User>> repoListStargazers(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a commit&#x27;s statuses
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param sha   sha of the commit (required)
   * @param sort  type of sort (optional)
   * @param state type of state (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;CommitStatus&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/statuses/{sha}")
  Call<List<CommitStatus>> repoListStatuses(
    @Path("owner") String owner, @Path("repo") String repo, @Path("sha") String sha, @Query("sort") String sort, @Query("state") String state, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a commit&#x27;s statuses, by branch/tag/commit reference
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param ref   name of branch/tag/commit (required)
   * @param sort  type of sort (optional)
   * @param state type of state (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;CommitStatus&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/commits/{ref}/statuses")
  Call<List<CommitStatus>> repoListStatusesByRef(
    @Path("owner") String owner, @Path("repo") String repo, @Path("ref") String ref, @Query("sort") String sort, @Query("state") String state, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repo&#x27;s watchers
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/subscribers")
  Call<List<User>> repoListSubscribers(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List tag protections for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;TagProtection&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/tag_protections")
  Call<List<TagProtection>> repoListTagProtection(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List a repository&#x27;s tags
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results, default maximum page size is 50 (optional)
   * @return Call&lt;List&lt;Tag&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/tags")
  Call<List<Tag>> repoListTags(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s teams
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;List&lt;Team&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/teams")
  Call<List<Team>> repoListTeams(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Get list of topics that a repository has
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;TopicName&gt;
   */
  @GET("repos/{owner}/{repo}/topics")
  Call<TopicName> repoListTopics(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Merge a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request to merge (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls/{index}/merge")
  Call<Void> repoMergePullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body MergePullRequestOption body
  );

  /**
   * Migrate a remote git repository
   *
   * @param body (optional)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/migrate")
  Call<Repository> repoMigrate(
    @Body MigrateRepoOptions body
  );

  /**
   * Sync a mirrored repository
   *
   * @param owner owner of the repo to sync (required)
   * @param repo  name of the repo to sync (required)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/mirror-sync")
  Call<Void> repoMirrorSync(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Returns if new Issue Pins are allowed
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;NewIssuePinsAllowed&gt;
   */
  @GET("repos/{owner}/{repo}/new_pin_allowed")
  Call<NewIssuePinsAllowed> repoNewPinAllowed(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Check if a pull request has been merged
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @return Call&lt;Void&gt;
   */
  @GET("repos/{owner}/{repo}/pulls/{index}/merge")
  Call<Void> repoPullRequestIsMerged(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Sync all push mirrored repository
   *
   * @param owner owner of the repo to sync (required)
   * @param repo  name of the repo to sync (required)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/push_mirrors-sync")
  Call<Void> repoPushMirrorSync(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Search for repositories
   *
   * @param q               keyword (optional)
   * @param topic           Limit search to repositories with keyword as topic (optional)
   * @param includeDesc     include search of keyword within repository description (optional)
   * @param uid             search only for repos that the user with the given id owns or contributes to (optional)
   * @param priorityOwnerId repo owner to prioritize in the results (optional)
   * @param teamId          search only for repos that belong to the given team id (optional)
   * @param starredBy       search only for repos that the user with the given id has starred (optional)
   * @param _private        include private repositories this user has access to (defaults to true) (optional)
   * @param isPrivate       show only pubic, private or all repositories (defaults to all) (optional)
   * @param template        include template repositories this user has access to (defaults to true) (optional)
   * @param archived        show only archived, non-archived or all repositories (defaults to all) (optional)
   * @param mode            type of repository to search for. Supported values are \&quot;fork\&quot;, \&quot;source\&quot;, \&quot;mirror\&quot; and \&quot;collaborative\&quot; (optional)
   * @param exclusive       if &#x60;uid&#x60; is given, search only for repos that the user owns (optional)
   * @param sort            sort repos by attribute. Supported values are \&quot;alpha\&quot;, \&quot;created\&quot;, \&quot;updated\&quot;, \&quot;size\&quot;, \&quot;git_size\&quot;, \&quot;lfs_size\&quot;, \&quot;stars\&quot;, \&quot;forks\&quot; and \&quot;id\&quot;. Default is \&quot;alpha\&quot; (optional)
   * @param order           sort order, either \&quot;asc\&quot; (ascending) or \&quot;desc\&quot; (descending). Default is \&quot;asc\&quot;, ignored if \&quot;sort\&quot; is not specified. (optional)
   * @param page            page number of results to return (1-based) (optional)
   * @param limit           page size of results (optional)
   * @return Call&lt;SearchResults&gt;
   */
  @GET("repos/search")
  Call<SearchResults> repoSearch(
    @Query("q") String q, @Query("topic") Boolean topic, @Query("includeDesc") Boolean includeDesc, @Query("uid") Long uid, @Query("priority_owner_id") Long priorityOwnerId, @Query("team_id") Long teamId, @Query("starredBy") Long starredBy, @Query("private") Boolean _private, @Query("is_private") Boolean isPrivate, @Query("template") Boolean template, @Query("archived") Boolean archived, @Query("mode") String mode, @Query("exclusive") Boolean exclusive, @Query("sort") String sort, @Query("order") String order, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get signing-key.gpg for given repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;String&gt;
   */
  @GET("repos/{owner}/{repo}/signing-key.gpg")
  Call<String> repoSigningKey(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Submit a pending review to an pull request
   *
   * @param body  (required)
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;PullReview&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/pulls/{index}/reviews/{id}")
  Call<PullReview> repoSubmitPullReview(
    @Body SubmitPullReviewOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Test a push webhook
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the hook to test (required)
   * @param ref   The name of the commit/branch/tag, indicates which commit will be loaded to the webhook payload. (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/hooks/{id}/tests")
  Call<Void> repoTestHook(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Query("ref") String ref
  );

  /**
   * List a repo&#x27;s tracked times
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param user   optional filter by user (available for issue managers) (optional)
   * @param since  Only show times updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before Only show times updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @param page   page number of results to return (1-based) (optional)
   * @param limit  page size of results (optional)
   * @return Call&lt;List&lt;TrackedTime&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/times")
  Call<List<TrackedTime>> repoTrackedTimes(
    @Path("owner") String owner, @Path("repo") String repo, @Query("user") String user, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Transfer a repo ownership
   *
   * @param body  Transfer Options (required)
   * @param owner owner of the repo to transfer (required)
   * @param repo  name of the repo to transfer (required)
   * @return Call&lt;Repository&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/transfer")
  Call<Repository> repoTransfer(
    @Body TransferRepoOption body, @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Cancel to dismiss a review for a pull request
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request (required)
   * @param id    id of the review (required)
   * @return Call&lt;PullReview&gt;
   */
  @POST("repos/{owner}/{repo}/pulls/{index}/reviews/{id}/undismissals")
  Call<PullReview> repoUnDismissPullReview(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Update avatar
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/avatar")
  Call<Void> repoUpdateAvatar(
    @Path("owner") String owner, @Path("repo") String repo, @Body UpdateRepoAvatarOption body
  );

  /**
   * Update the priorities of branch protections for a repository.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/branch_protections/priority")
  Call<Void> repoUpdateBranchProtectionPriories(
    @Path("owner") String owner, @Path("repo") String repo, @Body UpdateBranchProtectionPriories body
  );

  /**
   * Update a file in a repository
   *
   * @param body     (required)
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param filepath path of the file to update (required)
   * @return Call&lt;FileResponse&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/contents/{filepath}")
  Call<FileResponse> repoUpdateFile(
    @Body UpdateFileOptions body, @Path("owner") String owner, @Path("repo") String repo, @Path("filepath") String filepath
  );

  /**
   * Merge PR&#x27;s baseBranch into headBranch
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the pull request to get (required)
   * @param style how to update pull request (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/pulls/{index}/update")
  Call<Void> repoUpdatePullRequest(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("style") String style
  );

  /**
   * Replace list of topics for a repository
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/topics")
  Call<Void> repoUpdateTopics(
    @Path("owner") String owner, @Path("repo") String repo, @Body RepoTopicOptions body
  );

  /**
   * Returns the validation information for a issue config
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;IssueConfigValidation&gt;
   */
  @GET("repos/{owner}/{repo}/issue_config/validate")
  Call<IssueConfigValidation> repoValidateIssueConfig(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * search topics via keyword
   *
   * @param q     keywords to search (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;TopicResponse&gt;&gt;
   */
  @GET("topics/search")
  Call<List<TopicResponse>> topicSearch(
    @Query("q") String q, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Create or Update a secret value in a repository
   *
   * @param owner      owner of the repository (required)
   * @param repo       name of the repository (required)
   * @param secretname name of the secret (required)
   * @param body       (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/actions/secrets/{secretname}")
  Call<Void> updateRepoSecret(
    @Path("owner") String owner, @Path("repo") String repo, @Path("secretname") String secretname, @Body CreateOrUpdateSecretOption body
  );

  /**
   * Update a repo-level variable
   *
   * @param owner        name of the owner (required)
   * @param repo         name of the repository (required)
   * @param variablename name of the variable (required)
   * @param body         (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/actions/variables/{variablename}")
  Call<Void> updateRepoVariable(
    @Path("owner") String owner, @Path("repo") String repo, @Path("variablename") String variablename, @Body UpdateVariableOption body
  );

  /**
   * Check if the current user is watching a repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;WatchInfo&gt;
   */
  @GET("repos/{owner}/{repo}/subscription")
  Call<WatchInfo> userCurrentCheckSubscription(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Unwatch a repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/subscription")
  Call<Void> userCurrentDeleteSubscription(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * Watch a repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @return Call&lt;WatchInfo&gt;
   */
  @PUT("repos/{owner}/{repo}/subscription")
  Call<WatchInfo> userCurrentPutSubscription(
    @Path("owner") String owner, @Path("repo") String repo
  );

  /**
   * List a user&#x27;s tracked times in a repo
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param user  username of user (required)
   * @return Call&lt;List&lt;TrackedTime&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/times/{user}")
  Call<List<TrackedTime>> userTrackedTimes(
    @Path("owner") String owner, @Path("repo") String repo, @Path("user") String user
  );

}
