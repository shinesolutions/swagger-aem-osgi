package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties   {

    private ConfigNodePropertyString adapterCondition;
    private ConfigNodePropertyArray taskmanagerAdmingroups;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.
     *
     * @param adapterCondition adapterCondition
     * @param taskmanagerAdmingroups taskmanagerAdmingroups
     */
    public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(
        ConfigNodePropertyString adapterCondition, 
        ConfigNodePropertyArray taskmanagerAdmingroups
    ) {
        this.adapterCondition = adapterCondition;
        this.taskmanagerAdmingroups = taskmanagerAdmingroups;
    }



    /**
     * Get adapterCondition
     * @return adapterCondition
     */
    public ConfigNodePropertyString getAdapterCondition() {
        return adapterCondition;
    }

    public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
        this.adapterCondition = adapterCondition;
    }

    /**
     * Get taskmanagerAdmingroups
     * @return taskmanagerAdmingroups
     */
    public ConfigNodePropertyArray getTaskmanagerAdmingroups() {
        return taskmanagerAdmingroups;
    }

    public void setTaskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
        this.taskmanagerAdmingroups = taskmanagerAdmingroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {\n");
        
        sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
        sb.append("    taskmanagerAdmingroups: ").append(toIndentedString(taskmanagerAdmingroups)).append("\n");
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

