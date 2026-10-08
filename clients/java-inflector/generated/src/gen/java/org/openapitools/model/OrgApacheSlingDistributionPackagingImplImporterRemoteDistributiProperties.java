package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("endpoints")
  private ConfigNodePropertyArray endpoints;

  @JsonProperty("transportSecretProvider.target")
  private ConfigNodePropertyString transportSecretProviderTarget;

  /**
   **/
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties endpoints(ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endpoints")
  public ConfigNodePropertyArray getEndpoints() {
    return endpoints;
  }
  public void setEndpoints(ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
  }

  /**
   **/
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties = (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.name) &&
        Objects.equals(endpoints, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.endpoints) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.transportSecretProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, endpoints, transportSecretProviderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
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

