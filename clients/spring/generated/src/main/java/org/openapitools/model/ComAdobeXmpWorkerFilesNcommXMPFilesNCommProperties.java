package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties   {
  @JsonProperty("maxConnections")
  private ConfigNodePropertyString maxConnections = null;

  @JsonProperty("maxRequests")
  private ConfigNodePropertyString maxRequests = null;

  @JsonProperty("requestTimeout")
  private ConfigNodePropertyString requestTimeout = null;

  @JsonProperty("logDir")
  private ConfigNodePropertyString logDir = null;

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  /**
   * Get maxConnections
   * @return maxConnections
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

  /**
   * Get maxRequests
   * @return maxRequests
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }

  public void setMaxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties requestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties logDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
    return this;
  }

  /**
   * Get logDir
   * @return logDir
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getLogDir() {
    return logDir;
  }

  public void setLogDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

