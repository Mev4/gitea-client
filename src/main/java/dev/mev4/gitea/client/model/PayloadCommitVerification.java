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
 * PayloadCommitVerification represents the GPG verification of a commit
 */
@Schema(description = "PayloadCommitVerification represents the GPG verification of a commit")
public class PayloadCommitVerification {
  @SerializedName("payload")
  private String payload;

  @SerializedName("reason")
  private String reason;

  @SerializedName("signature")
  private String signature;

  @SerializedName("signer")
  private PayloadUser signer;

  @SerializedName("verified")
  private Boolean verified;

  public PayloadCommitVerification payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   *
   * @return payload
   **/
  @Schema(description = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public PayloadCommitVerification reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   *
   * @return reason
   **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PayloadCommitVerification signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   *
   * @return signature
   **/
  @Schema(description = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public PayloadCommitVerification signer(PayloadUser signer) {
    this.signer = signer;
    return this;
  }

  /**
   * Get signer
   *
   * @return signer
   **/
  @Schema(description = "")
  public PayloadUser getSigner() {
    return signer;
  }

  public void setSigner(PayloadUser signer) {
    this.signer = signer;
  }

  public PayloadCommitVerification verified(Boolean verified) {
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
    PayloadCommitVerification payloadCommitVerification = (PayloadCommitVerification) o;
    return Objects.equals(this.payload, payloadCommitVerification.payload) &&
           Objects.equals(this.reason, payloadCommitVerification.reason) &&
           Objects.equals(this.signature, payloadCommitVerification.signature) &&
           Objects.equals(this.signer, payloadCommitVerification.signer) &&
           Objects.equals(this.verified, payloadCommitVerification.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, reason, signature, signer, verified);
  }


  @Override
  public String toString() {

    String sb = "class PayloadCommitVerification {\n" +
                "    payload: " + toIndentedString(payload) + "\n" +
                "    reason: " + toIndentedString(reason) + "\n" +
                "    signature: " + toIndentedString(signature) + "\n" +
                "    signer: " + toIndentedString(signer) + "\n" +
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