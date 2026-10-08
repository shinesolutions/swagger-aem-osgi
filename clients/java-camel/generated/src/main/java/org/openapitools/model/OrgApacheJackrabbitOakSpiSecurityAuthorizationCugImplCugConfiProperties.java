package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {

  private ConfigNodePropertyArray cugSupportedPaths;

  private ConfigNodePropertyBoolean cugEnabled;

  private ConfigNodePropertyInteger configurationRanking;

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
    return this;
  }

  /**
   * Get cugSupportedPaths
   * @return cugSupportedPaths
   */
  @Valid 
  @Schema(name = "cugSupportedPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cugSupportedPaths")
  public ConfigNodePropertyArray getCugSupportedPaths() {
    return cugSupportedPaths;
  }

  public void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

  /**
   * Get cugEnabled
   * @return cugEnabled
   */
  @Valid 
  @Schema(name = "cugEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cugEnabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
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
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
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
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties) o;
    return Objects.equals(this.cugSupportedPaths, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugSupportedPaths) &&
        Objects.equals(this.cugEnabled, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.cugEnabled) &&
        Objects.equals(this.configurationRanking, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.configurationRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cugSupportedPaths, cugEnabled, configurationRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
    sb.append("    cugSupportedPaths: ").append(toIndentedString(cugSupportedPaths)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

