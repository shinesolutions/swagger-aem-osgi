package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplHandlerJpegHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplHandlerJpegHandlerProperties   {
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction = null;

  @JsonProperty("large_file_threshold")
  private ConfigNodePropertyInteger largeFileThreshold = null;

  @JsonProperty("large_comment_threshold")
  private ConfigNodePropertyInteger largeCommentThreshold = null;

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties cqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    return this;
  }

   /**
   * Get cqDamEnableExtMetaExtraction
   * @return cqDamEnableExtMetaExtraction
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

   /**
   * Get largeFileThreshold
   * @return largeFileThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
    return this;
  }

   /**
   * Get largeCommentThreshold
   * @return largeCommentThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getLargeCommentThreshold() {
    return largeCommentThreshold;
  }

  public void setLargeCommentThreshold(ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

