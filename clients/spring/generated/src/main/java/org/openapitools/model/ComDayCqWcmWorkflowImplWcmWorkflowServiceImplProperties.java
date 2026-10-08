package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
 */

@JsonTypeName("comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minThreadPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxThreadPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList;

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties minThreadPoolSize(@Nullable ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
    return this;
  }

  /**
   * Get minThreadPoolSize
   * @return minThreadPoolSize
   */
  @Valid 
  @Schema(name = "minThreadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minThreadPoolSize")
  public @Nullable ConfigNodePropertyInteger getMinThreadPoolSize() {
    return minThreadPoolSize;
  }

  @JsonProperty("minThreadPoolSize")
  public void setMinThreadPoolSize(@Nullable ConfigNodePropertyInteger minThreadPoolSize) {
    this.minThreadPoolSize = minThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties maxThreadPoolSize(@Nullable ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
    return this;
  }

  /**
   * Get maxThreadPoolSize
   * @return maxThreadPoolSize
   */
  @Valid 
  @Schema(name = "maxThreadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxThreadPoolSize")
  public @Nullable ConfigNodePropertyInteger getMaxThreadPoolSize() {
    return maxThreadPoolSize;
  }

  @JsonProperty("maxThreadPoolSize")
  public void setMaxThreadPoolSize(@Nullable ConfigNodePropertyInteger maxThreadPoolSize) {
    this.maxThreadPoolSize = maxThreadPoolSize;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorkflowTerminateOnActivate(@Nullable ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
    return this;
  }

  /**
   * Get cqWcmWorkflowTerminateOnActivate
   * @return cqWcmWorkflowTerminateOnActivate
   */
  @Valid 
  @Schema(name = "cq.wcm.workflow.terminate.on.activate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  public @Nullable ConfigNodePropertyBoolean getCqWcmWorkflowTerminateOnActivate() {
    return cqWcmWorkflowTerminateOnActivate;
  }

  @JsonProperty("cq.wcm.workflow.terminate.on.activate")
  public void setCqWcmWorkflowTerminateOnActivate(@Nullable ConfigNodePropertyBoolean cqWcmWorkflowTerminateOnActivate) {
    this.cqWcmWorkflowTerminateOnActivate = cqWcmWorkflowTerminateOnActivate;
  }

  public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties cqWcmWorklfowTerminateExclusionList(@Nullable ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
    return this;
  }

  /**
   * Get cqWcmWorklfowTerminateExclusionList
   * @return cqWcmWorklfowTerminateExclusionList
   */
  @Valid 
  @Schema(name = "cq.wcm.worklfow.terminate.exclusion.list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  public @Nullable ConfigNodePropertyArray getCqWcmWorklfowTerminateExclusionList() {
    return cqWcmWorklfowTerminateExclusionList;
  }

  @JsonProperty("cq.wcm.worklfow.terminate.exclusion.list")
  public void setCqWcmWorklfowTerminateExclusionList(@Nullable ConfigNodePropertyArray cqWcmWorklfowTerminateExclusionList) {
    this.cqWcmWorklfowTerminateExclusionList = cqWcmWorklfowTerminateExclusionList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.eventFilter) &&
        Objects.equals(this.minThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.minThreadPoolSize) &&
        Objects.equals(this.maxThreadPoolSize, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.maxThreadPoolSize) &&
        Objects.equals(this.cqWcmWorkflowTerminateOnActivate, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorkflowTerminateOnActivate) &&
        Objects.equals(this.cqWcmWorklfowTerminateExclusionList, comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.cqWcmWorklfowTerminateExclusionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, minThreadPoolSize, maxThreadPoolSize, cqWcmWorkflowTerminateOnActivate, cqWcmWorklfowTerminateExclusionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    minThreadPoolSize: ").append(toIndentedString(minThreadPoolSize)).append("\n");
    sb.append("    maxThreadPoolSize: ").append(toIndentedString(maxThreadPoolSize)).append("\n");
    sb.append("    cqWcmWorkflowTerminateOnActivate: ").append(toIndentedString(cqWcmWorkflowTerminateOnActivate)).append("\n");
    sb.append("    cqWcmWorklfowTerminateExclusionList: ").append(toIndentedString(cqWcmWorklfowTerminateExclusionList)).append("\n");
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

