package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString agentName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString diffPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString observedPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString propertyNames = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger distributionDelay = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceUserTarget = null;
 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get agentName
   * @return agentName
  **/
  @JsonProperty("agentName")
  public ConfigNodePropertyString getAgentName() {
    return agentName;
  }

  public void setAgentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties agentName(ConfigNodePropertyString agentName) {
    this.agentName = agentName;
    return this;
  }

 /**
   * Get diffPath
   * @return diffPath
  **/
  @JsonProperty("diffPath")
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties diffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

 /**
   * Get observedPath
   * @return observedPath
  **/
  @JsonProperty("observedPath")
  public ConfigNodePropertyString getObservedPath() {
    return observedPath;
  }

  public void setObservedPath(ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties observedPath(ConfigNodePropertyString observedPath) {
    this.observedPath = observedPath;
    return this;
  }

 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get propertyNames
   * @return propertyNames
  **/
  @JsonProperty("propertyNames")
  public ConfigNodePropertyString getPropertyNames() {
    return propertyNames;
  }

  public void setPropertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties propertyNames(ConfigNodePropertyString propertyNames) {
    this.propertyNames = propertyNames;
    return this;
  }

 /**
   * Get distributionDelay
   * @return distributionDelay
  **/
  @JsonProperty("distributionDelay")
  public ConfigNodePropertyInteger getDistributionDelay() {
    return distributionDelay;
  }

  public void setDistributionDelay(ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties distributionDelay(ConfigNodePropertyInteger distributionDelay) {
    this.distributionDelay = distributionDelay;
    return this;
  }

 /**
   * Get serviceUserTarget
   * @return serviceUserTarget
  **/
  @JsonProperty("serviceUser.target")
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties serviceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

