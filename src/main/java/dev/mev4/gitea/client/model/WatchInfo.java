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

import java.util.Objects;

/**
 * WatchInfo represents an API watch status of one repository
 */
@Schema(description = "WatchInfo represents an API watch status of one repository")
public class WatchInfo {
  @SerializedName("created_at")
  private OffsetDateTime createdAt;

  @SerializedName("ignored")
  private Boolean ignored;

  @SerializedName("reason")
  private Object reason;

  @SerializedName("repository_url")
  private String repositoryUrl;

  @SerializedName("subscribed")
  private Boolean subscribed;

  @SerializedName("url")
  private String url;

  public WatchInfo createdAt(OffsetDateTime createdAt) {
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

  public WatchInfo ignored(Boolean ignored) {
    this.ignored = ignored;
    return this;
  }

  /**
   * Get ignored
   *
   * @return ignored
   **/
  @Schema(description = "")
  public Boolean isIgnored() {
    return ignored;
  }

  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }

  public WatchInfo reason(Object reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   *
   * @return reason
   **/
  @Schema(description = "")
  public Object getReason() {
    return reason;
  }

  public void setReason(Object reason) {
    this.reason = reason;
  }

  public WatchInfo repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * Get repositoryUrl
   *
   * @return repositoryUrl
   **/
  @Schema(description = "")
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public WatchInfo subscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  /**
   * Get subscribed
   *
   * @return subscribed
   **/
  @Schema(description = "")
  public Boolean isSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }

  public WatchInfo url(String url) {
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
    WatchInfo watchInfo = (WatchInfo) o;
    return Objects.equals(this.createdAt, watchInfo.createdAt) &&
           Objects.equals(this.ignored, watchInfo.ignored) &&
           Objects.equals(this.reason, watchInfo.reason) &&
           Objects.equals(this.repositoryUrl, watchInfo.repositoryUrl) &&
           Objects.equals(this.subscribed, watchInfo.subscribed) &&
           Objects.equals(this.url, watchInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ignored, reason, repositoryUrl, subscribed, url);
  }


  @Override
  public String toString() {

    String sb = "class WatchInfo {\n" +
                "    createdAt: " + toIndentedString(createdAt) + "\n" +
                "    ignored: " + toIndentedString(ignored) + "\n" +
                "    reason: " + toIndentedString(reason) + "\n" +
                "    repositoryUrl: " + toIndentedString(repositoryUrl) + "\n" +
                "    subscribed: " + toIndentedString(subscribed) + "\n" +
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
