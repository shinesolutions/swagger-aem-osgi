package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyArray ignoredBundles;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param ignoredBundles ignoredBundles
     */
    public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyArray ignoredBundles
    ) {
        this.hcTags = hcTags;
        this.ignoredBundles = ignoredBundles;
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
     * Get ignoredBundles
     * @return ignoredBundles
     */
    public ConfigNodePropertyArray getIgnoredBundles() {
        return ignoredBundles;
    }

    public void setIgnoredBundles(ConfigNodePropertyArray ignoredBundles) {
        this.ignoredBundles = ignoredBundles;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    ignoredBundles: ").append(toIndentedString(ignoredBundles)).append("\n");
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

