package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString packageBuilderTarget = null;

  public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties () {

  }

  public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties (ConfigNodePropertyString name, ConfigNodePropertyString packageBuilderTarget) {
    this.name = name;
    this.packageBuilderTarget = packageBuilderTarget;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties = (OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.name) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.packageBuilderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, packageBuilderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
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
