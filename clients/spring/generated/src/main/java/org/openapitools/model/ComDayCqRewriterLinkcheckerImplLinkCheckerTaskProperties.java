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
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
 */

@JsonTypeName("comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger schedulerPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger goodLinkTestInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger badLinkTestInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger linkUnusedInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectionTimeout;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  /**
   * Get schedulerPeriod
   * @return schedulerPeriod
   */
  @Valid 
  @Schema(name = "scheduler.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.period")
  public @Nullable ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  @JsonProperty("scheduler.period")
  public void setSchedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
   */
  @Valid 
  @Schema(name = "scheduler.concurrent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.concurrent")
  public @Nullable ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  @JsonProperty("scheduler.concurrent")
  public void setSchedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties goodLinkTestInterval(@Nullable ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
    return this;
  }

  /**
   * Get goodLinkTestInterval
   * @return goodLinkTestInterval
   */
  @Valid 
  @Schema(name = "good_link_test_interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("good_link_test_interval")
  public @Nullable ConfigNodePropertyInteger getGoodLinkTestInterval() {
    return goodLinkTestInterval;
  }

  @JsonProperty("good_link_test_interval")
  public void setGoodLinkTestInterval(@Nullable ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties badLinkTestInterval(@Nullable ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
    return this;
  }

  /**
   * Get badLinkTestInterval
   * @return badLinkTestInterval
   */
  @Valid 
  @Schema(name = "bad_link_test_interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bad_link_test_interval")
  public @Nullable ConfigNodePropertyInteger getBadLinkTestInterval() {
    return badLinkTestInterval;
  }

  @JsonProperty("bad_link_test_interval")
  public void setBadLinkTestInterval(@Nullable ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties linkUnusedInterval(@Nullable ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
    return this;
  }

  /**
   * Get linkUnusedInterval
   * @return linkUnusedInterval
   */
  @Valid 
  @Schema(name = "link_unused_interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link_unused_interval")
  public @Nullable ConfigNodePropertyInteger getLinkUnusedInterval() {
    return linkUnusedInterval;
  }

  @JsonProperty("link_unused_interval")
  public void setLinkUnusedInterval(@Nullable ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties connectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  /**
   * Get connectionTimeout
   * @return connectionTimeout
   */
  @Valid 
  @Schema(name = "connection.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection.timeout")
  public @Nullable ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  @JsonProperty("connection.timeout")
  public void setConnectionTimeout(@Nullable ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties = (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties) o;
    return Objects.equals(this.schedulerPeriod, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerPeriod) &&
        Objects.equals(this.schedulerConcurrent, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerConcurrent) &&
        Objects.equals(this.goodLinkTestInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.goodLinkTestInterval) &&
        Objects.equals(this.badLinkTestInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.badLinkTestInterval) &&
        Objects.equals(this.linkUnusedInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.linkUnusedInterval) &&
        Objects.equals(this.connectionTimeout, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.connectionTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerPeriod, schedulerConcurrent, goodLinkTestInterval, badLinkTestInterval, linkUnusedInterval, connectionTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {\n");
    sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    goodLinkTestInterval: ").append(toIndentedString(goodLinkTestInterval)).append("\n");
    sb.append("    badLinkTestInterval: ").append(toIndentedString(badLinkTestInterval)).append("\n");
    sb.append("    linkUnusedInterval: ").append(toIndentedString(linkUnusedInterval)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
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

