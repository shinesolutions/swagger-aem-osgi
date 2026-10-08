package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCommonsUtilImplAssetCacheImplProperties   {

    private ConfigNodePropertyInteger largeFileMin;
    private ConfigNodePropertyBoolean cacheApply;
    private ConfigNodePropertyArray mimeTypes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCommonsUtilImplAssetCacheImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCommonsUtilImplAssetCacheImplProperties.
     *
     * @param largeFileMin largeFileMin
     * @param cacheApply cacheApply
     * @param mimeTypes mimeTypes
     */
    public ComDayCqDamCommonsUtilImplAssetCacheImplProperties(
        ConfigNodePropertyInteger largeFileMin, 
        ConfigNodePropertyBoolean cacheApply, 
        ConfigNodePropertyArray mimeTypes
    ) {
        this.largeFileMin = largeFileMin;
        this.cacheApply = cacheApply;
        this.mimeTypes = mimeTypes;
    }



    /**
     * Get largeFileMin
     * @return largeFileMin
     */
    public ConfigNodePropertyInteger getLargeFileMin() {
        return largeFileMin;
    }

    public void setLargeFileMin(ConfigNodePropertyInteger largeFileMin) {
        this.largeFileMin = largeFileMin;
    }

    /**
     * Get cacheApply
     * @return cacheApply
     */
    public ConfigNodePropertyBoolean getCacheApply() {
        return cacheApply;
    }

    public void setCacheApply(ConfigNodePropertyBoolean cacheApply) {
        this.cacheApply = cacheApply;
    }

    /**
     * Get mimeTypes
     * @return mimeTypes
     */
    public ConfigNodePropertyArray getMimeTypes() {
        return mimeTypes;
    }

    public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {\n");
        
        sb.append("    largeFileMin: ").append(toIndentedString(largeFileMin)).append("\n");
        sb.append("    cacheApply: ").append(toIndentedString(cacheApply)).append("\n");
        sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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

