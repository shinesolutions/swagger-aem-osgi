package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSyncImplDiffChangesObserverProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString agentName;
    private ConfigNodePropertyString diffPath;
    private ConfigNodePropertyString propertyNames;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSyncImplDiffChangesObserverProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSyncImplDiffChangesObserverProperties.
     *
     * @param enabled enabled
     * @param agentName agentName
     * @param diffPath diffPath
     * @param propertyNames propertyNames
     */
    public ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString agentName, 
        ConfigNodePropertyString diffPath, 
        ConfigNodePropertyString propertyNames
    ) {
        this.enabled = enabled;
        this.agentName = agentName;
        this.diffPath = diffPath;
        this.propertyNames = propertyNames;
    }



    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get agentName
     * @return agentName
     */
    public ConfigNodePropertyString getAgentName() {
        return agentName;
    }

    public void setAgentName(ConfigNodePropertyString agentName) {
        this.agentName = agentName;
    }

    /**
     * Get diffPath
     * @return diffPath
     */
    public ConfigNodePropertyString getDiffPath() {
        return diffPath;
    }

    public void setDiffPath(ConfigNodePropertyString diffPath) {
        this.diffPath = diffPath;
    }

    /**
     * Get propertyNames
     * @return propertyNames
     */
    public ConfigNodePropertyString getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(ConfigNodePropertyString propertyNames) {
        this.propertyNames = propertyNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSyncImplDiffChangesObserverProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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

