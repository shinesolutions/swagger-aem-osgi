package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties   {
  

  private ConfigNodePropertyString processLabel = null;

  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.enable.sha1")
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }
  public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
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
    return Objects.equals(processLabel, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.processLabel) &&
        Objects.equals(cqDamEnableSha1, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.cqDamEnableSha1);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

