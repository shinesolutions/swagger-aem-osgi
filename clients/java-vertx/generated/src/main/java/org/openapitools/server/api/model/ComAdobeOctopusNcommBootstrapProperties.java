package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeOctopusNcommBootstrapProperties   {
  
  private ConfigNodePropertyInteger maxConnections = null;
  private ConfigNodePropertyInteger maxRequests = null;
  private ConfigNodePropertyInteger requestTimeout = null;
  private ConfigNodePropertyInteger requestRetries = null;
  private ConfigNodePropertyInteger launchTimeout = null;

  public ComAdobeOctopusNcommBootstrapProperties () {

  }

  public ComAdobeOctopusNcommBootstrapProperties (ConfigNodePropertyInteger maxConnections, ConfigNodePropertyInteger maxRequests, ConfigNodePropertyInteger requestTimeout, ConfigNodePropertyInteger requestRetries, ConfigNodePropertyInteger launchTimeout) {
    this.maxConnections = maxConnections;
    this.maxRequests = maxRequests;
    this.requestTimeout = requestTimeout;
    this.requestRetries = requestRetries;
    this.launchTimeout = launchTimeout;
  }

    
  @JsonProperty("maxConnections")
  public ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }
  public void setMaxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
  }

    
  @JsonProperty("maxRequests")
  public ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }
  public void setMaxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
  }

    
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }
  public void setRequestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

    
  @JsonProperty("requestRetries")
  public ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }
  public void setRequestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
  }

    
  @JsonProperty("launchTimeout")
  public ConfigNodePropertyInteger getLaunchTimeout() {
    return launchTimeout;
  }
  public void setLaunchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeOctopusNcommBootstrapProperties comAdobeOctopusNcommBootstrapProperties = (ComAdobeOctopusNcommBootstrapProperties) o;
    return Objects.equals(maxConnections, comAdobeOctopusNcommBootstrapProperties.maxConnections) &&
        Objects.equals(maxRequests, comAdobeOctopusNcommBootstrapProperties.maxRequests) &&
        Objects.equals(requestTimeout, comAdobeOctopusNcommBootstrapProperties.requestTimeout) &&
        Objects.equals(requestRetries, comAdobeOctopusNcommBootstrapProperties.requestRetries) &&
        Objects.equals(launchTimeout, comAdobeOctopusNcommBootstrapProperties.launchTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConnections, maxRequests, requestTimeout, requestRetries, launchTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeOctopusNcommBootstrapProperties {\n");
    
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    maxRequests: ").append(toIndentedString(maxRequests)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    requestRetries: ").append(toIndentedString(requestRetries)).append("\n");
    sb.append("    launchTimeout: ").append(toIndentedString(launchTimeout)).append("\n");
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
