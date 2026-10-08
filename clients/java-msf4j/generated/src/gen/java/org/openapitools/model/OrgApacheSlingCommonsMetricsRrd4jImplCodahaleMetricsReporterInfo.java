package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties;

/**
 * OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties;

  @JsonProperty("bundle_location")
  private String bundleLocation;

  @JsonProperty("service_location")
  private String serviceLocation;

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo pid(String pid) {
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

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo title(String title) {
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

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo description(String description) {
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

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo properties(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo bundleLocation(String bundleLocation) {
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

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo serviceLocation(String serviceLocation) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo = (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo) o;
    return Objects.equals(this.pid, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.title) &&
        Objects.equals(this.description, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.properties) &&
        Objects.equals(this.bundleLocation, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo {\n");
    
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

