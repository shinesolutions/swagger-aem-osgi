package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqDamS7imagingImplIsImageServerComponentProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties   {
  private ConfigNodePropertyString tcpPort;
  private ConfigNodePropertyBoolean allowRemoteAccess;
  private ConfigNodePropertyString maxRenderRgnPixels;
  private ConfigNodePropertyString maxMessageSize;
  private ConfigNodePropertyInteger randomAccessUrlTimeout;
  private ConfigNodePropertyInteger workerThreads;

  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties() {
  }

  /**
   **/
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties tcpPort(ConfigNodePropertyString tcpPort) {
    this.tcpPort = tcpPort;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TcpPort")
  @Valid public ConfigNodePropertyString getTcpPort() {
    return tcpPort;
  }

  @JsonProperty("TcpPort")
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
  @Valid public ConfigNodePropertyBoolean getAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  @JsonProperty("AllowRemoteAccess")
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
  @Valid public ConfigNodePropertyString getMaxRenderRgnPixels() {
    return maxRenderRgnPixels;
  }

  @JsonProperty("MaxRenderRgnPixels")
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
  @Valid public ConfigNodePropertyString getMaxMessageSize() {
    return maxMessageSize;
  }

  @JsonProperty("MaxMessageSize")
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
  @Valid public ConfigNodePropertyInteger getRandomAccessUrlTimeout() {
    return randomAccessUrlTimeout;
  }

  @JsonProperty("RandomAccessUrlTimeout")
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
  @Valid public ConfigNodePropertyInteger getWorkerThreads() {
    return workerThreads;
  }

  @JsonProperty("WorkerThreads")
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
