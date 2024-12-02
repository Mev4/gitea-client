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
 * NotificationSubject contains the notification subject (Issue/Pull/Commit)
 */
@Schema(description = "NotificationSubject contains the notification subject (Issue/Pull/Commit)")
public class NotificationSubject {
  @SerializedName("html_url")
  private String htmlUrl;

  @SerializedName("latest_comment_html_url")
  private String latestCommentHtmlUrl;

  @SerializedName("latest_comment_url")
  private String latestCommentUrl;

  @SerializedName("state")
  private String state;

  @SerializedName("title")
  private String title;

  @SerializedName("type")
  private String type;

  @SerializedName("url")
  private String url;

  public NotificationSubject htmlUrl(String htmlUrl) {
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

  public NotificationSubject latestCommentHtmlUrl(String latestCommentHtmlUrl) {
    this.latestCommentHtmlUrl = latestCommentHtmlUrl;
    return this;
  }

  /**
   * Get latestCommentHtmlUrl
   *
   * @return latestCommentHtmlUrl
   **/
  @Schema(description = "")
  public String getLatestCommentHtmlUrl() {
    return latestCommentHtmlUrl;
  }

  public void setLatestCommentHtmlUrl(String latestCommentHtmlUrl) {
    this.latestCommentHtmlUrl = latestCommentHtmlUrl;
  }

  public NotificationSubject latestCommentUrl(String latestCommentUrl) {
    this.latestCommentUrl = latestCommentUrl;
    return this;
  }

  /**
   * Get latestCommentUrl
   *
   * @return latestCommentUrl
   **/
  @Schema(description = "")
  public String getLatestCommentUrl() {
    return latestCommentUrl;
  }

  public void setLatestCommentUrl(String latestCommentUrl) {
    this.latestCommentUrl = latestCommentUrl;
  }

  public NotificationSubject state(String state) {
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

  public NotificationSubject title(String title) {
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

  public NotificationSubject type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationSubject url(String url) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSubject notificationSubject = (NotificationSubject) o;
    return Objects.equals(this.htmlUrl, notificationSubject.htmlUrl) &&
           Objects.equals(this.latestCommentHtmlUrl, notificationSubject.latestCommentHtmlUrl) &&
           Objects.equals(this.latestCommentUrl, notificationSubject.latestCommentUrl) &&
           Objects.equals(this.state, notificationSubject.state) &&
           Objects.equals(this.title, notificationSubject.title) &&
           Objects.equals(this.type, notificationSubject.type) &&
           Objects.equals(this.url, notificationSubject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlUrl, latestCommentHtmlUrl, latestCommentUrl, state, title, type, url);
  }


  @Override
  public String toString() {

    String sb = "class NotificationSubject {\n" +
                "    htmlUrl: " + toIndentedString(htmlUrl) + "\n" +
                "    latestCommentHtmlUrl: " + toIndentedString(latestCommentHtmlUrl) + "\n" +
                "    latestCommentUrl: " + toIndentedString(latestCommentUrl) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    type: " + toIndentedString(type) + "\n" +
                "    url: " + toIndentedString(url) + "\n" +
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
