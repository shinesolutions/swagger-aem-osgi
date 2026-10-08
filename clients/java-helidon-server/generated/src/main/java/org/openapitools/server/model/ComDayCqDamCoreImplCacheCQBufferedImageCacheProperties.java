package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties   {

    private ConfigNodePropertyInteger cqDamImageCacheMaxMemory;
    private ConfigNodePropertyInteger cqDamImageCacheMaxAge;
    private ConfigNodePropertyString cqDamImageCacheMaxDimension;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.
     *
     * @param cqDamImageCacheMaxMemory cqDamImageCacheMaxMemory
     * @param cqDamImageCacheMaxAge cqDamImageCacheMaxAge
     * @param cqDamImageCacheMaxDimension cqDamImageCacheMaxDimension
     */
    public ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(
        ConfigNodePropertyInteger cqDamImageCacheMaxMemory, 
        ConfigNodePropertyInteger cqDamImageCacheMaxAge, 
        ConfigNodePropertyString cqDamImageCacheMaxDimension
    ) {
        this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
        this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
        this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
    }



    /**
     * Get cqDamImageCacheMaxMemory
     * @return cqDamImageCacheMaxMemory
     */
    public ConfigNodePropertyInteger getCqDamImageCacheMaxMemory() {
        return cqDamImageCacheMaxMemory;
    }

    public void setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger cqDamImageCacheMaxMemory) {
        this.cqDamImageCacheMaxMemory = cqDamImageCacheMaxMemory;
    }

    /**
     * Get cqDamImageCacheMaxAge
     * @return cqDamImageCacheMaxAge
     */
    public ConfigNodePropertyInteger getCqDamImageCacheMaxAge() {
        return cqDamImageCacheMaxAge;
    }

    public void setCqDamImageCacheMaxAge(ConfigNodePropertyInteger cqDamImageCacheMaxAge) {
        this.cqDamImageCacheMaxAge = cqDamImageCacheMaxAge;
    }

    /**
     * Get cqDamImageCacheMaxDimension
     * @return cqDamImageCacheMaxDimension
     */
    public ConfigNodePropertyString getCqDamImageCacheMaxDimension() {
        return cqDamImageCacheMaxDimension;
    }

    public void setCqDamImageCacheMaxDimension(ConfigNodePropertyString cqDamImageCacheMaxDimension) {
        this.cqDamImageCacheMaxDimension = cqDamImageCacheMaxDimension;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {\n");
        
        sb.append("    cqDamImageCacheMaxMemory: ").append(toIndentedString(cqDamImageCacheMaxMemory)).append("\n");
        sb.append("    cqDamImageCacheMaxAge: ").append(toIndentedString(cqDamImageCacheMaxAge)).append("\n");
        sb.append("    cqDamImageCacheMaxDimension: ").append(toIndentedString(cqDamImageCacheMaxDimension)).append("\n");
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

