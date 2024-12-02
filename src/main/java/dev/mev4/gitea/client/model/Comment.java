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
 * Comment represents a comment on a commit or issue
 */
@Schema(description = "Comment represents a comment on a commit or issue")
public class Comment {
  @SerializedName("assets")
  private List<Attachment> assets;

  @SerializedName("body")
  private String body;

  @SerializedName("created_at")
  private OffsetDateTime createdAt;

  @SerializedName("html_url")
  private String htmlUrl;

  @SerializedName("id")
  private Long id;

  @SerializedName("issue_url")
  private String issueUrl;

  @SerializedName("original_author")
  private String originalAuthor;

  @SerializedName("original_author_id")
  private Long originalAuthorId;

  @SerializedName("pull_request_url")
  private String pullRequestUrl;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt;

  @SerializedName("user")
  private User user;

  public Comment assets(List<Attachment> assets) {
    this.assets = assets;
    return this;
  }

  public Comment addAssetsItem(Attachment assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<Attachment>();
    }
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * Get assets
   *
   * @return assets
   **/
  @Schema(description = "")
  public List<Attachment> getAssets() {
    return assets;
  }

  public void setAssets(List<Attachment> assets) {
    this.assets = assets;
  }

  public Comment body(String body) {
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

  public Comment createdAt(OffsetDateTime createdAt) {
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

  public Comment htmlUrl(String htmlUrl) {
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

  public Comment id(Long id) {
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

  public Comment issueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
    return this;
  }

  /**
   * Get issueUrl
   *
   * @return issueUrl
   **/
  @Schema(description = "")
  public String getIssueUrl() {
    return issueUrl;
  }

  public void setIssueUrl(String issueUrl) {
    this.issueUrl = issueUrl;
  }

  public Comment originalAuthor(String originalAuthor) {
    this.originalAuthor = originalAuthor;
    return this;
  }

  /**
   * Get originalAuthor
   *
   * @return originalAuthor
   **/
  @Schema(description = "")
  public String getOriginalAuthor() {
    return originalAuthor;
  }

  public void setOriginalAuthor(String originalAuthor) {
    this.originalAuthor = originalAuthor;
  }

  public Comment originalAuthorId(Long originalAuthorId) {
    this.originalAuthorId = originalAuthorId;
    return this;
  }

  /**
   * Get originalAuthorId
   *
   * @return originalAuthorId
   **/
  @Schema(description = "")
  public Long getOriginalAuthorId() {
    return originalAuthorId;
  }

  public void setOriginalAuthorId(Long originalAuthorId) {
    this.originalAuthorId = originalAuthorId;
  }

  public Comment pullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

  /**
   * Get pullRequestUrl
   *
   * @return pullRequestUrl
   **/
  @Schema(description = "")
  public String getPullRequestUrl() {
    return pullRequestUrl;
  }

  public void setPullRequestUrl(String pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }

  public Comment updatedAt(OffsetDateTime updatedAt) {
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

  public Comment user(User user) {
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
    Comment comment = (Comment) o;
    return Objects.equals(this.assets, comment.assets) &&
           Objects.equals(this.body, comment.body) &&
           Objects.equals(this.createdAt, comment.createdAt) &&
           Objects.equals(this.htmlUrl, comment.htmlUrl) &&
           Objects.equals(this.id, comment.id) &&
           Objects.equals(this.issueUrl, comment.issueUrl) &&
           Objects.equals(this.originalAuthor, comment.originalAuthor) &&
           Objects.equals(this.originalAuthorId, comment.originalAuthorId) &&
           Objects.equals(this.pullRequestUrl, comment.pullRequestUrl) &&
           Objects.equals(this.updatedAt, comment.updatedAt) &&
           Objects.equals(this.user, comment.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, body, createdAt, htmlUrl, id, issueUrl, originalAuthor, originalAuthorId, pullRequestUrl, updatedAt, user);
  }


  @Override
  public String toString() {

    String sb = "class Comment {\n" +
                "    assets: " + toIndentedString(assets) + "\n" +
                "    body: " + toIndentedString(body) + "\n" +
                "    createdAt: " + toIndentedString(createdAt) + "\n" +
                "    htmlUrl: " + toIndentedString(htmlUrl) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    issueUrl: " + toIndentedString(issueUrl) + "\n" +
                "    originalAuthor: " + toIndentedString(originalAuthor) + "\n" +
                "    originalAuthorId: " + toIndentedString(originalAuthorId) + "\n" +
                "    pullRequestUrl: " + toIndentedString(pullRequestUrl) + "\n" +
                "    updatedAt: " + toIndentedString(updatedAt) + "\n" +
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
