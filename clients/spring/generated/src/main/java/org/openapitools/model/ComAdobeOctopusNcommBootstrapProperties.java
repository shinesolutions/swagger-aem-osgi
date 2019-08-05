package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeOctopusNcommBootstrapProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeOctopusNcommBootstrapProperties   {
  @JsonProperty("maxConnections")
  private ConfigNodePropertyInteger maxConnections = null;

  @JsonProperty("maxRequests")
  private ConfigNodePropertyInteger maxRequests = null;

  @JsonProperty("requestTimeout")
  private ConfigNodePropertyInteger requestTimeout = null;

  @JsonProperty("requestRetries")
  private ConfigNodePropertyInteger requestRetries = null;

  @JsonProperty("launchTimeout")
  private ConfigNodePropertyInteger launchTimeout = null;

  public ComAdobeOctopusNcommBootstrapProperties maxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  /**
   * Get maxConnections
   * @return maxConnections
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
  }

  public ComAdobeOctopusNcommBootstrapProperties maxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
    return this;
  }

  /**
   * Get maxRequests
   * @return maxRequests
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }

  public void setMaxRequests(ConfigNodePropertyInteger maxRequests) {
    this.maxRequests = maxRequests;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

  /**
   * Get requestTimeout
   * @return requestTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(ConfigNodePropertyInteger requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ComAdobeOctopusNcommBootstrapProperties requestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
    return this;
  }

  /**
   * Get requestRetries
   * @return requestRetries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }

  public void setRequestRetries(ConfigNodePropertyInteger requestRetries) {
    this.requestRetries = requestRetries;
  }

  public ComAdobeOctopusNcommBootstrapProperties launchTimeout(ConfigNodePropertyInteger launchTimeout) {
    this.launchTimeout = launchTimeout;
    return this;
  }

  /**
   * Get launchTimeout
   * @return launchTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.maxConnections, comAdobeOctopusNcommBootstrapProperties.maxConnections) &&
        Objects.equals(this.maxRequests, comAdobeOctopusNcommBootstrapProperties.maxRequests) &&
        Objects.equals(this.requestTimeout, comAdobeOctopusNcommBootstrapProperties.requestTimeout) &&
        Objects.equals(this.requestRetries, comAdobeOctopusNcommBootstrapProperties.requestRetries) &&
        Objects.equals(this.launchTimeout, comAdobeOctopusNcommBootstrapProperties.launchTimeout);
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

