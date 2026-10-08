package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties   {

    private ConfigNodePropertyString processLabel;
    private ConfigNodePropertyBoolean notifyOnComplete;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.
     *
     * @param processLabel processLabel
     * @param notifyOnComplete notifyOnComplete
     */
    public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(
        ConfigNodePropertyString processLabel, 
        ConfigNodePropertyBoolean notifyOnComplete
    ) {
        this.processLabel = processLabel;
        this.notifyOnComplete = notifyOnComplete;
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
     * Get notifyOnComplete
     * @return notifyOnComplete
     */
    public ConfigNodePropertyBoolean getNotifyOnComplete() {
        return notifyOnComplete;
    }

    public void setNotifyOnComplete(ConfigNodePropertyBoolean notifyOnComplete) {
        this.notifyOnComplete = notifyOnComplete;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {\n");
        
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
        sb.append("    notifyOnComplete: ").append(toIndentedString(notifyOnComplete)).append("\n");
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

