package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString processLabel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqDamEnableSha1;
 /**
  * Get processLabel
  * @return processLabel
  */
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  /**
   * Sets the <code>processLabel</code> property.
   */
 public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  /**
   * Sets the <code>processLabel</code> property.
   */
  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

 /**
  * Get cqDamEnableSha1
  * @return cqDamEnableSha1
  */
  @JsonProperty("cq.dam.enable.sha1")
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  /**
   * Sets the <code>cqDamEnableSha1</code> property.
   */
 public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }

  /**
   * Sets the <code>cqDamEnableSha1</code> property.
   */
  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
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
    ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties = (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.processLabel) &&
        Objects.equals(this.cqDamEnableSha1, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.cqDamEnableSha1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamEnableSha1);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

