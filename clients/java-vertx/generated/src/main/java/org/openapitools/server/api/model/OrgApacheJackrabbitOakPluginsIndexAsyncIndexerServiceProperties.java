package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties   {
  
  private ConfigNodePropertyArray asyncConfigs = null;
  private ConfigNodePropertyInteger leaseTimeOutMinutes = null;
  private ConfigNodePropertyInteger failingIndexTimeoutSeconds = null;
  private ConfigNodePropertyInteger errorWarnIntervalSeconds = null;

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties () {

  }

  public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties (ConfigNodePropertyArray asyncConfigs, ConfigNodePropertyInteger leaseTimeOutMinutes, ConfigNodePropertyInteger failingIndexTimeoutSeconds, ConfigNodePropertyInteger errorWarnIntervalSeconds) {
    this.asyncConfigs = asyncConfigs;
    this.leaseTimeOutMinutes = leaseTimeOutMinutes;
    this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
    this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
  }

    
  @JsonProperty("asyncConfigs")
  public ConfigNodePropertyArray getAsyncConfigs() {
    return asyncConfigs;
  }
  public void setAsyncConfigs(ConfigNodePropertyArray asyncConfigs) {
    this.asyncConfigs = asyncConfigs;
  }

    
  @JsonProperty("leaseTimeOutMinutes")
  public ConfigNodePropertyInteger getLeaseTimeOutMinutes() {
    return leaseTimeOutMinutes;
  }
  public void setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes) {
    this.leaseTimeOutMinutes = leaseTimeOutMinutes;
  }

    
  @JsonProperty("failingIndexTimeoutSeconds")
  public ConfigNodePropertyInteger getFailingIndexTimeoutSeconds() {
    return failingIndexTimeoutSeconds;
  }
  public void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds) {
    this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
  }

    
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
