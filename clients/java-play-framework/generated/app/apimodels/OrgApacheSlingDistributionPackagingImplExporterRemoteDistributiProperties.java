package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("endpoints")
  private ConfigNodePropertyArray endpoints = null;

  @JsonProperty("pull.items")
  private ConfigNodePropertyInteger pullItems = null;

  @JsonProperty("packageBuilder.target")
  private ConfigNodePropertyString packageBuilderTarget = null;

  @JsonProperty("transportSecretProvider.target")
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties endpoints(ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @Valid
  public ConfigNodePropertyArray getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

   /**
   * Get pullItems
   * @return pullItems
  **/
  @Valid
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

   /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
  **/
  @Valid
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

   /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

