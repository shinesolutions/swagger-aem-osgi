package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties   {

    private ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot;
    private ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.
     *
     * @param comAdobeGraniteHttpcacheFileDocumentRoot comAdobeGraniteHttpcacheFileDocumentRoot
     * @param comAdobeGraniteHttpcacheFileIncludeHost comAdobeGraniteHttpcacheFileIncludeHost
     */
    public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(
        ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot, 
        ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost
    ) {
        this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
        this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
    }



    /**
     * Get comAdobeGraniteHttpcacheFileDocumentRoot
     * @return comAdobeGraniteHttpcacheFileDocumentRoot
     */
    public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileDocumentRoot() {
        return comAdobeGraniteHttpcacheFileDocumentRoot;
    }

    public void setComAdobeGraniteHttpcacheFileDocumentRoot(ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
        this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
    }

    /**
     * Get comAdobeGraniteHttpcacheFileIncludeHost
     * @return comAdobeGraniteHttpcacheFileIncludeHost
     */
    public ConfigNodePropertyString getComAdobeGraniteHttpcacheFileIncludeHost() {
        return comAdobeGraniteHttpcacheFileIncludeHost;
    }

    public void setComAdobeGraniteHttpcacheFileIncludeHost(ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
        this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {\n");
        
        sb.append("    comAdobeGraniteHttpcacheFileDocumentRoot: ").append(toIndentedString(comAdobeGraniteHttpcacheFileDocumentRoot)).append("\n");
        sb.append("    comAdobeGraniteHttpcacheFileIncludeHost: ").append(toIndentedString(comAdobeGraniteHttpcacheFileIncludeHost)).append("\n");
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

