package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeOctopusNcommBootstrapProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeOctopusNcommBootstrapProperties   {
  private ConfigNodePropertyInteger maxConnections;
  private ConfigNodePropertyInteger maxRequests;
  private ConfigNodePropertyInteger requestTimeout;
  private ConfigNodePropertyInteger requestRetries;
  private ConfigNodePropertyInteger launchTimeout;

  public ComAdobeOctopusNcommBootstrapProperties() {
  }

  /**
   **/
  public ComAdobeOctopusNcommBootstrapProperties maxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxConnections")
  @Valid public ConfigNodePropertyInteger getMaxConnections() {
    return maxConnections;
  }

  @JsonProperty("maxConnections")
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
  @Valid public ConfigNodePropertyInteger getMaxRequests() {
    return maxRequests;
  }

  @JsonProperty("maxRequests")
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
  @Valid public ConfigNodePropertyInteger getRequestTimeout() {
    return requestTimeout;
  }

  @JsonProperty("requestTimeout")
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
  @Valid public ConfigNodePropertyInteger getRequestRetries() {
    return requestRetries;
  }

  @JsonProperty("requestRetries")
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
  @Valid public ConfigNodePropertyInteger getLaunchTimeout() {
    return launchTimeout;
  }

  @JsonProperty("launchTimeout")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
