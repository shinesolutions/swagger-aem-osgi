package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplHandlerJpegHandlerProperties
 */

@JsonTypeName("comDayCqDamCoreImplHandlerJpegHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplHandlerJpegHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeFileThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeCommentThreshold;

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties cqDamEnableExtMetaExtraction(@Nullable ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
    return this;
  }

  /**
   * Get cqDamEnableExtMetaExtraction
   * @return cqDamEnableExtMetaExtraction
   */
  @Valid 
  @Schema(name = "cq.dam.enable.ext.meta.extraction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  public @Nullable ConfigNodePropertyBoolean getCqDamEnableExtMetaExtraction() {
    return cqDamEnableExtMetaExtraction;
  }

  @JsonProperty("cq.dam.enable.ext.meta.extraction")
  public void setCqDamEnableExtMetaExtraction(@Nullable ConfigNodePropertyBoolean cqDamEnableExtMetaExtraction) {
    this.cqDamEnableExtMetaExtraction = cqDamEnableExtMetaExtraction;
  }

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeFileThreshold(@Nullable ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

  /**
   * Get largeFileThreshold
   * @return largeFileThreshold
   */
  @Valid 
  @Schema(name = "large_file_threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large_file_threshold")
  public @Nullable ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  @JsonProperty("large_file_threshold")
  public void setLargeFileThreshold(@Nullable ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  public ComDayCqDamCoreImplHandlerJpegHandlerProperties largeCommentThreshold(@Nullable ConfigNodePropertyInteger largeCommentThreshold) {
    this.largeCommentThreshold = largeCommentThreshold;
    return this;
  }

  /**
   * Get largeCommentThreshold
   * @return largeCommentThreshold
   */
  @Valid 
  @Schema(name = "large_comment_threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large_comment_threshold")
  public @Nullable ConfigNodePropertyInteger getLargeCommentThreshold() {
    return largeCommentThreshold;
  }

  @JsonProperty("large_comment_threshold")
  public void setLargeCommentThreshold(@Nullable ConfigNodePropertyInteger largeCommentThreshold) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

