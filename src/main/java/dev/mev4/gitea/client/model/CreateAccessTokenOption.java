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
 * CreateAccessTokenOption options when create access token
 */
@Schema(description = "CreateAccessTokenOption options when create access token")
public class CreateAccessTokenOption {
  @SerializedName("name")
  private String name;

  @SerializedName("scopes")
  private List<String> scopes;

  public CreateAccessTokenOption name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateAccessTokenOption scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public CreateAccessTokenOption addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   *
   * @return scopes
   **/
  @Schema(description = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccessTokenOption createAccessTokenOption = (CreateAccessTokenOption) o;
    return Objects.equals(this.name, createAccessTokenOption.name) &&
           Objects.equals(this.scopes, createAccessTokenOption.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopes);
  }


  @Override
  public String toString() {

    String sb = "class CreateAccessTokenOption {\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    scopes: " + toIndentedString(scopes) + "\n" +
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