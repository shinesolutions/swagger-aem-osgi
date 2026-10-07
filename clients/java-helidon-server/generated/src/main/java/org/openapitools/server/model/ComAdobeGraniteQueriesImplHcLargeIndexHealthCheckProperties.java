package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties   {

    private ConfigNodePropertyInteger largeIndexCriticalThreshold;
    private ConfigNodePropertyInteger largeIndexWarnThreshold;
    private ConfigNodePropertyArray hcTags;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
     *
     * @param largeIndexCriticalThreshold largeIndexCriticalThreshold
     * @param largeIndexWarnThreshold largeIndexWarnThreshold
     * @param hcTags hcTags
     */
    public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(
        ConfigNodePropertyInteger largeIndexCriticalThreshold, 
        ConfigNodePropertyInteger largeIndexWarnThreshold, 
        ConfigNodePropertyArray hcTags
    ) {
        this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
        this.largeIndexWarnThreshold = largeIndexWarnThreshold;
        this.hcTags = hcTags;
    }



    /**
     * Get largeIndexCriticalThreshold
     * @return largeIndexCriticalThreshold
     */
    public ConfigNodePropertyInteger getLargeIndexCriticalThreshold() {
        return largeIndexCriticalThreshold;
    }

    public void setLargeIndexCriticalThreshold(ConfigNodePropertyInteger largeIndexCriticalThreshold) {
        this.largeIndexCriticalThreshold = largeIndexCriticalThreshold;
    }

    /**
     * Get largeIndexWarnThreshold
     * @return largeIndexWarnThreshold
     */
    public ConfigNodePropertyInteger getLargeIndexWarnThreshold() {
        return largeIndexWarnThreshold;
    }

    public void setLargeIndexWarnThreshold(ConfigNodePropertyInteger largeIndexWarnThreshold) {
        this.largeIndexWarnThreshold = largeIndexWarnThreshold;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {\n");
        
        sb.append("    largeIndexCriticalThreshold: ").append(toIndentedString(largeIndexCriticalThreshold)).append("\n");
        sb.append("    largeIndexWarnThreshold: ").append(toIndentedString(largeIndexWarnThreshold)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

