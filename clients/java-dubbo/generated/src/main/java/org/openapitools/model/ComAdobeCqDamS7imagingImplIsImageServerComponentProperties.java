package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("TcpPort")
  private ConfigNodePropertyString tcpPort;

  @JsonProperty("AllowRemoteAccess")
  private ConfigNodePropertyBoolean allowRemoteAccess;

  @JsonProperty("MaxRenderRgnPixels")
  private ConfigNodePropertyString maxRenderRgnPixels;

  @JsonProperty("MaxMessageSize")
  private ConfigNodePropertyString maxMessageSize;

  @JsonProperty("RandomAccessUrlTimeout")
  private ConfigNodePropertyInteger randomAccessUrlTimeout;

  @JsonProperty("WorkerThreads")
  private ConfigNodePropertyInteger workerThreads;

  /**
   * 
   * @return tcpPort
   */
  public ConfigNodePropertyString getTcpPort() {
    return tcpPort;
  }

  public void setTcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
  }

  /**
   * 
   * @return allowRemoteAccess
   */
  public ConfigNodePropertyBoolean getAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  public void setAllowRemoteAccess(ConfigNodePropertyBoolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }

  /**
   * 
   * @return maxRenderRgnPixels
   */
  public ConfigNodePropertyString getMaxRenderRgnPixels() {
    return maxRenderRgnPixels;
  }

  public void setMaxRenderRgnPixels(ConfigNodePropertyString maxRenderRgnPixels) {
    this.maxRenderRgnPixels = maxRenderRgnPixels;
  }

  /**
   * 
   * @return maxMessageSize
   */
  public ConfigNodePropertyString getMaxMessageSize() {
    return maxMessageSize;
  }

  public void setMaxMessageSize(ConfigNodePropertyString maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }

  /**
   * 
   * @return randomAccessUrlTimeout
   */
  public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
    return randomAccessUrlTimeout;
  }

  public void setRandomAccessUrlTimeout(ConfigNodePropertyInteger randomAccessUrlTimeout) {
    this.randomAccessUrlTimeout = randomAccessUrlTimeout;
  }

  /**
   * 
   * @return workerThreads
   */
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
    return Objects.equals(this.tcpPort, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.tcpPort) &&
        Objects.equals(this.allowRemoteAccess, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.allowRemoteAccess) &&
        Objects.equals(this.maxRenderRgnPixels, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxRenderRgnPixels) &&
        Objects.equals(this.maxMessageSize, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.maxMessageSize) &&
        Objects.equals(this.randomAccessUrlTimeout, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.randomAccessUrlTimeout) &&
        Objects.equals(this.workerThreads, comAdobeCqDamS7imagingImplIsImageServerComponentProperties.workerThreads);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
