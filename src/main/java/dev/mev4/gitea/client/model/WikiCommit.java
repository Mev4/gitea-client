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

import java.util.Objects;

/**
 * WikiCommit page commit/revision
 */
@Schema(description = "WikiCommit page commit/revision")
public class WikiCommit {
  @SerializedName("author")
  private CommitUser author;

  @SerializedName("commiter")
  private CommitUser commiter;

  @SerializedName("message")
  private String message;

  @SerializedName("sha")
  private String sha;

  public WikiCommit author(CommitUser author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   *
   * @return author
   **/
  @Schema(description = "")
  public CommitUser getAuthor() {
    return author;
  }

  public void setAuthor(CommitUser author) {
    this.author = author;
  }

  public WikiCommit commiter(CommitUser commiter) {
    this.commiter = commiter;
    return this;
  }

  /**
   * Get commiter
   *
   * @return commiter
   **/
  @Schema(description = "")
  public CommitUser getCommiter() {
    return commiter;
  }

  public void setCommiter(CommitUser commiter) {
    this.commiter = commiter;
  }

  public WikiCommit message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public WikiCommit sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * Get sha
   *
   * @return sha
   **/
  @Schema(description = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiCommit wikiCommit = (WikiCommit) o;
    return Objects.equals(this.author, wikiCommit.author) &&
           Objects.equals(this.commiter, wikiCommit.commiter) &&
           Objects.equals(this.message, wikiCommit.message) &&
           Objects.equals(this.sha, wikiCommit.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, commiter, message, sha);
  }


  @Override
  public String toString() {

    String sb = "class WikiCommit {\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    commiter: " + toIndentedString(commiter) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
                "    sha: " + toIndentedString(sha) + "\n" +
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
