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
 * CreatePushMirrorOption
 */

public class CreatePushMirrorOption {
  @SerializedName("interval")
  private String interval;

  @SerializedName("remote_address")
  private String remoteAddress;

  @SerializedName("remote_password")
  private String remotePassword;

  @SerializedName("remote_username")
  private String remoteUsername;

  @SerializedName("sync_on_commit")
  private Boolean syncOnCommit;

  public CreatePushMirrorOption interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   *
   * @return interval
   **/
  @Schema(description = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public CreatePushMirrorOption remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

  /**
   * Get remoteAddress
   *
   * @return remoteAddress
   **/
  @Schema(description = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public CreatePushMirrorOption remotePassword(String remotePassword) {
    this.remotePassword = remotePassword;
    return this;
  }

  /**
   * Get remotePassword
   *
   * @return remotePassword
   **/
  @Schema(description = "")
  public String getRemotePassword() {
    return remotePassword;
  }

  public void setRemotePassword(String remotePassword) {
    this.remotePassword = remotePassword;
  }

  public CreatePushMirrorOption remoteUsername(String remoteUsername) {
    this.remoteUsername = remoteUsername;
    return this;
  }

  /**
   * Get remoteUsername
   *
   * @return remoteUsername
   **/
  @Schema(description = "")
  public String getRemoteUsername() {
    return remoteUsername;
  }

  public void setRemoteUsername(String remoteUsername) {
    this.remoteUsername = remoteUsername;
  }

  public CreatePushMirrorOption syncOnCommit(Boolean syncOnCommit) {
    this.syncOnCommit = syncOnCommit;
    return this;
  }

  /**
   * Get syncOnCommit
   *
   * @return syncOnCommit
   **/
  @Schema(description = "")
  public Boolean isSyncOnCommit() {
    return syncOnCommit;
  }

  public void setSyncOnCommit(Boolean syncOnCommit) {
    this.syncOnCommit = syncOnCommit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePushMirrorOption createPushMirrorOption = (CreatePushMirrorOption) o;
    return Objects.equals(this.interval, createPushMirrorOption.interval) &&
           Objects.equals(this.remoteAddress, createPushMirrorOption.remoteAddress) &&
           Objects.equals(this.remotePassword, createPushMirrorOption.remotePassword) &&
           Objects.equals(this.remoteUsername, createPushMirrorOption.remoteUsername) &&
           Objects.equals(this.syncOnCommit, createPushMirrorOption.syncOnCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, remoteAddress, remotePassword, remoteUsername, syncOnCommit);
  }


  @Override
  public String toString() {

    String sb = "class CreatePushMirrorOption {\n" +
                "    interval: " + toIndentedString(interval) + "\n" +
                "    remoteAddress: " + toIndentedString(remoteAddress) + "\n" +
                "    remotePassword: " + toIndentedString(remotePassword) + "\n" +
                "    remoteUsername: " + toIndentedString(remoteUsername) + "\n" +
                "    syncOnCommit: " + toIndentedString(syncOnCommit) + "\n" +
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