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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ChangeFilesOptions options for creating, updating or deleting multiple files Note: &#x60;author&#x60; and &#x60;committer&#x60; are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)
 */
@Schema(description = "ChangeFilesOptions options for creating, updating or deleting multiple files Note: `author` and `committer` are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)")
public class ChangeFilesOptions {
  @SerializedName("author")
  private Identity author;

  @SerializedName("branch")
  private String branch;

  @SerializedName("committer")
  private Identity committer;

  @SerializedName("dates")
  private CommitDateOptions dates;

  @SerializedName("files")
  private List<ChangeFileOperation> files = new ArrayList<ChangeFileOperation>();

  @SerializedName("message")
  private String message;

  @SerializedName("new_branch")
  private String newBranch;

  @SerializedName("signoff")
  private Boolean signoff;

  public ChangeFilesOptions author(Identity author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   *
   * @return author
   **/
  @Schema(description = "")
  public Identity getAuthor() {
    return author;
  }

  public void setAuthor(Identity author) {
    this.author = author;
  }

  public ChangeFilesOptions branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * branch (optional) to base this file from. if not given, the default branch is used
   *
   * @return branch
   **/
  @Schema(description = "branch (optional) to base this file from. if not given, the default branch is used")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public ChangeFilesOptions committer(Identity committer) {
    this.committer = committer;
    return this;
  }

  /**
   * Get committer
   *
   * @return committer
   **/
  @Schema(description = "")
  public Identity getCommitter() {
    return committer;
  }

  public void setCommitter(Identity committer) {
    this.committer = committer;
  }

  public ChangeFilesOptions dates(CommitDateOptions dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   *
   * @return dates
   **/
  @Schema(description = "")
  public CommitDateOptions getDates() {
    return dates;
  }

  public void setDates(CommitDateOptions dates) {
    this.dates = dates;
  }

  public ChangeFilesOptions files(List<ChangeFileOperation> files) {
    this.files = files;
    return this;
  }

  public ChangeFilesOptions addFilesItem(ChangeFileOperation filesItem) {
    this.files.add(filesItem);
    return this;
  }

  /**
   * list of file operations
   *
   * @return files
   **/
  @Schema(required = true, description = "list of file operations")
  public List<ChangeFileOperation> getFiles() {
    return files;
  }

  public void setFiles(List<ChangeFileOperation> files) {
    this.files = files;
  }

  public ChangeFilesOptions message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message (optional) for the commit of this file. if not supplied, a default message will be used
   *
   * @return message
   **/
  @Schema(description = "message (optional) for the commit of this file. if not supplied, a default message will be used")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChangeFilesOptions newBranch(String newBranch) {
    this.newBranch = newBranch;
    return this;
  }

  /**
   * new_branch (optional) will make a new branch from &#x60;branch&#x60; before creating the file
   *
   * @return newBranch
   **/
  @Schema(description = "new_branch (optional) will make a new branch from `branch` before creating the file")
  public String getNewBranch() {
    return newBranch;
  }

  public void setNewBranch(String newBranch) {
    this.newBranch = newBranch;
  }

  public ChangeFilesOptions signoff(Boolean signoff) {
    this.signoff = signoff;
    return this;
  }

  /**
   * Add a Signed-off-by trailer by the committer at the end of the commit log message.
   *
   * @return signoff
   **/
  @Schema(description = "Add a Signed-off-by trailer by the committer at the end of the commit log message.")
  public Boolean isSignoff() {
    return signoff;
  }

  public void setSignoff(Boolean signoff) {
    this.signoff = signoff;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeFilesOptions changeFilesOptions = (ChangeFilesOptions) o;
    return Objects.equals(this.author, changeFilesOptions.author) &&
           Objects.equals(this.branch, changeFilesOptions.branch) &&
           Objects.equals(this.committer, changeFilesOptions.committer) &&
           Objects.equals(this.dates, changeFilesOptions.dates) &&
           Objects.equals(this.files, changeFilesOptions.files) &&
           Objects.equals(this.message, changeFilesOptions.message) &&
           Objects.equals(this.newBranch, changeFilesOptions.newBranch) &&
           Objects.equals(this.signoff, changeFilesOptions.signoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, branch, committer, dates, files, message, newBranch, signoff);
  }


  @Override
  public String toString() {

    String sb = "class ChangeFilesOptions {\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    branch: " + toIndentedString(branch) + "\n" +
                "    committer: " + toIndentedString(committer) + "\n" +
                "    dates: " + toIndentedString(dates) + "\n" +
                "    files: " + toIndentedString(files) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    newBranch: " + toIndentedString(newBranch) + "\n" +
                "    signoff: " + toIndentedString(signoff) + "\n" +
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