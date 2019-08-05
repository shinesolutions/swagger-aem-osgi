package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties   {
  
  private @Valid ConfigNodePropertyString tcpPort = null;
  private @Valid ConfigNodePropertyBoolean allowRemoteAccess = null;
  private @Valid ConfigNodePropertyString maxRenderRgnPixels = null;
  private @Valid ConfigNodePropertyString maxMessageSize = null;
  private @Valid ConfigNodePropertyInteger randomAccessUrlTimeout = null;
  private @Valid ConfigNodePropertyInteger workerThreads = null;

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties tcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TcpPort")
  public ConfigNodePropertyString getTcpPort() {
    return tcpPort;
  }
  public void setTcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties allowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AllowRemoteAccess")
  public ConfigNodePropertyBoolean getAllowRemoteAccess() {
    return allowRemoteAccess;
  }
  public void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MaxRenderRgnPixels")
  public ConfigNodePropertyString getMaxRenderRgnPixels() {
    return maxRenderRgnPixels;
  }
  public void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MaxMessageSize")
  public ConfigNodePropertyString getMaxMessageSize() {
    return maxMessageSize;
  }
  public void setMaxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties randomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("RandomAccessUrlTimeout")
  public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
    return randomAccessUrlTimeout;
  }
  public void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties workerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("WorkerThreads")
  public ConfigNodePropertyInteger getWorkerThreads() {
    return workerThreads;
  }
  public void setWorkerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties comAdobeCqDamS7imagingImplIsImageServerComponentProperties = (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties) o;
    return Objects.equals(tcpPort, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.tcpPort) &&
        Objects.equals(allowRemoteAccess, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.allowRemoteAccess) &&
        Objects.equals(maxRenderRgnPixels, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxRenderRgnPixels) &&
        Objects.equals(maxMessageSize, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxMessageSize) &&
        Objects.equals(randomAccessUrlTimeout, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.randomAccessUrlTimeout) &&
        Objects.equals(workerThreads, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.workerThreads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcpPort, allowRemoteAccess, maxRenderRgnPixels, maxMessageSize, randomAccessUrlTimeout, workerThreads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {\n");
    
    sb.append("    tcpPort: ").append(toIndentedString(tcpPort)).append("\n");
    sb.append("    allowRemoteAccess: ").append(toIndentedString(allowRemoteAccess)).append("\n");
    sb.append("    maxRenderRgnPixels: ").append(toIndentedString(maxRenderRgnPixels)).append("\n");
    sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
    sb.append("    randomAccessUrlTimeout: ").append(toIndentedString(randomAccessUrlTimeout)).append("\n");
    sb.append("    workerThreads: ").append(toIndentedString(workerThreads)).append("\n");
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

