package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AnalyticsComponentQueryCacheServiceProperties   {

    private ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize;

    /**
     * Default constructor.
     */
    public AnalyticsComponentQueryCacheServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create AnalyticsComponentQueryCacheServiceProperties.
     *
     * @param cqAnalyticsComponentQueryCacheSize cqAnalyticsComponentQueryCacheSize
     */
    public AnalyticsComponentQueryCacheServiceProperties(
        ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize
    ) {
        this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
    }



    /**
     * Get cqAnalyticsComponentQueryCacheSize
     * @return cqAnalyticsComponentQueryCacheSize
     */
    public ConfigNodePropertyInteger getCqAnalyticsComponentQueryCacheSize() {
        return cqAnalyticsComponentQueryCacheSize;
    }

    public void setCqAnalyticsComponentQueryCacheSize(ConfigNodePropertyInteger cqAnalyticsComponentQueryCacheSize) {
        this.cqAnalyticsComponentQueryCacheSize = cqAnalyticsComponentQueryCacheSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsComponentQueryCacheServiceProperties {\n");
        
        sb.append("    cqAnalyticsComponentQueryCacheSize: ").append(toIndentedString(cqAnalyticsComponentQueryCacheSize)).append("\n");
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

