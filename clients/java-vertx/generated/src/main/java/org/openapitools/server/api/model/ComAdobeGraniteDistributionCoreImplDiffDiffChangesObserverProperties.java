package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyString agentName = null;
  private ConfigNodePropertyString diffPath = null;
  private ConfigNodePropertyString observedPath = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString propertyNames = null;
  private ConfigNodePropertyInteger distributionDelay = null;
  private ConfigNodePropertyString serviceUserTarget = null;

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties () {

  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties (ConfigNodePropertyBoolean enabled, ConfigNodePropertyString agentName, ConfigNodePropertyString diffPath, ConfigNodePropertyString observedPath, ConfigNodePropertyString serviceName, ConfigNodePropertyString propertyNames, ConfigNodePropertyInteger distributionDelay, ConfigNodePropertyString serviceUserTarget) {
    this.enabled = enabled;
    this.agentName = agentName;
    this.diffPath = diffPath;
    this.observedPath = observedPath;
    this.serviceName = serviceName;
    this.propertyNames = propertyNames;
    this.distributionDelay = distributionDelay;
    this.serviceUserTarget = serviceUserTarget;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("agentName")
  public ConfigNodePropertyString getAgentName() {
    return agentName;
  }
  public void setAgentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

    
  @JsonProperty("diffPath")
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }
  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

    
  @JsonProperty("observedPath")
  public ConfigNodePropertyString getObservedPath() {
    return observedPath;
  }
  public void setObservedPath(ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("propertyNames")
  public ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }
  public void setPropertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }

    
  @JsonProperty("distributionDelay")
  public ConfigNodePropertyInteger getDistributionDelay() {
    return distributionDelay;
  }
  public void setDistributionDelay(ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
  }

    
  @JsonProperty("serviceUser.target")
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }
  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
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
    return Objects.equals(enabled, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.enabled) &&
        Objects.equals(agentName, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.agentName) &&
        Objects.equals(diffPath, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.diffPath) &&
        Objects.equals(observedPath, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.observedPath) &&
        Objects.equals(serviceName, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.serviceName) &&
        Objects.equals(propertyNames, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.propertyNames) &&
        Objects.equals(distributionDelay, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.distributionDelay) &&
        Objects.equals(serviceUserTarget, comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.serviceUserTarget);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
