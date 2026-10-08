package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString agentName;
    private ConfigNodePropertyString diffPath;
    private ConfigNodePropertyString observedPath;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString propertyNames;
    private ConfigNodePropertyInteger distributionDelay;
    private ConfigNodePropertyString serviceUserTarget;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
     *
     * @param enabled enabled
     * @param agentName agentName
     * @param diffPath diffPath
     * @param observedPath observedPath
     * @param serviceName serviceName
     * @param propertyNames propertyNames
     * @param distributionDelay distributionDelay
     * @param serviceUserTarget serviceUserTarget
     */
    public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString agentName, 
        ConfigNodePropertyString diffPath, 
        ConfigNodePropertyString observedPath, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString propertyNames, 
        ConfigNodePropertyInteger distributionDelay, 
        ConfigNodePropertyString serviceUserTarget
    ) {
        this.enabled = enabled;
        this.agentName = agentName;
        this.diffPath = diffPath;
        this.observedPath = observedPath;
        this.serviceName = serviceName;
        this.propertyNames = propertyNames;
        this.distributionDelay = distributionDelay;
        this.serviceUserTarget = serviceUserTarget;
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
     * Get observedPath
     * @return observedPath
     */
    public ConfigNodePropertyString getObservedPath() {
        return observedPath;
    }

    public void setObservedPath(ConfigNodePropertyString observedPath) {
        this.observedPath = observedPath;
    }

    /**
     * Get serviceName
     * @return serviceName
     */
    public ConfigNodePropertyString getServiceName() {
        return serviceName;
    }

    public void setServiceName(ConfigNodePropertyString serviceName) {
        this.serviceName = serviceName;
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
     * Get distributionDelay
     * @return distributionDelay
     */
    public ConfigNodePropertyInteger getDistributionDelay() {
        return distributionDelay;
    }

    public void setDistributionDelay(ConfigNodePropertyInteger distributionDelay) {
        this.distributionDelay = distributionDelay;
    }

    /**
     * Get serviceUserTarget
     * @return serviceUserTarget
     */
    public ConfigNodePropertyString getServiceUserTarget() {
        return serviceUserTarget;
    }

    public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
        this.serviceUserTarget = serviceUserTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
        sb.append("    observedPath: ").append(toIndentedString(observedPath)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
        sb.append("    distributionDelay: ").append(toIndentedString(distributionDelay)).append("\n");
        sb.append("    serviceUserTarget: ").append(toIndentedString(serviceUserTarget)).append("\n");
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

