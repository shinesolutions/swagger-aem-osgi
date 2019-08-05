package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties   {
  

  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyArray endpoints = null;

  private ConfigNodePropertyString transportSecretProviderTarget = null;

  /**
   **/
  
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

