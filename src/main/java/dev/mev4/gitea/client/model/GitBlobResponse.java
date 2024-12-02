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
 * GitBlobResponse represents a git blob
 */
@Schema(description = "GitBlobResponse represents a git blob")
public class GitBlobResponse {
  @SerializedName("content")
  private String content;

  @SerializedName("encoding")
  private String encoding;

  @SerializedName("sha")
  private String sha;

  @SerializedName("size")
  private Long size;

  @SerializedName("url")
  private String url;

  public GitBlobResponse content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   **/
  @Schema(description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GitBlobResponse encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   *
   * @return encoding
   **/
  @Schema(description = "")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public GitBlobResponse sha(String sha) {
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

  public GitBlobResponse size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   *
   * @return size
   **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public GitBlobResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitBlobResponse gitBlobResponse = (GitBlobResponse) o;
    return Objects.equals(this.content, gitBlobResponse.content) &&
           Objects.equals(this.encoding, gitBlobResponse.encoding) &&
           Objects.equals(this.sha, gitBlobResponse.sha) &&
           Objects.equals(this.size, gitBlobResponse.size) &&
           Objects.equals(this.url, gitBlobResponse.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, encoding, sha, size, url);
  }


  @Override
  public String toString() {

    String sb = "class GitBlobResponse {\n" +
                "    content: " + toIndentedString(content) + "\n" +
                "    encoding: " + toIndentedString(encoding) + "\n" +
                "    sha: " + toIndentedString(sha) + "\n" +
                "    size: " + toIndentedString(size) + "\n" +
                "    url: " + toIndentedString(url) + "\n" +
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
