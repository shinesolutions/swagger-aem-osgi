package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties   {

    private ConfigNodePropertyString processLabel;
    private ConfigNodePropertyString cqDamInddPagesRegex;
    private ConfigNodePropertyBoolean idsJobDecoupled;
    private ConfigNodePropertyString idsJobWorkflowModel;

    /**
     * Default constructor.
     */
    public ComDayCqDamInddProcessINDDMediaExtractProcessProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamInddProcessINDDMediaExtractProcessProperties.
     *
     * @param processLabel processLabel
     * @param cqDamInddPagesRegex cqDamInddPagesRegex
     * @param idsJobDecoupled idsJobDecoupled
     * @param idsJobWorkflowModel idsJobWorkflowModel
     */
    public ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
        ConfigNodePropertyString processLabel, 
        ConfigNodePropertyString cqDamInddPagesRegex, 
        ConfigNodePropertyBoolean idsJobDecoupled, 
        ConfigNodePropertyString idsJobWorkflowModel
    ) {
        this.processLabel = processLabel;
        this.cqDamInddPagesRegex = cqDamInddPagesRegex;
        this.idsJobDecoupled = idsJobDecoupled;
        this.idsJobWorkflowModel = idsJobWorkflowModel;
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
     * Get cqDamInddPagesRegex
     * @return cqDamInddPagesRegex
     */
    public ConfigNodePropertyString getCqDamInddPagesRegex() {
        return cqDamInddPagesRegex;
    }

    public void setCqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
        this.cqDamInddPagesRegex = cqDamInddPagesRegex;
    }

    /**
     * Get idsJobDecoupled
     * @return idsJobDecoupled
     */
    public ConfigNodePropertyBoolean getIdsJobDecoupled() {
        return idsJobDecoupled;
    }

    public void setIdsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
        this.idsJobDecoupled = idsJobDecoupled;
    }

    /**
     * Get idsJobWorkflowModel
     * @return idsJobWorkflowModel
     */
    public ConfigNodePropertyString getIdsJobWorkflowModel() {
        return idsJobWorkflowModel;
    }

    public void setIdsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
        this.idsJobWorkflowModel = idsJobWorkflowModel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {\n");
        
        sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
        sb.append("    cqDamInddPagesRegex: ").append(toIndentedString(cqDamInddPagesRegex)).append("\n");
        sb.append("    idsJobDecoupled: ").append(toIndentedString(idsJobDecoupled)).append("\n");
        sb.append("    idsJobWorkflowModel: ").append(toIndentedString(idsJobWorkflowModel)).append("\n");
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

