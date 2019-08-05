package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties   {
  

  private ConfigNodePropertyString tcpPort = null;

  private ConfigNodePropertyBoolean allowRemoteAccess = null;

  private ConfigNodePropertyString maxRenderRgnPixels = null;

  private ConfigNodePropertyString maxMessageSize = null;

  private ConfigNodePropertyInteger randomAccessUrlTimeout = null;

  private ConfigNodePropertyInteger workerThreads = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("WorkerThreads")
  public ConfigNodePropertyInteger getWorkerThreads() {
    return workerThreads;
  }
  public void setWorkerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

