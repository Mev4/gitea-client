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
 * AnnotatedTagObject contains meta information of the tag object
 */
@Schema(description = "AnnotatedTagObject contains meta information of the tag object")
public class AnnotatedTagObject {
  @SerializedName("sha")
  private String sha;

  @SerializedName("type")
  private String type;

  @SerializedName("url")
  private String url;

  public AnnotatedTagObject sha(String sha) {
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

  public AnnotatedTagObject type(String type) {
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

  public AnnotatedTagObject url(String url) {
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
    AnnotatedTagObject annotatedTagObject = (AnnotatedTagObject) o;
    return Objects.equals(this.sha, annotatedTagObject.sha) &&
           Objects.equals(this.type, annotatedTagObject.type) &&
           Objects.equals(this.url, annotatedTagObject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha, type, url);
  }


  @Override
  public String toString() {

    String sb = "class AnnotatedTagObject {\n" +
                "    sha: " + toIndentedString(sha) + "\n" +
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