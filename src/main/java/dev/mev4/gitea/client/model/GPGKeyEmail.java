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
 * GPGKeyEmail an email attached to a GPGKey
 */
@Schema(description = "GPGKeyEmail an email attached to a GPGKey")
public class GPGKeyEmail {
  @SerializedName("email")
  private String email;

  @SerializedName("verified")
  private Boolean verified;

  public GPGKeyEmail email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GPGKeyEmail verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   *
   * @return verified
   **/
  @Schema(description = "")
  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GPGKeyEmail gpGKeyEmail = (GPGKeyEmail) o;
    return Objects.equals(this.email, gpGKeyEmail.email) &&
           Objects.equals(this.verified, gpGKeyEmail.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, verified);
  }


  @Override
  public String toString() {

    String sb = "class GPGKeyEmail {\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    verified: " + toIndentedString(verified) + "\n" +
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
