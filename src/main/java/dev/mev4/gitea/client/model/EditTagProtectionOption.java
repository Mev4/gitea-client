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
 * EditTagProtectionOption options for editing a tag protection
 */
@Schema(description = "EditTagProtectionOption options for editing a tag protection")
public class EditTagProtectionOption {
  @SerializedName("name_pattern")
  private String namePattern;

  @SerializedName("whitelist_teams")
  private List<String> whitelistTeams;

  @SerializedName("whitelist_usernames")
  private List<String> whitelistUsernames;

  public EditTagProtectionOption namePattern(String namePattern) {
    this.namePattern = namePattern;
    return this;
  }

  /**
   * Get namePattern
   *
   * @return namePattern
   **/
  @Schema(description = "")
  public String getNamePattern() {
    return namePattern;
  }

  public void setNamePattern(String namePattern) {
    this.namePattern = namePattern;
  }

  public EditTagProtectionOption whitelistTeams(List<String> whitelistTeams) {
    this.whitelistTeams = whitelistTeams;
    return this;
  }

  public EditTagProtectionOption addWhitelistTeamsItem(String whitelistTeamsItem) {
    if (this.whitelistTeams == null) {
      this.whitelistTeams = new ArrayList<String>();
    }
    this.whitelistTeams.add(whitelistTeamsItem);
    return this;
  }

  /**
   * Get whitelistTeams
   *
   * @return whitelistTeams
   **/
  @Schema(description = "")
  public List<String> getWhitelistTeams() {
    return whitelistTeams;
  }

  public void setWhitelistTeams(List<String> whitelistTeams) {
    this.whitelistTeams = whitelistTeams;
  }

  public EditTagProtectionOption whitelistUsernames(List<String> whitelistUsernames) {
    this.whitelistUsernames = whitelistUsernames;
    return this;
  }

  public EditTagProtectionOption addWhitelistUsernamesItem(String whitelistUsernamesItem) {
    if (this.whitelistUsernames == null) {
      this.whitelistUsernames = new ArrayList<String>();
    }
    this.whitelistUsernames.add(whitelistUsernamesItem);
    return this;
  }

  /**
   * Get whitelistUsernames
   *
   * @return whitelistUsernames
   **/
  @Schema(description = "")
  public List<String> getWhitelistUsernames() {
    return whitelistUsernames;
  }

  public void setWhitelistUsernames(List<String> whitelistUsernames) {
    this.whitelistUsernames = whitelistUsernames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditTagProtectionOption editTagProtectionOption = (EditTagProtectionOption) o;
    return Objects.equals(this.namePattern, editTagProtectionOption.namePattern) &&
           Objects.equals(this.whitelistTeams, editTagProtectionOption.whitelistTeams) &&
           Objects.equals(this.whitelistUsernames, editTagProtectionOption.whitelistUsernames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namePattern, whitelistTeams, whitelistUsernames);
  }


  @Override
  public String toString() {

    String sb = "class EditTagProtectionOption {\n" +
                "    namePattern: " + toIndentedString(namePattern) + "\n" +
                "    whitelistTeams: " + toIndentedString(whitelistTeams) + "\n" +
                "    whitelistUsernames: " + toIndentedString(whitelistUsernames) + "\n" +
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