package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComDayCqDamCoreProcessMetadataProcessorProcessProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString processLabel = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqDamMetadataXssprotectedProperties = null;
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

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties processLabel(ConfigNodePropertyString processLabel) {
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

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }

 /**
   * Get cqDamMetadataXssprotectedProperties
   * @return cqDamMetadataXssprotectedProperties
  **/
  @JsonProperty("cq.dam.metadata.xssprotected.properties")
  public ConfigNodePropertyArray getCqDamMetadataXssprotectedProperties() {
    return cqDamMetadataXssprotectedProperties;
  }

  public void setCqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
    sb.append("    cqDamMetadataXssprotectedProperties: ").append(toIndentedString(cqDamMetadataXssprotectedProperties)).append("\n");
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

