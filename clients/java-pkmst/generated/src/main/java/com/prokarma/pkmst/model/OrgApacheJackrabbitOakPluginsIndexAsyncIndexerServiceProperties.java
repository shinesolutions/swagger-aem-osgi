package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties   {
  @JsonProperty("asyncConfigs")
  private ConfigNodePropertyArray asyncConfigs = null;

  @JsonProperty("leaseTimeOutMinutes")
  private ConfigNodePropertyInteger leaseTimeOutMinutes = null;

  @JsonProperty("failingIndexTimeoutSeconds")
  private ConfigNodePropertyInteger failingIndexTimeoutSeconds = null;

  @JsonProperty("errorWarnIntervalSeconds")
  private ConfigNodePropertyInteger errorWarnIntervalSeconds = null;

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties asyncConfigs(ConfigNodePropertyArray asyncConfigs) {
    this.asyncConfigs = asyncConfigs;
    return this;
  }

   /**
   * Get asyncConfigs
   * @return asyncConfigs
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getErrorWarnIntervalSeconds() {
    return errorWarnIntervalSeconds;
  }

  public void setErrorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds) {
    this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

