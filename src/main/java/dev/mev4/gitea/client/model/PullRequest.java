/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.23.0+dev-728-g93640993e3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package dev.mev4.gitea.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PullRequest represents a pull request
 */
@Schema(description = "PullRequest represents a pull request")
public class PullRequest {
  @SerializedName("additions")
  private Long additions;

  @SerializedName("allow_maintainer_edit")
  private Boolean allowMaintainerEdit;

  @SerializedName("assignee")
  private User assignee;

  @SerializedName("assignees")
  private List<User> assignees;

  @SerializedName("base")
  private PRBranchInfo base;

  @SerializedName("body")
  private String body;

  @SerializedName("changed_files")
  private Long changedFiles;

  @SerializedName("closed_at")
  private OffsetDateTime closedAt;

  @SerializedName("comments")
  private Long comments;

  @SerializedName("created_at")
  private OffsetDateTime createdAt;

  @SerializedName("deletions")
  private Long deletions;

  @SerializedName("diff_url")
  private String diffUrl;

  @SerializedName("draft")
  private Boolean draft;

  @SerializedName("due_date")
  private OffsetDateTime dueDate;

  @SerializedName("head")
  private PRBranchInfo head;

  @SerializedName("html_url")
  private String htmlUrl;

  @SerializedName("id")
  private Long id;

  @SerializedName("is_locked")
  private Boolean isLocked;

  @SerializedName("labels")
  private List<Label> labels;

  @SerializedName("merge_base")
  private String mergeBase;

  @SerializedName("merge_commit_sha")
  private String mergeCommitSha;

  @SerializedName("mergeable")
  private Boolean mergeable;

  @SerializedName("merged")
  private Boolean merged;

  @SerializedName("merged_at")
  private OffsetDateTime mergedAt;

  @SerializedName("merged_by")
  private User mergedBy;

  @SerializedName("milestone")
  private Milestone milestone;

  @SerializedName("number")
  private Long number;

  @SerializedName("patch_url")
  private String patchUrl;

  @SerializedName("pin_order")
  private Long pinOrder;

  @SerializedName("requested_reviewers")
  private List<User> requestedReviewers;

  @SerializedName("requested_reviewers_teams")
  private List<Team> requestedReviewersTeams;

  @SerializedName("review_comments")
  private Long reviewComments;

  @SerializedName("state")
  private String state;

  @SerializedName("title")
  private String title;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt;

  @SerializedName("url")
  private String url;

  @SerializedName("user")
  private User user;

  public PullRequest additions(Long additions) {
    this.additions = additions;
    return this;
  }

  /**
   * Get additions
   *
   * @return additions
   **/
  @Schema(description = "")
  public Long getAdditions() {
    return additions;
  }

  public void setAdditions(Long additions) {
    this.additions = additions;
  }

  public PullRequest allowMaintainerEdit(Boolean allowMaintainerEdit) {
    this.allowMaintainerEdit = allowMaintainerEdit;
    return this;
  }

  /**
   * Get allowMaintainerEdit
   *
   * @return allowMaintainerEdit
   **/
  @Schema(description = "")
  public Boolean isAllowMaintainerEdit() {
    return allowMaintainerEdit;
  }

  public void setAllowMaintainerEdit(Boolean allowMaintainerEdit) {
    this.allowMaintainerEdit = allowMaintainerEdit;
  }

  public PullRequest assignee(User assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   *
   * @return assignee
   **/
  @Schema(description = "")
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public PullRequest assignees(List<User> assignees) {
    this.assignees = assignees;
    return this;
  }

  public PullRequest addAssigneesItem(User assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<User>();
    }
    this.assignees.add(assigneesItem);
    return this;
  }

