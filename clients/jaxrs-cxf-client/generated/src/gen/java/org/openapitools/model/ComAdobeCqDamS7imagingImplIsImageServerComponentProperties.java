package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString tcpPort = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean allowRemoteAccess = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString maxRenderRgnPixels = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString maxMessageSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger randomAccessUrlTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger workerThreads = null;
 /**
   * Get tcpPort
   * @return tcpPort
  **/
  @JsonProperty("TcpPort")
  public ConfigNodePropertyString getTcpPort() {
    return tcpPort;
  }

  public void setTcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties tcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
    return this;
  }

 /**
   * Get allowRemoteAccess
   * @return allowRemoteAccess
  **/
  @JsonProperty("AllowRemoteAccess")
  public ConfigNodePropertyBoolean getAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  public void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties allowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
    return this;
  }

 /**
   * Get maxRenderRgnPixels
   * @return maxRenderRgnPixels
  **/
  @JsonProperty("MaxRenderRgnPixels")
  public ConfigNodePropertyString getMaxRenderRgnPixels() {
    return maxRenderRgnPixels;
  }

  public void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
    return this;
  }

 /**
   * Get maxMessageSize
   * @return maxMessageSize
  **/
  @JsonProperty("MaxMessageSize")
  public ConfigNodePropertyString getMaxMessageSize() {
    return maxMessageSize;
  }

  public void setMaxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties maxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
    return this;
  }

 /**
   * Get randomAccessUrlTimeout
   * @return randomAccessUrlTimeout
  **/
  @JsonProperty("RandomAccessUrlTimeout")
  public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
    return randomAccessUrlTimeout;
  }

  public void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties randomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
    return this;
  }

 /**
   * Get workerThreads
   * @return workerThreads
  **/
  @JsonProperty("WorkerThreads")
  public ConfigNodePropertyInteger getWorkerThreads() {
    return workerThreads;
  }

  public void setWorkerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties workerThreads(ConfigNodePropertyInteger workerThreads) {
    this.workerThreads = workerThreads;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

