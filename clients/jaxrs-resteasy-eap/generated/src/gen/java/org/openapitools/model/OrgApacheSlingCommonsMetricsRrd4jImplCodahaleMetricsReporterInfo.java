package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo   {
  

  private String pid = null;

  private String title = null;

  private String description = null;

  private OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties = null;

  private String bundleLocation = null;

  private String serviceLocation = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties) {
    this.properties = properties;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo = (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo) o;
    return Objects.equals(pid, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.pid) &&
        Objects.equals(title, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.title) &&
        Objects.equals(description, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.description) &&
        Objects.equals(properties, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.properties) &&
        Objects.equals(bundleLocation, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.bundleLocation) &&
        Objects.equals(serviceLocation, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.serviceLocation);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

