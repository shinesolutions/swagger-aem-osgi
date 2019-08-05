package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyArray endpoints = null;
  private @Valid ConfigNodePropertyString transportSecretProviderTarget = null;

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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

