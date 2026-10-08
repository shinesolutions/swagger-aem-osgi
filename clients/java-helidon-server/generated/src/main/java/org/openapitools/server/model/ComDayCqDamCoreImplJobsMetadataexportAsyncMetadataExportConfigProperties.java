package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties   {

    private ConfigNodePropertyString operation;
    private ConfigNodePropertyBoolean emailEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.
     *
     * @param operation operation
     * @param emailEnabled emailEnabled
     */
    public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(
        ConfigNodePropertyString operation, 
        ConfigNodePropertyBoolean emailEnabled
    ) {
        this.operation = operation;
        this.emailEnabled = emailEnabled;
    }



    /**
     * Get operation
     * @return operation
     */
    public ConfigNodePropertyString getOperation() {
        return operation;
    }

    public void setOperation(ConfigNodePropertyString operation) {
        this.operation = operation;
    }

    /**
     * Get emailEnabled
     * @return emailEnabled
     */
    public ConfigNodePropertyBoolean getEmailEnabled() {
        return emailEnabled;
    }

    public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
        this.emailEnabled = emailEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

