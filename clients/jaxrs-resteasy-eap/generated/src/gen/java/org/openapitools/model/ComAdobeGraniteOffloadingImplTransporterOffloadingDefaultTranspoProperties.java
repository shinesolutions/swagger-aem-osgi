package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties   {
  

  private ConfigNodePropertyString defaultTransportAgentToWorkerPrefix = null;

  private ConfigNodePropertyString defaultTransportAgentToMasterPrefix = null;

  private ConfigNodePropertyString defaultTransportInputPackage = null;

  private ConfigNodePropertyString defaultTransportOutputPackage = null;

  private ConfigNodePropertyBoolean defaultTransportReplicationSynchronous = null;

  private ConfigNodePropertyBoolean defaultTransportContentpackage = null;

  private ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.agent-to-worker.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
    return defaultTransportAgentToWorkerPrefix;
  }
  public void setDefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.agent-to-master.prefix")
  public ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
    return defaultTransportAgentToMasterPrefix;
  }
  public void setDefaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.input.package")
  public ConfigNodePropertyString getDefaultTransportInputPackage() {
    return defaultTransportInputPackage;
  }
  public void setDefaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.output.package")
  public ConfigNodePropertyString getDefaultTransportOutputPackage() {
    return defaultTransportOutputPackage;
  }
  public void setDefaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.replication.synchronous")
  public ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
    return defaultTransportReplicationSynchronous;
  }
  public void setDefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("default.transport.contentpackage")
  public ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
    return defaultTransportContentpackage;
  }
  public void setDefaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.transporter.default.enabled")
  public ConfigNodePropertyBoolean getOffloadingTransporterDefaultEnabled() {
    return offloadingTransporterDefaultEnabled;
  }
  public void setOffloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
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
    return Objects.equals(defaultTransportAgentToWorkerPrefix, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportAgentToWorkerPrefix) &&
        Objects.equals(defaultTransportAgentToMasterPrefix, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportAgentToMasterPrefix) &&
        Objects.equals(defaultTransportInputPackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportInputPackage) &&
        Objects.equals(defaultTransportOutputPackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportOutputPackage) &&
        Objects.equals(defaultTransportReplicationSynchronous, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportReplicationSynchronous) &&
        Objects.equals(defaultTransportContentpackage, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.defaultTransportContentpackage) &&
        Objects.equals(offloadingTransporterDefaultEnabled, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.offloadingTransporterDefaultEnabled);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

