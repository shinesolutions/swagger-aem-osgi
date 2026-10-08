package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties   {

    private ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    private ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    private ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    private ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
     *
     * @param comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
     * @param comAdobeCqDamMacSyncDamsyncserviceSyncRenditions comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
     * @param comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
     * @param comAdobeCqDamMacSyncDamsyncservicePlatform comAdobeCqDamMacSyncDamsyncservicePlatform
     */
    public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(
        ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths, 
        ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions, 
        ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs, 
        ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform
    ) {
        this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
        this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
        this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
        this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
    }



    /**
     * Get comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
     * @return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
     */
    public ConfigNodePropertyArray getComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths() {
        return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    }

    public void setComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
        this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    }

    /**
     * Get comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
     * @return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
     */
    public ConfigNodePropertyBoolean getComAdobeCqDamMacSyncDamsyncserviceSyncRenditions() {
        return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    }

    public void setComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
        this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    }

    /**
     * Get comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
     * @return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
     */
    public ConfigNodePropertyInteger getComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs() {
        return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    }

    public void setComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
        this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    }

    /**
     * Get comAdobeCqDamMacSyncDamsyncservicePlatform
     * @return comAdobeCqDamMacSyncDamsyncservicePlatform
     */
    public ConfigNodePropertyDropDown getComAdobeCqDamMacSyncDamsyncservicePlatform() {
        return comAdobeCqDamMacSyncDamsyncservicePlatform;
    }

    public void setComAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
        this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {\n");
        
        sb.append("    comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths)).append("\n");
        sb.append("    comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceSyncRenditions)).append("\n");
        sb.append("    comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs)).append("\n");
        sb.append("    comAdobeCqDamMacSyncDamsyncservicePlatform: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncservicePlatform)).append("\n");
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

