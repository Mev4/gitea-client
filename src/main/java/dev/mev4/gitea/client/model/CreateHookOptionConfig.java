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

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.HashMap;
import java.util.Objects;

/**
 * CreateHookOptionConfig has all config options in it required are \&quot;content_type\&quot; and \&quot;url\&quot; Required
 */
@Schema(description = "CreateHookOptionConfig has all config options in it required are \"content_type\" and \"url\" Required")
public class CreateHookOptionConfig extends HashMap<String, String> {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    String sb = "class CreateHookOptionConfig {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
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