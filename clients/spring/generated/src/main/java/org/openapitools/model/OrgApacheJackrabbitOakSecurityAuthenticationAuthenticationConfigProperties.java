package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName;

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationAppName(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
    return this;
  }

  /**
   * Get orgApacheJackrabbitOakAuthenticationAppName
   * @return orgApacheJackrabbitOakAuthenticationAppName
   */
  @Valid 
  @Schema(name = "org.apache.jackrabbit.oak.authentication.appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  public @Nullable ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
    return orgApacheJackrabbitOakAuthenticationAppName;
  }

  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  public void setOrgApacheJackrabbitOakAuthenticationAppName(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationConfigSpiName(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
    return this;
  }

  /**
   * Get orgApacheJackrabbitOakAuthenticationConfigSpiName
   * @return orgApacheJackrabbitOakAuthenticationConfigSpiName
   */
  @Valid 
  @Schema(name = "org.apache.jackrabbit.oak.authentication.configSpiName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  public @Nullable ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationConfigSpiName() {
    return orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  public void setOrgApacheJackrabbitOakAuthenticationConfigSpiName(@Nullable ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties = (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties) o;
    return Objects.equals(this.orgApacheJackrabbitOakAuthenticationAppName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationAppName) &&
        Objects.equals(this.orgApacheJackrabbitOakAuthenticationConfigSpiName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationConfigSpiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheJackrabbitOakAuthenticationAppName, orgApacheJackrabbitOakAuthenticationConfigSpiName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {\n");
    sb.append("    orgApacheJackrabbitOakAuthenticationAppName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationAppName)).append("\n");
    sb.append("    orgApacheJackrabbitOakAuthenticationConfigSpiName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationConfigSpiName)).append("\n");
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

