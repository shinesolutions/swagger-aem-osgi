package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplHandlerJpegHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;

  @JsonProperty("large_file_threshold")
  private ConfigNodePropertyInteger largeFileThreshold;

  @JsonProperty("large_comment_threshold")
  private ConfigNodePropertyInteger largeCommentThreshold;

  /**
   * 
   * @return cqDamEnableExtMetaExtraction
   */
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

  /**
   * 
   * @return largeFileThreshold
   */
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  /**
   * 
   * @return largeCommentThreshold
   */
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
    return Objects.equals(this.cqDamEnableExtMetaExtraction, comDayCqDamCoreImplHandlerJpegHandlerProperties.cqDamEnableExtMetaExtraction) &&
        Objects.equals(this.largeFileThreshold, comDayCqDamCoreImplHandlerJpegHandlerProperties.largeFileThreshold) &&
        Objects.equals(this.largeCommentThreshold, comDayCqDamCoreImplHandlerJpegHandlerProperties.largeCommentThreshold);
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
