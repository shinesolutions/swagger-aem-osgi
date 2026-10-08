package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString path;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString privilegeName;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("service.name")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get privilegeName
   * @return privilegeName
  **/
  @JsonProperty("privilege.name")
  public ConfigNodePropertyString getPrivilegeName() {
    return privilegeName;
  }

  public void setPrivilegeName(ConfigNodePropertyString privilegeName) {
    this.privilegeName = privilegeName;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties privilegeName(ConfigNodePropertyString privilegeName) {
    this.privilegeName = privilegeName;
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
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties = (OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.name) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.serviceName) &&
        Objects.equals(this.path, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.path) &&
        Objects.equals(this.privilegeName, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.privilegeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceName, path, privilegeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    privilegeName: ").append(toIndentedString(privilegeName)).append("\n");
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

