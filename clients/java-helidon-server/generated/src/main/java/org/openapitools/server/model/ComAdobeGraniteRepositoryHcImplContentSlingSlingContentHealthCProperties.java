package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyArray excludeSearchPath;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.
     *
     * @param hcTags hcTags
     * @param excludeSearchPath excludeSearchPath
     */
    public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyArray excludeSearchPath
    ) {
        this.hcTags = hcTags;
        this.excludeSearchPath = excludeSearchPath;
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
     * Get excludeSearchPath
     * @return excludeSearchPath
     */
    public ConfigNodePropertyArray getExcludeSearchPath() {
        return excludeSearchPath;
    }

    public void setExcludeSearchPath(ConfigNodePropertyArray excludeSearchPath) {
        this.excludeSearchPath = excludeSearchPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    excludeSearchPath: ").append(toIndentedString(excludeSearchPath)).append("\n");
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

