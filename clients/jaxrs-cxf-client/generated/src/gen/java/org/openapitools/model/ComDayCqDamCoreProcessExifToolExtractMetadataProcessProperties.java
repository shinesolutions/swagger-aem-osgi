package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString processLabel = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;
 /**
   * Get processLabel
   * @return processLabel
  **/
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

 /**
   * Get cqDamEnableSha1
   * @return cqDamEnableSha1
  **/
  @JsonProperty("cq.dam.enable.sha1")
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }

  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
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

