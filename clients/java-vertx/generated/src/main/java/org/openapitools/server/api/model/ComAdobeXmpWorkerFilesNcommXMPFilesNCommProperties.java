package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties   {
  
  private ConfigNodePropertyString maxConnections = null;
  private ConfigNodePropertyString maxRequests = null;
  private ConfigNodePropertyString requestTimeout = null;
  private ConfigNodePropertyString logDir = null;

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties () {

  }

  public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties (ConfigNodePropertyString maxConnections, ConfigNodePropertyString maxRequests, ConfigNodePropertyString requestTimeout, ConfigNodePropertyString logDir) {
    this.maxConnections = maxConnections;
    this.maxRequests = maxRequests;
    this.requestTimeout = requestTimeout;
    this.logDir = logDir;
  }

    
  @JsonProperty("maxConnections")
  public ConfigNodePropertyString getMaxConnections() {
    return maxConnections;
  }
  public void setMaxConnections(ConfigNodePropertyString maxConnections) {
    this.maxConnections = maxConnections;
  }

    
  @JsonProperty("maxRequests")
  public ConfigNodePropertyString getMaxRequests() {
    return maxRequests;
  }
  public void setMaxRequests(ConfigNodePropertyString maxRequests) {
    this.maxRequests = maxRequests;
  }

    
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyString getRequestTimeout() {
    return requestTimeout;
  }
  public void setRequestTimeout(ConfigNodePropertyString requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
