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
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */

@JsonTypeName("comAdobeGraniteRepositoryImplCommitStatsConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger intervalSeconds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger commitsPerIntervalThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxLocationLength;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxDetailsShown;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minDetailsPercentage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray threadMatchers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxGreedyDepth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString greedyStackMatchers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray stackFilters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray stackMatchers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray stackCategorizers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray stackShorteners;

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties intervalSeconds(@Nullable ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    return this;
  }

  /**
   * Get intervalSeconds
   * @return intervalSeconds
   */
  @Valid 
  @Schema(name = "intervalSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intervalSeconds")
  public @Nullable ConfigNodePropertyInteger getIntervalSeconds() {
    return intervalSeconds;
  }

  @JsonProperty("intervalSeconds")
  public void setIntervalSeconds(@Nullable ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties commitsPerIntervalThreshold(@Nullable ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
    return this;
  }

  /**
   * Get commitsPerIntervalThreshold
   * @return commitsPerIntervalThreshold
   */
  @Valid 
  @Schema(name = "commitsPerIntervalThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commitsPerIntervalThreshold")
  public @Nullable ConfigNodePropertyInteger getCommitsPerIntervalThreshold() {
    return commitsPerIntervalThreshold;
  }

  @JsonProperty("commitsPerIntervalThreshold")
  public void setCommitsPerIntervalThreshold(@Nullable ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxLocationLength(@Nullable ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
    return this;
  }

  /**
   * Get maxLocationLength
   * @return maxLocationLength
   */
  @Valid 
  @Schema(name = "maxLocationLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxLocationLength")
  public @Nullable ConfigNodePropertyInteger getMaxLocationLength() {
    return maxLocationLength;
  }

  @JsonProperty("maxLocationLength")
  public void setMaxLocationLength(@Nullable ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxDetailsShown(@Nullable ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
    return this;
  }

  /**
   * Get maxDetailsShown
   * @return maxDetailsShown
   */
  @Valid 
  @Schema(name = "maxDetailsShown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDetailsShown")
  public @Nullable ConfigNodePropertyInteger getMaxDetailsShown() {
    return maxDetailsShown;
  }

  @JsonProperty("maxDetailsShown")
  public void setMaxDetailsShown(@Nullable ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties minDetailsPercentage(@Nullable ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
    return this;
  }

  /**
   * Get minDetailsPercentage
   * @return minDetailsPercentage
   */
  @Valid 
  @Schema(name = "minDetailsPercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minDetailsPercentage")
  public @Nullable ConfigNodePropertyInteger getMinDetailsPercentage() {
    return minDetailsPercentage;
  }

  @JsonProperty("minDetailsPercentage")
  public void setMinDetailsPercentage(@Nullable ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties threadMatchers(@Nullable ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
    return this;
  }

  /**
   * Get threadMatchers
   * @return threadMatchers
   */
  @Valid 
  @Schema(name = "threadMatchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threadMatchers")
  public @Nullable ConfigNodePropertyArray getThreadMatchers() {
    return threadMatchers;
  }

  @JsonProperty("threadMatchers")
  public void setThreadMatchers(@Nullable ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxGreedyDepth(@Nullable ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
    return this;
  }

  /**
   * Get maxGreedyDepth
   * @return maxGreedyDepth
   */
  @Valid 
  @Schema(name = "maxGreedyDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxGreedyDepth")
  public @Nullable ConfigNodePropertyInteger getMaxGreedyDepth() {
    return maxGreedyDepth;
  }

  @JsonProperty("maxGreedyDepth")
  public void setMaxGreedyDepth(@Nullable ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties greedyStackMatchers(@Nullable ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
    return this;
  }

  /**
   * Get greedyStackMatchers
   * @return greedyStackMatchers
   */
  @Valid 
  @Schema(name = "greedyStackMatchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("greedyStackMatchers")
  public @Nullable ConfigNodePropertyString getGreedyStackMatchers() {
    return greedyStackMatchers;
  }

  @JsonProperty("greedyStackMatchers")
  public void setGreedyStackMatchers(@Nullable ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackFilters(@Nullable ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
    return this;
  }

  /**
   * Get stackFilters
   * @return stackFilters
   */
  @Valid 
  @Schema(name = "stackFilters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stackFilters")
  public @Nullable ConfigNodePropertyArray getStackFilters() {
    return stackFilters;
  }

  @JsonProperty("stackFilters")
  public void setStackFilters(@Nullable ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackMatchers(@Nullable ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
    return this;
  }

  /**
   * Get stackMatchers
   * @return stackMatchers
   */
  @Valid 
  @Schema(name = "stackMatchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stackMatchers")
  public @Nullable ConfigNodePropertyArray getStackMatchers() {
    return stackMatchers;
  }

  @JsonProperty("stackMatchers")
  public void setStackMatchers(@Nullable ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackCategorizers(@Nullable ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
    return this;
  }

  /**
   * Get stackCategorizers
   * @return stackCategorizers
   */
  @Valid 
  @Schema(name = "stackCategorizers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stackCategorizers")
  public @Nullable ConfigNodePropertyArray getStackCategorizers() {
    return stackCategorizers;
  }

  @JsonProperty("stackCategorizers")
  public void setStackCategorizers(@Nullable ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackShorteners(@Nullable ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
    return this;
  }

  /**
   * Get stackShorteners
   * @return stackShorteners
   */
  @Valid 
  @Schema(name = "stackShorteners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stackShorteners")
  public @Nullable ConfigNodePropertyArray getStackShorteners() {
    return stackShorteners;
  }

  @JsonProperty("stackShorteners")
  public void setStackShorteners(@Nullable ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties comAdobeGraniteRepositoryImplCommitStatsConfigProperties = (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) o;
    return Objects.equals(this.enabled, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.enabled) &&
        Objects.equals(this.intervalSeconds, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.intervalSeconds) &&
        Objects.equals(this.commitsPerIntervalThreshold, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.commitsPerIntervalThreshold) &&
        Objects.equals(this.maxLocationLength, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxLocationLength) &&
        Objects.equals(this.maxDetailsShown, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxDetailsShown) &&
        Objects.equals(this.minDetailsPercentage, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.minDetailsPercentage) &&
        Objects.equals(this.threadMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.threadMatchers) &&
        Objects.equals(this.maxGreedyDepth, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxGreedyDepth) &&
        Objects.equals(this.greedyStackMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.greedyStackMatchers) &&
        Objects.equals(this.stackFilters, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackFilters) &&
        Objects.equals(this.stackMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackMatchers) &&
        Objects.equals(this.stackCategorizers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackCategorizers) &&
        Objects.equals(this.stackShorteners, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackShorteners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, intervalSeconds, commitsPerIntervalThreshold, maxLocationLength, maxDetailsShown, minDetailsPercentage, threadMatchers, maxGreedyDepth, greedyStackMatchers, stackFilters, stackMatchers, stackCategorizers, stackShorteners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
    sb.append("    commitsPerIntervalThreshold: ").append(toIndentedString(commitsPerIntervalThreshold)).append("\n");
    sb.append("    maxLocationLength: ").append(toIndentedString(maxLocationLength)).append("\n");
    sb.append("    maxDetailsShown: ").append(toIndentedString(maxDetailsShown)).append("\n");
    sb.append("    minDetailsPercentage: ").append(toIndentedString(minDetailsPercentage)).append("\n");
    sb.append("    threadMatchers: ").append(toIndentedString(threadMatchers)).append("\n");
    sb.append("    maxGreedyDepth: ").append(toIndentedString(maxGreedyDepth)).append("\n");
    sb.append("    greedyStackMatchers: ").append(toIndentedString(greedyStackMatchers)).append("\n");
    sb.append("    stackFilters: ").append(toIndentedString(stackFilters)).append("\n");
    sb.append("    stackMatchers: ").append(toIndentedString(stackMatchers)).append("\n");
    sb.append("    stackCategorizers: ").append(toIndentedString(stackCategorizers)).append("\n");
    sb.append("    stackShorteners: ").append(toIndentedString(stackShorteners)).append("\n");
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

