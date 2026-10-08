package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCommonsHandlerStandardImageHandlerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger largeFileThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger largeCommentThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;
 /**
   * Get largeFileThreshold
   * @return largeFileThreshold
  **/
  @JsonProperty("large_file_threshold")
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

 /**
   * Get largeCommentThreshold
   * @return largeCommentThreshold
  **/
  @JsonProperty("large_comment_threshold")
  public ConfigNodePropertyInteger getLargeCommentThreshold() {
    return largeCommentThreshold;
  }

  public void setLargeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
  }

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties largeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
    return this;
  }

 /**
   * Get cqDamEnableExtMetaExtraction
   * @return cqDamEnableExtMetaExtraction
  **/
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties cqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
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
    ComDayCqDamCommonsHandlerStandardImageHandlerProperties comDayCqDamCommonsHandlerStandardImageHandlerProperties = (ComDayCqDamCommonsHandlerStandardImageHandlerProperties) o;
    return Objects.equals(this.largeFileThreshold, comDayCqDamCommonsHandlerStandardImageHandlerProperties.largeFileThreshold) &&
        Objects.equals(this.largeCommentThreshold, comDayCqDamCommonsHandlerStandardImageHandlerProperties.largeCommentThreshold) &&
        Objects.equals(this.cqDamEnableExtMetaExtraction, comDayCqDamCommonsHandlerStandardImageHandlerProperties.cqDamEnableExtMetaExtraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileThreshold, largeCommentThreshold, cqDamEnableExtMetaExtraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCommonsHandlerStandardImageHandlerProperties {\n");
    
    sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
    sb.append("    largeCommentThreshold: ").append(toIndentedString(largeCommentThreshold)).append("\n");
    sb.append("    cqDamEnableExtMetaExtraction: ").append(toIndentedString(cqDamEnableExtMetaExtraction)).append("\n");
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

