package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties   {

    private ConfigNodePropertyBoolean createPreviewEnabled;
    private ConfigNodePropertyBoolean updatePreviewEnabled;
    private ConfigNodePropertyInteger queueSize;
    private ConfigNodePropertyString folderPreviewRenditionRegex;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
     *
     * @param createPreviewEnabled createPreviewEnabled
     * @param updatePreviewEnabled updatePreviewEnabled
     * @param queueSize queueSize
     * @param folderPreviewRenditionRegex folderPreviewRenditionRegex
     */
    public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
        ConfigNodePropertyBoolean createPreviewEnabled, 
        ConfigNodePropertyBoolean updatePreviewEnabled, 
        ConfigNodePropertyInteger queueSize, 
        ConfigNodePropertyString folderPreviewRenditionRegex
    ) {
        this.createPreviewEnabled = createPreviewEnabled;
        this.updatePreviewEnabled = updatePreviewEnabled;
        this.queueSize = queueSize;
        this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
    }



    /**
     * Get createPreviewEnabled
     * @return createPreviewEnabled
     */
    public ConfigNodePropertyBoolean getCreatePreviewEnabled() {
        return createPreviewEnabled;
    }

    public void setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
        this.createPreviewEnabled = createPreviewEnabled;
    }

    /**
     * Get updatePreviewEnabled
     * @return updatePreviewEnabled
     */
    public ConfigNodePropertyBoolean getUpdatePreviewEnabled() {
        return updatePreviewEnabled;
    }

    public void setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
        this.updatePreviewEnabled = updatePreviewEnabled;
    }

    /**
     * Get queueSize
     * @return queueSize
     */
    public ConfigNodePropertyInteger getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(ConfigNodePropertyInteger queueSize) {
        this.queueSize = queueSize;
    }

    /**
     * Get folderPreviewRenditionRegex
     * @return folderPreviewRenditionRegex
     */
    public ConfigNodePropertyString getFolderPreviewRenditionRegex() {
        return folderPreviewRenditionRegex;
    }

    public void setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
        this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {\n");
        
        sb.append("    createPreviewEnabled: ").append(toIndentedString(createPreviewEnabled)).append("\n");
        sb.append("    updatePreviewEnabled: ").append(toIndentedString(updatePreviewEnabled)).append("\n");
        sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
        sb.append("    folderPreviewRenditionRegex: ").append(toIndentedString(folderPreviewRenditionRegex)).append("\n");
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

