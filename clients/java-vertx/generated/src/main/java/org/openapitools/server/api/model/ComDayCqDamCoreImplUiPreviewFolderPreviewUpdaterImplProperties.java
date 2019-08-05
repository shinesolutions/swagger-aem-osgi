package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties   {
  
  private ConfigNodePropertyBoolean createPreviewEnabled = null;
  private ConfigNodePropertyBoolean updatePreviewEnabled = null;
  private ConfigNodePropertyInteger queueSize = null;
  private ConfigNodePropertyString folderPreviewRenditionRegex = null;

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties () {

  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties (ConfigNodePropertyBoolean createPreviewEnabled, ConfigNodePropertyBoolean updatePreviewEnabled, ConfigNodePropertyInteger queueSize, ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.createPreviewEnabled = createPreviewEnabled;
    this.updatePreviewEnabled = updatePreviewEnabled;
    this.queueSize = queueSize;
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
  }

    
  @JsonProperty("createPreviewEnabled")
  public ConfigNodePropertyBoolean getCreatePreviewEnabled() {
    return createPreviewEnabled;
  }
  public void setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
    this.createPreviewEnabled = createPreviewEnabled;
  }

    
  @JsonProperty("updatePreviewEnabled")
  public ConfigNodePropertyBoolean getUpdatePreviewEnabled() {
    return updatePreviewEnabled;
  }
  public void setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
    this.updatePreviewEnabled = updatePreviewEnabled;
  }

    
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

    
  @JsonProperty("folderPreviewRenditionRegex")
  public ConfigNodePropertyString getFolderPreviewRenditionRegex() {
    return folderPreviewRenditionRegex;
  }
  public void setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties = (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties) o;
    return Objects.equals(createPreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.createPreviewEnabled) &&
        Objects.equals(updatePreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.updatePreviewEnabled) &&
        Objects.equals(queueSize, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.queueSize) &&
        Objects.equals(folderPreviewRenditionRegex, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.folderPreviewRenditionRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createPreviewEnabled, updatePreviewEnabled, queueSize, folderPreviewRenditionRegex);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
