package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeOctopusNcommBootstrapProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxConnections = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxRequests = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger requestTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger requestRetries = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger launchTimeout = null;
 /**
   * Get maxConnections
   * @return maxConnections
  **/
  @JsonProperty("maxConnections")
  public ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeOctopusNcommBootstrapProperties maxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

 /**
   * Get maxRequests
   * @return maxRequests
  **/
  @JsonProperty("maxRequests")
  public ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }

  public void setMaxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeOctopusNcommBootstrapProperties maxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

 /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @JsonProperty("requestTimeout")
  public ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

 /**
   * Get requestRetries
   * @return requestRetries
  **/
  @JsonProperty("requestRetries")
  public ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }

  public void setRequestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
    return this;
  }

 /**
   * Get launchTimeout
   * @return launchTimeout
  **/
  @JsonProperty("launchTimeout")
  public ConfigNodePropertyInteger getLaunchTimeout() {
    return launchTimeout;
  }

  public void setLaunchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
  }

  public ComAdobeOctopusNcommBootstrapProperties launchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

