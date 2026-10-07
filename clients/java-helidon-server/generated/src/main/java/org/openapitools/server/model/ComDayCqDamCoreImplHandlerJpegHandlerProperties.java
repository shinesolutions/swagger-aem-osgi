package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplHandlerJpegHandlerProperties   {

    private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;
    private ConfigNodePropertyInteger largeFileThreshold;
    private ConfigNodePropertyInteger largeCommentThreshold;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplHandlerJpegHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplHandlerJpegHandlerProperties.
     *
     * @param cqDamEnableExtMetaExtraction cqDamEnableExtMetaExtraction
     * @param largeFileThreshold largeFileThreshold
     * @param largeCommentThreshold largeCommentThreshold
     */
    public ComDayCqDamCoreImplHandlerJpegHandlerProperties(
        ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction, 
        ConfigNodePropertyInteger largeFileThreshold, 
        ConfigNodePropertyInteger largeCommentThreshold
    ) {
        this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
        this.largeFileThreshold = largeFileThreshold;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplHandlerJpegHandlerProperties {\n");
        
        sb.append("    cqDamEnableExtMetaExtraction: ").append(toIndentedString(cqDamEnableExtMetaExtraction)).append("\n");
        sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
        sb.append("    largeCommentThreshold: ").append(toIndentedString(largeCommentThreshold)).append("\n");
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

