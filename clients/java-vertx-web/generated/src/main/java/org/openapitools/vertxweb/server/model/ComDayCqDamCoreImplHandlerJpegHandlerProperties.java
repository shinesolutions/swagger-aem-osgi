package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqDamCoreImplHandlerJpegHandlerProperties   {
  
  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;
  private ConfigNodePropertyInteger largeFileThreshold;
  private ConfigNodePropertyInteger largeCommentThreshold;

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties () {

  }

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties (ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction, ConfigNodePropertyInteger largeFileThreshold, ConfigNodePropertyInteger largeCommentThreshold) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    this.largeFileThreshold = largeFileThreshold;
    this.largeCommentThreshold = largeCommentThreshold;
  }

    
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }
  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

    
  @JsonProperty("large_file_threshold")
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }
  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

    
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
