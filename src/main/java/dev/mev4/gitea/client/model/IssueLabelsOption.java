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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IssueLabelsOption a collection of labels
 */
@Schema(description = "IssueLabelsOption a collection of labels")
public class IssueLabelsOption {
  @SerializedName("labels")
  private List<Object> labels;

  public IssueLabelsOption labels(List<Object> labels) {
    this.labels = labels;
    return this;
  }

  public IssueLabelsOption addLabelsItem(Object labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Object>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels can be a list of integers representing label IDs or a list of strings representing label names
   *
   * @return labels
   **/
  @Schema(description = "Labels can be a list of integers representing label IDs or a list of strings representing label names")
  public List<Object> getLabels() {
    return labels;
  }

  public void setLabels(List<Object> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLabelsOption issueLabelsOption = (IssueLabelsOption) o;
    return Objects.equals(this.labels, issueLabelsOption.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels);
  }


  @Override
  public String toString() {

    String sb = "class IssueLabelsOption {\n" +
                "    labels: " + toIndentedString(labels) + "\n" +
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
