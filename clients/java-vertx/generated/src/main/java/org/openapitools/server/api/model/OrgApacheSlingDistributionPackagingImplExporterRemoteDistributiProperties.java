package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyArray endpoints = null;
  private ConfigNodePropertyInteger pullItems = null;
  private ConfigNodePropertyString packageBuilderTarget = null;
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties () {

  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties (ConfigNodePropertyString name, ConfigNodePropertyArray endpoints, ConfigNodePropertyInteger pullItems, ConfigNodePropertyString packageBuilderTarget, ConfigNodePropertyString transportSecretProviderTarget) {
    this.name = name;
    this.endpoints = endpoints;
    this.pullItems = pullItems;
    this.packageBuilderTarget = packageBuilderTarget;
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("endpoints")
  public ConfigNodePropertyArray getEndpoints() {
    return endpoints;
  }
  public void setEndpoints(ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
  }

    
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }
  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

    
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

    
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
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties = (OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.name) &&
        Objects.equals(endpoints, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.endpoints) &&
        Objects.equals(pullItems, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.pullItems) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.packageBuilderTarget) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.transportSecretProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, endpoints, pullItems, packageBuilderTarget, transportSecretProviderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    pullItems: ").append(toIndentedString(pullItems)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
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
