package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCommonsHandlerStandardImageHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCommonsHandlerStandardImageHandlerProperties   {
  @JsonProperty("large_file_threshold")
  @Valid

  private ConfigNodePropertyInteger largeFileThreshold;

  @JsonProperty("large_comment_threshold")
  @Valid

  private ConfigNodePropertyInteger largeCommentThreshold;

  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  @Valid

  private ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;

  public ComDayCqDamCommonsHandlerStandardImageHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

   /**
   * Get largeFileThreshold
   * @return largeFileThreshold
  **/
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
  public ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  public void setCqDamEnableExtMetaExtraction(ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

