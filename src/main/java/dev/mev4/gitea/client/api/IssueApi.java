package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.model.*;
import okhttp3.RequestBody;
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

public interface IssueApi {
  /**
   * Add a label to an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/labels")
  Call<List<Label>> issueAddLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body IssueLabelsOption body
  );

  /**
   * Subscribe user to issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param user  user to subscribe (required)
   * @return Call&lt;Void&gt;
   */
  @PUT("repos/{owner}/{repo}/issues/{index}/subscriptions/{user}")
  Call<Void> issueAddSubscription(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("user") String user
  );

  /**
   * Add tracked time to a issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;TrackedTime&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/times")
  Call<TrackedTime> issueAddTime(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body AddTimeOption body
  );

  /**
   * Check if user is subscribed to an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @return Call&lt;WatchInfo&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/subscriptions/check")
  Call<WatchInfo> issueCheckSubscription(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Remove all labels from an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/labels")
  Call<Void> issueClearLabels(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Add a comment to an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Comment&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/comments")
  Call<Comment> issueCreateComment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body CreateIssueCommentOption body
  );

  /**
   * Create an issue. If using deadline only the date will be taken into account, and time of day ignored.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues")
  Call<Issue> issueCreateIssue(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateIssueOption body
  );

  /**
   * Create an issue attachment
   *
   * @param attachment (required)
   * @param owner      owner of the repo (required)
   * @param repo       name of the repo (required)
   * @param index      index of the issue (required)
   * @param name       name of the attachment (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Multipart
  @POST("repos/{owner}/{repo}/issues/{index}/assets")
  Call<Attachment> issueCreateIssueAttachment(
    @Part("attachment\"; filename=\"attachment") RequestBody attachment, @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("name") String name
  );

  /**
   * Block the issue given in the body by the issue in path
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/blocks")
  Call<Issue> issueCreateIssueBlocking(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Body IssueMeta body
  );

  /**
   * Create a comment attachment
   *
   * @param attachment (required)
   * @param owner      owner of the repo (required)
   * @param repo       name of the repo (required)
   * @param id         id of the comment (required)
   * @param name       name of the attachment (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Multipart
  @POST("repos/{owner}/{repo}/issues/comments/{id}/assets")
  Call<Attachment> issueCreateIssueCommentAttachment(
    @Part("attachment\"; filename=\"attachment") RequestBody attachment, @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Query("name") String name
  );

  /**
   * Make the issue in the url depend on the issue in the form.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/dependencies")
  Call<Issue> issueCreateIssueDependencies(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Body IssueMeta body
  );

  /**
   * Create a label
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Label&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/labels")
  Call<Label> issueCreateLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateLabelOption body
  );

  /**
   * Create a milestone
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param body  (optional)
   * @return Call&lt;Milestone&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/milestones")
  Call<Milestone> issueCreateMilestone(
    @Path("owner") String owner, @Path("repo") String repo, @Body CreateMilestoneOption body
  );

  /**
   * Delete an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of issue to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}")
  Call<Void> issueDelete(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Delete a comment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of comment to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/comments/{id}")
  Call<Void> issueDeleteComment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Delete a comment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index this parameter is ignored (required)
   * @param id    id of comment to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/comments/{id}")
  Call<Void> issueDeleteCommentDeprecated(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Integer index, @Path("id") Long id
  );

  /**
   * Remove a reaction from a comment of an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment to edit (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/issues/comments/{id}/reactions")
  Call<Void> issueDeleteCommentReaction(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditReactionOption body
  );

  /**
   * Delete an issue attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param index        index of the issue (required)
   * @param attachmentId id of the attachment to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/assets/{attachment_id}")
  Call<Void> issueDeleteIssueAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("attachment_id") Long attachmentId
  );

  /**
   * Delete a comment attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the comment (required)
   * @param attachmentId id of the attachment to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/comments/{id}/assets/{attachment_id}")
  Call<Void> issueDeleteIssueCommentAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId
  );

  /**
   * Remove a reaction from an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/issues/{index}/reactions")
  Call<Void> issueDeleteIssueReaction(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body EditReactionOption body
  );

  /**
   * Delete a label
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the label to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/labels/{id}")
  Call<Void> issueDeleteLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Delete a milestone
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    the milestone to delete, identified by ID and if not available by name (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/milestones/{id}")
  Call<Void> issueDeleteMilestone(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id
  );

  /**
   * Delete an issue&#x27;s existing stopwatch.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to stop the stopwatch on (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/stopwatch/delete")
  Call<Void> issueDeleteStopWatch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Unsubscribe user from issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param user  user witch unsubscribe (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/subscriptions/{user}")
  Call<Void> issueDeleteSubscription(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("user") String user
  );

  /**
   * Delete specific tracked time
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param id    id of time to delete (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/times/{id}")
  Call<Void> issueDeleteTime(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Edit a comment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment to edit (required)
   * @param body  (optional)
   * @return Call&lt;Comment&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/issues/comments/{id}")
  Call<Comment> issueEditComment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditIssueCommentOption body
  );

  /**
   * Edit a comment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index this parameter is ignored (required)
   * @param id    id of the comment to edit (required)
   * @param body  (optional)
   * @return Call&lt;Comment&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/issues/{index}/comments/{id}")
  Call<Comment> issueEditCommentDeprecated(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Integer index, @Path("id") Long id, @Body EditIssueCommentOption body
  );

  /**
   * Edit an issue. If using deadline only the date will be taken into account, and time of day ignored.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to edit (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/issues/{index}")
  Call<Issue> issueEditIssue(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body EditIssueOption body
  );

  /**
   * Edit an issue attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param index        index of the issue (required)
   * @param attachmentId id of the attachment to edit (required)
   * @param body         (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/issues/{index}/assets/{attachment_id}")
  Call<Attachment> issueEditIssueAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("attachment_id") Long attachmentId, @Body EditAttachmentOptions body
  );

  /**
   * Edit a comment attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the comment (required)
   * @param attachmentId id of the attachment to edit (required)
   * @param body         (optional)
   * @return Call&lt;Attachment&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/issues/comments/{id}/assets/{attachment_id}")
  Call<Attachment> issueEditIssueCommentAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId, @Body EditAttachmentOptions body
  );

  /**
   * Set an issue deadline. If set to null, the deadline is deleted. If using deadline only the date will be taken into account, and time of day ignored.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to create or update a deadline on (required)
   * @param body  (optional)
   * @return Call&lt;IssueDeadline&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/deadline")
  Call<IssueDeadline> issueEditIssueDeadline(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body EditDeadlineOption body
  );

  /**
   * Update a label
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the label to edit (required)
   * @param body  (optional)
   * @return Call&lt;Label&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/labels/{id}")
  Call<Label> issueEditLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditLabelOption body
  );

  /**
   * Update a milestone
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    the milestone to edit, identified by ID and if not available by name (required)
   * @param body  (optional)
   * @return Call&lt;Milestone&gt;
   */
  @Headers("Content-Type:application/json")
  @PATCH("repos/{owner}/{repo}/milestones/{id}")
  Call<Milestone> issueEditMilestone(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id, @Body EditMilestoneOption body
  );

