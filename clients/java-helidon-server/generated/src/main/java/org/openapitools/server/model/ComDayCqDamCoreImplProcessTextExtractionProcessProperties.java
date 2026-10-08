package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties   {

    private ConfigNodePropertyArray mimeTypes;
    private ConfigNodePropertyInteger maxExtract;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplProcessTextExtractionProcessProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplProcessTextExtractionProcessProperties.
     *
     * @param mimeTypes mimeTypes
     * @param maxExtract maxExtract
     */
    public ComDayCqDamCoreImplProcessTextExtractionProcessProperties(
        ConfigNodePropertyArray mimeTypes, 
        ConfigNodePropertyInteger maxExtract
    ) {
        this.mimeTypes = mimeTypes;
        this.maxExtract = maxExtract;
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
     * Get maxExtract
     * @return maxExtract
     */
    public ConfigNodePropertyInteger getMaxExtract() {
        return maxExtract;
    }

    public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
        this.maxExtract = maxExtract;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
        
        sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
        sb.append("    maxExtract: ").append(toIndentedString(maxExtract)).append("\n");
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

