package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger intervalSeconds = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger commitsPerIntervalThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxLocationLength = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxDetailsShown = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minDetailsPercentage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray threadMatchers = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxGreedyDepth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString greedyStackMatchers = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray stackFilters = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray stackMatchers = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray stackCategorizers = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray stackShorteners = null;
 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get intervalSeconds
   * @return intervalSeconds
  **/
  @JsonProperty("intervalSeconds")
  public ConfigNodePropertyInteger getIntervalSeconds() {
    return intervalSeconds;
  }

  public void setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties intervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    return this;
  }

 /**
   * Get commitsPerIntervalThreshold
   * @return commitsPerIntervalThreshold
  **/
  @JsonProperty("commitsPerIntervalThreshold")
  public ConfigNodePropertyInteger getCommitsPerIntervalThreshold() {
    return commitsPerIntervalThreshold;
  }

  public void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties commitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
    return this;
  }

 /**
   * Get maxLocationLength
   * @return maxLocationLength
  **/
  @JsonProperty("maxLocationLength")
  public ConfigNodePropertyInteger getMaxLocationLength() {
    return maxLocationLength;
  }

  public void setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
    return this;
  }

 /**
   * Get maxDetailsShown
   * @return maxDetailsShown
  **/
  @JsonProperty("maxDetailsShown")
  public ConfigNodePropertyInteger getMaxDetailsShown() {
    return maxDetailsShown;
  }

  public void setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
    return this;
  }

 /**
   * Get minDetailsPercentage
   * @return minDetailsPercentage
  **/
  @JsonProperty("minDetailsPercentage")
  public ConfigNodePropertyInteger getMinDetailsPercentage() {
    return minDetailsPercentage;
  }

  public void setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties minDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
    return this;
  }

 /**
   * Get threadMatchers
   * @return threadMatchers
  **/
  @JsonProperty("threadMatchers")
  public ConfigNodePropertyArray getThreadMatchers() {
    return threadMatchers;
  }

  public void setThreadMatchers(ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties threadMatchers(ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
    return this;
  }

 /**
   * Get maxGreedyDepth
   * @return maxGreedyDepth
  **/
  @JsonProperty("maxGreedyDepth")
  public ConfigNodePropertyInteger getMaxGreedyDepth() {
    return maxGreedyDepth;
  }

  public void setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties maxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
    return this;
  }

 /**
   * Get greedyStackMatchers
   * @return greedyStackMatchers
  **/
  @JsonProperty("greedyStackMatchers")
  public ConfigNodePropertyString getGreedyStackMatchers() {
    return greedyStackMatchers;
  }

  public void setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties greedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
    return this;
  }

 /**
   * Get stackFilters
   * @return stackFilters
  **/
  @JsonProperty("stackFilters")
  public ConfigNodePropertyArray getStackFilters() {
    return stackFilters;
  }

  public void setStackFilters(ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackFilters(ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
    return this;
  }

 /**
   * Get stackMatchers
   * @return stackMatchers
  **/
  @JsonProperty("stackMatchers")
  public ConfigNodePropertyArray getStackMatchers() {
    return stackMatchers;
  }

  public void setStackMatchers(ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackMatchers(ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
    return this;
  }

 /**
   * Get stackCategorizers
   * @return stackCategorizers
  **/
  @JsonProperty("stackCategorizers")
  public ConfigNodePropertyArray getStackCategorizers() {
    return stackCategorizers;
  }

  public void setStackCategorizers(ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackCategorizers(ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
    return this;
  }

 /**
   * Get stackShorteners
   * @return stackShorteners
  **/
  @JsonProperty("stackShorteners")
  public ConfigNodePropertyArray getStackShorteners() {
    return stackShorteners;
  }

  public void setStackShorteners(ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
  }

  public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties stackShorteners(ConfigNodePropertyArray stackShorteners) {
    this.stackShorteners = stackShorteners;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

