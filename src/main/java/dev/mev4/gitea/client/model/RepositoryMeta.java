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
 * RepositoryMeta basic repository information
 */
@Schema(description = "RepositoryMeta basic repository information")
public class RepositoryMeta {
  @SerializedName("full_name")
  private String fullName;

  @SerializedName("id")
  private Long id;

  @SerializedName("name")
  private String name;

  @SerializedName("owner")
  private String owner;

  public RepositoryMeta fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   *
   * @return fullName
   **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public RepositoryMeta id(Long id) {
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

  public RepositoryMeta name(String name) {
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

  public RepositoryMeta owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   *
   * @return owner
   **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryMeta repositoryMeta = (RepositoryMeta) o;
    return Objects.equals(this.fullName, repositoryMeta.fullName) &&
           Objects.equals(this.id, repositoryMeta.id) &&
           Objects.equals(this.name, repositoryMeta.name) &&
           Objects.equals(this.owner, repositoryMeta.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, id, name, owner);
  }


  @Override
  public String toString() {

    String sb = "class RepositoryMeta {\n" +
                "    fullName: " + toIndentedString(fullName) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    owner: " + toIndentedString(owner) + "\n" +
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