  /**
   * Get assignees
   *
   * @return assignees
   **/
  @Schema(description = "")
  public List<User> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<User> assignees) {
    this.assignees = assignees;
  }

  public PullRequest base(PRBranchInfo base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   *
   * @return base
   **/
  @Schema(description = "")
  public PRBranchInfo getBase() {
    return base;
  }

  public void setBase(PRBranchInfo base) {
    this.base = base;
  }

  public PullRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   **/
  @Schema(description = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PullRequest changedFiles(Long changedFiles) {
    this.changedFiles = changedFiles;
    return this;
  }

  /**
   * Get changedFiles
   *
   * @return changedFiles
   **/
  @Schema(description = "")
  public Long getChangedFiles() {
    return changedFiles;
  }

  public void setChangedFiles(Long changedFiles) {
    this.changedFiles = changedFiles;
  }

  public PullRequest closedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
    return this;
  }

  /**
   * Get closedAt
   *
   * @return closedAt
   **/
  @Schema(description = "")
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  public PullRequest comments(Long comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   *
   * @return comments
   **/
  @Schema(description = "")
  public Long getComments() {
    return comments;
  }

  public void setComments(Long comments) {
    this.comments = comments;
  }

  public PullRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PullRequest deletions(Long deletions) {
    this.deletions = deletions;
    return this;
  }

  /**
   * Get deletions
   *
   * @return deletions
   **/
  @Schema(description = "")
  public Long getDeletions() {
    return deletions;
  }

  public void setDeletions(Long deletions) {
    this.deletions = deletions;
  }

  public PullRequest diffUrl(String diffUrl) {
    this.diffUrl = diffUrl;
    return this;
  }

  /**
   * Get diffUrl
   *
   * @return diffUrl
   **/
  @Schema(description = "")
  public String getDiffUrl() {
    return diffUrl;
  }

  public void setDiffUrl(String diffUrl) {
    this.diffUrl = diffUrl;
  }

  public PullRequest draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  /**
   * Get draft
   *
   * @return draft
   **/
  @Schema(description = "")
  public Boolean isDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public PullRequest dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   *
   * @return dueDate
   **/
  @Schema(description = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public PullRequest head(PRBranchInfo head) {
    this.head = head;
    return this;
  }

  /**
   * Get head
   *
   * @return head
   **/
  @Schema(description = "")
  public PRBranchInfo getHead() {
    return head;
  }

  public void setHead(PRBranchInfo head) {
    this.head = head;
  }

  public PullRequest htmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
    return this;
  }

  /**
   * Get htmlUrl
   *
   * @return htmlUrl
   **/
  @Schema(description = "")
  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public PullRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PullRequest isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   *
   * @return isLocked
   **/
  @Schema(description = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public PullRequest labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public PullRequest addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   *
   * @return labels
   **/
  @Schema(description = "")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public PullRequest mergeBase(String mergeBase) {
    this.mergeBase = mergeBase;
    return this;
  }

  /**
   * Get mergeBase
   *
   * @return mergeBase
   **/
  @Schema(description = "")
  public String getMergeBase() {
    return mergeBase;
  }

  public void setMergeBase(String mergeBase) {
    this.mergeBase = mergeBase;
  }

  public PullRequest mergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
    return this;
  }

  /**
   * Get mergeCommitSha
   *
   * @return mergeCommitSha
   **/
  @Schema(description = "")
  public String getMergeCommitSha() {
    return mergeCommitSha;
  }

  public void setMergeCommitSha(String mergeCommitSha) {
    this.mergeCommitSha = mergeCommitSha;
  }

  public PullRequest mergeable(Boolean mergeable) {
    this.mergeable = mergeable;
    return this;
  }

  /**
   * Get mergeable
   *
   * @return mergeable
   **/
  @Schema(description = "")
  public Boolean isMergeable() {
    return mergeable;
  }

  public void setMergeable(Boolean mergeable) {
    this.mergeable = mergeable;
  }

  public PullRequest merged(Boolean merged) {
    this.merged = merged;
    return this;
  }

  /**
   * Get merged
   *
   * @return merged
   **/
  @Schema(description = "")
  public Boolean isMerged() {
    return merged;
  }

  public void setMerged(Boolean merged) {
    this.merged = merged;
  }

  public PullRequest mergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
    return this;
  }

  /**
   * Get mergedAt
   *
   * @return mergedAt
   **/
  @Schema(description = "")
  public OffsetDateTime getMergedAt() {
    return mergedAt;
  }

  public void setMergedAt(OffsetDateTime mergedAt) {
    this.mergedAt = mergedAt;
  }

  public PullRequest mergedBy(User mergedBy) {
    this.mergedBy = mergedBy;
    return this;
  }

  /**
   * Get mergedBy
   *
   * @return mergedBy
   **/
  @Schema(description = "")
  public User getMergedBy() {
    return mergedBy;
  }

  public void setMergedBy(User mergedBy) {
    this.mergedBy = mergedBy;
  }

  public PullRequest milestone(Milestone milestone) {
    this.milestone = milestone;
    return this;
  }

  /**
   * Get milestone
   *
   * @return milestone
   **/
  @Schema(description = "")
  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  public PullRequest number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   *
   * @return number
   **/
  @Schema(description = "")
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public PullRequest patchUrl(String patchUrl) {
    this.patchUrl = patchUrl;
    return this;
  }

  /**
   * Get patchUrl
   *
   * @return patchUrl
   **/
  @Schema(description = "")
  public String getPatchUrl() {
    return patchUrl;
  }

  public void setPatchUrl(String patchUrl) {
    this.patchUrl = patchUrl;
  }

  public PullRequest pinOrder(Long pinOrder) {
    this.pinOrder = pinOrder;
    return this;
  }

  /**
   * Get pinOrder
   *
   * @return pinOrder
   **/
  @Schema(description = "")
  public Long getPinOrder() {
    return pinOrder;
  }

  public void setPinOrder(Long pinOrder) {
    this.pinOrder = pinOrder;
  }

  public PullRequest requestedReviewers(List<User> requestedReviewers) {
    this.requestedReviewers = requestedReviewers;
    return this;
  }

  public PullRequest addRequestedReviewersItem(User requestedReviewersItem) {
    if (this.requestedReviewers == null) {
      this.requestedReviewers = new ArrayList<User>();
    }
    this.requestedReviewers.add(requestedReviewersItem);
    return this;
  }

  /**
   * Get requestedReviewers
   *
   * @return requestedReviewers
   **/
  @Schema(description = "")
  public List<User> getRequestedReviewers() {
    return requestedReviewers;
  }

  public void setRequestedReviewers(List<User> requestedReviewers) {
    this.requestedReviewers = requestedReviewers;
  }

  public PullRequest requestedReviewersTeams(List<Team> requestedReviewersTeams) {
    this.requestedReviewersTeams = requestedReviewersTeams;
    return this;
  }

  public PullRequest addRequestedReviewersTeamsItem(Team requestedReviewersTeamsItem) {
    if (this.requestedReviewersTeams == null) {
      this.requestedReviewersTeams = new ArrayList<Team>();
    }
    this.requestedReviewersTeams.add(requestedReviewersTeamsItem);
    return this;
  }

  /**
   * Get requestedReviewersTeams
   *
   * @return requestedReviewersTeams
   **/
  @Schema(description = "")
  public List<Team> getRequestedReviewersTeams() {
    return requestedReviewersTeams;
  }

  public void setRequestedReviewersTeams(List<Team> requestedReviewersTeams) {
    this.requestedReviewersTeams = requestedReviewersTeams;
  }

  public PullRequest reviewComments(Long reviewComments) {
    this.reviewComments = reviewComments;
    return this;
  }

  /**
   * number of review comments made on the diff of a PR review (not including comments on commits or issues in a PR)
   *
   * @return reviewComments
   **/
  @Schema(description = "number of review comments made on the diff of a PR review (not including comments on commits or issues in a PR)")
  public Long getReviewComments() {
    return reviewComments;
  }

  public void setReviewComments(Long reviewComments) {
    this.reviewComments = reviewComments;
  }

  public PullRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   *
   * @return state
   **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PullRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PullRequest updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   *
   * @return updatedAt
   **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PullRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PullRequest user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequest pullRequest = (PullRequest) o;
    return Objects.equals(this.additions, pullRequest.additions) &&
           Objects.equals(this.allowMaintainerEdit, pullRequest.allowMaintainerEdit) &&
           Objects.equals(this.assignee, pullRequest.assignee) &&
           Objects.equals(this.assignees, pullRequest.assignees) &&
           Objects.equals(this.base, pullRequest.base) &&
           Objects.equals(this.body, pullRequest.body) &&
           Objects.equals(this.changedFiles, pullRequest.changedFiles) &&
           Objects.equals(this.closedAt, pullRequest.closedAt) &&
           Objects.equals(this.comments, pullRequest.comments) &&
           Objects.equals(this.createdAt, pullRequest.createdAt) &&
           Objects.equals(this.deletions, pullRequest.deletions) &&
           Objects.equals(this.diffUrl, pullRequest.diffUrl) &&
           Objects.equals(this.draft, pullRequest.draft) &&
           Objects.equals(this.dueDate, pullRequest.dueDate) &&
           Objects.equals(this.head, pullRequest.head) &&
           Objects.equals(this.htmlUrl, pullRequest.htmlUrl) &&
           Objects.equals(this.id, pullRequest.id) &&
           Objects.equals(this.isLocked, pullRequest.isLocked) &&
           Objects.equals(this.labels, pullRequest.labels) &&
           Objects.equals(this.mergeBase, pullRequest.mergeBase) &&
           Objects.equals(this.mergeCommitSha, pullRequest.mergeCommitSha) &&
           Objects.equals(this.mergeable, pullRequest.mergeable) &&
           Objects.equals(this.merged, pullRequest.merged) &&
           Objects.equals(this.mergedAt, pullRequest.mergedAt) &&
           Objects.equals(this.mergedBy, pullRequest.mergedBy) &&
           Objects.equals(this.milestone, pullRequest.milestone) &&
           Objects.equals(this.number, pullRequest.number) &&
           Objects.equals(this.patchUrl, pullRequest.patchUrl) &&
           Objects.equals(this.pinOrder, pullRequest.pinOrder) &&
           Objects.equals(this.requestedReviewers, pullRequest.requestedReviewers) &&
           Objects.equals(this.requestedReviewersTeams, pullRequest.requestedReviewersTeams) &&
           Objects.equals(this.reviewComments, pullRequest.reviewComments) &&
           Objects.equals(this.state, pullRequest.state) &&
           Objects.equals(this.title, pullRequest.title) &&
           Objects.equals(this.updatedAt, pullRequest.updatedAt) &&
           Objects.equals(this.url, pullRequest.url) &&
           Objects.equals(this.user, pullRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, allowMaintainerEdit, assignee, assignees, base, body, changedFiles, closedAt, comments, createdAt, deletions, diffUrl, draft, dueDate, head, htmlUrl, id, isLocked, labels, mergeBase, mergeCommitSha, mergeable, merged, mergedAt, mergedBy, milestone, number, patchUrl, pinOrder, requestedReviewers, requestedReviewersTeams, reviewComments, state, title, updatedAt, url, user);
  }


  @Override
  public String toString() {

    String sb = "class PullRequest {\n" +
                "    additions: " + toIndentedString(additions) + "\n" +
                "    allowMaintainerEdit: " + toIndentedString(allowMaintainerEdit) + "\n" +
                "    assignee: " + toIndentedString(assignee) + "\n" +
                "    assignees: " + toIndentedString(assignees) + "\n" +
                "    base: " + toIndentedString(base) + "\n" +
                "    body: " + toIndentedString(body) + "\n" +
                "    changedFiles: " + toIndentedString(changedFiles) + "\n" +
                "    closedAt: " + toIndentedString(closedAt) + "\n" +
                "    comments: " + toIndentedString(comments) + "\n" +
                "    createdAt: " + toIndentedString(createdAt) + "\n" +
                "    deletions: " + toIndentedString(deletions) + "\n" +
                "    diffUrl: " + toIndentedString(diffUrl) + "\n" +
                "    draft: " + toIndentedString(draft) + "\n" +
                "    dueDate: " + toIndentedString(dueDate) + "\n" +
                "    head: " + toIndentedString(head) + "\n" +
                "    htmlUrl: " + toIndentedString(htmlUrl) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    isLocked: " + toIndentedString(isLocked) + "\n" +
                "    labels: " + toIndentedString(labels) + "\n" +
                "    mergeBase: " + toIndentedString(mergeBase) + "\n" +
                "    mergeCommitSha: " + toIndentedString(mergeCommitSha) + "\n" +
                "    mergeable: " + toIndentedString(mergeable) + "\n" +
                "    merged: " + toIndentedString(merged) + "\n" +
                "    mergedAt: " + toIndentedString(mergedAt) + "\n" +
                "    mergedBy: " + toIndentedString(mergedBy) + "\n" +
                "    milestone: " + toIndentedString(milestone) + "\n" +
                "    number: " + toIndentedString(number) + "\n" +
                "    patchUrl: " + toIndentedString(patchUrl) + "\n" +
                "    pinOrder: " + toIndentedString(pinOrder) + "\n" +
                "    requestedReviewers: " + toIndentedString(requestedReviewers) + "\n" +
                "    requestedReviewersTeams: " + toIndentedString(requestedReviewersTeams) + "\n" +
                "    reviewComments: " + toIndentedString(reviewComments) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
                "    url: " + toIndentedString(url) + "\n" +
                "    user: " + toIndentedString(user) + "\n" +
                "}";
    return sb;
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}