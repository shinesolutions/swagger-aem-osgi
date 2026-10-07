package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties   {

    private ConfigNodePropertyString operation;
    private ConfigNodePropertyString operationIcon;
    private ConfigNodePropertyString topicName;
    private ConfigNodePropertyBoolean emailEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
     *
     * @param operation operation
     * @param operationIcon operationIcon
     * @param topicName topicName
     * @param emailEnabled emailEnabled
     */
    public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
        ConfigNodePropertyString operation, 
        ConfigNodePropertyString operationIcon, 
        ConfigNodePropertyString topicName, 
        ConfigNodePropertyBoolean emailEnabled
    ) {
        this.operation = operation;
        this.operationIcon = operationIcon;
        this.topicName = topicName;
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
     * Get operationIcon
     * @return operationIcon
     */
    public ConfigNodePropertyString getOperationIcon() {
        return operationIcon;
    }

    public void setOperationIcon(ConfigNodePropertyString operationIcon) {
        this.operationIcon = operationIcon;
    }

    /**
     * Get topicName
     * @return topicName
     */
    public ConfigNodePropertyString getTopicName() {
        return topicName;
    }

    public void setTopicName(ConfigNodePropertyString topicName) {
        this.topicName = topicName;
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
        sb.append("class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    operationIcon: ").append(toIndentedString(operationIcon)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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

