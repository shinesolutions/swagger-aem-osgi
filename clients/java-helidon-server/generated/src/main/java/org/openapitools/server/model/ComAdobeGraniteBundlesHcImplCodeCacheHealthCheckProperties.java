package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyInteger minimumCodeCacheSize;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param minimumCodeCacheSize minimumCodeCacheSize
     */
    public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyInteger minimumCodeCacheSize
    ) {
        this.hcTags = hcTags;
        this.minimumCodeCacheSize = minimumCodeCacheSize;
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
     * Get minimumCodeCacheSize
     * @return minimumCodeCacheSize
     */
    public ConfigNodePropertyInteger getMinimumCodeCacheSize() {
        return minimumCodeCacheSize;
    }

    public void setMinimumCodeCacheSize(ConfigNodePropertyInteger minimumCodeCacheSize) {
        this.minimumCodeCacheSize = minimumCodeCacheSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    minimumCodeCacheSize: ").append(toIndentedString(minimumCodeCacheSize)).append("\n");
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