  /**
   * Get a comment
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment (required)
   * @return Call&lt;Comment&gt;
   */
  @GET("repos/{owner}/{repo}/issues/comments/{id}")
  Call<Comment> issueGetComment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Get a list of reactions from a comment of an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment to edit (required)
   * @return Call&lt;List&lt;Reaction&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/comments/{id}/reactions")
  Call<List<Reaction>> issueGetCommentReactions(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * List all comments on an issue
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param index  index of the issue (required)
   * @param since  if provided, only comments updated since the specified time are returned. (optional)
   * @param before if provided, only comments updated before the provided time are returned. (optional)
   * @return Call&lt;List&lt;Comment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/comments")
  Call<List<Comment>> issueGetComments(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before
  );

  /**
   * List all comments and events on an issue
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param index  index of the issue (required)
   * @param since  if provided, only comments updated since the specified time are returned. (optional)
   * @param page   page number of results to return (1-based) (optional)
   * @param limit  page size of results (optional)
   * @param before if provided, only comments updated before the provided time are returned. (optional)
   * @return Call&lt;List&lt;TimelineComment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/timeline")
  Call<List<TimelineComment>> issueGetCommentsAndTimeline(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("since") OffsetDateTime since, @Query("page") Integer page, @Query("limit") Integer limit, @Query("before") OffsetDateTime before
  );

  /**
   * Get an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to get (required)
   * @return Call&lt;Issue&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}")
  Call<Issue> issueGetIssue(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Get an issue attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param index        index of the issue (required)
   * @param attachmentId id of the attachment to get (required)
   * @return Call&lt;Attachment&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/assets/{attachment_id}")
  Call<Attachment> issueGetIssueAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("attachment_id") Long attachmentId
  );

  /**
   * Get a comment attachment
   *
   * @param owner        owner of the repo (required)
   * @param repo         name of the repo (required)
   * @param id           id of the comment (required)
   * @param attachmentId id of the attachment to get (required)
   * @return Call&lt;Attachment&gt;
   */
  @GET("repos/{owner}/{repo}/issues/comments/{id}/assets/{attachment_id}")
  Call<Attachment> issueGetIssueCommentAttachment(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Path("attachment_id") Long attachmentId
  );

  /**
   * Get a list reactions of an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Reaction&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/reactions")
  Call<List<Reaction>> issueGetIssueReactions(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get a single label
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the label to get (required)
   * @return Call&lt;Label&gt;
   */
  @GET("repos/{owner}/{repo}/labels/{id}")
  Call<Label> issueGetLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * Get an issue&#x27;s labels
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/labels")
  Call<List<Label>> issueGetLabels(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Get a milestone
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    the milestone to get, identified by ID and if not available by name (required)
   * @return Call&lt;Milestone&gt;
   */
  @GET("repos/{owner}/{repo}/milestones/{id}")
  Call<Milestone> issueGetMilestone(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") String id
  );

  /**
   * Get all of a repository&#x27;s opened milestones
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param state Milestone state, Recognized values are open, closed and all. Defaults to \&quot;open\&quot; (optional)
   * @param name  filter by milestone name (optional)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Milestone&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/milestones")
  Call<List<Milestone>> issueGetMilestonesList(
    @Path("owner") String owner, @Path("repo") String repo, @Query("state") String state, @Query("name") String name, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List all comments in a repository
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param since  if provided, only comments updated since the provided time are returned. (optional)
   * @param before if provided, only comments updated before the provided time are returned. (optional)
   * @param page   page number of results to return (1-based) (optional)
   * @param limit  page size of results (optional)
   * @return Call&lt;List&lt;Comment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/comments")
  Call<List<Comment>> issueGetRepoComments(
    @Path("owner") String owner, @Path("repo") String repo, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List issues that are blocked by this issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Issue&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/blocks")
  Call<List<Issue>> issueListBlocks(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List issue&#x27;s attachments
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @return Call&lt;List&lt;Attachment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/assets")
  Call<List<Attachment>> issueListIssueAttachments(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * List comment&#x27;s attachments
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment (required)
   * @return Call&lt;List&lt;Attachment&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/comments/{id}/assets")
  Call<List<Attachment>> issueListIssueCommentAttachments(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id
  );

  /**
   * List an issue&#x27;s dependencies, i.e all issues that block this issue.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Issue&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/dependencies")
  Call<List<Issue>> issueListIssueDependencies(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List a repository&#x27;s issues
   *
   * @param owner       owner of the repo (required)
   * @param repo        name of the repo (required)
   * @param state       whether issue is open or closed (optional)
   * @param labels      comma separated list of labels. Fetch only issues that have any of this labels. Non existent labels are discarded (optional)
   * @param q           search string (optional)
   * @param type        filter by type (issues / pulls) if set (optional)
   * @param milestones  comma separated list of milestone names or ids. It uses names and fall back to ids. Fetch only issues that have any of this milestones. Non existent milestones are discarded (optional)
   * @param since       Only show items updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before      Only show items updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @param createdBy   Only show items which were created by the given user (optional)
   * @param assignedBy  Only show items for which the given user is assigned (optional)
   * @param mentionedBy Only show items in which the given user was mentioned (optional)
   * @param page        page number of results to return (1-based) (optional)
   * @param limit       page size of results (optional)
   * @return Call&lt;List&lt;Issue&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues")
  Call<List<Issue>> issueListIssues(
    @Path("owner") String owner, @Path("repo") String repo, @Query("state") String state, @Query("labels") String labels, @Query("q") String q, @Query("type") String type, @Query("milestones") String milestones, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("created_by") String createdBy, @Query("assigned_by") String assignedBy, @Query("mentioned_by") String mentionedBy, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Get all of a repository&#x27;s labels
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/labels")
  Call<List<Label>> issueListLabels(
    @Path("owner") String owner, @Path("repo") String repo, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Add a reaction to a comment of an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param id    id of the comment to edit (required)
   * @param body  (optional)
   * @return Call&lt;Reaction&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/comments/{id}/reactions")
  Call<Reaction> issuePostCommentReaction(
    @Path("owner") String owner, @Path("repo") String repo, @Path("id") Long id, @Body EditReactionOption body
  );

  /**
   * Add a reaction to an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Reaction&gt;
   */
  @Headers("Content-Type:application/json")
  @POST("repos/{owner}/{repo}/issues/{index}/reactions")
  Call<Reaction> issuePostIssueReaction(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body EditReactionOption body
  );

  /**
   * Unblock the issue given in the body by the issue in path
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/issues/{index}/blocks")
  Call<Issue> issueRemoveIssueBlocking(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Body IssueMeta body
  );

  /**
   * Remove an issue dependency
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;Issue&gt;
   */
  @Headers("Content-Type:application/json")
  @DELETE("repos/{owner}/{repo}/issues/{index}/dependencies")
  Call<Issue> issueRemoveIssueDependencies(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") String index, @Body IssueMeta body
  );

  /**
   * Remove a label from an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param id    id of the label to remove (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/labels/{id}")
  Call<Void> issueRemoveLabel(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("id") Long id
  );

  /**
   * Replace an issue&#x27;s labels
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param body  (optional)
   * @return Call&lt;List&lt;Label&gt;&gt;
   */
  @Headers("Content-Type:application/json")
  @PUT("repos/{owner}/{repo}/issues/{index}/labels")
  Call<List<Label>> issueReplaceLabels(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Body IssueLabelsOption body
  );

  /**
   * Reset a tracked time of an issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to add tracked time to (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/times")
  Call<Void> issueResetTime(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Search for issues across the repositories that the user has access to
   *
   * @param state           State of the issue (optional, default to open)
   * @param labels          Comma-separated list of label names. Fetch only issues that have any of these labels. Non existent labels are discarded. (optional)
   * @param milestones      Comma-separated list of milestone names. Fetch only issues that have any of these milestones. Non existent milestones are discarded. (optional)
   * @param q               Search string (optional)
   * @param priorityRepoId  Repository ID to prioritize in the results (optional)
   * @param type            Filter by issue type (optional)
   * @param since           Only show issues updated after the given time (RFC 3339 format) (optional)
   * @param before          Only show issues updated before the given time (RFC 3339 format) (optional)
   * @param assigned        Filter issues or pulls assigned to the authenticated user (optional, default to false)
   * @param created         Filter issues or pulls created by the authenticated user (optional, default to false)
   * @param mentioned       Filter issues or pulls mentioning the authenticated user (optional, default to false)
   * @param reviewRequested Filter pull requests where the authenticated user&#x27;s review was requested (optional, default to false)
   * @param reviewed        Filter pull requests reviewed by the authenticated user (optional, default to false)
   * @param owner           Filter by repository owner (optional)
   * @param team            Filter by team (requires organization owner parameter) (optional)
   * @param page            Page number of results to return (1-based) (optional, default to 1)
   * @param limit           Number of items per page (optional)
   * @return Call&lt;List&lt;Issue&gt;&gt;
   */
  @GET("repos/issues/search")
  Call<List<Issue>> issueSearchIssues(
    @Query("state") String state, @Query("labels") String labels, @Query("milestones") String milestones, @Query("q") String q, @Query("priority_repo_id") Long priorityRepoId, @Query("type") String type, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("assigned") Boolean assigned, @Query("created") Boolean created, @Query("mentioned") Boolean mentioned, @Query("review_requested") Boolean reviewRequested, @Query("reviewed") Boolean reviewed, @Query("owner") String owner, @Query("team") String team, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Start stopwatch on an issue.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to create the stopwatch on (required)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/issues/{index}/stopwatch/start")
  Call<Void> issueStartStopWatch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Stop an issue&#x27;s existing stopwatch.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue to stop the stopwatch on (required)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/issues/{index}/stopwatch/stop")
  Call<Void> issueStopStopWatch(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Get users who subscribed on an issue.
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of the issue (required)
   * @param page  page number of results to return (1-based) (optional)
   * @param limit page size of results (optional)
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/subscriptions")
  Call<List<User>> issueSubscriptions(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * List an issue&#x27;s tracked times
   *
   * @param owner  owner of the repo (required)
   * @param repo   name of the repo (required)
   * @param index  index of the issue (required)
   * @param user   optional filter by user (available for issue managers) (optional)
   * @param since  Only show times updated after the given time. This is a timestamp in RFC 3339 format (optional)
   * @param before Only show times updated before the given time. This is a timestamp in RFC 3339 format (optional)
   * @param page   page number of results to return (1-based) (optional)
   * @param limit  page size of results (optional)
   * @return Call&lt;List&lt;TrackedTime&gt;&gt;
   */
  @GET("repos/{owner}/{repo}/issues/{index}/times")
  Call<List<TrackedTime>> issueTrackedTimes(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Query("user") String user, @Query("since") OffsetDateTime since, @Query("before") OffsetDateTime before, @Query("page") Integer page, @Query("limit") Integer limit
  );

  /**
   * Moves the Pin to the given Position
   *
   * @param owner    owner of the repo (required)
   * @param repo     name of the repo (required)
   * @param index    index of issue (required)
   * @param position the new position (required)
   * @return Call&lt;Void&gt;
   */
  @PATCH("repos/{owner}/{repo}/issues/{index}/pin/{position}")
  Call<Void> moveIssuePin(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index, @Path("position") Long position
  );

  /**
   * Pin an Issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of issue to pin (required)
   * @return Call&lt;Void&gt;
   */
  @POST("repos/{owner}/{repo}/issues/{index}/pin")
  Call<Void> pinIssue(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

  /**
   * Unpin an Issue
   *
   * @param owner owner of the repo (required)
   * @param repo  name of the repo (required)
   * @param index index of issue to unpin (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("repos/{owner}/{repo}/issues/{index}/pin")
  Call<Void> unpinIssue(
    @Path("owner") String owner, @Path("repo") String repo, @Path("index") Long index
  );

}
