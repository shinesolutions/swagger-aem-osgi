/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
  
  @SerializedName("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod = null;
  @SerializedName("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;
  @SerializedName("good_link_test_interval")
  private ConfigNodePropertyInteger goodLinkTestInterval = null;
  @SerializedName("bad_link_test_interval")
  private ConfigNodePropertyInteger badLinkTestInterval = null;
  @SerializedName("link_unused_interval")
  private ConfigNodePropertyInteger linkUnusedInterval = null;
  @SerializedName("connection.timeout")
  private ConfigNodePropertyInteger connectionTimeout = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getGoodLinkTestInterval() {
    return goodLinkTestInterval;
  }
  public void setGoodLinkTestInterval(ConfigNodePropertyInteger goodLinkTestInterval) {
    this.goodLinkTestInterval = goodLinkTestInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getBadLinkTestInterval() {
    return badLinkTestInterval;
  }
  public void setBadLinkTestInterval(ConfigNodePropertyInteger badLinkTestInterval) {
    this.badLinkTestInterval = badLinkTestInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLinkUnusedInterval() {
    return linkUnusedInterval;
  }
  public void setLinkUnusedInterval(ConfigNodePropertyInteger linkUnusedInterval) {
    this.linkUnusedInterval = linkUnusedInterval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
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
    return (this.schedulerPeriod == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerPeriod == null : this.schedulerPeriod.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerPeriod)) &&
        (this.schedulerConcurrent == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerConcurrent == null : this.schedulerConcurrent.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.schedulerConcurrent)) &&
        (this.goodLinkTestInterval == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.goodLinkTestInterval == null : this.goodLinkTestInterval.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.goodLinkTestInterval)) &&
        (this.badLinkTestInterval == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.badLinkTestInterval == null : this.badLinkTestInterval.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.badLinkTestInterval)) &&
        (this.linkUnusedInterval == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.linkUnusedInterval == null : this.linkUnusedInterval.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.linkUnusedInterval)) &&
        (this.connectionTimeout == null ? comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.connectionTimeout == null : this.connectionTimeout.equals(comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.connectionTimeout));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.schedulerPeriod == null ? 0: this.schedulerPeriod.hashCode());
    result = 31 * result + (this.schedulerConcurrent == null ? 0: this.schedulerConcurrent.hashCode());
    result = 31 * result + (this.goodLinkTestInterval == null ? 0: this.goodLinkTestInterval.hashCode());
    result = 31 * result + (this.badLinkTestInterval == null ? 0: this.badLinkTestInterval.hashCode());
    result = 31 * result + (this.linkUnusedInterval == null ? 0: this.linkUnusedInterval.hashCode());
    result = 31 * result + (this.connectionTimeout == null ? 0: this.connectionTimeout.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {\n");
    
    sb.append("  schedulerPeriod: ").append(schedulerPeriod).append("\n");
    sb.append("  schedulerConcurrent: ").append(schedulerConcurrent).append("\n");
    sb.append("  goodLinkTestInterval: ").append(goodLinkTestInterval).append("\n");
    sb.append("  badLinkTestInterval: ").append(badLinkTestInterval).append("\n");
    sb.append("  linkUnusedInterval: ").append(linkUnusedInterval).append("\n");
    sb.append("  connectionTimeout: ").append(connectionTimeout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}