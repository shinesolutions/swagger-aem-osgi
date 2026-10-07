package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString maxConnections;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString maxRequests;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString requestTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString logDir;
 /**
  * Get maxConnections
  * @return maxConnections
  */
  @JsonProperty("maxConnections")
  public ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }

  /**
   * Sets the <code>maxConnections</code> property.
   */
 public void setMaxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

  /**
   * Sets the <code>maxConnections</code> property.
   */
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

 /**
  * Get maxRequests
  * @return maxRequests
  */
  @JsonProperty("maxRequests")
  public ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }

  /**
   * Sets the <code>maxRequests</code> property.
   */
 public void setMaxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

  /**
   * Sets the <code>maxRequests</code> property.
   */
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

 /**
  * Get requestTimeout
  * @return requestTimeout
  */
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }

  /**
   * Sets the <code>requestTimeout</code> property.
   */
 public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  /**
   * Sets the <code>requestTimeout</code> property.
   */
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties requestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

 /**
  * Get logDir
  * @return logDir
  */
  @JsonProperty("logDir")
  public ConfigNodePropertyString getLogDir() {
    return logDir;
  }

  /**
   * Sets the <code>logDir</code> property.
   */
 public void setLogDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
  }

  /**
   * Sets the <code>logDir</code> property.
   */
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties logDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties = (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties) o;
    return Objects.equals(this.maxConnections, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxConnections) &&
        Objects.equals(this.maxRequests, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxRequests) &&
        Objects.equals(this.requestTimeout, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.requestTimeout) &&
        Objects.equals(this.logDir, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.logDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConnections, maxRequests, requestTimeout, logDir);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

