package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean createPreviewEnabled;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean updatePreviewEnabled;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger queueSize;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString folderPreviewRenditionRegex;
 /**
   * Get createPreviewEnabled
   * @return createPreviewEnabled
  **/
  @JsonProperty("createPreviewEnabled")
  public ConfigNodePropertyBoolean getCreatePreviewEnabled() {
    return createPreviewEnabled;
  }

  public void setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
    this.createPreviewEnabled = createPreviewEnabled;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties createPreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
    this.createPreviewEnabled = createPreviewEnabled;
    return this;
  }

 /**
   * Get updatePreviewEnabled
   * @return updatePreviewEnabled
  **/
  @JsonProperty("updatePreviewEnabled")
  public ConfigNodePropertyBoolean getUpdatePreviewEnabled() {
    return updatePreviewEnabled;
  }

  public void setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
    this.updatePreviewEnabled = updatePreviewEnabled;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties updatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
    this.updatePreviewEnabled = updatePreviewEnabled;
    return this;
  }

 /**
   * Get queueSize
   * @return queueSize
  **/
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

 /**
   * Get folderPreviewRenditionRegex
   * @return folderPreviewRenditionRegex
  **/
  @JsonProperty("folderPreviewRenditionRegex")
  public ConfigNodePropertyString getFolderPreviewRenditionRegex() {
    return folderPreviewRenditionRegex;
  }

  public void setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties folderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
    return this;
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
    return Objects.equals(this.createPreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.createPreviewEnabled) &&
        Objects.equals(this.updatePreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.updatePreviewEnabled) &&
        Objects.equals(this.queueSize, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.queueSize) &&
        Objects.equals(this.folderPreviewRenditionRegex, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.folderPreviewRenditionRegex);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

