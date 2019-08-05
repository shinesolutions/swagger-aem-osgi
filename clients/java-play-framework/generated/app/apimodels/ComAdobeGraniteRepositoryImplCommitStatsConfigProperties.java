package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("intervalSeconds")
  private ConfigNodePropertyInteger intervalSeconds = null;

  @JsonProperty("commitsPerIntervalThreshold")
  private ConfigNodePropertyInteger commitsPerIntervalThreshold = null;

  @JsonProperty("maxLocationLength")
  private ConfigNodePropertyInteger maxLocationLength = null;

  @JsonProperty("maxDetailsShown")
  private ConfigNodePropertyInteger maxDetailsShown = null;

  @JsonProperty("minDetailsPercentage")
  private ConfigNodePropertyInteger minDetailsPercentage = null;

  @JsonProperty("threadMatchers")
  private ConfigNodePropertyArray threadMatchers = null;

  @JsonProperty("maxGreedyDepth")
  private ConfigNodePropertyInteger maxGreedyDepth = null;

  @JsonProperty("greedyStackMatchers")
  private ConfigNodePropertyString greedyStackMatchers = null;

  @JsonProperty("stackFilters")
  private ConfigNodePropertyArray stackFilters = null;

  @JsonProperty("stackMatchers")
  private ConfigNodePropertyArray stackMatchers = null;

  @JsonProperty("stackCategorizers")
  private ConfigNodePropertyArray stackCategorizers = null;

  @JsonProperty("stackShorteners")
  private ConfigNodePropertyArray stackShorteners = null;

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties intervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    return this;
  }

   /**
   * Get intervalSeconds
   * @return intervalSeconds
  **/
  @Valid
  public ConfigNodePropertyInteger getIntervalSeconds() {
    return intervalSeconds;
  }

  public void setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties commitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
    return this;
  }

   /**
   * Get commitsPerIntervalThreshold
   * @return commitsPerIntervalThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getCommitsPerIntervalThreshold() {
    return commitsPerIntervalThreshold;
  }

  public void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
    return this;
  }

   /**
   * Get maxLocationLength
   * @return maxLocationLength
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxLocationLength() {
    return maxLocationLength;
  }

  public void setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
    return this;
  }

   /**
   * Get maxDetailsShown
   * @return maxDetailsShown
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxDetailsShown() {
    return maxDetailsShown;
  }

  public void setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties minDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
    return this;
  }

   /**
   * Get minDetailsPercentage
   * @return minDetailsPercentage
  **/
  @Valid
  public ConfigNodePropertyInteger getMinDetailsPercentage() {
    return minDetailsPercentage;
  }

  public void setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties threadMatchers(ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
    return this;
  }

   /**
   * Get threadMatchers
   * @return threadMatchers
  **/
  @Valid
  public ConfigNodePropertyArray getThreadMatchers() {
    return threadMatchers;
  }

  public void setThreadMatchers(ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
    return this;
  }

   /**
   * Get maxGreedyDepth
   * @return maxGreedyDepth
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxGreedyDepth() {
    return maxGreedyDepth;
  }

  public void setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties greedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
    return this;
  }

   /**
   * Get greedyStackMatchers
   * @return greedyStackMatchers
  **/
  @Valid
  public ConfigNodePropertyString getGreedyStackMatchers() {
    return greedyStackMatchers;
  }

  public void setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackFilters(ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
    return this;
  }

   /**
   * Get stackFilters
   * @return stackFilters
  **/
  @Valid
  public ConfigNodePropertyArray getStackFilters() {
    return stackFilters;
  }

  public void setStackFilters(ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackMatchers(ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
    return this;
  }

   /**
   * Get stackMatchers
   * @return stackMatchers
  **/
  @Valid
  public ConfigNodePropertyArray getStackMatchers() {
    return stackMatchers;
  }

  public void setStackMatchers(ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackCategorizers(ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
    return this;
  }

   /**
   * Get stackCategorizers
   * @return stackCategorizers
  **/
  @Valid
  public ConfigNodePropertyArray getStackCategorizers() {
    return stackCategorizers;
  }

  public void setStackCategorizers(ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackShorteners(ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
    return this;
  }

   /**
   * Get stackShorteners
   * @return stackShorteners
  **/
  @Valid
  public ConfigNodePropertyArray getStackShorteners() {
    return stackShorteners;
  }

  public void setStackShorteners(ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties comAdobeGraniteRepositoryImplCommitStatsConfigProperties = (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) o;
    return Objects.equals(enabled, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.enabled) &&
        Objects.equals(intervalSeconds, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.intervalSeconds) &&
        Objects.equals(commitsPerIntervalThreshold, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.commitsPerIntervalThreshold) &&
        Objects.equals(maxLocationLength, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxLocationLength) &&
        Objects.equals(maxDetailsShown, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxDetailsShown) &&
        Objects.equals(minDetailsPercentage, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.minDetailsPercentage) &&
        Objects.equals(threadMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.threadMatchers) &&
        Objects.equals(maxGreedyDepth, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.maxGreedyDepth) &&
        Objects.equals(greedyStackMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.greedyStackMatchers) &&
        Objects.equals(stackFilters, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackFilters) &&
        Objects.equals(stackMatchers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackMatchers) &&
        Objects.equals(stackCategorizers, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackCategorizers) &&
        Objects.equals(stackShorteners, comAdobeGraniteRepositoryImplCommitStatsConfigProperties.stackShorteners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, intervalSeconds, commitsPerIntervalThreshold, maxLocationLength, maxDetailsShown, minDetailsPercentage, threadMatchers, maxGreedyDepth, greedyStackMatchers, stackFilters, stackMatchers, stackCategorizers, stackShorteners);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

