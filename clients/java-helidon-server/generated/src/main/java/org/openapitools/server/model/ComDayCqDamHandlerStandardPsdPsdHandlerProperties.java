package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamHandlerStandardPsdPsdHandlerProperties   {

    private ConfigNodePropertyInteger largeFileThreshold;

    /**
     * Default constructor.
     */
    public ComDayCqDamHandlerStandardPsdPsdHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
     *
     * @param largeFileThreshold largeFileThreshold
     */
    public ComDayCqDamHandlerStandardPsdPsdHandlerProperties(
        ConfigNodePropertyInteger largeFileThreshold
    ) {
        this.largeFileThreshold = largeFileThreshold;
    }



    /**
     * Get largeFileThreshold
     * @return largeFileThreshold
     */
    public ConfigNodePropertyInteger getLargeFileThreshold() {
        return largeFileThreshold;
    }

    public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
        this.largeFileThreshold = largeFileThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {\n");
        
        sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
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

