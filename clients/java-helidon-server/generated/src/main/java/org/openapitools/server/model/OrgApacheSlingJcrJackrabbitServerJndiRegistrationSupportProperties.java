package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties   {

    private ConfigNodePropertyString javaNamingFactoryInitial;
    private ConfigNodePropertyString javaNamingProviderUrl;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
     *
     * @param javaNamingFactoryInitial javaNamingFactoryInitial
     * @param javaNamingProviderUrl javaNamingProviderUrl
     */
    public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(
        ConfigNodePropertyString javaNamingFactoryInitial, 
        ConfigNodePropertyString javaNamingProviderUrl
    ) {
        this.javaNamingFactoryInitial = javaNamingFactoryInitial;
        this.javaNamingProviderUrl = javaNamingProviderUrl;
    }



    /**
     * Get javaNamingFactoryInitial
     * @return javaNamingFactoryInitial
     */
    public ConfigNodePropertyString getJavaNamingFactoryInitial() {
        return javaNamingFactoryInitial;
    }

    public void setJavaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
        this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    }

    /**
     * Get javaNamingProviderUrl
     * @return javaNamingProviderUrl
     */
    public ConfigNodePropertyString getJavaNamingProviderUrl() {
        return javaNamingProviderUrl;
    }

    public void setJavaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
        this.javaNamingProviderUrl = javaNamingProviderUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {\n");
        
        sb.append("    javaNamingFactoryInitial: ").append(toIndentedString(javaNamingFactoryInitial)).append("\n");
        sb.append("    javaNamingProviderUrl: ").append(toIndentedString(javaNamingProviderUrl)).append("\n");
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

