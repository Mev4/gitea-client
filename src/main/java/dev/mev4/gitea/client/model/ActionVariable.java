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
 * ActionVariable return value of the query API
 */
@Schema(description = "ActionVariable return value of the query API")
public class ActionVariable {
  @SerializedName("data")
  private String data;

  @SerializedName("name")
  private String name;

  @SerializedName("owner_id")
  private Long ownerId;

  @SerializedName("repo_id")
  private Long repoId;

  public ActionVariable data(String data) {
    this.data = data;
    return this;
  }

  /**
   * the value of the variable
   *
   * @return data
   **/
  @Schema(description = "the value of the variable")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ActionVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the name of the variable
   *
   * @return name
   **/
  @Schema(description = "the name of the variable")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionVariable ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * the owner to which the variable belongs
   *
   * @return ownerId
   **/
  @Schema(description = "the owner to which the variable belongs")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ActionVariable repoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * the repository to which the variable belongs
   *
   * @return repoId
   **/
  @Schema(description = "the repository to which the variable belongs")
  public Long getRepoId() {
    return repoId;
  }

  public void setRepoId(Long repoId) {
    this.repoId = repoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionVariable actionVariable = (ActionVariable) o;
    return Objects.equals(this.data, actionVariable.data) &&
           Objects.equals(this.name, actionVariable.name) &&
           Objects.equals(this.ownerId, actionVariable.ownerId) &&
           Objects.equals(this.repoId, actionVariable.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, ownerId, repoId);
  }


  @Override
  public String toString() {

    String sb = "class ActionVariable {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    ownerId: " + toIndentedString(ownerId) + "\n" +
                "    repoId: " + toIndentedString(repoId) + "\n" +
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