package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties   {
  @JsonProperty("process.label")
  private ConfigNodePropertyString processLabel = null;

  @JsonProperty("cq.dam.enable.sha1")
  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;

  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }

   /**
   * Get cqDamEnableSha1
   * @return cqDamEnableSha1
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

