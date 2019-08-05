package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean createPreviewEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean updatePreviewEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queueSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString folderPreviewRenditionRegex = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

