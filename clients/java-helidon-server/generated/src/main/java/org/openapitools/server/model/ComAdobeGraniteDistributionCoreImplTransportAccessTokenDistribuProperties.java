package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyString userId;
    private ConfigNodePropertyString accessTokenProviderTarget;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
     *
     * @param name name
     * @param serviceName serviceName
     * @param userId userId
     * @param accessTokenProviderTarget accessTokenProviderTarget
     */
    public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyString userId, 
        ConfigNodePropertyString accessTokenProviderTarget
    ) {
        this.name = name;
        this.serviceName = serviceName;
        this.userId = userId;
        this.accessTokenProviderTarget = accessTokenProviderTarget;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
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
     * Get userId
     * @return userId
     */
    public ConfigNodePropertyString getUserId() {
        return userId;
    }

    public void setUserId(ConfigNodePropertyString userId) {
        this.userId = userId;
    }

    /**
     * Get accessTokenProviderTarget
     * @return accessTokenProviderTarget
     */
    public ConfigNodePropertyString getAccessTokenProviderTarget() {
        return accessTokenProviderTarget;
    }

    public void setAccessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
        this.accessTokenProviderTarget = accessTokenProviderTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    accessTokenProviderTarget: ").append(toIndentedString(accessTokenProviderTarget)).append("\n");
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

