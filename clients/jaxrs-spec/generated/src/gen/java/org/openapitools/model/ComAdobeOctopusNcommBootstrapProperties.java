package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeOctopusNcommBootstrapProperties   {
  
  private @Valid ConfigNodePropertyInteger maxConnections = null;
  private @Valid ConfigNodePropertyInteger maxRequests = null;
  private @Valid ConfigNodePropertyInteger requestTimeout = null;
  private @Valid ConfigNodePropertyInteger requestRetries = null;
  private @Valid ConfigNodePropertyInteger launchTimeout = null;

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties maxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxConnections")
  public ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }
  public void setMaxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
  }

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties maxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxRequests")
  public ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }
  public void setMaxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
  }

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties requestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }
  public void setRequestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties requestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestRetries")
  public ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }
  public void setRequestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
  }

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties launchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("launchTimeout")
  public ConfigNodePropertyInteger getLaunchTimeout() {
    return launchTimeout;
  }
  public void setLaunchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

