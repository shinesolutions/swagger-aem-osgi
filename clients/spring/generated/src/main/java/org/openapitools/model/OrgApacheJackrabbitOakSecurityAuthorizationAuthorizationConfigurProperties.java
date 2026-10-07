package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown permissionsJr2;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown importBehavior;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray readPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray administrativePrincipals;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger configurationRanking;

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties permissionsJr2(@Nullable ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
    return this;
  }

  /**
   * Get permissionsJr2
   * @return permissionsJr2
   */
  @Valid 
  @Schema(name = "permissionsJr2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionsJr2")
  public @Nullable ConfigNodePropertyDropDown getPermissionsJr2() {
    return permissionsJr2;
  }

  @JsonProperty("permissionsJr2")
  public void setPermissionsJr2(@Nullable ConfigNodePropertyDropDown permissionsJr2) {
    this.permissionsJr2 = permissionsJr2;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties importBehavior(@Nullable ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
    return this;
  }

  /**
   * Get importBehavior
   * @return importBehavior
   */
  @Valid 
  @Schema(name = "importBehavior", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importBehavior")
  public @Nullable ConfigNodePropertyDropDown getImportBehavior() {
    return importBehavior;
  }

  @JsonProperty("importBehavior")
  public void setImportBehavior(@Nullable ConfigNodePropertyDropDown importBehavior) {
    this.importBehavior = importBehavior;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties readPaths(@Nullable ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
    return this;
  }

  /**
   * Get readPaths
   * @return readPaths
   */
  @Valid 
  @Schema(name = "readPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readPaths")
  public @Nullable ConfigNodePropertyArray getReadPaths() {
    return readPaths;
  }

  @JsonProperty("readPaths")
  public void setReadPaths(@Nullable ConfigNodePropertyArray readPaths) {
    this.readPaths = readPaths;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties administrativePrincipals(@Nullable ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
    return this;
  }

  /**
   * Get administrativePrincipals
   * @return administrativePrincipals
   */
  @Valid 
  @Schema(name = "administrativePrincipals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("administrativePrincipals")
  public @Nullable ConfigNodePropertyArray getAdministrativePrincipals() {
    return administrativePrincipals;
  }

  @JsonProperty("administrativePrincipals")
  public void setAdministrativePrincipals(@Nullable ConfigNodePropertyArray administrativePrincipals) {
    this.administrativePrincipals = administrativePrincipals;
  }

  public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties configurationRanking(@Nullable ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }

  /**
   * Get configurationRanking
   * @return configurationRanking
   */
  @Valid 
  @Schema(name = "configurationRanking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configurationRanking")
  public @Nullable ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  @JsonProperty("configurationRanking")
  public void setConfigurationRanking(@Nullable ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties = (OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties) o;
    return Objects.equals(this.permissionsJr2, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.permissionsJr2) &&
        Objects.equals(this.importBehavior, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.importBehavior) &&
        Objects.equals(this.readPaths, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.readPaths) &&
        Objects.equals(this.administrativePrincipals, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.administrativePrincipals) &&
        Objects.equals(this.configurationRanking, orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.configurationRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsJr2, importBehavior, readPaths, administrativePrincipals, configurationRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {\n");
    sb.append("    permissionsJr2: ").append(toIndentedString(permissionsJr2)).append("\n");
    sb.append("    importBehavior: ").append(toIndentedString(importBehavior)).append("\n");
    sb.append("    readPaths: ").append(toIndentedString(readPaths)).append("\n");
    sb.append("    administrativePrincipals: ").append(toIndentedString(administrativePrincipals)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

