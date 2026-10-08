package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingI18nImplJcrResourceBundleProviderInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo   {
  private String pid;
  private String title;
  private String description;
  private OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties;
  private String additionalProperties;
  private String bundleLocation;
  private String serviceLocation;

  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo() {
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  @JsonProperty("pid")
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo properties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(OrgApacheSlingI18nImplJcrResourceBundleProviderProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalProperties")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonProperty("additionalProperties")
  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  @JsonProperty("bundle_location")
  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_location")
  public String getServiceLocation() {
    return serviceLocation;
  }

  @JsonProperty("service_location")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
