package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
    return Objects.equals(asyncConfigs, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.asyncConfigs) &&
        Objects.equals(leaseTimeOutMinutes, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.leaseTimeOutMinutes) &&
        Objects.equals(failingIndexTimeoutSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.failingIndexTimeoutSeconds) &&
        Objects.equals(errorWarnIntervalSeconds, orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.errorWarnIntervalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncConfigs, leaseTimeOutMinutes, failingIndexTimeoutSeconds, errorWarnIntervalSeconds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

