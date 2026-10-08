package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString webserverAddress;

    /**
     * Default constructor.
     */
    public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param webserverAddress webserverAddress
     */
    public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString webserverAddress
    ) {
        this.hcTags = hcTags;
        this.webserverAddress = webserverAddress;
    }



    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
     * Get webserverAddress
     * @return webserverAddress
     */
    public ConfigNodePropertyString getWebserverAddress() {
        return webserverAddress;
    }

    public void setWebserverAddress(ConfigNodePropertyString webserverAddress) {
        this.webserverAddress = webserverAddress;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    webserverAddress: ").append(toIndentedString(webserverAddress)).append("\n");
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

