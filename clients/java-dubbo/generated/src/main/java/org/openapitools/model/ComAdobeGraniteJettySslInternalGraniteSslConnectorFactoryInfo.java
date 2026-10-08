package org.openapitools.model;

import org.openapitools.model.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties;

  @JsonProperty("additionalProperties")
  private String additionalProperties;

  @JsonProperty("bundle_location")
  private String bundleLocation;

  @JsonProperty("service_location")
  private String serviceLocation;

  /**
   * 
   * @return pid
   */
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * 
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   * @return properties
   */
  public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties properties) {
    this.properties = properties;
  }

  /**
   * 
   * @return additionalProperties
   */
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * 
   * @return bundleLocation
   */
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   * 
   * @return serviceLocation
   */
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo = (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.properties) &&
        Objects.equals(this.additionalProperties, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.additionalProperties) &&
        Objects.equals(this.bundleLocation, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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
