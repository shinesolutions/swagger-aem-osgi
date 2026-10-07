package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties   {

    private ConfigNodePropertyInteger indexingCriticalThreshold;
    private ConfigNodePropertyInteger indexingWarnThreshold;
    private ConfigNodePropertyArray hcTags;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
     *
     * @param indexingCriticalThreshold indexingCriticalThreshold
     * @param indexingWarnThreshold indexingWarnThreshold
     * @param hcTags hcTags
     */
    public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(
        ConfigNodePropertyInteger indexingCriticalThreshold, 
        ConfigNodePropertyInteger indexingWarnThreshold, 
        ConfigNodePropertyArray hcTags
    ) {
        this.indexingCriticalThreshold = indexingCriticalThreshold;
        this.indexingWarnThreshold = indexingWarnThreshold;
        this.hcTags = hcTags;
    }



    /**
     * Get indexingCriticalThreshold
     * @return indexingCriticalThreshold
     */
    public ConfigNodePropertyInteger getIndexingCriticalThreshold() {
        return indexingCriticalThreshold;
    }

    public void setIndexingCriticalThreshold(ConfigNodePropertyInteger indexingCriticalThreshold) {
        this.indexingCriticalThreshold = indexingCriticalThreshold;
    }

    /**
     * Get indexingWarnThreshold
     * @return indexingWarnThreshold
     */
    public ConfigNodePropertyInteger getIndexingWarnThreshold() {
        return indexingWarnThreshold;
    }

    public void setIndexingWarnThreshold(ConfigNodePropertyInteger indexingWarnThreshold) {
        this.indexingWarnThreshold = indexingWarnThreshold;
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
        sb.append("class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {\n");
        
        sb.append("    indexingCriticalThreshold: ").append(toIndentedString(indexingCriticalThreshold)).append("\n");
        sb.append("    indexingWarnThreshold: ").append(toIndentedString(indexingWarnThreshold)).append("\n");
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

