package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo   {
  private String pid;
  private String title;
  private String description;
  private OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties properties;
  private String bundleLocation;
  private String serviceLocation;

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo() {
  }

  /**
   **/
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo pid(String pid) {
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
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo title(String title) {
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
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo description(String description) {
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
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo properties(OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo bundleLocation(String bundleLocation) {
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
  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo serviceLocation(String serviceLocation) {
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
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo = (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo) o;
    return Objects.equals(this.pid, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.title) &&
        Objects.equals(this.description, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.properties) &&
        Objects.equals(this.bundleLocation, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
