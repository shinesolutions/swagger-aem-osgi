package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties properties;

  @ApiModelProperty(value = "")

  private String bundleLocation;

  @ApiModelProperty(value = "")

  private String serviceLocation;
 /**
   * Get pid
   * @return pid
  **/
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties properties) {
    this.properties = properties;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo properties(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties properties) {
    this.properties = properties;
    return this;
  }

 /**
   * Get bundleLocation
   * @return bundleLocation
  **/
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

 /**
   * Get serviceLocation
   * @return serviceLocation
  **/
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo = (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo) o;
    return Objects.equals(this.pid, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.pid) &&
        Objects.equals(this.title, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.title) &&
        Objects.equals(this.description, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.description) &&
        Objects.equals(this.properties, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.properties) &&
        Objects.equals(this.bundleLocation, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

