package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString maxConnections = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString maxRequests = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString requestTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString logDir = null;
 /**
   * Get maxConnections
   * @return maxConnections
  **/
  @JsonProperty("maxConnections")
  public ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

 /**
   * Get maxRequests
   * @return maxRequests
  **/
  @JsonProperty("maxRequests")
  public ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }

  public void setMaxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

 /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties requestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

 /**
   * Get logDir
   * @return logDir
  **/
  @JsonProperty("logDir")
  public ConfigNodePropertyString getLogDir() {
    return logDir;
  }

  public void setLogDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties logDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {\n");
    
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
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

