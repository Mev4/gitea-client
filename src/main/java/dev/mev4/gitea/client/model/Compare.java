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
 * Compare
 */

public class Compare {
  @SerializedName("commits")
  private List<Commit> commits;

  @SerializedName("total_commits")
  private Long totalCommits;

  public Compare commits(List<Commit> commits) {
    this.commits = commits;
    return this;
  }

  public Compare addCommitsItem(Commit commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<Commit>();
    }
    this.commits.add(commitsItem);
    return this;
  }

  /**
   * Get commits
   *
   * @return commits
   **/
  @Schema(description = "")
  public List<Commit> getCommits() {
    return commits;
  }

  public void setCommits(List<Commit> commits) {
    this.commits = commits;
  }

  public Compare totalCommits(Long totalCommits) {
    this.totalCommits = totalCommits;
    return this;
  }

  /**
   * Get totalCommits
   *
   * @return totalCommits
   **/
  @Schema(description = "")
  public Long getTotalCommits() {
    return totalCommits;
  }

  public void setTotalCommits(Long totalCommits) {
    this.totalCommits = totalCommits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Compare compare = (Compare) o;
    return Objects.equals(this.commits, compare.commits) &&
           Objects.equals(this.totalCommits, compare.totalCommits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commits, totalCommits);
  }


  @Override
  public String toString() {

    String sb = "class Compare {\n" +
                "    commits: " + toIndentedString(commits) + "\n" +
                "    totalCommits: " + toIndentedString(totalCommits) + "\n" +
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