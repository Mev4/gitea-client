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
 * UpdateUserAvatarUserOption options when updating the user avatar
 */
@Schema(description = "UpdateUserAvatarUserOption options when updating the user avatar")
public class UpdateUserAvatarOption {
  @SerializedName("image")
  private String image;

  public UpdateUserAvatarOption image(String image) {
    this.image = image;
    return this;
  }

  /**
   * image must be base64 encoded
   *
   * @return image
   **/
  @Schema(description = "image must be base64 encoded")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserAvatarOption updateUserAvatarOption = (UpdateUserAvatarOption) o;
    return Objects.equals(this.image, updateUserAvatarOption.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }


  @Override
  public String toString() {

    String sb = "class UpdateUserAvatarOption {\n" +
                "    image: " + toIndentedString(image) + "\n" +
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
