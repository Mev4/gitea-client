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
 * UserHeatmapData represents the data needed to create a heatmap
 */
@Schema(description = "UserHeatmapData represents the data needed to create a heatmap")
public class UserHeatmapData {
  @SerializedName("contributions")
  private Long contributions;

  @SerializedName("timestamp")
  private Long timestamp;

  public UserHeatmapData contributions(Long contributions) {
    this.contributions = contributions;
    return this;
  }

  /**
   * Get contributions
   *
   * @return contributions
   **/
  @Schema(description = "")
  public Long getContributions() {
    return contributions;
  }

  public void setContributions(Long contributions) {
    this.contributions = contributions;
  }

  public UserHeatmapData timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   *
   * @return timestamp
   **/
  @Schema(description = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserHeatmapData userHeatmapData = (UserHeatmapData) o;
    return Objects.equals(this.contributions, userHeatmapData.contributions) &&
           Objects.equals(this.timestamp, userHeatmapData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributions, timestamp);
  }


  @Override
  public String toString() {

    String sb = "class UserHeatmapData {\n" +
                "    contributions: " + toIndentedString(contributions) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
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