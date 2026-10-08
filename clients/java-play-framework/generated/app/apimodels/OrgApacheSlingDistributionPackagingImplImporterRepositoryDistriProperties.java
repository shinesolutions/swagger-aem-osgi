package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties   {
  @JsonProperty("name")
  @Valid

  private ConfigNodePropertyString name;

  @JsonProperty("service.name")
  @Valid

  private ConfigNodePropertyString serviceName;

  @JsonProperty("path")
  @Valid

  private ConfigNodePropertyString path;

  @JsonProperty("privilege.name")
  @Valid

  private ConfigNodePropertyString privilegeName;

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties privilegeName(ConfigNodePropertyString privilegeName) {
    this.privilegeName = privilegeName;
    return this;
  }

   /**
   * Get privilegeName
   * @return privilegeName
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

