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
 * InternalTracker represents settings for internal tracker
 */
@Schema(description = "InternalTracker represents settings for internal tracker")
public class InternalTracker {
  @SerializedName("allow_only_contributors_to_track_time")
  private Boolean allowOnlyContributorsToTrackTime;

  @SerializedName("enable_issue_dependencies")
  private Boolean enableIssueDependencies;

  @SerializedName("enable_time_tracker")
  private Boolean enableTimeTracker;

  public InternalTracker allowOnlyContributorsToTrackTime(Boolean allowOnlyContributorsToTrackTime) {
    this.allowOnlyContributorsToTrackTime = allowOnlyContributorsToTrackTime;
    return this;
  }

  /**
   * Let only contributors track time (Built-in issue tracker)
   *
   * @return allowOnlyContributorsToTrackTime
   **/
  @Schema(description = "Let only contributors track time (Built-in issue tracker)")
  public Boolean isAllowOnlyContributorsToTrackTime() {
    return allowOnlyContributorsToTrackTime;
  }

  public void setAllowOnlyContributorsToTrackTime(Boolean allowOnlyContributorsToTrackTime) {
    this.allowOnlyContributorsToTrackTime = allowOnlyContributorsToTrackTime;
  }

  public InternalTracker enableIssueDependencies(Boolean enableIssueDependencies) {
    this.enableIssueDependencies = enableIssueDependencies;
    return this;
  }

  /**
   * Enable dependencies for issues and pull requests (Built-in issue tracker)
   *
   * @return enableIssueDependencies
   **/
  @Schema(description = "Enable dependencies for issues and pull requests (Built-in issue tracker)")
  public Boolean isEnableIssueDependencies() {
    return enableIssueDependencies;
  }

  public void setEnableIssueDependencies(Boolean enableIssueDependencies) {
    this.enableIssueDependencies = enableIssueDependencies;
  }

  public InternalTracker enableTimeTracker(Boolean enableTimeTracker) {
    this.enableTimeTracker = enableTimeTracker;
    return this;
  }

  /**
   * Enable time tracking (Built-in issue tracker)
   *
   * @return enableTimeTracker
   **/
  @Schema(description = "Enable time tracking (Built-in issue tracker)")
  public Boolean isEnableTimeTracker() {
    return enableTimeTracker;
  }

  public void setEnableTimeTracker(Boolean enableTimeTracker) {
    this.enableTimeTracker = enableTimeTracker;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTracker internalTracker = (InternalTracker) o;
    return Objects.equals(this.allowOnlyContributorsToTrackTime, internalTracker.allowOnlyContributorsToTrackTime) &&
           Objects.equals(this.enableIssueDependencies, internalTracker.enableIssueDependencies) &&
           Objects.equals(this.enableTimeTracker, internalTracker.enableTimeTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOnlyContributorsToTrackTime, enableIssueDependencies, enableTimeTracker);
  }


  @Override
  public String toString() {

    String sb = "class InternalTracker {\n" +
                "    allowOnlyContributorsToTrackTime: " + toIndentedString(allowOnlyContributorsToTrackTime) + "\n" +
                "    enableIssueDependencies: " + toIndentedString(enableIssueDependencies) + "\n" +
                "    enableTimeTracker: " + toIndentedString(enableTimeTracker) + "\n" +
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