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
 * PRBranchInfo information about a branch
 */
@Schema(description = "PRBranchInfo information about a branch")
public class PRBranchInfo {
  @SerializedName("label")
  private String label;

  @SerializedName("ref")
  private String ref;

  @SerializedName("repo")
  private Repository repo;

  @SerializedName("repo_id")
  private Long repoId;

  @SerializedName("sha")
  private String sha;

  public PRBranchInfo label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   *
   * @return label
   **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PRBranchInfo ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   *
   * @return ref
   **/
  @Schema(description = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public PRBranchInfo repo(Repository repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Get repo
   *
   * @return repo
   **/
  @Schema(description = "")
  public Repository getRepo() {
    return repo;
  }

  public void setRepo(Repository repo) {
    this.repo = repo;
  }

  public PRBranchInfo repoId(Long repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Get repoId
   *
   * @return repoId
   **/
  @Schema(description = "")
  public Long getRepoId() {
    return repoId;
  }

  public void setRepoId(Long repoId) {
    this.repoId = repoId;
  }

  public PRBranchInfo sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * Get sha
   *
   * @return sha
   **/
  @Schema(description = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PRBranchInfo prBranchInfo = (PRBranchInfo) o;
    return Objects.equals(this.label, prBranchInfo.label) &&
           Objects.equals(this.ref, prBranchInfo.ref) &&
           Objects.equals(this.repo, prBranchInfo.repo) &&
           Objects.equals(this.repoId, prBranchInfo.repoId) &&
           Objects.equals(this.sha, prBranchInfo.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, ref, repo, repoId, sha);
  }


  @Override
  public String toString() {

    String sb = "class PRBranchInfo {\n" +
                "    label: " + toIndentedString(label) + "\n" +
                "    ref: " + toIndentedString(ref) + "\n" +
                "    repo: " + toIndentedString(repo) + "\n" +
                "    repoId: " + toIndentedString(repoId) + "\n" +
                "    sha: " + toIndentedString(sha) + "\n" +
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