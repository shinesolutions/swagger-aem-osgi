package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties   {

    private ConfigNodePropertyString defaultTransportAgentToWorkerPrefix;
    private ConfigNodePropertyString defaultTransportAgentToMasterPrefix;
    private ConfigNodePropertyString defaultTransportInputPackage;
    private ConfigNodePropertyString defaultTransportOutputPackage;
    private ConfigNodePropertyBoolean defaultTransportReplicationSynchronous;
    private ConfigNodePropertyBoolean defaultTransportContentpackage;
    private ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
     *
     * @param defaultTransportAgentToWorkerPrefix defaultTransportAgentToWorkerPrefix
     * @param defaultTransportAgentToMasterPrefix defaultTransportAgentToMasterPrefix
     * @param defaultTransportInputPackage defaultTransportInputPackage
     * @param defaultTransportOutputPackage defaultTransportOutputPackage
     * @param defaultTransportReplicationSynchronous defaultTransportReplicationSynchronous
     * @param defaultTransportContentpackage defaultTransportContentpackage
     * @param offloadingTransporterDefaultEnabled offloadingTransporterDefaultEnabled
     */
    public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
        ConfigNodePropertyString defaultTransportAgentToWorkerPrefix, 
        ConfigNodePropertyString defaultTransportAgentToMasterPrefix, 
        ConfigNodePropertyString defaultTransportInputPackage, 
        ConfigNodePropertyString defaultTransportOutputPackage, 
        ConfigNodePropertyBoolean defaultTransportReplicationSynchronous, 
        ConfigNodePropertyBoolean defaultTransportContentpackage, 
        ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled
    ) {
        this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
        this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
        this.defaultTransportInputPackage = defaultTransportInputPackage;
        this.defaultTransportOutputPackage = defaultTransportOutputPackage;
        this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
        this.defaultTransportContentpackage = defaultTransportContentpackage;
        this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    }



    /**
     * Get defaultTransportAgentToWorkerPrefix
     * @return defaultTransportAgentToWorkerPrefix
     */
    public ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
        return defaultTransportAgentToWorkerPrefix;
    }

    public void setDefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
        this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
    }

    /**
     * Get defaultTransportAgentToMasterPrefix
     * @return defaultTransportAgentToMasterPrefix
     */
    public ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
        return defaultTransportAgentToMasterPrefix;
    }

    public void setDefaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
        this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
    }

    /**
     * Get defaultTransportInputPackage
     * @return defaultTransportInputPackage
     */
    public ConfigNodePropertyString getDefaultTransportInputPackage() {
        return defaultTransportInputPackage;
    }

    public void setDefaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
        this.defaultTransportInputPackage = defaultTransportInputPackage;
    }

    /**
     * Get defaultTransportOutputPackage
     * @return defaultTransportOutputPackage
     */
    public ConfigNodePropertyString getDefaultTransportOutputPackage() {
        return defaultTransportOutputPackage;
    }

    public void setDefaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
        this.defaultTransportOutputPackage = defaultTransportOutputPackage;
    }

    /**
     * Get defaultTransportReplicationSynchronous
     * @return defaultTransportReplicationSynchronous
     */
    public ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
        return defaultTransportReplicationSynchronous;
    }

    public void setDefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
        this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
    }

    /**
     * Get defaultTransportContentpackage
     * @return defaultTransportContentpackage
     */
    public ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
        return defaultTransportContentpackage;
    }

    public void setDefaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
        this.defaultTransportContentpackage = defaultTransportContentpackage;
    }

    /**
     * Get offloadingTransporterDefaultEnabled
     * @return offloadingTransporterDefaultEnabled
     */
    public ConfigNodePropertyBoolean getOffloadingTransporterDefaultEnabled() {
        return offloadingTransporterDefaultEnabled;
    }

    public void setOffloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
        this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {\n");
        
        sb.append("    defaultTransportAgentToWorkerPrefix: ").append(toIndentedString(defaultTransportAgentToWorkerPrefix)).append("\n");
        sb.append("    defaultTransportAgentToMasterPrefix: ").append(toIndentedString(defaultTransportAgentToMasterPrefix)).append("\n");
        sb.append("    defaultTransportInputPackage: ").append(toIndentedString(defaultTransportInputPackage)).append("\n");
        sb.append("    defaultTransportOutputPackage: ").append(toIndentedString(defaultTransportOutputPackage)).append("\n");
        sb.append("    defaultTransportReplicationSynchronous: ").append(toIndentedString(defaultTransportReplicationSynchronous)).append("\n");
        sb.append("    defaultTransportContentpackage: ").append(toIndentedString(defaultTransportContentpackage)).append("\n");
        sb.append("    offloadingTransporterDefaultEnabled: ").append(toIndentedString(offloadingTransporterDefaultEnabled)).append("\n");
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

