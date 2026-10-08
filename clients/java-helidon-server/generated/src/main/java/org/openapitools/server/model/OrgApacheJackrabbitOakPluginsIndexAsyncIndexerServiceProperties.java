package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties   {

    private ConfigNodePropertyArray asyncConfigs;
    private ConfigNodePropertyInteger leaseTimeOutMinutes;
    private ConfigNodePropertyInteger failingIndexTimeoutSeconds;
    private ConfigNodePropertyInteger errorWarnIntervalSeconds;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
     *
     * @param asyncConfigs asyncConfigs
     * @param leaseTimeOutMinutes leaseTimeOutMinutes
     * @param failingIndexTimeoutSeconds failingIndexTimeoutSeconds
     * @param errorWarnIntervalSeconds errorWarnIntervalSeconds
     */
    public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
        ConfigNodePropertyArray asyncConfigs, 
        ConfigNodePropertyInteger leaseTimeOutMinutes, 
        ConfigNodePropertyInteger failingIndexTimeoutSeconds, 
        ConfigNodePropertyInteger errorWarnIntervalSeconds
    ) {
        this.asyncConfigs = asyncConfigs;
        this.leaseTimeOutMinutes = leaseTimeOutMinutes;
        this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
        this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
    }



    /**
     * Get asyncConfigs
     * @return asyncConfigs
     */
    public ConfigNodePropertyArray getAsyncConfigs() {
        return asyncConfigs;
    }

    public void setAsyncConfigs(ConfigNodePropertyArray asyncConfigs) {
        this.asyncConfigs = asyncConfigs;
    }

    /**
     * Get leaseTimeOutMinutes
     * @return leaseTimeOutMinutes
     */
    public ConfigNodePropertyInteger getLeaseTimeOutMinutes() {
        return leaseTimeOutMinutes;
    }

    public void setLeaseTimeOutMinutes(ConfigNodePropertyInteger leaseTimeOutMinutes) {
        this.leaseTimeOutMinutes = leaseTimeOutMinutes;
    }

    /**
     * Get failingIndexTimeoutSeconds
     * @return failingIndexTimeoutSeconds
     */
    public ConfigNodePropertyInteger getFailingIndexTimeoutSeconds() {
        return failingIndexTimeoutSeconds;
    }

    public void setFailingIndexTimeoutSeconds(ConfigNodePropertyInteger failingIndexTimeoutSeconds) {
        this.failingIndexTimeoutSeconds = failingIndexTimeoutSeconds;
    }

    /**
     * Get errorWarnIntervalSeconds
     * @return errorWarnIntervalSeconds
     */
    public ConfigNodePropertyInteger getErrorWarnIntervalSeconds() {
        return errorWarnIntervalSeconds;
    }

    public void setErrorWarnIntervalSeconds(ConfigNodePropertyInteger errorWarnIntervalSeconds) {
        this.errorWarnIntervalSeconds = errorWarnIntervalSeconds;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

