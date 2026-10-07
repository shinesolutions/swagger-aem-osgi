package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties   {

    private ConfigNodePropertyInteger minThreadPoolSize;
    private ConfigNodePropertyInteger maxThreadPoolSize;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
     *
     * @param minThreadPoolSize minThreadPoolSize
     * @param maxThreadPoolSize maxThreadPoolSize
     */
    public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(
        ConfigNodePropertyInteger minThreadPoolSize, 
        ConfigNodePropertyInteger maxThreadPoolSize
    ) {
        this.minThreadPoolSize = minThreadPoolSize;
        this.maxThreadPoolSize = maxThreadPoolSize;
    }



    /**
     * Get minThreadPoolSize
     * @return minThreadPoolSize
     */
    public ConfigNodePropertyInteger getMinThreadPoolSize() {
        return minThreadPoolSize;
    }

    public void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize) {
        this.minThreadPoolSize = minThreadPoolSize;
    }

    /**
     * Get maxThreadPoolSize
     * @return maxThreadPoolSize
     */
    public ConfigNodePropertyInteger getMaxThreadPoolSize() {
        return maxThreadPoolSize;
    }

    public void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize) {
        this.maxThreadPoolSize = maxThreadPoolSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {\n");
        
        sb.append("    minThreadPoolSize: ").append(toIndentedString(minThreadPoolSize)).append("\n");
        sb.append("    maxThreadPoolSize: ").append(toIndentedString(maxThreadPoolSize)).append("\n");
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

