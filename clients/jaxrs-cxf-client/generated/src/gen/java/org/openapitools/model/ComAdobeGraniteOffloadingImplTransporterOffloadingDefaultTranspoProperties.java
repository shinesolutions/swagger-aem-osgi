package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString defaultTransportAgentToWorkerPrefix = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString defaultTransportAgentToMasterPrefix = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString defaultTransportInputPackage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString defaultTransportOutputPackage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean defaultTransportReplicationSynchronous = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean defaultTransportContentpackage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled = null;
 /**
   * Get defaultTransportAgentToWorkerPrefix
   * @return defaultTransportAgentToWorkerPrefix
  **/
  @JsonProperty("default.transport.agent-to-worker.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
    return defaultTransportAgentToWorkerPrefix;
  }

  public void setDefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
    return this;
  }

 /**
   * Get defaultTransportAgentToMasterPrefix
   * @return defaultTransportAgentToMasterPrefix
  **/
  @JsonProperty("default.transport.agent-to-master.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
    return defaultTransportAgentToMasterPrefix;
  }

  public void setDefaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
    return this;
  }

 /**
   * Get defaultTransportInputPackage
   * @return defaultTransportInputPackage
  **/
  @JsonProperty("default.transport.input.package")
  public ConfigNodePropertyString getDefaultTransportInputPackage() {
    return defaultTransportInputPackage;
  }

  public void setDefaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
    return this;
  }

 /**
   * Get defaultTransportOutputPackage
   * @return defaultTransportOutputPackage
  **/
  @JsonProperty("default.transport.output.package")
  public ConfigNodePropertyString getDefaultTransportOutputPackage() {
    return defaultTransportOutputPackage;
  }

  public void setDefaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
    return this;
  }

 /**
   * Get defaultTransportReplicationSynchronous
   * @return defaultTransportReplicationSynchronous
  **/
  @JsonProperty("default.transport.replication.synchronous")
  public ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
    return defaultTransportReplicationSynchronous;
  }

  public void setDefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
    return this;
  }

 /**
   * Get defaultTransportContentpackage
   * @return defaultTransportContentpackage
  **/
  @JsonProperty("default.transport.contentpackage")
  public ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
    return defaultTransportContentpackage;
  }

  public void setDefaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
    return this;
  }

 /**
   * Get offloadingTransporterDefaultEnabled
   * @return offloadingTransporterDefaultEnabled
  **/
  @JsonProperty("offloading.transporter.default.enabled")
  public ConfigNodePropertyBoolean getOffloadingTransporterDefaultEnabled() {
    return offloadingTransporterDefaultEnabled;
  }

  public void setOffloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties offloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

