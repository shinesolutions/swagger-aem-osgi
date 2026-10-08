package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties   {

    private ConfigNodePropertyArray workflowpackageinfoproviderFilter;
    private ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath;

    /**
     * Default constructor.
     */
    public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
     *
     * @param workflowpackageinfoproviderFilter workflowpackageinfoproviderFilter
     * @param workflowpackageinfoproviderFilterRootpath workflowpackageinfoproviderFilterRootpath
     */
    public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(
        ConfigNodePropertyArray workflowpackageinfoproviderFilter, 
        ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath
    ) {
        this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
        this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
    }



    /**
     * Get workflowpackageinfoproviderFilter
     * @return workflowpackageinfoproviderFilter
     */
    public ConfigNodePropertyArray getWorkflowpackageinfoproviderFilter() {
        return workflowpackageinfoproviderFilter;
    }

    public void setWorkflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
        this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
    }

    /**
     * Get workflowpackageinfoproviderFilterRootpath
     * @return workflowpackageinfoproviderFilterRootpath
     */
    public ConfigNodePropertyString getWorkflowpackageinfoproviderFilterRootpath() {
        return workflowpackageinfoproviderFilterRootpath;
    }

    public void setWorkflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
        this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {\n");
        
        sb.append("    workflowpackageinfoproviderFilter: ").append(toIndentedString(workflowpackageinfoproviderFilter)).append("\n");
        sb.append("    workflowpackageinfoproviderFilterRootpath: ").append(toIndentedString(workflowpackageinfoproviderFilterRootpath)).append("\n");
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

