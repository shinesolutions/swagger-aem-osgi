package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
 */

@JsonTypeName("comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultTransportAgentToWorkerPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultTransportAgentToMasterPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultTransportInputPackage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultTransportOutputPackage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean defaultTransportReplicationSynchronous;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean defaultTransportContentpackage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled;

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToWorkerPrefix(@Nullable ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
    return this;
  }

  /**
   * Get defaultTransportAgentToWorkerPrefix
   * @return defaultTransportAgentToWorkerPrefix
   */
  @Valid 
  @Schema(name = "default.transport.agent-to-worker.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.agent-to-worker.prefix")
  public @Nullable ConfigNodePropertyString getDefaultTransportAgentToWorkerPrefix() {
    return defaultTransportAgentToWorkerPrefix;
  }

  @JsonProperty("default.transport.agent-to-worker.prefix")
  public void setDefaultTransportAgentToWorkerPrefix(@Nullable ConfigNodePropertyString defaultTransportAgentToWorkerPrefix) {
    this.defaultTransportAgentToWorkerPrefix = defaultTransportAgentToWorkerPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportAgentToMasterPrefix(@Nullable ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
    return this;
  }

  /**
   * Get defaultTransportAgentToMasterPrefix
   * @return defaultTransportAgentToMasterPrefix
   */
  @Valid 
  @Schema(name = "default.transport.agent-to-master.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.agent-to-master.prefix")
  public @Nullable ConfigNodePropertyString getDefaultTransportAgentToMasterPrefix() {
    return defaultTransportAgentToMasterPrefix;
  }

  @JsonProperty("default.transport.agent-to-master.prefix")
  public void setDefaultTransportAgentToMasterPrefix(@Nullable ConfigNodePropertyString defaultTransportAgentToMasterPrefix) {
    this.defaultTransportAgentToMasterPrefix = defaultTransportAgentToMasterPrefix;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportInputPackage(@Nullable ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
    return this;
  }

  /**
   * Get defaultTransportInputPackage
   * @return defaultTransportInputPackage
   */
  @Valid 
  @Schema(name = "default.transport.input.package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.input.package")
  public @Nullable ConfigNodePropertyString getDefaultTransportInputPackage() {
    return defaultTransportInputPackage;
  }

  @JsonProperty("default.transport.input.package")
  public void setDefaultTransportInputPackage(@Nullable ConfigNodePropertyString defaultTransportInputPackage) {
    this.defaultTransportInputPackage = defaultTransportInputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportOutputPackage(@Nullable ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
    return this;
  }

  /**
   * Get defaultTransportOutputPackage
   * @return defaultTransportOutputPackage
   */
  @Valid 
  @Schema(name = "default.transport.output.package", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.output.package")
  public @Nullable ConfigNodePropertyString getDefaultTransportOutputPackage() {
    return defaultTransportOutputPackage;
  }

  @JsonProperty("default.transport.output.package")
  public void setDefaultTransportOutputPackage(@Nullable ConfigNodePropertyString defaultTransportOutputPackage) {
    this.defaultTransportOutputPackage = defaultTransportOutputPackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportReplicationSynchronous(@Nullable ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
    return this;
  }

  /**
   * Get defaultTransportReplicationSynchronous
   * @return defaultTransportReplicationSynchronous
   */
  @Valid 
  @Schema(name = "default.transport.replication.synchronous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.replication.synchronous")
  public @Nullable ConfigNodePropertyBoolean getDefaultTransportReplicationSynchronous() {
    return defaultTransportReplicationSynchronous;
  }

  @JsonProperty("default.transport.replication.synchronous")
  public void setDefaultTransportReplicationSynchronous(@Nullable ConfigNodePropertyBoolean defaultTransportReplicationSynchronous) {
    this.defaultTransportReplicationSynchronous = defaultTransportReplicationSynchronous;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties defaultTransportContentpackage(@Nullable ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
    return this;
  }

  /**
   * Get defaultTransportContentpackage
   * @return defaultTransportContentpackage
   */
  @Valid 
  @Schema(name = "default.transport.contentpackage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.transport.contentpackage")
  public @Nullable ConfigNodePropertyBoolean getDefaultTransportContentpackage() {
    return defaultTransportContentpackage;
  }

  @JsonProperty("default.transport.contentpackage")
  public void setDefaultTransportContentpackage(@Nullable ConfigNodePropertyBoolean defaultTransportContentpackage) {
    this.defaultTransportContentpackage = defaultTransportContentpackage;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties offloadingTransporterDefaultEnabled(@Nullable ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
    this.offloadingTransporterDefaultEnabled = offloadingTransporterDefaultEnabled;
    return this;
  }

  /**
   * Get offloadingTransporterDefaultEnabled
   * @return offloadingTransporterDefaultEnabled
   */
  @Valid 
  @Schema(name = "offloading.transporter.default.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offloading.transporter.default.enabled")
  public @Nullable ConfigNodePropertyBoolean getOffloadingTransporterDefaultEnabled() {
    return offloadingTransporterDefaultEnabled;
  }

  @JsonProperty("offloading.transporter.default.enabled")
  public void setOffloadingTransporterDefaultEnabled(@Nullable ConfigNodePropertyBoolean offloadingTransporterDefaultEnabled) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

