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
 * GitHook represents a Git repository hook
 */
@Schema(description = "GitHook represents a Git repository hook")
public class GitHook {
  @SerializedName("content")
  private String content;

  @SerializedName("is_active")
  private Boolean isActive;

  @SerializedName("name")
  private String name;

  public GitHook content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   **/
  @Schema(description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GitHook isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   *
   * @return isActive
   **/
  @Schema(description = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GitHook name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHook gitHook = (GitHook) o;
    return Objects.equals(this.content, gitHook.content) &&
           Objects.equals(this.isActive, gitHook.isActive) &&
           Objects.equals(this.name, gitHook.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, isActive, name);
  }


  @Override
  public String toString() {

    String sb = "class GitHook {\n" +
                "    content: " + toIndentedString(content) + "\n" +
                "    isActive: " + toIndentedString(isActive) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
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