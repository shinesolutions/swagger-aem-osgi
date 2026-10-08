package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheSlingSecurityImplReferrerFilterProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingSecurityImplReferrerFilterInfo
 */

@JsonTypeName("orgApacheSlingSecurityImplReferrerFilterInfo")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSecurityImplReferrerFilterInfo {

  private String pid;

  private String title;

  private String description;

  private OrgApacheSlingSecurityImplReferrerFilterProperties properties;

  private String bundleLocation;

  private String serviceLocation;

  public OrgApacheSlingSecurityImplReferrerFilterInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheSlingSecurityImplReferrerFilterInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheSlingSecurityImplReferrerFilterInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheSlingSecurityImplReferrerFilterInfo properties(OrgApacheSlingSecurityImplReferrerFilterProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public OrgApacheSlingSecurityImplReferrerFilterProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingSecurityImplReferrerFilterProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingSecurityImplReferrerFilterInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * Get bundleLocation
   * @return bundleLocation
   */
  
  @Schema(name = "bundle_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundle_location")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public OrgApacheSlingSecurityImplReferrerFilterInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Get serviceLocation
   * @return serviceLocation
   */
  
  @Schema(name = "service_location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrgApacheSlingSecurityImplReferrerFilterInfo orgApacheSlingSecurityImplReferrerFilterInfo = (OrgApacheSlingSecurityImplReferrerFilterInfo) o;
    return Objects.equals(this.pid, orgApacheSlingSecurityImplReferrerFilterInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingSecurityImplReferrerFilterInfo.title) &&
        Objects.equals(this.description, orgApacheSlingSecurityImplReferrerFilterInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingSecurityImplReferrerFilterInfo.properties) &&
        Objects.equals(this.bundleLocation, orgApacheSlingSecurityImplReferrerFilterInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheSlingSecurityImplReferrerFilterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplReferrerFilterInfo {\n");
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

