package dev.mev4.gitea.client.api;

import dev.mev4.gitea.client.ApiClient;
import dev.mev4.gitea.client.model.AddTimeOption;
import dev.mev4.gitea.client.model.CreateIssueCommentOption;
import dev.mev4.gitea.client.model.CreateIssueOption;
import dev.mev4.gitea.client.model.CreateLabelOption;
import dev.mev4.gitea.client.model.CreateMilestoneOption;
import dev.mev4.gitea.client.model.EditAttachmentOptions;
import dev.mev4.gitea.client.model.EditDeadlineOption;
import dev.mev4.gitea.client.model.EditIssueCommentOption;
import dev.mev4.gitea.client.model.EditIssueOption;
import dev.mev4.gitea.client.model.EditLabelOption;
import dev.mev4.gitea.client.model.EditMilestoneOption;
import dev.mev4.gitea.client.model.EditReactionOption;
import dev.mev4.gitea.client.model.IssueLabelsOption;
import dev.mev4.gitea.client.model.IssueMeta;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;

import java.io.File;


/**
 * API tests for IssueApi
 */
public class IssueApiTest {

  private IssueApi api;

  @Before
  public void setup() {
    api = new ApiClient().createService(IssueApi.class);
  }


  /**
   * Add a label to an issue
   */
  @Test
  public void issueAddLabelTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    IssueLabelsOption body = null;
    // List<Label> response = api.issueAddLabel(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Subscribe user to issue
   */
  @Test
  public void issueAddSubscriptionTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String user = null;
    // Void response = api.issueAddSubscription(owner, repo, index, user);

