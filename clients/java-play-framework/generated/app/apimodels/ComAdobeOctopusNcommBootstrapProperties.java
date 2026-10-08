package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeOctopusNcommBootstrapProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeOctopusNcommBootstrapProperties   {
  @JsonProperty("maxConnections")
  @Valid

  private ConfigNodePropertyInteger maxConnections;

  @JsonProperty("maxRequests")
  @Valid

  private ConfigNodePropertyInteger maxRequests;

  @JsonProperty("requestTimeout")
  @Valid

  private ConfigNodePropertyInteger requestTimeout;

  @JsonProperty("requestRetries")
  @Valid

  private ConfigNodePropertyInteger requestRetries;

  @JsonProperty("launchTimeout")
  @Valid

  private ConfigNodePropertyInteger launchTimeout;

  public ComAdobeOctopusNcommBootstrapProperties maxConnections(ConfigNodePropertyInteger maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Get maxConnections
   * @return maxConnections
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

