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
 * CreateReleaseOption options when creating a release
 */
@Schema(description = "CreateReleaseOption options when creating a release")
public class CreateReleaseOption {
  @SerializedName("body")
  private String body;

  @SerializedName("draft")
  private Boolean draft;

  @SerializedName("name")
  private String name;

  @SerializedName("prerelease")
  private Boolean prerelease;

  @SerializedName("tag_name")
  private String tagName;

  @SerializedName("target_commitish")
  private String targetCommitish;

  public CreateReleaseOption body(String body) {
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

  public CreateReleaseOption draft(Boolean draft) {
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

  public CreateReleaseOption name(String name) {
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

  public CreateReleaseOption prerelease(Boolean prerelease) {
    this.prerelease = prerelease;
    return this;
  }

  /**
   * Get prerelease
   *
   * @return prerelease
   **/
  @Schema(description = "")
  public Boolean isPrerelease() {
    return prerelease;
  }

  public void setPrerelease(Boolean prerelease) {
    this.prerelease = prerelease;
  }

  public CreateReleaseOption tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

  /**
   * Get tagName
   *
   * @return tagName
   **/
  @Schema(required = true, description = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public CreateReleaseOption targetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
    return this;
  }

  /**
   * Get targetCommitish
   *
   * @return targetCommitish
   **/
  @Schema(description = "")
  public String getTargetCommitish() {
    return targetCommitish;
  }

  public void setTargetCommitish(String targetCommitish) {
    this.targetCommitish = targetCommitish;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReleaseOption createReleaseOption = (CreateReleaseOption) o;
    return Objects.equals(this.body, createReleaseOption.body) &&
           Objects.equals(this.draft, createReleaseOption.draft) &&
           Objects.equals(this.name, createReleaseOption.name) &&
           Objects.equals(this.prerelease, createReleaseOption.prerelease) &&
           Objects.equals(this.tagName, createReleaseOption.tagName) &&
           Objects.equals(this.targetCommitish, createReleaseOption.targetCommitish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, draft, name, prerelease, tagName, targetCommitish);
  }


  @Override
  public String toString() {

    String sb = "class CreateReleaseOption {\n" +
                "    body: " + toIndentedString(body) + "\n" +
                "    draft: " + toIndentedString(draft) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    prerelease: " + toIndentedString(prerelease) + "\n" +
                "    tagName: " + toIndentedString(tagName) + "\n" +
                "    targetCommitish: " + toIndentedString(targetCommitish) + "\n" +
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