package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
 */

@JsonTypeName("orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray endpoints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger pullItems;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageBuilderTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString transportSecretProviderTarget;

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties endpoints(@Nullable ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * Get endpoints
   * @return endpoints
   */
  @Valid 
  @Schema(name = "endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoints")
  public @Nullable ConfigNodePropertyArray getEndpoints() {
    return endpoints;
  }

  @JsonProperty("endpoints")
  public void setEndpoints(@Nullable ConfigNodePropertyArray endpoints) {
    this.endpoints = endpoints;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties pullItems(@Nullable ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

  /**
   * Get pullItems
   * @return pullItems
   */
  @Valid 
  @Schema(name = "pull.items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pull.items")
  public @Nullable ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  @JsonProperty("pull.items")
  public void setPullItems(@Nullable ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties packageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
   */
  @Valid 
  @Schema(name = "packageBuilder.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageBuilder.target")
  public @Nullable ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  @JsonProperty("packageBuilder.target")
  public void setPackageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties transportSecretProviderTarget(@Nullable ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

  /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
   */
  @Valid 
  @Schema(name = "transportSecretProvider.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportSecretProvider.target")
  public @Nullable ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  @JsonProperty("transportSecretProvider.target")
  public void setTransportSecretProviderTarget(@Nullable ConfigNodePropertyString transportSecretProviderTarget) {
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
    return Objects.equals(this.name, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.name) &&
        Objects.equals(this.endpoints, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.endpoints) &&
        Objects.equals(this.pullItems, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.pullItems) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.packageBuilderTarget) &&
        Objects.equals(this.transportSecretProviderTarget, orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.transportSecretProviderTarget);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

