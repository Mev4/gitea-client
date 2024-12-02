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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * IssueDeadline represents an issue deadline
 */
@Schema(description = "IssueDeadline represents an issue deadline")
public class IssueDeadline {
  @SerializedName("due_date")
  private OffsetDateTime dueDate;

  public IssueDeadline dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   *
   * @return dueDate
   **/
  @Schema(description = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueDeadline issueDeadline = (IssueDeadline) o;
    return Objects.equals(this.dueDate, issueDeadline.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueDate);
  }


  @Override
  public String toString() {

    String sb = "class IssueDeadline {\n" +
                "    dueDate: " + toIndentedString(dueDate) + "\n" +
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
