package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
 */

@JsonTypeName("comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerImageresourcetypes
   * @return cqPagesupdatehandlerImageresourcetypes
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.imageresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public void setCqPagesupdatehandlerImageresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerProductresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerProductresourcetypes
   * @return cqPagesupdatehandlerProductresourcetypes
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.productresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
  public void setCqPagesupdatehandlerProductresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerVideoresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerVideoresourcetypes
   * @return cqPagesupdatehandlerVideoresourcetypes
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.videoresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
  public void setCqPagesupdatehandlerVideoresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerDynamicsequenceresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerDynamicsequenceresourcetypes
   * @return cqPagesupdatehandlerDynamicsequenceresourcetypes
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.dynamicsequenceresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
  public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerPreviewmodepaths(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerPreviewmodepaths
   * @return cqPagesupdatehandlerPreviewmodepaths
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.previewmodepaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }

  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
  public void setCqPagesupdatehandlerPreviewmodepaths(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties) o;
    return Objects.equals(this.cqPagesupdatehandlerImageresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerProductresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerProductresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerVideoresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerVideoresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerDynamicsequenceresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerDynamicsequenceresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerPreviewmodepaths, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes, cqPagesupdatehandlerProductresourcetypes, cqPagesupdatehandlerVideoresourcetypes, cqPagesupdatehandlerDynamicsequenceresourcetypes, cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerProductresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerProductresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerVideoresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerVideoresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerDynamicsequenceresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerDynamicsequenceresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerPreviewmodepaths: ").append(toIndentedString(cqPagesupdatehandlerPreviewmodepaths)).append("\n");
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

