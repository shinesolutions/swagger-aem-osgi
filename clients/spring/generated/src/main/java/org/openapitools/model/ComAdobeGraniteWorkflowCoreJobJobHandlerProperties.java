package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
 */

@JsonTypeName("comAdobeGraniteWorkflowCoreJobJobHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray jobTopics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean allowSelfProcessTermination;

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties jobTopics(@Nullable ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  /**
   * Get jobTopics
   * @return jobTopics
   */
  @Valid 
  @Schema(name = "job.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job.topics")
  public @Nullable ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }

  @JsonProperty("job.topics")
  public void setJobTopics(@Nullable ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties allowSelfProcessTermination(@Nullable ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
    return this;
  }

  /**
   * Get allowSelfProcessTermination
   * @return allowSelfProcessTermination
   */
  @Valid 
  @Schema(name = "allow.self.process.termination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow.self.process.termination")
  public @Nullable ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }

  @JsonProperty("allow.self.process.termination")
  public void setAllowSelfProcessTermination(@Nullable ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties comAdobeGraniteWorkflowCoreJobJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties) o;
    return Objects.equals(this.jobTopics, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.jobTopics) &&
        Objects.equals(this.allowSelfProcessTermination, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.allowSelfProcessTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics, allowSelfProcessTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {\n");
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
    sb.append("    allowSelfProcessTermination: ").append(toIndentedString(allowSelfProcessTermination)).append("\n");
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

