package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties   {

    private ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties.
     *
     * @param comAdobeGraniteHttpcacheUrlPaths comAdobeGraniteHttpcacheUrlPaths
     */
    public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(
        ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths
    ) {
        this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
    }



    /**
     * Get comAdobeGraniteHttpcacheUrlPaths
     * @return comAdobeGraniteHttpcacheUrlPaths
     */
    public ConfigNodePropertyArray getComAdobeGraniteHttpcacheUrlPaths() {
        return comAdobeGraniteHttpcacheUrlPaths;
    }

    public void setComAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
        this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {\n");
        
        sb.append("    comAdobeGraniteHttpcacheUrlPaths: ").append(toIndentedString(comAdobeGraniteHttpcacheUrlPaths)).append("\n");
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

