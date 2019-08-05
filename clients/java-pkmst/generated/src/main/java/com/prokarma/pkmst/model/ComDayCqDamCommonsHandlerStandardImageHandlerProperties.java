package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCommonsHandlerStandardImageHandlerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCommonsHandlerStandardImageHandlerProperties   {
  @JsonProperty("large_file_threshold")
  private ConfigNodePropertyInteger largeFileThreshold = null;

  @JsonProperty("large_comment_threshold")
  private ConfigNodePropertyInteger largeCommentThreshold = null;

  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction = null;

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

   /**
   * Get largeFileThreshold
   * @return largeFileThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties largeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
    return this;
  }

   /**
   * Get largeCommentThreshold
   * @return largeCommentThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLargeCommentThreshold() {
    return largeCommentThreshold;
  }

  public void setLargeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
  }

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties cqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    return this;
  }

   /**
   * Get cqDamEnableExtMetaExtraction
   * @return cqDamEnableExtMetaExtraction
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

