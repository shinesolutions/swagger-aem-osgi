package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {

  private ConfigNodePropertyArray asyncConfigs;

  private ConfigNodePropertyInteger leaseTimeOutMinutes;

  private ConfigNodePropertyInteger failingIndexTimeoutSeconds;

  private ConfigNodePropertyInteger errorWarnIntervalSeconds;

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties asyncConfigs(ConfigNodePropertyArray asyncConfigs) {
    this.asyncConfigs = asyncConfigs;
    return this;
  }

  /**
   * Get asyncConfigs
   * @return asyncConfigs
   */
  @Valid 
  @Schema(name = "asyncConfigs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asyncConfigs")
  public ConfigNodePropertyArray getAsyncConfigs() {
    return asyncConfigs;
  }

  public void setAsyncConfigs(ConfigNodePropertyArray asyncConfigs) {
    this.asyncConfigs = asyncConfigs;
  }

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties leaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes) {
    this.leaseTimeOutMinutes = leaseTimeOutMinutes;
    return this;
  }

  /**
   * Get leaseTimeOutMinutes
   * @return leaseTimeOutMinutes
   */
  @Valid 
  @Schema(name = "leaseTimeOutMinutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaseTimeOutMinutes")
  public ConfigNodePropertyInteger getLeaseTimeOutMinutes() {
    return leaseTimeOutMinutes;
  }

  public void setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes) {
    this.leaseTimeOutMinutes = leaseTimeOutMinutes;
  }

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties failingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds) {
    this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
    return this;
  }

  /**
   * Get failingIndexTimeoutSeconds
   * @return failingIndexTimeoutSeconds
   */
  @Valid 
  @Schema(name = "failingIndexTimeoutSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failingIndexTimeoutSeconds")
  public ConfigNodePropertyInteger getFailingIndexTimeoutSeconds() {
    return failingIndexTimeoutSeconds;
  }

  public void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds) {
    this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
  }

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties errorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds) {
    this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
    return this;
  }

  /**
   * Get errorWarnIntervalSeconds
   * @return errorWarnIntervalSeconds
   */
  @Valid 
  @Schema(name = "errorWarnIntervalSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorWarnIntervalSeconds")
  public ConfigNodePropertyInteger getErrorWarnIntervalSeconds() {
    return errorWarnIntervalSeconds;
  }

  public void setErrorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds) {
    this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties = (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties) o;
    return Objects.equals(this.asyncConfigs, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.asyncConfigs) &&
        Objects.equals(this.leaseTimeOutMinutes, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.leaseTimeOutMinutes) &&
        Objects.equals(this.failingIndexTimeoutSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.failingIndexTimeoutSeconds) &&
        Objects.equals(this.errorWarnIntervalSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.errorWarnIntervalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncConfigs, leaseTimeOutMinutes, failingIndexTimeoutSeconds, errorWarnIntervalSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {\n");
    sb.append("    asyncConfigs: ").append(toIndentedString(asyncConfigs)).append("\n");
    sb.append("    leaseTimeOutMinutes: ").append(toIndentedString(leaseTimeOutMinutes)).append("\n");
    sb.append("    failingIndexTimeoutSeconds: ").append(toIndentedString(failingIndexTimeoutSeconds)).append("\n");
    sb.append("    errorWarnIntervalSeconds: ").append(toIndentedString(errorWarnIntervalSeconds)).append("\n");
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

