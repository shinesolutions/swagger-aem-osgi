package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCommonsHandlerStandardImageHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
    return Objects.equals(largeFileThreshold, comDayCqDamCommonsHandlerStandardImageHandlerProperties.largeFileThreshold) &&
        Objects.equals(largeCommentThreshold, comDayCqDamCommonsHandlerStandardImageHandlerProperties.largeCommentThreshold) &&
        Objects.equals(cqDamEnableExtMetaExtraction, comDayCqDamCommonsHandlerStandardImageHandlerProperties.cqDamEnableExtMetaExtraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileThreshold, largeCommentThreshold, cqDamEnableExtMetaExtraction);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

