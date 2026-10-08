package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreProcessExtractMetadataProcessProperties   {

    private ConfigNodePropertyString processLabel;
    private ConfigNodePropertyBoolean cqDamEnableSha1;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreProcessExtractMetadataProcessProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreProcessExtractMetadataProcessProperties.
     *
     * @param processLabel processLabel
     * @param cqDamEnableSha1 cqDamEnableSha1
     */
    public ComDayCqDamCoreProcessExtractMetadataProcessProperties(
        ConfigNodePropertyString processLabel, 
        ConfigNodePropertyBoolean cqDamEnableSha1
    ) {
        this.processLabel = processLabel;
        this.cqDamEnableSha1 = cqDamEnableSha1;
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
     * Get cqDamEnableSha1
     * @return cqDamEnableSha1
     */
    public ConfigNodePropertyBoolean getCqDamEnableSha1() {
        return cqDamEnableSha1;
    }

    public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
        this.cqDamEnableSha1 = cqDamEnableSha1;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreProcessExtractMetadataProcessProperties {\n");
        
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
        sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
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

