package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamIdsImplIDSPoolManagerImplProperties   {

    private ConfigNodePropertyInteger maxErrorsToBlacklist;
    private ConfigNodePropertyInteger retryIntervalToWhitelist;
    private ConfigNodePropertyInteger connectTimeout;
    private ConfigNodePropertyInteger socketTimeout;
    private ConfigNodePropertyString processLabel;
    private ConfigNodePropertyInteger connectionUseMax;

    /**
     * Default constructor.
     */
    public ComDayCqDamIdsImplIDSPoolManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamIdsImplIDSPoolManagerImplProperties.
     *
     * @param maxErrorsToBlacklist maxErrorsToBlacklist
     * @param retryIntervalToWhitelist retryIntervalToWhitelist
     * @param connectTimeout connectTimeout
     * @param socketTimeout socketTimeout
     * @param processLabel processLabel
     * @param connectionUseMax connectionUseMax
     */
    public ComDayCqDamIdsImplIDSPoolManagerImplProperties(
        ConfigNodePropertyInteger maxErrorsToBlacklist, 
        ConfigNodePropertyInteger retryIntervalToWhitelist, 
        ConfigNodePropertyInteger connectTimeout, 
        ConfigNodePropertyInteger socketTimeout, 
        ConfigNodePropertyString processLabel, 
        ConfigNodePropertyInteger connectionUseMax
    ) {
        this.maxErrorsToBlacklist = maxErrorsToBlacklist;
        this.retryIntervalToWhitelist = retryIntervalToWhitelist;
        this.connectTimeout = connectTimeout;
        this.socketTimeout = socketTimeout;
        this.processLabel = processLabel;
        this.connectionUseMax = connectionUseMax;
    }



    /**
     * Get maxErrorsToBlacklist
     * @return maxErrorsToBlacklist
     */
    public ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
        return maxErrorsToBlacklist;
    }

    public void setMaxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
        this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    }

    /**
     * Get retryIntervalToWhitelist
     * @return retryIntervalToWhitelist
     */
    public ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
        return retryIntervalToWhitelist;
    }

    public void setRetryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
        this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    }

    /**
     * Get connectTimeout
     * @return connectTimeout
     */
    public ConfigNodePropertyInteger getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(ConfigNodePropertyInteger connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Get socketTimeout
     * @return socketTimeout
     */
    public ConfigNodePropertyInteger getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
     * Get processLabel
     * @return processLabel
     */
    public ConfigNodePropertyString getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(ConfigNodePropertyString processLabel) {
        this.processLabel = processLabel;
    }

    /**
     * Get connectionUseMax
     * @return connectionUseMax
     */
    public ConfigNodePropertyInteger getConnectionUseMax() {
        return connectionUseMax;
    }

    public void setConnectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
        this.connectionUseMax = connectionUseMax;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamIdsImplIDSPoolManagerImplProperties {\n");
        
        sb.append("    maxErrorsToBlacklist: ").append(toIndentedString(maxErrorsToBlacklist)).append("\n");
        sb.append("    retryIntervalToWhitelist: ").append(toIndentedString(retryIntervalToWhitelist)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
        sb.append("    connectionUseMax: ").append(toIndentedString(connectionUseMax)).append("\n");
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

