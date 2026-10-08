package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString agentName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString diffPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString observedPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString propertyNames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger distributionDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceUserTarget;

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties agentName(@Nullable ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

  /**
   * Get agentName
   * @return agentName
   */
  @Valid 
  @Schema(name = "agentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agentName")
  public @Nullable ConfigNodePropertyString getAgentName() {
    return agentName;
  }

  @JsonProperty("agentName")
  public void setAgentName(@Nullable ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties diffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

  /**
   * Get diffPath
   * @return diffPath
   */
  @Valid 
  @Schema(name = "diffPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diffPath")
  public @Nullable ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  @JsonProperty("diffPath")
  public void setDiffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties observedPath(@Nullable ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
    return this;
  }

  /**
   * Get observedPath
   * @return observedPath
   */
  @Valid 
  @Schema(name = "observedPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedPath")
  public @Nullable ConfigNodePropertyString getObservedPath() {
    return observedPath;
  }

  @JsonProperty("observedPath")
  public void setObservedPath(@Nullable ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @Valid 
  @Schema(name = "serviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public @Nullable ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties propertyNames(@Nullable ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

  /**
   * Get propertyNames
   * @return propertyNames
   */
  @Valid 
  @Schema(name = "propertyNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propertyNames")
  public @Nullable ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }

  @JsonProperty("propertyNames")
  public void setPropertyNames(@Nullable ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties distributionDelay(@Nullable ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
    return this;
  }

  /**
   * Get distributionDelay
   * @return distributionDelay
   */
  @Valid 
  @Schema(name = "distributionDelay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distributionDelay")
  public @Nullable ConfigNodePropertyInteger getDistributionDelay() {
    return distributionDelay;
  }

  @JsonProperty("distributionDelay")
  public void setDistributionDelay(@Nullable ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  /**
   * Get serviceUserTarget
   * @return serviceUserTarget
   */
  @Valid 
  @Schema(name = "serviceUser.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceUser.target")
  public @Nullable ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  @JsonProperty("serviceUser.target")
  public void setServiceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties = (ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties) o;
    return Objects.equals(this.enabled, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.enabled) &&
        Objects.equals(this.agentName, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.agentName) &&
        Objects.equals(this.diffPath, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.diffPath) &&
        Objects.equals(this.observedPath, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.observedPath) &&
        Objects.equals(this.serviceName, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.serviceName) &&
        Objects.equals(this.propertyNames, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.propertyNames) &&
        Objects.equals(this.distributionDelay, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.distributionDelay) &&
        Objects.equals(this.serviceUserTarget, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.serviceUserTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, agentName, diffPath, observedPath, serviceName, propertyNames, distributionDelay, serviceUserTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
    sb.append("    observedPath: ").append(toIndentedString(observedPath)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
    sb.append("    distributionDelay: ").append(toIndentedString(distributionDelay)).append("\n");
    sb.append("    serviceUserTarget: ").append(toIndentedString(serviceUserTarget)).append("\n");
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

