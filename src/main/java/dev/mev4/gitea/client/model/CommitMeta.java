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
 * CommitMeta
 */

public class CommitMeta {
  @SerializedName("created")
  private OffsetDateTime created;

  @SerializedName("sha")
  private String sha;

  @SerializedName("url")
  private String url;

  public CommitMeta created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   *
   * @return created
   **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CommitMeta sha(String sha) {
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

  public CommitMeta url(String url) {
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
    CommitMeta commitMeta = (CommitMeta) o;
    return Objects.equals(this.created, commitMeta.created) &&
           Objects.equals(this.sha, commitMeta.sha) &&
           Objects.equals(this.url, commitMeta.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, sha, url);
  }


  @Override
  public String toString() {

    String sb = "class CommitMeta {\n" +
                "    created: " + toIndentedString(created) + "\n" +
                "    sha: " + toIndentedString(sha) + "\n" +
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