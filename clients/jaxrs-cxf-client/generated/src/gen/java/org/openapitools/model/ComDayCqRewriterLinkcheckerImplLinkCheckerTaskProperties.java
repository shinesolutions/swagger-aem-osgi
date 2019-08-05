package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger goodLinkTestInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger badLinkTestInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger linkUnusedInterval = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger connectionTimeout = null;
 /**
   * Get schedulerPeriod
   * @return schedulerPeriod
  **/
  @JsonProperty("scheduler.period")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

 /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @JsonProperty("scheduler.concurrent")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

 /**
   * Get goodLinkTestInterval
   * @return goodLinkTestInterval
  **/
  @JsonProperty("good_link_test_interval")
  public ConfigNodePropertyInteger getGoodLinkTestInterval() {
    return goodLinkTestInterval;
  }

  public void setGoodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties goodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
    return this;
  }

 /**
   * Get badLinkTestInterval
   * @return badLinkTestInterval
  **/
  @JsonProperty("bad_link_test_interval")
  public ConfigNodePropertyInteger getBadLinkTestInterval() {
    return badLinkTestInterval;
  }

  public void setBadLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties badLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
    return this;
  }

 /**
   * Get linkUnusedInterval
   * @return linkUnusedInterval
  **/
  @JsonProperty("link_unused_interval")
  public ConfigNodePropertyInteger getLinkUnusedInterval() {
    return linkUnusedInterval;
  }

  public void setLinkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties linkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
    return this;
  }

 /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @JsonProperty("connection.timeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

