package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties   {

    private ConfigNodePropertyString diffPath;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString serviceUserTarget;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.
     *
     * @param diffPath diffPath
     * @param serviceName serviceName
     * @param serviceUserTarget serviceUserTarget
     */
    public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(
        ConfigNodePropertyString diffPath, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString serviceUserTarget
    ) {
        this.diffPath = diffPath;
        this.serviceName = serviceName;
        this.serviceUserTarget = serviceUserTarget;
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
        sb.append("class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {\n");
        
        sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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

