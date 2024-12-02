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
 * RepoCollaboratorPermission to get repository permission for a collaborator
 */
@Schema(description = "RepoCollaboratorPermission to get repository permission for a collaborator")
public class RepoCollaboratorPermission {
  @SerializedName("permission")
  private String permission;

  @SerializedName("role_name")
  private String roleName;

  @SerializedName("user")
  private User user;

  public RepoCollaboratorPermission permission(String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   *
   * @return permission
   **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public RepoCollaboratorPermission roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   *
   * @return roleName
   **/
  @Schema(description = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RepoCollaboratorPermission user(User user) {
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
    RepoCollaboratorPermission repoCollaboratorPermission = (RepoCollaboratorPermission) o;
    return Objects.equals(this.permission, repoCollaboratorPermission.permission) &&
           Objects.equals(this.roleName, repoCollaboratorPermission.roleName) &&
           Objects.equals(this.user, repoCollaboratorPermission.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, roleName, user);
  }


  @Override
  public String toString() {

    String sb = "class RepoCollaboratorPermission {\n" +
                "    permission: " + toIndentedString(permission) + "\n" +
                "    roleName: " + toIndentedString(roleName) + "\n" +
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
