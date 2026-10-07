package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties   {

    private ConfigNodePropertyBoolean isTransactionRecordingEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeAemTransactionCoreImplTransactionRecorderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeAemTransactionCoreImplTransactionRecorderProperties.
     *
     * @param isTransactionRecordingEnabled isTransactionRecordingEnabled
     */
    public ComAdobeAemTransactionCoreImplTransactionRecorderProperties(
        ConfigNodePropertyBoolean isTransactionRecordingEnabled
    ) {
        this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    }



    /**
     * Get isTransactionRecordingEnabled
     * @return isTransactionRecordingEnabled
     */
    public ConfigNodePropertyBoolean getIsTransactionRecordingEnabled() {
        return isTransactionRecordingEnabled;
    }

    public void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
        this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {\n");
        
        sb.append("    isTransactionRecordingEnabled: ").append(toIndentedString(isTransactionRecordingEnabled)).append("\n");
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

