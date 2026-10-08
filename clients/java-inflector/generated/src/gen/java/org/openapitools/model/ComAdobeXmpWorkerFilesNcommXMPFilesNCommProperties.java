package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties   {
  @JsonProperty("maxConnections")
  private ConfigNodePropertyString maxConnections;

  @JsonProperty("maxRequests")
  private ConfigNodePropertyString maxRequests;

  @JsonProperty("requestTimeout")
  private ConfigNodePropertyString requestTimeout;

  @JsonProperty("logDir")
  private ConfigNodePropertyString logDir;

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxConnections")
  public ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }
  public void setMaxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties maxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxRequests")
  public ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }
  public void setMaxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties requestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }
  public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  /**
   **/
  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties logDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logDir")
  public ConfigNodePropertyString getLogDir() {
    return logDir;
  }
  public void setLogDir(ConfigNodePropertyString logDir) {
    this.logDir = logDir;
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
    return Objects.equals(maxConnections, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxConnections) &&
        Objects.equals(maxRequests, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.maxRequests) &&
        Objects.equals(requestTimeout, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.requestTimeout) &&
        Objects.equals(logDir, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.logDir);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

