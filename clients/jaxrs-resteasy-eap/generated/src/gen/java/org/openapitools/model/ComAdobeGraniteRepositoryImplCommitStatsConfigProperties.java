package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties   {
  

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyInteger intervalSeconds = null;

  private ConfigNodePropertyInteger commitsPerIntervalThreshold = null;

  private ConfigNodePropertyInteger maxLocationLength = null;

  private ConfigNodePropertyInteger maxDetailsShown = null;

  private ConfigNodePropertyInteger minDetailsPercentage = null;

  private ConfigNodePropertyArray threadMatchers = null;

  private ConfigNodePropertyInteger maxGreedyDepth = null;

  private ConfigNodePropertyString greedyStackMatchers = null;

  private ConfigNodePropertyArray stackFilters = null;

  private ConfigNodePropertyArray stackMatchers = null;

  private ConfigNodePropertyArray stackCategorizers = null;

  private ConfigNodePropertyArray stackShorteners = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("intervalSeconds")
  public ConfigNodePropertyInteger getIntervalSeconds() {
    return intervalSeconds;
  }
  public void setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("commitsPerIntervalThreshold")
  public ConfigNodePropertyInteger getCommitsPerIntervalThreshold() {
    return commitsPerIntervalThreshold;
  }
  public void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
    this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxLocationLength")
  public ConfigNodePropertyInteger getMaxLocationLength() {
    return maxLocationLength;
  }
  public void setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
    this.maxLocationLength = maxLocationLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxDetailsShown")
  public ConfigNodePropertyInteger getMaxDetailsShown() {
    return maxDetailsShown;
  }
  public void setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
    this.maxDetailsShown = maxDetailsShown;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("minDetailsPercentage")
  public ConfigNodePropertyInteger getMinDetailsPercentage() {
    return minDetailsPercentage;
  }
  public void setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
    this.minDetailsPercentage = minDetailsPercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("threadMatchers")
  public ConfigNodePropertyArray getThreadMatchers() {
    return threadMatchers;
  }
  public void setThreadMatchers(ConfigNodePropertyArray threadMatchers) {
    this.threadMatchers = threadMatchers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxGreedyDepth")
  public ConfigNodePropertyInteger getMaxGreedyDepth() {
    return maxGreedyDepth;
  }
  public void setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
    this.maxGreedyDepth = maxGreedyDepth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("greedyStackMatchers")
  public ConfigNodePropertyString getGreedyStackMatchers() {
    return greedyStackMatchers;
  }
  public void setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
    this.greedyStackMatchers = greedyStackMatchers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stackFilters")
  public ConfigNodePropertyArray getStackFilters() {
    return stackFilters;
  }
  public void setStackFilters(ConfigNodePropertyArray stackFilters) {
    this.stackFilters = stackFilters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stackMatchers")
  public ConfigNodePropertyArray getStackMatchers() {
    return stackMatchers;
  }
  public void setStackMatchers(ConfigNodePropertyArray stackMatchers) {
    this.stackMatchers = stackMatchers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stackCategorizers")
  public ConfigNodePropertyArray getStackCategorizers() {
    return stackCategorizers;
  }
  public void setStackCategorizers(ConfigNodePropertyArray stackCategorizers) {
    this.stackCategorizers = stackCategorizers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("stackShorteners")
  public ConfigNodePropertyArray getStackShorteners() {
    return stackShorteners;
  }
  public void setStackShorteners(ConfigNodePropertyArray stackShorteners) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

