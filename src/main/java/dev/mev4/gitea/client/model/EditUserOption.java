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
 * EditUserOption edit user options
 */
@Schema(description = "EditUserOption edit user options")
public class EditUserOption {
  @SerializedName("active")
  private Boolean active;

  @SerializedName("admin")
  private Boolean admin;

  @SerializedName("allow_create_organization")
  private Boolean allowCreateOrganization;

  @SerializedName("allow_git_hook")
  private Boolean allowGitHook;

  @SerializedName("allow_import_local")
  private Boolean allowImportLocal;

  @SerializedName("description")
  private String description;

  @SerializedName("email")
  private String email;

  @SerializedName("full_name")
  private String fullName;

  @SerializedName("location")
  private String location;

  @SerializedName("login_name")
  private String loginName;

  @SerializedName("max_repo_creation")
  private Long maxRepoCreation;

  @SerializedName("must_change_password")
  private Boolean mustChangePassword;

  @SerializedName("password")
  private String password;

  @SerializedName("prohibit_login")
  private Boolean prohibitLogin;

  @SerializedName("restricted")
  private Boolean restricted;

  @SerializedName("source_id")
  private Long sourceId;

  @SerializedName("visibility")
  private String visibility;

  @SerializedName("website")
  private String website;

  public EditUserOption active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   *
   * @return active
   **/
  @Schema(description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public EditUserOption admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin
   *
   * @return admin
   **/
  @Schema(description = "")
  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public EditUserOption allowCreateOrganization(Boolean allowCreateOrganization) {
    this.allowCreateOrganization = allowCreateOrganization;
    return this;
  }

  /**
   * Get allowCreateOrganization
   *
   * @return allowCreateOrganization
   **/
  @Schema(description = "")
  public Boolean isAllowCreateOrganization() {
    return allowCreateOrganization;
  }

  public void setAllowCreateOrganization(Boolean allowCreateOrganization) {
    this.allowCreateOrganization = allowCreateOrganization;
  }

  public EditUserOption allowGitHook(Boolean allowGitHook) {
    this.allowGitHook = allowGitHook;
    return this;
  }

  /**
   * Get allowGitHook
   *
   * @return allowGitHook
   **/
  @Schema(description = "")
  public Boolean isAllowGitHook() {
    return allowGitHook;
  }

  public void setAllowGitHook(Boolean allowGitHook) {
    this.allowGitHook = allowGitHook;
  }

  public EditUserOption allowImportLocal(Boolean allowImportLocal) {
    this.allowImportLocal = allowImportLocal;
    return this;
  }

  /**
   * Get allowImportLocal
   *
   * @return allowImportLocal
   **/
  @Schema(description = "")
  public Boolean isAllowImportLocal() {
    return allowImportLocal;
  }

  public void setAllowImportLocal(Boolean allowImportLocal) {
    this.allowImportLocal = allowImportLocal;
  }

  public EditUserOption description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EditUserOption email(String email) {
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

  public EditUserOption fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   *
   * @return fullName
   **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public EditUserOption location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   *
   * @return location
   **/
  @Schema(description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public EditUserOption loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

  /**
   * Get loginName
   *
   * @return loginName
   **/
  @Schema(required = true, description = "")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public EditUserOption maxRepoCreation(Long maxRepoCreation) {
    this.maxRepoCreation = maxRepoCreation;
    return this;
  }

  /**
   * Get maxRepoCreation
   *
   * @return maxRepoCreation
   **/
  @Schema(description = "")
  public Long getMaxRepoCreation() {
    return maxRepoCreation;
  }

  public void setMaxRepoCreation(Long maxRepoCreation) {
    this.maxRepoCreation = maxRepoCreation;
  }

  public EditUserOption mustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
    return this;
  }

  /**
   * Get mustChangePassword
   *
   * @return mustChangePassword
   **/
  @Schema(description = "")
  public Boolean isMustChangePassword() {
    return mustChangePassword;
  }

  public void setMustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
  }

  public EditUserOption password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   *
   * @return password
   **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EditUserOption prohibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
    return this;
  }

  /**
   * Get prohibitLogin
   *
   * @return prohibitLogin
   **/
  @Schema(description = "")
  public Boolean isProhibitLogin() {
    return prohibitLogin;
  }

  public void setProhibitLogin(Boolean prohibitLogin) {
    this.prohibitLogin = prohibitLogin;
  }

  public EditUserOption restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * Get restricted
   *
   * @return restricted
   **/
  @Schema(description = "")
  public Boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public EditUserOption sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * Get sourceId
   *
   * @return sourceId
   **/
  @Schema(required = true, description = "")
  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  public EditUserOption visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   *
   * @return visibility
   **/
  @Schema(description = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public EditUserOption website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   *
   * @return website
   **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditUserOption editUserOption = (EditUserOption) o;
    return Objects.equals(this.active, editUserOption.active) &&
           Objects.equals(this.admin, editUserOption.admin) &&
           Objects.equals(this.allowCreateOrganization, editUserOption.allowCreateOrganization) &&
           Objects.equals(this.allowGitHook, editUserOption.allowGitHook) &&
           Objects.equals(this.allowImportLocal, editUserOption.allowImportLocal) &&
           Objects.equals(this.description, editUserOption.description) &&
           Objects.equals(this.email, editUserOption.email) &&
           Objects.equals(this.fullName, editUserOption.fullName) &&
           Objects.equals(this.location, editUserOption.location) &&
           Objects.equals(this.loginName, editUserOption.loginName) &&
           Objects.equals(this.maxRepoCreation, editUserOption.maxRepoCreation) &&
           Objects.equals(this.mustChangePassword, editUserOption.mustChangePassword) &&
           Objects.equals(this.password, editUserOption.password) &&
           Objects.equals(this.prohibitLogin, editUserOption.prohibitLogin) &&
           Objects.equals(this.restricted, editUserOption.restricted) &&
           Objects.equals(this.sourceId, editUserOption.sourceId) &&
           Objects.equals(this.visibility, editUserOption.visibility) &&
           Objects.equals(this.website, editUserOption.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, admin, allowCreateOrganization, allowGitHook, allowImportLocal, description, email, fullName, location, loginName, maxRepoCreation, mustChangePassword, password, prohibitLogin, restricted, sourceId, visibility, website);
  }


  @Override
  public String toString() {

    String sb = "class EditUserOption {\n" +
                "    active: " + toIndentedString(active) + "\n" +
                "    admin: " + toIndentedString(admin) + "\n" +
                "    allowCreateOrganization: " + toIndentedString(allowCreateOrganization) + "\n" +
                "    allowGitHook: " + toIndentedString(allowGitHook) + "\n" +
                "    allowImportLocal: " + toIndentedString(allowImportLocal) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    fullName: " + toIndentedString(fullName) + "\n" +
                "    location: " + toIndentedString(location) + "\n" +
                "    loginName: " + toIndentedString(loginName) + "\n" +
                "    maxRepoCreation: " + toIndentedString(maxRepoCreation) + "\n" +
                "    mustChangePassword: " + toIndentedString(mustChangePassword) + "\n" +
                "    password: " + toIndentedString(password) + "\n" +
                "    prohibitLogin: " + toIndentedString(prohibitLogin) + "\n" +
                "    restricted: " + toIndentedString(restricted) + "\n" +
                "    sourceId: " + toIndentedString(sourceId) + "\n" +
                "    visibility: " + toIndentedString(visibility) + "\n" +
                "    website: " + toIndentedString(website) + "\n" +
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