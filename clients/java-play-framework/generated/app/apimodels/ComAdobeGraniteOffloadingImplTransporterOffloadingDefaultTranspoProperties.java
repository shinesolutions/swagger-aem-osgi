package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties   {
  @JsonProperty("default.transport.agent-to-worker.prefix")
  @Valid

  private ConfigNodePropertyString defaultTransportAgentToWorkerPrefix;

  @JsonProperty("default.transport.agent-to-master.prefix")
  @Valid

  private ConfigNodePropertyString defaultTransportAgentToMasterPrefix;

  @JsonProperty("default.transport.input.package")
  @Valid

  private ConfigNodePropertyString defaultTransportInputPackage;

  @JsonProperty("default.transport.output.package")
  @Valid

  private ConfigNodePropertyString defaultTransportOutputPackage;

  @JsonProperty("default.transport.replication.synchronous")
  @Valid

  private ConfigNodePropertyBoolean defaultTransportReplicationSynchronous;

  @JsonProperty("default.transport.contentpackage")
  @Valid

  private ConfigNodePropertyBoolean defaultTransportContentpackage;

  @JsonProperty("offloading.transporter.default.enabled")
  @Valid

  private ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled;

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
    return this;
  }

   /**
   * Get defaultTransportAgentToWorkerPrefix
   * @return defaultTransportAgentToWorkerPrefix
  **/
  public ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
    return defaultTransportAgentToWorkerPrefix;
  }

  public void setDefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
    return this;
  }

   /**
   * Get defaultTransportAgentToMasterPrefix
   * @return defaultTransportAgentToMasterPrefix
  **/
  public ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
    return defaultTransportAgentToMasterPrefix;
  }

  public void setDefaultTransportAgentToMasterPrefix(ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
    return this;
  }

   /**
   * Get defaultTransportInputPackage
   * @return defaultTransportInputPackage
  **/
  public ConfigNodePropertyString getDefaultTransportInputPackage() {
    return defaultTransportInputPackage;
  }

  public void setDefaultTransportInputPackage(ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
    return this;
  }

   /**
   * Get defaultTransportOutputPackage
   * @return defaultTransportOutputPackage
  **/
  public ConfigNodePropertyString getDefaultTransportOutputPackage() {
    return defaultTransportOutputPackage;
  }

  public void setDefaultTransportOutputPackage(ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
    return this;
  }

   /**
   * Get defaultTransportReplicationSynchronous
   * @return defaultTransportReplicationSynchronous
  **/
  public ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
    return defaultTransportReplicationSynchronous;
  }

  public void setDefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
    return this;
  }

   /**
   * Get defaultTransportContentpackage
   * @return defaultTransportContentpackage
  **/
  public ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
    return defaultTransportContentpackage;
  }

  public void setDefaultTransportContentpackage(ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties offloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    return this;
  }

   /**
   * Get offloadingTransporterDefaultEnabled
   * @return offloadingTransporterDefaultEnabled
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

