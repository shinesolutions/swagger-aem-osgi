package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
 */

@JsonTypeName("comAdobeGraniteBundlesHcImplJobsHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxQueuedJobs;

  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties maxQueuedJobs(@Nullable ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
    return this;
  }

  /**
   * Get maxQueuedJobs
   * @return maxQueuedJobs
   */
  @Valid 
  @Schema(name = "max.queued.jobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.queued.jobs")
  public @Nullable ConfigNodePropertyInteger getMaxQueuedJobs() {
    return maxQueuedJobs;
  }

  @JsonProperty("max.queued.jobs")
  public void setMaxQueuedJobs(@Nullable ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties comAdobeGraniteBundlesHcImplJobsHealthCheckProperties = (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.hcTags) &&
        Objects.equals(this.maxQueuedJobs, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.maxQueuedJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, maxQueuedJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    maxQueuedJobs: ").append(toIndentedString(maxQueuedJobs)).append("\n");
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

