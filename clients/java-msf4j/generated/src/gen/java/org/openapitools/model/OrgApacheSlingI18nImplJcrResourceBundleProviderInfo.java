package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties;

/**
 * OrgApacheSlingI18nImplJcrResourceBundleProviderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties = null;

  @JsonProperty("additionalProperties")
  private String additionalProperties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo properties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

   /**
   * Get bundleLocation
   * @return bundleLocation
  **/
  @ApiModelProperty(value = "")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * Get serviceLocation
   * @return serviceLocation
  **/
  @ApiModelProperty(value = "")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

