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
 * PublicKey publickey is a user key to push code to repository
 */
@Schema(description = "PublicKey publickey is a user key to push code to repository")
public class PublicKey {
  @SerializedName("created_at")
  private OffsetDateTime createdAt;

  @SerializedName("fingerprint")
  private String fingerprint;

  @SerializedName("id")
  private Long id;

  @SerializedName("key")
  private String key;

  @SerializedName("key_type")
  private String keyType;

  @SerializedName("read_only")
  private Boolean readOnly;

  @SerializedName("title")
  private String title;

  @SerializedName("url")
  private String url;

  @SerializedName("user")
  private User user;

  public PublicKey createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PublicKey fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   *
   * @return fingerprint
   **/
  @Schema(description = "")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public PublicKey id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PublicKey key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   *
   * @return key
   **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PublicKey keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   *
   * @return keyType
   **/
  @Schema(description = "")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public PublicKey readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   *
   * @return readOnly
   **/
  @Schema(description = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public PublicKey title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PublicKey url(String url) {
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

  public PublicKey user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   **/
  @Schema(description = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKey publicKey = (PublicKey) o;
    return Objects.equals(this.createdAt, publicKey.createdAt) &&
           Objects.equals(this.fingerprint, publicKey.fingerprint) &&
           Objects.equals(this.id, publicKey.id) &&
           Objects.equals(this.key, publicKey.key) &&
           Objects.equals(this.keyType, publicKey.keyType) &&
           Objects.equals(this.readOnly, publicKey.readOnly) &&
           Objects.equals(this.title, publicKey.title) &&
           Objects.equals(this.url, publicKey.url) &&
           Objects.equals(this.user, publicKey.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, fingerprint, id, key, keyType, readOnly, title, url, user);
  }


  @Override
  public String toString() {

    String sb = "class PublicKey {\n" +
                "    createdAt: " + toIndentedString(createdAt) + "\n" +
                "    fingerprint: " + toIndentedString(fingerprint) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    key: " + toIndentedString(key) + "\n" +
                "    keyType: " + toIndentedString(keyType) + "\n" +
                "    readOnly: " + toIndentedString(readOnly) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "    url: " + toIndentedString(url) + "\n" +
                "    user: " + toIndentedString(user) + "\n" +
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