package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties   {
  
  private ConfigNodePropertyInteger schedulerPeriod;
  private ConfigNodePropertyBoolean schedulerConcurrent;
  private ConfigNodePropertyInteger goodLinkTestInterval;
  private ConfigNodePropertyInteger badLinkTestInterval;
  private ConfigNodePropertyInteger linkUnusedInterval;
  private ConfigNodePropertyInteger connectionTimeout;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.timeout")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

