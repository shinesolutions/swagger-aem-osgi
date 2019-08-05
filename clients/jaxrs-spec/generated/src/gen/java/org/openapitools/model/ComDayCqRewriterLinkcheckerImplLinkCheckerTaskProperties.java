package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties   {
  
  private @Valid ConfigNodePropertyInteger schedulerPeriod = null;
  private @Valid ConfigNodePropertyBoolean schedulerConcurrent = null;
  private @Valid ConfigNodePropertyInteger goodLinkTestInterval = null;
  private @Valid ConfigNodePropertyInteger badLinkTestInterval = null;
  private @Valid ConfigNodePropertyInteger linkUnusedInterval = null;
  private @Valid ConfigNodePropertyInteger connectionTimeout = null;

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties goodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("good_link_test_interval")
  public ConfigNodePropertyInteger getGoodLinkTestInterval() {
    return goodLinkTestInterval;
  }
  public void setGoodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
  }

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties badLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bad_link_test_interval")
  public ConfigNodePropertyInteger getBadLinkTestInterval() {
    return badLinkTestInterval;
  }
  public void setBadLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
  }

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties linkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link_unused_interval")
  public ConfigNodePropertyInteger getLinkUnusedInterval() {
    return linkUnusedInterval;
  }
  public void setLinkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
  }

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.timeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties = (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties) o;
    return Objects.equals(schedulerPeriod, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerPeriod) &&
        Objects.equals(schedulerConcurrent, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerConcurrent) &&
        Objects.equals(goodLinkTestInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.goodLinkTestInterval) &&
        Objects.equals(badLinkTestInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.badLinkTestInterval) &&
        Objects.equals(linkUnusedInterval, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.linkUnusedInterval) &&
        Objects.equals(connectionTimeout, comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.connectionTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

