package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString privilegeName = null;

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties () {

  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties (ConfigNodePropertyString name, ConfigNodePropertyString serviceName, ConfigNodePropertyString path, ConfigNodePropertyString privilegeName) {
    this.name = name;
    this.serviceName = serviceName;
    this.path = path;
    this.privilegeName = privilegeName;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("service.name")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("privilege.name")
  public ConfigNodePropertyString getPrivilegeName() {
    return privilegeName;
  }
  public void setPrivilegeName(ConfigNodePropertyString privilegeName) {
    this.privilegeName = privilegeName;
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
    return Objects.equals(name, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.name) &&
        Objects.equals(serviceName, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.serviceName) &&
        Objects.equals(path, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.path) &&
        Objects.equals(privilegeName, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.privilegeName);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