    // TODO: test validations
  }

  /**
   * Add tracked time to a issue
   */
  @Test
  public void issueAddTimeTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    AddTimeOption body = null;
    // TrackedTime response = api.issueAddTime(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Check if user is subscribed to an issue
   */
  @Test
  public void issueCheckSubscriptionTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // WatchInfo response = api.issueCheckSubscription(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Remove all labels from an issue
   */
  @Test
  public void issueClearLabelsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueClearLabels(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Add a comment to an issue
   */
  @Test
  public void issueCreateCommentTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    CreateIssueCommentOption body = null;
    // Comment response = api.issueCreateComment(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Create an issue. If using deadline only the date will be taken into account, and time of day ignored.
   */
  @Test
  public void issueCreateIssueTest() {
    String owner = null;
    String repo = null;
    CreateIssueOption body = null;
    // Issue response = api.issueCreateIssue(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create an issue attachment
   */
  @Test
  public void issueCreateIssueAttachmentTest() {
    File attachment = null;
    String owner = null;
    String repo = null;
    Long index = null;
    String name = null;
    // Attachment response = api.issueCreateIssueAttachment(attachment, owner, repo, index, name);

    // TODO: test validations
  }

  /**
   * Block the issue given in the body by the issue in path
   */
  @Test
  public void issueCreateIssueBlockingTest() {
    String owner = null;
    String repo = null;
    String index = null;
    IssueMeta body = null;
    // Issue response = api.issueCreateIssueBlocking(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Create a comment attachment
   */
  @Test
  public void issueCreateIssueCommentAttachmentTest() {
    File attachment = null;
    String owner = null;
    String repo = null;
    Long id = null;
    String name = null;
    // Attachment response = api.issueCreateIssueCommentAttachment(attachment, owner, repo, id, name);

    // TODO: test validations
  }

  /**
   * Make the issue in the url depend on the issue in the form.
   */
  @Test
  public void issueCreateIssueDependenciesTest() {
    String owner = null;
    String repo = null;
    String index = null;
    IssueMeta body = null;
    // Issue response = api.issueCreateIssueDependencies(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Create a label
   */
  @Test
  public void issueCreateLabelTest() {
    String owner = null;
    String repo = null;
    CreateLabelOption body = null;
    // Label response = api.issueCreateLabel(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Create a milestone
   */
  @Test
  public void issueCreateMilestoneTest() {
    String owner = null;
    String repo = null;
    CreateMilestoneOption body = null;
    // Milestone response = api.issueCreateMilestone(owner, repo, body);

    // TODO: test validations
  }

  /**
   * Delete an issue
   */
  @Test
  public void issueDeleteTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueDelete(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Delete a comment
   */
  @Test
  public void issueDeleteCommentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Void response = api.issueDeleteComment(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a comment
   */
  @Test
  public void issueDeleteCommentDeprecatedTest() {
    String owner = null;
    String repo = null;
    Integer index = null;
    Long id = null;
    // Void response = api.issueDeleteCommentDeprecated(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Remove a reaction from a comment of an issue
   */
  @Test
  public void issueDeleteCommentReactionTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditReactionOption body = null;
    // Void response = api.issueDeleteCommentReaction(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Delete an issue attachment
   */
  @Test
  public void issueDeleteIssueAttachmentTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long attachmentId = null;
    // Void response = api.issueDeleteIssueAttachment(owner, repo, index, attachmentId);

    // TODO: test validations
  }

  /**
   * Delete a comment attachment
   */
  @Test
  public void issueDeleteIssueCommentAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    // Void response = api.issueDeleteIssueCommentAttachment(owner, repo, id, attachmentId);

    // TODO: test validations
  }

  /**
   * Remove a reaction from an issue
   */
  @Test
  public void issueDeleteIssueReactionTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    EditReactionOption body = null;
    // Void response = api.issueDeleteIssueReaction(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Delete a label
   */
  @Test
  public void issueDeleteLabelTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Void response = api.issueDeleteLabel(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete a milestone
   */
  @Test
  public void issueDeleteMilestoneTest() {
    String owner = null;
    String repo = null;
    String id = null;
    // Void response = api.issueDeleteMilestone(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Delete an issue&#x27;s existing stopwatch.
   */
  @Test
  public void issueDeleteStopWatchTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueDeleteStopWatch(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Unsubscribe user from issue
   */
  @Test
  public void issueDeleteSubscriptionTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String user = null;
    // Void response = api.issueDeleteSubscription(owner, repo, index, user);

    // TODO: test validations
  }

  /**
   * Delete specific tracked time
   */
  @Test
  public void issueDeleteTimeTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // Void response = api.issueDeleteTime(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Edit a comment
   */
  @Test
  public void issueEditCommentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditIssueCommentOption body = null;
    // Comment response = api.issueEditComment(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Edit a comment
   */
  @Test
  public void issueEditCommentDeprecatedTest() {
    String owner = null;
    String repo = null;
    Integer index = null;
    Long id = null;
    EditIssueCommentOption body = null;
    // Comment response = api.issueEditCommentDeprecated(owner, repo, index, id, body);

    // TODO: test validations
  }

  /**
   * Edit an issue. If using deadline only the date will be taken into account, and time of day ignored.
   */
  @Test
  public void issueEditIssueTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    EditIssueOption body = null;
    // Issue response = api.issueEditIssue(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Edit an issue attachment
   */
  @Test
  public void issueEditIssueAttachmentTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long attachmentId = null;
    EditAttachmentOptions body = null;
    // Attachment response = api.issueEditIssueAttachment(owner, repo, index, attachmentId, body);

    // TODO: test validations
  }

  /**
   * Edit a comment attachment
   */
  @Test
  public void issueEditIssueCommentAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    EditAttachmentOptions body = null;
    // Attachment response = api.issueEditIssueCommentAttachment(owner, repo, id, attachmentId, body);

    // TODO: test validations
  }

  /**
   * Set an issue deadline. If set to null, the deadline is deleted. If using deadline only the date will be taken into account, and time of day ignored.
   */
  @Test
  public void issueEditIssueDeadlineTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    EditDeadlineOption body = null;
    // IssueDeadline response = api.issueEditIssueDeadline(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Update a label
   */
  @Test
  public void issueEditLabelTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditLabelOption body = null;
    // Label response = api.issueEditLabel(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Update a milestone
   */
  @Test
  public void issueEditMilestoneTest() {
    String owner = null;
    String repo = null;
    String id = null;
    EditMilestoneOption body = null;
    // Milestone response = api.issueEditMilestone(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Get a comment
   */
  @Test
  public void issueGetCommentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Comment response = api.issueGetComment(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get a list of reactions from a comment of an issue
   */
  @Test
  public void issueGetCommentReactionsTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // List<Reaction> response = api.issueGetCommentReactions(owner, repo, id);

    // TODO: test validations
  }

  /**
   * List all comments on an issue
   */
  @Test
  public void issueGetCommentsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    // List<Comment> response = api.issueGetComments(owner, repo, index, since, before);

    // TODO: test validations
  }

  /**
   * List all comments and events on an issue
   */
  @Test
  public void issueGetCommentsAndTimelineTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    OffsetDateTime since = null;
    Integer page = null;
    Integer limit = null;
    OffsetDateTime before = null;
    // List<TimelineComment> response = api.issueGetCommentsAndTimeline(owner, repo, index, since, page, limit, before);

    // TODO: test validations
  }

  /**
   * Get an issue
   */
  @Test
  public void issueGetIssueTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Issue response = api.issueGetIssue(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Get an issue attachment
   */
  @Test
  public void issueGetIssueAttachmentTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long attachmentId = null;
    // Attachment response = api.issueGetIssueAttachment(owner, repo, index, attachmentId);

    // TODO: test validations
  }

  /**
   * Get a comment attachment
   */
  @Test
  public void issueGetIssueCommentAttachmentTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    Long attachmentId = null;
    // Attachment response = api.issueGetIssueCommentAttachment(owner, repo, id, attachmentId);

    // TODO: test validations
  }

  /**
   * Get a list reactions of an issue
   */
  @Test
  public void issueGetIssueReactionsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Integer page = null;
    Integer limit = null;
    // List<Reaction> response = api.issueGetIssueReactions(owner, repo, index, page, limit);

    // TODO: test validations
  }

  /**
   * Get a single label
   */
  @Test
  public void issueGetLabelTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // Label response = api.issueGetLabel(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get an issue&#x27;s labels
   */
  @Test
  public void issueGetLabelsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // List<Label> response = api.issueGetLabels(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Get a milestone
   */
  @Test
  public void issueGetMilestoneTest() {
    String owner = null;
    String repo = null;
    String id = null;
    // Milestone response = api.issueGetMilestone(owner, repo, id);

    // TODO: test validations
  }

  /**
   * Get all of a repository&#x27;s opened milestones
   */
  @Test
  public void issueGetMilestonesListTest() {
    String owner = null;
    String repo = null;
    String state = null;
    String name = null;
    Integer page = null;
    Integer limit = null;
    // List<Milestone> response = api.issueGetMilestonesList(owner, repo, state, name, page, limit);

    // TODO: test validations
  }

  /**
   * List all comments in a repository
   */
  @Test
  public void issueGetRepoCommentsTest() {
    String owner = null;
    String repo = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Integer page = null;
    Integer limit = null;
    // List<Comment> response = api.issueGetRepoComments(owner, repo, since, before, page, limit);

    // TODO: test validations
  }

  /**
   * List issues that are blocked by this issue
   */
  @Test
  public void issueListBlocksTest() {
    String owner = null;
    String repo = null;
    String index = null;
    Integer page = null;
    Integer limit = null;
    // List<Issue> response = api.issueListBlocks(owner, repo, index, page, limit);

    // TODO: test validations
  }

  /**
   * List issue&#x27;s attachments
   */
  @Test
  public void issueListIssueAttachmentsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // List<Attachment> response = api.issueListIssueAttachments(owner, repo, index);

    // TODO: test validations
  }

  /**
   * List comment&#x27;s attachments
   */
  @Test
  public void issueListIssueCommentAttachmentsTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    // List<Attachment> response = api.issueListIssueCommentAttachments(owner, repo, id);

    // TODO: test validations
  }

  /**
   * List an issue&#x27;s dependencies, i.e all issues that block this issue.
   */
  @Test
  public void issueListIssueDependenciesTest() {
    String owner = null;
    String repo = null;
    String index = null;
    Integer page = null;
    Integer limit = null;
    // List<Issue> response = api.issueListIssueDependencies(owner, repo, index, page, limit);

    // TODO: test validations
  }

  /**
   * List a repository&#x27;s issues
   */
  @Test
  public void issueListIssuesTest() {
    String owner = null;
    String repo = null;
    String state = null;
    String labels = null;
    String q = null;
    String type = null;
    String milestones = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    String createdBy = null;
    String assignedBy = null;
    String mentionedBy = null;
    Integer page = null;
    Integer limit = null;
    // List<Issue> response = api.issueListIssues(owner, repo, state, labels, q, type, milestones, since, before, createdBy, assignedBy, mentionedBy, page, limit);

    // TODO: test validations
  }

  /**
   * Get all of a repository&#x27;s labels
   */
  @Test
  public void issueListLabelsTest() {
    String owner = null;
    String repo = null;
    Integer page = null;
    Integer limit = null;
    // List<Label> response = api.issueListLabels(owner, repo, page, limit);

    // TODO: test validations
  }

  /**
   * Add a reaction to a comment of an issue
   */
  @Test
  public void issuePostCommentReactionTest() {
    String owner = null;
    String repo = null;
    Long id = null;
    EditReactionOption body = null;
    // Reaction response = api.issuePostCommentReaction(owner, repo, id, body);

    // TODO: test validations
  }

  /**
   * Add a reaction to an issue
   */
  @Test
  public void issuePostIssueReactionTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    EditReactionOption body = null;
    // Reaction response = api.issuePostIssueReaction(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Unblock the issue given in the body by the issue in path
   */
  @Test
  public void issueRemoveIssueBlockingTest() {
    String owner = null;
    String repo = null;
    String index = null;
    IssueMeta body = null;
    // Issue response = api.issueRemoveIssueBlocking(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Remove an issue dependency
   */
  @Test
  public void issueRemoveIssueDependenciesTest() {
    String owner = null;
    String repo = null;
    String index = null;
    IssueMeta body = null;
    // Issue response = api.issueRemoveIssueDependencies(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Remove a label from an issue
   */
  @Test
  public void issueRemoveLabelTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long id = null;
    // Void response = api.issueRemoveLabel(owner, repo, index, id);

    // TODO: test validations
  }

  /**
   * Replace an issue&#x27;s labels
   */
  @Test
  public void issueReplaceLabelsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    IssueLabelsOption body = null;
    // List<Label> response = api.issueReplaceLabels(owner, repo, index, body);

    // TODO: test validations
  }

  /**
   * Reset a tracked time of an issue
   */
  @Test
  public void issueResetTimeTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueResetTime(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Search for issues across the repositories that the user has access to
   */
  @Test
  public void issueSearchIssuesTest() {
    String state = null;
    String labels = null;
    String milestones = null;
    String q = null;
    Long priorityRepoId = null;
    String type = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Boolean assigned = null;
    Boolean created = null;
    Boolean mentioned = null;
    Boolean reviewRequested = null;
    Boolean reviewed = null;
    String owner = null;
    String team = null;
    Integer page = null;
    Integer limit = null;
    // List<Issue> response = api.issueSearchIssues(state, labels, milestones, q, priorityRepoId, type, since, before, assigned, created, mentioned, reviewRequested, reviewed, owner, team, page, limit);

    // TODO: test validations
  }

  /**
   * Start stopwatch on an issue.
   */
  @Test
  public void issueStartStopWatchTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueStartStopWatch(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Stop an issue&#x27;s existing stopwatch.
   */
  @Test
  public void issueStopStopWatchTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.issueStopStopWatch(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Get users who subscribed on an issue.
   */
  @Test
  public void issueSubscriptionsTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Integer page = null;
    Integer limit = null;
    // List<User> response = api.issueSubscriptions(owner, repo, index, page, limit);

    // TODO: test validations
  }

  /**
   * List an issue&#x27;s tracked times
   */
  @Test
  public void issueTrackedTimesTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    String user = null;
    OffsetDateTime since = null;
    OffsetDateTime before = null;
    Integer page = null;
    Integer limit = null;
    // List<TrackedTime> response = api.issueTrackedTimes(owner, repo, index, user, since, before, page, limit);

    // TODO: test validations
  }

  /**
   * Moves the Pin to the given Position
   */
  @Test
  public void moveIssuePinTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    Long position = null;
    // Void response = api.moveIssuePin(owner, repo, index, position);

    // TODO: test validations
  }

  /**
   * Pin an Issue
   */
  @Test
  public void pinIssueTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.pinIssue(owner, repo, index);

    // TODO: test validations
  }

  /**
   * Unpin an Issue
   */
  @Test
  public void unpinIssueTest() {
    String owner = null;
    String repo = null;
    Long index = null;
    // Void response = api.unpinIssue(owner, repo, index);

    // TODO: test validations
  }
}
