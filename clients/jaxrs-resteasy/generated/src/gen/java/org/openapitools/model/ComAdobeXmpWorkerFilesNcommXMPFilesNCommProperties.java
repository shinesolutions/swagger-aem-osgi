package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties   {
  
  private ConfigNodePropertyString maxConnections = null;
  private ConfigNodePropertyString maxRequests = null;
  private ConfigNodePropertyString requestTimeout = null;
  private ConfigNodePropertyString logDir = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("logDir")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

