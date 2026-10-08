package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheSlingI18nImplI18NFilterProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingI18nImplI18NFilterInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private OrgApacheSlingI18nImplI18NFilterProperties properties;

  @ApiModelProperty(value = "")
  private String bundleLocation;

  @ApiModelProperty(value = "")
  private String serviceLocation;
 /**
  * Get pid
  * @return pid
  */
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
 public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public OrgApacheSlingI18nImplI18NFilterProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(OrgApacheSlingI18nImplI18NFilterProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo properties(OrgApacheSlingI18nImplI18NFilterProperties properties) {
    this.properties = properties;
    return this;
  }

 /**
  * Get bundleLocation
  * @return bundleLocation
  */
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  /**
   * Sets the <code>bundleLocation</code> property.
   */
 public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   * Sets the <code>bundleLocation</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

 /**
  * Get serviceLocation
  * @return serviceLocation
  */
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  /**
   * Sets the <code>serviceLocation</code> property.
   */
 public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }

  /**
   * Sets the <code>serviceLocation</code> property.
   */
  public OrgApacheSlingI18nImplI18NFilterInfo serviceLocation(String serviceLocation) {
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
    OrgApacheSlingI18nImplI18NFilterInfo orgApacheSlingI18nImplI18NFilterInfo = (OrgApacheSlingI18nImplI18NFilterInfo) o;
    return Objects.equals(this.pid, orgApacheSlingI18nImplI18NFilterInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingI18nImplI18NFilterInfo.title) &&
        Objects.equals(this.description, orgApacheSlingI18nImplI18NFilterInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingI18nImplI18NFilterInfo.properties) &&
        Objects.equals(this.bundleLocation, orgApacheSlingI18nImplI18NFilterInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheSlingI18nImplI18NFilterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplI18NFilterInfo {\n");
    
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

