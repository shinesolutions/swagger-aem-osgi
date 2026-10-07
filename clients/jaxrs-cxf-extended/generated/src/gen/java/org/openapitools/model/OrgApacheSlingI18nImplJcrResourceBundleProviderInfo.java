package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties;

  @ApiModelProperty(value = "")
  private String additionalProperties;

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
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo pid(String pid) {
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
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo title(String title) {
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
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo properties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
    return this;
  }

 /**
  * Get additionalProperties
  * @return additionalProperties
  */
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Sets the <code>additionalProperties</code> property.
   */
 public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   * Sets the <code>additionalProperties</code> property.
   */
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
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
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo bundleLocation(String bundleLocation) {
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
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo serviceLocation(String serviceLocation) {
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
    OrgApacheSlingI18nImplJcrResourceBundleProviderInfo orgApacheSlingI18nImplJcrResourceBundleProviderInfo = (OrgApacheSlingI18nImplJcrResourceBundleProviderInfo) o;
    return Objects.equals(this.pid, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.title) &&
        Objects.equals(this.description, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.properties) &&
        Objects.equals(this.additionalProperties, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.additionalProperties) &&
        Objects.equals(this.bundleLocation, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheSlingI18nImplJcrResourceBundleProviderInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

