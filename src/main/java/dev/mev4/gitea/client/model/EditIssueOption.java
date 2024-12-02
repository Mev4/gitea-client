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
 * EditIssueOption options for editing an issue
 */
@Schema(description = "EditIssueOption options for editing an issue")
public class EditIssueOption {
  @SerializedName("assignee")
  private String assignee;

  @SerializedName("assignees")
  private List<String> assignees;

  @SerializedName("body")
  private String body;

  @SerializedName("due_date")
  private OffsetDateTime dueDate;

  @SerializedName("milestone")
  private Long milestone;

  @SerializedName("ref")
  private String ref;

  @SerializedName("state")
  private String state;

  @SerializedName("title")
  private String title;

  @SerializedName("unset_due_date")
  private Boolean unsetDueDate;

  public EditIssueOption assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * deprecated
   *
   * @return assignee
   **/
  @Schema(description = "deprecated")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public EditIssueOption assignees(List<String> assignees) {
    this.assignees = assignees;
    return this;
  }

  public EditIssueOption addAssigneesItem(String assigneesItem) {
    if (this.assignees == null) {
      this.assignees = new ArrayList<String>();
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
  public List<String> getAssignees() {
    return assignees;
  }

  public void setAssignees(List<String> assignees) {
    this.assignees = assignees;
  }

  public EditIssueOption body(String body) {
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

  public EditIssueOption dueDate(OffsetDateTime dueDate) {
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

  public EditIssueOption milestone(Long milestone) {
    this.milestone = milestone;
    return this;
  }

  /**
   * Get milestone
   *
   * @return milestone
   **/
  @Schema(description = "")
  public Long getMilestone() {
    return milestone;
  }

  public void setMilestone(Long milestone) {
    this.milestone = milestone;
  }

  public EditIssueOption ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   *
   * @return ref
   **/
  @Schema(description = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public EditIssueOption state(String state) {
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

  public EditIssueOption title(String title) {
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

  public EditIssueOption unsetDueDate(Boolean unsetDueDate) {
    this.unsetDueDate = unsetDueDate;
    return this;
  }

  /**
   * Get unsetDueDate
   *
   * @return unsetDueDate
   **/
  @Schema(description = "")
  public Boolean isUnsetDueDate() {
    return unsetDueDate;
  }

  public void setUnsetDueDate(Boolean unsetDueDate) {
    this.unsetDueDate = unsetDueDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditIssueOption editIssueOption = (EditIssueOption) o;
    return Objects.equals(this.assignee, editIssueOption.assignee) &&
           Objects.equals(this.assignees, editIssueOption.assignees) &&
           Objects.equals(this.body, editIssueOption.body) &&
           Objects.equals(this.dueDate, editIssueOption.dueDate) &&
           Objects.equals(this.milestone, editIssueOption.milestone) &&
           Objects.equals(this.ref, editIssueOption.ref) &&
           Objects.equals(this.state, editIssueOption.state) &&
           Objects.equals(this.title, editIssueOption.title) &&
           Objects.equals(this.unsetDueDate, editIssueOption.unsetDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assignees, body, dueDate, milestone, ref, state, title, unsetDueDate);
  }


  @Override
  public String toString() {

    String sb = "class EditIssueOption {\n" +
                "    assignee: " + toIndentedString(assignee) + "\n" +
                "    assignees: " + toIndentedString(assignees) + "\n" +
                "    body: " + toIndentedString(body) + "\n" +
                "    dueDate: " + toIndentedString(dueDate) + "\n" +
                "    milestone: " + toIndentedString(milestone) + "\n" +
                "    ref: " + toIndentedString(ref) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    unsetDueDate: " + toIndentedString(unsetDueDate) + "\n" +
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
