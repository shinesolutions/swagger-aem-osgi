package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties = null;

  @JsonProperty("bundle_location")
  private String bundleLocation = null;

  @JsonProperty("service_location")
  private String serviceLocation = null;

  /**
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo pid(String pid) {
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
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo title(String title) {
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
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo description(String description) {
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
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo properties(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo bundleLocation(String bundleLocation) {
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
   **/
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo serviceLocation(String serviceLocation) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo = (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo) o;
    return Objects.equals(pid, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.pid) &&
        Objects.equals(title, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.title) &&
        Objects.equals(description, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.description) &&
        Objects.equals(properties, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.properties) &&
        Objects.equals(bundleLocation, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

