package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties   {
  

  private ConfigNodePropertyArray asyncConfigs = null;

  private ConfigNodePropertyInteger leaseTimeOutMinutes = null;

  private ConfigNodePropertyInteger failingIndexTimeoutSeconds = null;

  private ConfigNodePropertyInteger errorWarnIntervalSeconds = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asyncConfigs")
  public ConfigNodePropertyArray getAsyncConfigs() {
    return asyncConfigs;
  }
  public void setAsyncConfigs(ConfigNodePropertyArray asyncConfigs) {
    this.asyncConfigs = asyncConfigs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("leaseTimeOutMinutes")
  public ConfigNodePropertyInteger getLeaseTimeOutMinutes() {
    return leaseTimeOutMinutes;
  }
  public void setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes) {
    this.leaseTimeOutMinutes = leaseTimeOutMinutes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("failingIndexTimeoutSeconds")
  public ConfigNodePropertyInteger getFailingIndexTimeoutSeconds() {
    return failingIndexTimeoutSeconds;
  }
  public void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds) {
    this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(asyncConfigs, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.asyncConfigs) &&
        Objects.equals(leaseTimeOutMinutes, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.leaseTimeOutMinutes) &&
        Objects.equals(failingIndexTimeoutSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.failingIndexTimeoutSeconds) &&
        Objects.equals(errorWarnIntervalSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.errorWarnIntervalSeconds);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

