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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * ChangeFileOperation for creating, updating or deleting a file
 */
@Schema(description = "ChangeFileOperation for creating, updating or deleting a file")
public class ChangeFileOperation {
  @SerializedName("content")
  private String content;

  @SerializedName("from_path")
  private String fromPath;
  @SerializedName("operation")
  private OperationEnum operation;
  @SerializedName("path")
  private String path;
  @SerializedName("sha")
  private String sha;

  /**
   * indicates what to do with the file
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    @SerializedName("create")
    CREATE("create"),
    @SerializedName("update")
    UPDATE("update"),
    @SerializedName("delete")
    DELETE("delete");

    private final String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperationEnum.fromValue((String) (value));
      }
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String input) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
  }

  public ChangeFileOperation content(String content) {
    this.content = content;
    return this;
  }

  /**
   * new or updated file content, must be base64 encoded
   *
   * @return content
   **/
  @Schema(description = "new or updated file content, must be base64 encoded")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ChangeFileOperation fromPath(String fromPath) {
    this.fromPath = fromPath;
    return this;
  }

  /**
   * old path of the file to move
   *
   * @return fromPath
   **/
  @Schema(description = "old path of the file to move")
  public String getFromPath() {
    return fromPath;
  }

  public void setFromPath(String fromPath) {
    this.fromPath = fromPath;
  }

  public ChangeFileOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * indicates what to do with the file
   *
   * @return operation
   **/
  @Schema(required = true, description = "indicates what to do with the file")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public ChangeFileOperation path(String path) {
    this.path = path;
    return this;
  }

  /**
   * path to the existing or new file
   *
   * @return path
   **/
  @Schema(required = true, description = "path to the existing or new file")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ChangeFileOperation sha(String sha) {
    this.sha = sha;
    return this;
  }

  /**
   * sha is the SHA for the file that already exists, required for update or delete
   *
   * @return sha
   **/
  @Schema(description = "sha is the SHA for the file that already exists, required for update or delete")
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
    ChangeFileOperation changeFileOperation = (ChangeFileOperation) o;
    return Objects.equals(this.content, changeFileOperation.content) &&
           Objects.equals(this.fromPath, changeFileOperation.fromPath) &&
           this.operation == changeFileOperation.operation &&
           Objects.equals(this.path, changeFileOperation.path) &&
           Objects.equals(this.sha, changeFileOperation.sha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, fromPath, operation, path, sha);
  }


  @Override
  public String toString() {

    String sb = "class ChangeFileOperation {\n" +
                "    content: " + toIndentedString(content) + "\n" +
                "    fromPath: " + toIndentedString(fromPath) + "\n" +
                "    operation: " + toIndentedString(operation) + "\n" +
                "    path: " + toIndentedString(path) + "\n" +
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
