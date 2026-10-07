package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCommonsHandlerStandardImageHandlerProperties   {

    private ConfigNodePropertyInteger largeFileThreshold;
    private ConfigNodePropertyInteger largeCommentThreshold;
    private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;

    /**
     * Default constructor.
     */
    public ComDayCqDamCommonsHandlerStandardImageHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCommonsHandlerStandardImageHandlerProperties.
     *
     * @param largeFileThreshold largeFileThreshold
     * @param largeCommentThreshold largeCommentThreshold
     * @param cqDamEnableExtMetaExtraction cqDamEnableExtMetaExtraction
     */
    public ComDayCqDamCommonsHandlerStandardImageHandlerProperties(
        ConfigNodePropertyInteger largeFileThreshold, 
        ConfigNodePropertyInteger largeCommentThreshold, 
        ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction
    ) {
        this.largeFileThreshold = largeFileThreshold;
        this.largeCommentThreshold = largeCommentThreshold;
        this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
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
     * Get largeCommentThreshold
     * @return largeCommentThreshold
     */
    public ConfigNodePropertyInteger getLargeCommentThreshold() {
        return largeCommentThreshold;
    }

    public void setLargeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
        this.largeCommentThreshold = largeCommentThreshold;
    }

    /**
     * Get cqDamEnableExtMetaExtraction
     * @return cqDamEnableExtMetaExtraction
     */
    public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
        return cqDamEnableExtMetaExtraction;
    }

    public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
        this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCommonsHandlerStandardImageHandlerProperties {\n");
        
        sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
        sb.append("    largeCommentThreshold: ").append(toIndentedString(largeCommentThreshold)).append("\n");
        sb.append("    cqDamEnableExtMetaExtraction: ").append(toIndentedString(cqDamEnableExtMetaExtraction)).append("\n");
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

