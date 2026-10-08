package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheSlingEventImplJobsDefaultJobManagerProperties
 */

@JsonTypeName("orgApacheSlingEventImplJobsDefaultJobManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown queuePriority;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueRetries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueRetrydelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueMaxparallel;

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queuePriority(@Nullable ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
    return this;
  }

  /**
   * Get queuePriority
   * @return queuePriority
   */
  @Valid 
  @Schema(name = "queue.priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.priority")
  public @Nullable ConfigNodePropertyDropDown getQueuePriority() {
    return queuePriority;
  }

  @JsonProperty("queue.priority")
  public void setQueuePriority(@Nullable ConfigNodePropertyDropDown queuePriority) {
    this.queuePriority = queuePriority;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetries(@Nullable ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
    return this;
  }

  /**
   * Get queueRetries
   * @return queueRetries
   */
  @Valid 
  @Schema(name = "queue.retries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.retries")
  public @Nullable ConfigNodePropertyInteger getQueueRetries() {
    return queueRetries;
  }

  @JsonProperty("queue.retries")
  public void setQueueRetries(@Nullable ConfigNodePropertyInteger queueRetries) {
    this.queueRetries = queueRetries;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueRetrydelay(@Nullable ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
    return this;
  }

  /**
   * Get queueRetrydelay
   * @return queueRetrydelay
   */
  @Valid 
  @Schema(name = "queue.retrydelay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.retrydelay")
  public @Nullable ConfigNodePropertyInteger getQueueRetrydelay() {
    return queueRetrydelay;
  }

  @JsonProperty("queue.retrydelay")
  public void setQueueRetrydelay(@Nullable ConfigNodePropertyInteger queueRetrydelay) {
    this.queueRetrydelay = queueRetrydelay;
  }

  public OrgApacheSlingEventImplJobsDefaultJobManagerProperties queueMaxparallel(@Nullable ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
    return this;
  }

  /**
   * Get queueMaxparallel
   * @return queueMaxparallel
   */
  @Valid 
  @Schema(name = "queue.maxparallel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.maxparallel")
  public @Nullable ConfigNodePropertyInteger getQueueMaxparallel() {
    return queueMaxparallel;
  }

  @JsonProperty("queue.maxparallel")
  public void setQueueMaxparallel(@Nullable ConfigNodePropertyInteger queueMaxparallel) {
    this.queueMaxparallel = queueMaxparallel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties orgApacheSlingEventImplJobsDefaultJobManagerProperties = (OrgApacheSlingEventImplJobsDefaultJobManagerProperties) o;
    return Objects.equals(this.queuePriority, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queuePriority) &&
        Objects.equals(this.queueRetries, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetries) &&
        Objects.equals(this.queueRetrydelay, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueRetrydelay) &&
        Objects.equals(this.queueMaxparallel, orgApacheSlingEventImplJobsDefaultJobManagerProperties.queueMaxparallel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuePriority, queueRetries, queueRetrydelay, queueMaxparallel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {\n");
    sb.append("    queuePriority: ").append(toIndentedString(queuePriority)).append("\n");
    sb.append("    queueRetries: ").append(toIndentedString(queueRetries)).append("\n");
    sb.append("    queueRetrydelay: ").append(toIndentedString(queueRetrydelay)).append("\n");
    sb.append("    queueMaxparallel: ").append(toIndentedString(queueMaxparallel)).append("\n");
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

