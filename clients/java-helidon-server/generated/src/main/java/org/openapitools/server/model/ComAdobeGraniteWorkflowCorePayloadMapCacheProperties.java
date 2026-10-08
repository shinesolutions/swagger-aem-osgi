package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties   {

    private ConfigNodePropertyArray getSystemWorkflowModels;
    private ConfigNodePropertyString getPackageRootPath;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
     *
     * @param getSystemWorkflowModels getSystemWorkflowModels
     * @param getPackageRootPath getPackageRootPath
     */
    public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(
        ConfigNodePropertyArray getSystemWorkflowModels, 
        ConfigNodePropertyString getPackageRootPath
    ) {
        this.getSystemWorkflowModels = getSystemWorkflowModels;
        this.getPackageRootPath = getPackageRootPath;
    }



    /**
     * Get getSystemWorkflowModels
     * @return getSystemWorkflowModels
     */
    public ConfigNodePropertyArray getGetSystemWorkflowModels() {
        return getSystemWorkflowModels;
    }

    public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
        this.getSystemWorkflowModels = getSystemWorkflowModels;
    }

    /**
     * Get getPackageRootPath
     * @return getPackageRootPath
     */
    public ConfigNodePropertyString getGetPackageRootPath() {
        return getPackageRootPath;
    }

    public void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
        this.getPackageRootPath = getPackageRootPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {\n");
        
        sb.append("    getSystemWorkflowModels: ").append(toIndentedString(getSystemWorkflowModels)).append("\n");
        sb.append("    getPackageRootPath: ").append(toIndentedString(getPackageRootPath)).append("\n");
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

