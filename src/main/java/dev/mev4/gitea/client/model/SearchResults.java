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
 * SearchResults results of a successful search
 */
@Schema(description = "SearchResults results of a successful search")
public class SearchResults {
  @SerializedName("data")
  private List<Repository> data;

  @SerializedName("ok")
  private Boolean ok;

  public SearchResults data(List<Repository> data) {
    this.data = data;
    return this;
  }

  public SearchResults addDataItem(Repository dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Repository>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   *
   * @return data
   **/
  @Schema(description = "")
  public List<Repository> getData() {
    return data;
  }

  public void setData(List<Repository> data) {
    this.data = data;
  }

  public SearchResults ok(Boolean ok) {
    this.ok = ok;
    return this;
  }

  /**
   * Get ok
   *
   * @return ok
   **/
  @Schema(description = "")
  public Boolean isOk() {
    return ok;
  }

  public void setOk(Boolean ok) {
    this.ok = ok;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.data, searchResults.data) &&
           Objects.equals(this.ok, searchResults.ok);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, ok);
  }


  @Override
  public String toString() {

    String sb = "class SearchResults {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    ok: " + toIndentedString(ok) + "\n" +
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