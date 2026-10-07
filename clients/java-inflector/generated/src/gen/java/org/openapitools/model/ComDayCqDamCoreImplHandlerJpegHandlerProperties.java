package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplHandlerJpegHandlerProperties   {
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;

  @JsonProperty("large_file_threshold")
  private ConfigNodePropertyInteger largeFileThreshold;

  @JsonProperty("large_comment_threshold")
  private ConfigNodePropertyInteger largeCommentThreshold;

  /**
   **/
  public ComDayCqDamCoreImplHandlerJpegHandlerProperties cqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }
  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

  /**
   **/
  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large_file_threshold")
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }
  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  /**
   **/
  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("large_comment_threshold")
  public ConfigNodePropertyInteger getLargeCommentThreshold() {
    return largeCommentThreshold;
  }
  public void setLargeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerJpegHandlerProperties comDayCqDamCoreImplHandlerJpegHandlerProperties = (ComDayCqDamCoreImplHandlerJpegHandlerProperties) o;
    return Objects.equals(cqDamEnableExtMetaExtraction, comDayCqDamCoreImplHandlerJpegHandlerProperties.cqDamEnableExtMetaExtraction) &&
        Objects.equals(largeFileThreshold, comDayCqDamCoreImplHandlerJpegHandlerProperties.largeFileThreshold) &&
        Objects.equals(largeCommentThreshold, comDayCqDamCoreImplHandlerJpegHandlerProperties.largeCommentThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamEnableExtMetaExtraction, largeFileThreshold, largeCommentThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerJpegHandlerProperties {\n");
    
    sb.append("    cqDamEnableExtMetaExtraction: ").append(toIndentedString(cqDamEnableExtMetaExtraction)).append("\n");
    sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
    sb.append("    largeCommentThreshold: ").append(toIndentedString(largeCommentThreshold)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

