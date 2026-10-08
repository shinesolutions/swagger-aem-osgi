package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyInteger minThreadPoolSize;
    private ConfigNodePropertyInteger maxThreadPoolSize;
    private ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate;
    private ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList;

    /**
     * Default constructor.
     */
    public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
     *
     * @param eventFilter eventFilter
     * @param minThreadPoolSize minThreadPoolSize
     * @param maxThreadPoolSize maxThreadPoolSize
     * @param cqWcmWorkflowTerminateOnActivate cqWcmWorkflowTerminateOnActivate
     * @param cqWcmWorklfowTerminateExclusionList cqWcmWorklfowTerminateExclusionList
     */
    public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyInteger minThreadPoolSize, 
        ConfigNodePropertyInteger maxThreadPoolSize, 
        ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate, 
        ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList
    ) {
        this.eventFilter = eventFilter;
        this.minThreadPoolSize = minThreadPoolSize;
        this.maxThreadPoolSize = maxThreadPoolSize;
        this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
        this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
    }



    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Get minThreadPoolSize
     * @return minThreadPoolSize
     */
    public ConfigNodePropertyInteger getMinThreadPoolSize() {
        return minThreadPoolSize;
    }

    public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
        this.minThreadPoolSize = minThreadPoolSize;
    }

    /**
     * Get maxThreadPoolSize
     * @return maxThreadPoolSize
     */
    public ConfigNodePropertyInteger getMaxThreadPoolSize() {
        return maxThreadPoolSize;
    }

    public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
        this.maxThreadPoolSize = maxThreadPoolSize;
    }

    /**
     * Get cqWcmWorkflowTerminateOnActivate
     * @return cqWcmWorkflowTerminateOnActivate
     */
    public ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
        return cqWcmWorkflowTerminateOnActivate;
    }

    public void setCqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
        this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    }

    /**
     * Get cqWcmWorklfowTerminateExclusionList
     * @return cqWcmWorklfowTerminateExclusionList
     */
    public ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
        return cqWcmWorklfowTerminateExclusionList;
    }

    public void setCqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
        this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    minThreadPoolSize: ").append(toIndentedString(minThreadPoolSize)).append("\n");
        sb.append("    maxThreadPoolSize: ").append(toIndentedString(maxThreadPoolSize)).append("\n");
        sb.append("    cqWcmWorkflowTerminateOnActivate: ").append(toIndentedString(cqWcmWorkflowTerminateOnActivate)).append("\n");
        sb.append("    cqWcmWorklfowTerminateExclusionList: ").append(toIndentedString(cqWcmWorklfowTerminateExclusionList)).append("\n");
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

