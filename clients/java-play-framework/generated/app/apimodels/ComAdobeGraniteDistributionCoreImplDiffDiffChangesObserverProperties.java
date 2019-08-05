package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("agentName")
  private ConfigNodePropertyString agentName = null;

  @JsonProperty("diffPath")
  private ConfigNodePropertyString diffPath = null;

  @JsonProperty("observedPath")
  private ConfigNodePropertyString observedPath = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("propertyNames")
  private ConfigNodePropertyString propertyNames = null;

  @JsonProperty("distributionDelay")
  private ConfigNodePropertyInteger distributionDelay = null;

  @JsonProperty("serviceUser.target")
  private ConfigNodePropertyString serviceUserTarget = null;

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties agentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

   /**
   * Get agentName
   * @return agentName
  **/
  @Valid
  public ConfigNodePropertyString getAgentName() {
    return agentName;
  }

  public void setAgentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties diffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

   /**
   * Get diffPath
   * @return diffPath
  **/
  @Valid
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties observedPath(ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
    return this;
  }

   /**
   * Get observedPath
   * @return observedPath
  **/
  @Valid
  public ConfigNodePropertyString getObservedPath() {
    return observedPath;
  }

  public void setObservedPath(ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Valid
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties propertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

   /**
   * Get propertyNames
   * @return propertyNames
  **/
  @Valid
  public ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }

  public void setPropertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties distributionDelay(ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
    return this;
  }

   /**
   * Get distributionDelay
   * @return distributionDelay
  **/
  @Valid
  public ConfigNodePropertyInteger getDistributionDelay() {
    return distributionDelay;
  }

  public void setDistributionDelay(ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

   /**
   * Get serviceUserTarget
   * @return serviceUserTarget
  **/
  @Valid
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

