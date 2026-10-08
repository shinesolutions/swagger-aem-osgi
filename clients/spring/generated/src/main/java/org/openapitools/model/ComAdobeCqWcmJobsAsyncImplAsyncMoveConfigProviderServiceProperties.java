package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
 */

@JsonTypeName("comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger threshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jobTopicName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean emailEnabled;

  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties threshold(@Nullable ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @Valid 
  @Schema(name = "threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public @Nullable ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }

  @JsonProperty("threshold")
  public void setThreshold(@Nullable ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties jobTopicName(@Nullable ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

  /**
   * Get jobTopicName
   * @return jobTopicName
   */
  @Valid 
  @Schema(name = "jobTopicName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobTopicName")
  public @Nullable ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }

  @JsonProperty("jobTopicName")
  public void setJobTopicName(@Nullable ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties emailEnabled(@Nullable ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  /**
   * Get emailEnabled
   * @return emailEnabled
   */
  @Valid 
  @Schema(name = "emailEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailEnabled")
  public @Nullable ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  @JsonProperty("emailEnabled")
  public void setEmailEnabled(@Nullable ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties) o;
    return Objects.equals(this.threshold, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.threshold) &&
        Objects.equals(this.jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(this.emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, jobTopicName, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    jobTopicName: ").append(toIndentedString(jobTopicName)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

