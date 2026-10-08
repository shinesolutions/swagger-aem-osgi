package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletHealthCheckServletProperties   {

    private ConfigNodePropertyString cqDamSyncWorkflowId;
    private ConfigNodePropertyArray cqDamSyncFolderTypes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletHealthCheckServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletHealthCheckServletProperties.
     *
     * @param cqDamSyncWorkflowId cqDamSyncWorkflowId
     * @param cqDamSyncFolderTypes cqDamSyncFolderTypes
     */
    public ComDayCqDamCoreImplServletHealthCheckServletProperties(
        ConfigNodePropertyString cqDamSyncWorkflowId, 
        ConfigNodePropertyArray cqDamSyncFolderTypes
    ) {
        this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
        this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
    }



    /**
     * Get cqDamSyncWorkflowId
     * @return cqDamSyncWorkflowId
     */
    public ConfigNodePropertyString getCqDamSyncWorkflowId() {
        return cqDamSyncWorkflowId;
    }

    public void setCqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
        this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
    }

    /**
     * Get cqDamSyncFolderTypes
     * @return cqDamSyncFolderTypes
     */
    public ConfigNodePropertyArray getCqDamSyncFolderTypes() {
        return cqDamSyncFolderTypes;
    }

    public void setCqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
        this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletHealthCheckServletProperties {\n");
        
        sb.append("    cqDamSyncWorkflowId: ").append(toIndentedString(cqDamSyncWorkflowId)).append("\n");
        sb.append("    cqDamSyncFolderTypes: ").append(toIndentedString(cqDamSyncFolderTypes)).append("\n");
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

