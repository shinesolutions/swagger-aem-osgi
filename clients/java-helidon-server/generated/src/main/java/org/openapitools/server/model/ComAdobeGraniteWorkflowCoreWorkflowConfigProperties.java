package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties   {

    private ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath;
    private ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode;
    private ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
     *
     * @param cqWorkflowConfigWorkflowPackagesRootPath cqWorkflowConfigWorkflowPackagesRootPath
     * @param cqWorkflowConfigWorkflowProcessLegacyMode cqWorkflowConfigWorkflowProcessLegacyMode
     * @param cqWorkflowConfigAllowLocking cqWorkflowConfigAllowLocking
     */
    public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
        ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath, 
        ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode, 
        ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking
    ) {
        this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
        this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
        this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
    }



    /**
     * Get cqWorkflowConfigWorkflowPackagesRootPath
     * @return cqWorkflowConfigWorkflowPackagesRootPath
     */
    public ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
        return cqWorkflowConfigWorkflowPackagesRootPath;
    }

    public void setCqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
        this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
    }

    /**
     * Get cqWorkflowConfigWorkflowProcessLegacyMode
     * @return cqWorkflowConfigWorkflowProcessLegacyMode
     */
    public ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
        return cqWorkflowConfigWorkflowProcessLegacyMode;
    }

    public void setCqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
        this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
    }

    /**
     * Get cqWorkflowConfigAllowLocking
     * @return cqWorkflowConfigAllowLocking
     */
    public ConfigNodePropertyBoolean getCqWorkflowConfigAllowLocking() {
        return cqWorkflowConfigAllowLocking;
    }

    public void setCqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
        this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {\n");
        
        sb.append("    cqWorkflowConfigWorkflowPackagesRootPath: ").append(toIndentedString(cqWorkflowConfigWorkflowPackagesRootPath)).append("\n");
        sb.append("    cqWorkflowConfigWorkflowProcessLegacyMode: ").append(toIndentedString(cqWorkflowConfigWorkflowProcessLegacyMode)).append("\n");
        sb.append("    cqWorkflowConfigAllowLocking: ").append(toIndentedString(cqWorkflowConfigAllowLocking)).append("\n");
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

