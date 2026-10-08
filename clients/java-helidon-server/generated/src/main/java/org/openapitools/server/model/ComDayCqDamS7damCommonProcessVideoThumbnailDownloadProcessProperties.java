package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties   {

    private ConfigNodePropertyString processLabel;

    /**
     * Default constructor.
     */
    public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.
     *
     * @param processLabel processLabel
     */
    public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(
        ConfigNodePropertyString processLabel
    ) {
        this.processLabel = processLabel;
    }



    /**
     * Get processLabel
     * @return processLabel
     */
    public ConfigNodePropertyString getProcessLabel() {
        return processLabel;
    }

    public void setProcessLabel(ConfigNodePropertyString processLabel) {
        this.processLabel = processLabel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {\n");
        
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
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

