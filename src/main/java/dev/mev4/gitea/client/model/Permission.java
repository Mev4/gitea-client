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
 * Permission represents a set of permissions
 */
@Schema(description = "Permission represents a set of permissions")
public class Permission {
  @SerializedName("admin")
  private Boolean admin;

  @SerializedName("pull")
  private Boolean pull;

  @SerializedName("push")
  private Boolean push;

  public Permission admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin
   *
   * @return admin
   **/
  @Schema(description = "")
  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public Permission pull(Boolean pull) {
    this.pull = pull;
    return this;
  }

  /**
   * Get pull
   *
   * @return pull
   **/
  @Schema(description = "")
  public Boolean isPull() {
    return pull;
  }

  public void setPull(Boolean pull) {
    this.pull = pull;
  }

  public Permission push(Boolean push) {
    this.push = push;
    return this;
  }

  /**
   * Get push
   *
   * @return push
   **/
  @Schema(description = "")
  public Boolean isPush() {
    return push;
  }

  public void setPush(Boolean push) {
    this.push = push;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.admin, permission.admin) &&
           Objects.equals(this.pull, permission.pull) &&
           Objects.equals(this.push, permission.push);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, pull, push);
  }


  @Override
  public String toString() {

    String sb = "class Permission {\n" +
                "    admin: " + toIndentedString(admin) + "\n" +
                "    pull: " + toIndentedString(pull) + "\n" +
                "    push: " + toIndentedString(push) + "\n" +
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