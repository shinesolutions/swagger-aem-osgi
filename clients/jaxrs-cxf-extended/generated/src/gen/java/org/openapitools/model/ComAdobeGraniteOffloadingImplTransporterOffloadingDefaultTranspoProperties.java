package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultTransportAgentToWorkerPrefix;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultTransportAgentToMasterPrefix;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultTransportInputPackage;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultTransportOutputPackage;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultTransportReplicationSynchronous;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultTransportContentpackage;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled;
 /**
  * Get defaultTransportAgentToWorkerPrefix
  * @return defaultTransportAgentToWorkerPrefix
  */
  @JsonProperty("default.transport.agent-to-worker.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
    return defaultTransportAgentToWorkerPrefix;
  }

  /**
   * Sets the <code>defaultTransportAgentToWorkerPrefix</code> property.
   */
 public void setDefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
  }

  /**
   * Sets the <code>defaultTransportAgentToWorkerPrefix</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
    return this;
  }

 /**
  * Get defaultTransportAgentToMasterPrefix
  * @return defaultTransportAgentToMasterPrefix
  */
  @JsonProperty("default.transport.agent-to-master.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
    return defaultTransportAgentToMasterPrefix;
  }

  /**
   * Sets the <code>defaultTransportAgentToMasterPrefix</code> property.
   */
 public void setDefaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
  }

  /**
   * Sets the <code>defaultTransportAgentToMasterPrefix</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
    return this;
  }

 /**
  * Get defaultTransportInputPackage
  * @return defaultTransportInputPackage
  */
  @JsonProperty("default.transport.input.package")
  public ConfigNodePropertyString getDefaultTransportInputPackage() {
    return defaultTransportInputPackage;
  }

  /**
   * Sets the <code>defaultTransportInputPackage</code> property.
   */
 public void setDefaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
  }

  /**
   * Sets the <code>defaultTransportInputPackage</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
    return this;
  }

 /**
  * Get defaultTransportOutputPackage
  * @return defaultTransportOutputPackage
  */
  @JsonProperty("default.transport.output.package")
  public ConfigNodePropertyString getDefaultTransportOutputPackage() {
    return defaultTransportOutputPackage;
  }

  /**
   * Sets the <code>defaultTransportOutputPackage</code> property.
   */
 public void setDefaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
  }

  /**
   * Sets the <code>defaultTransportOutputPackage</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
    return this;
  }

 /**
  * Get defaultTransportReplicationSynchronous
  * @return defaultTransportReplicationSynchronous
  */
  @JsonProperty("default.transport.replication.synchronous")
  public ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
    return defaultTransportReplicationSynchronous;
  }

  /**
   * Sets the <code>defaultTransportReplicationSynchronous</code> property.
   */
 public void setDefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
  }

  /**
   * Sets the <code>defaultTransportReplicationSynchronous</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
    return this;
  }

 /**
  * Get defaultTransportContentpackage
  * @return defaultTransportContentpackage
  */
  @JsonProperty("default.transport.contentpackage")
  public ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
    return defaultTransportContentpackage;
  }

  /**
   * Sets the <code>defaultTransportContentpackage</code> property.
   */
 public void setDefaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
  }

  /**
   * Sets the <code>defaultTransportContentpackage</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
    return this;
  }

 /**
  * Get offloadingTransporterDefaultEnabled
  * @return offloadingTransporterDefaultEnabled
  */
  @JsonProperty("offloading.transporter.default.enabled")
  public ConfigNodePropertyBoolean getOffloadingTransporterDefaultEnabled() {
    return offloadingTransporterDefaultEnabled;
  }

  /**
   * Sets the <code>offloadingTransporterDefaultEnabled</code> property.
   */
 public void setOffloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
  }

  /**
   * Sets the <code>offloadingTransporterDefaultEnabled</code> property.
   */
  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties offloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties = (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties) o;
    return Objects.equals(this.defaultTransportAgentToWorkerPrefix, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportAgentToWorkerPrefix) &&
        Objects.equals(this.defaultTransportAgentToMasterPrefix, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportAgentToMasterPrefix) &&
        Objects.equals(this.defaultTransportInputPackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportInputPackage) &&
        Objects.equals(this.defaultTransportOutputPackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportOutputPackage) &&
        Objects.equals(this.defaultTransportReplicationSynchronous, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportReplicationSynchronous) &&
        Objects.equals(this.defaultTransportContentpackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportContentpackage) &&
        Objects.equals(this.offloadingTransporterDefaultEnabled, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.offloadingTransporterDefaultEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTransportAgentToWorkerPrefix, defaultTransportAgentToMasterPrefix, defaultTransportInputPackage, defaultTransportOutputPackage, defaultTransportReplicationSynchronous, defaultTransportContentpackage, offloadingTransporterDefaultEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {\n");
    
    sb.append("    defaultTransportAgentToWorkerPrefix: ").append(toIndentedString(defaultTransportAgentToWorkerPrefix)).append("\n");
    sb.append("    defaultTransportAgentToMasterPrefix: ").append(toIndentedString(defaultTransportAgentToMasterPrefix)).append("\n");
    sb.append("    defaultTransportInputPackage: ").append(toIndentedString(defaultTransportInputPackage)).append("\n");
    sb.append("    defaultTransportOutputPackage: ").append(toIndentedString(defaultTransportOutputPackage)).append("\n");
    sb.append("    defaultTransportReplicationSynchronous: ").append(toIndentedString(defaultTransportReplicationSynchronous)).append("\n");
    sb.append("    defaultTransportContentpackage: ").append(toIndentedString(defaultTransportContentpackage)).append("\n");
    sb.append("    offloadingTransporterDefaultEnabled: ").append(toIndentedString(offloadingTransporterDefaultEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

