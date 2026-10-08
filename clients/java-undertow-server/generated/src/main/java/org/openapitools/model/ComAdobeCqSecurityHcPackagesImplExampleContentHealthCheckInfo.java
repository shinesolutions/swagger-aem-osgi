/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo   {
  
  private String pid;
  private String title;
  private String description;
  private ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties properties;
  private String additionalProperties;
  private String bundleLocation;
  private String serviceLocation;

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo properties(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties properties) {
    this.properties = properties;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }
  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   */
  public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_location")
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
    ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo = (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo) o;
    return Objects.equals(pid, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.pid) &&
        Objects.equals(title, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.title) &&
        Objects.equals(description, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.description) &&
        Objects.equals(properties, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.properties) &&
        Objects.equals(additionalProperties, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.additionalProperties) &&
        Objects.equals(bundleLocation, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.bundleLocation) &&
        Objects.equals(serviceLocation, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo {\n");
    
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

