package org.openapitools.model;

import org.openapitools.model.OrgApacheSlingScriptingCoreImplScriptCacheImplProperties;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo  {
  
  @ApiModelProperty(value = "")
  private String pid = null;

  @ApiModelProperty(value = "")
  private String title = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties = null;

  @ApiModelProperty(value = "")
  private String bundleLocation = null;

  @ApiModelProperty(value = "")
  private String serviceLocation = null;
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

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo pid(String pid) {
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

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo title(String title) {
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

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo properties(OrgApacheSlingScriptingCoreImplScriptCacheImplProperties properties) {
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

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo bundleLocation(String bundleLocation) {
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

  public OrgApacheSlingScriptingCoreImplScriptCacheImplInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptCacheImplInfo {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

