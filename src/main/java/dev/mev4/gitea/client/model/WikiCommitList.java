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
 * WikiCommitList commit/revision list
 */
@Schema(description = "WikiCommitList commit/revision list")
public class WikiCommitList {
  @SerializedName("commits")
  private List<WikiCommit> commits;

  @SerializedName("count")
  private Long count;

  public WikiCommitList commits(List<WikiCommit> commits) {
    this.commits = commits;
    return this;
  }

  public WikiCommitList addCommitsItem(WikiCommit commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<WikiCommit>();
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
  public List<WikiCommit> getCommits() {
    return commits;
  }

  public void setCommits(List<WikiCommit> commits) {
    this.commits = commits;
  }

  public WikiCommitList count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   *
   * @return count
   **/
  @Schema(description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiCommitList wikiCommitList = (WikiCommitList) o;
    return Objects.equals(this.commits, wikiCommitList.commits) &&
           Objects.equals(this.count, wikiCommitList.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commits, count);
  }


  @Override
  public String toString() {

    String sb = "class WikiCommitList {\n" +
                "    commits: " + toIndentedString(commits) + "\n" +
                "    count: " + toIndentedString(count) + "\n" +
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