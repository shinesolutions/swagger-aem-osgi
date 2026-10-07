package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties   {

    private ConfigNodePropertyInteger timeoutInMs;
    private ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs;
    private ConfigNodePropertyInteger resultCacheTtlInMs;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties.
     *
     * @param timeoutInMs timeoutInMs
     * @param longRunningFutureThresholdForCriticalMs longRunningFutureThresholdForCriticalMs
     * @param resultCacheTtlInMs resultCacheTtlInMs
     */
    public OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(
        ConfigNodePropertyInteger timeoutInMs, 
        ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs, 
        ConfigNodePropertyInteger resultCacheTtlInMs
    ) {
        this.timeoutInMs = timeoutInMs;
        this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
        this.resultCacheTtlInMs = resultCacheTtlInMs;
    }



    /**
     * Get timeoutInMs
     * @return timeoutInMs
     */
    public ConfigNodePropertyInteger getTimeoutInMs() {
        return timeoutInMs;
    }

    public void setTimeoutInMs(ConfigNodePropertyInteger timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
    }

    /**
     * Get longRunningFutureThresholdForCriticalMs
     * @return longRunningFutureThresholdForCriticalMs
     */
    public ConfigNodePropertyInteger getLongRunningFutureThresholdForCriticalMs() {
        return longRunningFutureThresholdForCriticalMs;
    }

    public void setLongRunningFutureThresholdForCriticalMs(ConfigNodePropertyInteger longRunningFutureThresholdForCriticalMs) {
        this.longRunningFutureThresholdForCriticalMs = longRunningFutureThresholdForCriticalMs;
    }

    /**
     * Get resultCacheTtlInMs
     * @return resultCacheTtlInMs
     */
    public ConfigNodePropertyInteger getResultCacheTtlInMs() {
        return resultCacheTtlInMs;
    }

    public void setResultCacheTtlInMs(ConfigNodePropertyInteger resultCacheTtlInMs) {
        this.resultCacheTtlInMs = resultCacheTtlInMs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {\n");
        
        sb.append("    timeoutInMs: ").append(toIndentedString(timeoutInMs)).append("\n");
        sb.append("    longRunningFutureThresholdForCriticalMs: ").append(toIndentedString(longRunningFutureThresholdForCriticalMs)).append("\n");
        sb.append("    resultCacheTtlInMs: ").append(toIndentedString(resultCacheTtlInMs)).append("\n");
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

