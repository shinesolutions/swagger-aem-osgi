package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreProcessMetadataProcessorProcessProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString processLabel;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqDamEnableSha1;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cqDamMetadataXssprotectedProperties;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties comDayCqDamCoreProcessMetadataProcessorProcessProperties = (ComDayCqDamCoreProcessMetadataProcessorProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamCoreProcessMetadataProcessorProcessProperties.processLabel) &&
        Objects.equals(this.cqDamEnableSha1, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamEnableSha1) &&
        Objects.equals(this.cqDamMetadataXssprotectedProperties, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamMetadataXssprotectedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamEnableSha1, cqDamMetadataXssprotectedProperties);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

