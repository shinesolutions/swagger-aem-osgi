package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
 */

@JsonTypeName("comAdobeCqDeserfwImplDeserializationFirewallImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray firewallDeserializationWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray firewallDeserializationBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString firewallDeserializationDiagnostics;

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationWhitelist(@Nullable ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    return this;
  }

  /**
   * Get firewallDeserializationWhitelist
   * @return firewallDeserializationWhitelist
   */
  @Valid 
  @Schema(name = "firewall.deserialization.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firewall.deserialization.whitelist")
  public @Nullable ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
    return firewallDeserializationWhitelist;
  }

  @JsonProperty("firewall.deserialization.whitelist")
  public void setFirewallDeserializationWhitelist(@Nullable ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationBlacklist(@Nullable ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    return this;
  }

  /**
   * Get firewallDeserializationBlacklist
   * @return firewallDeserializationBlacklist
   */
  @Valid 
  @Schema(name = "firewall.deserialization.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firewall.deserialization.blacklist")
  public @Nullable ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
    return firewallDeserializationBlacklist;
  }

  @JsonProperty("firewall.deserialization.blacklist")
  public void setFirewallDeserializationBlacklist(@Nullable ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationDiagnostics(@Nullable ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    return this;
  }

  /**
   * Get firewallDeserializationDiagnostics
   * @return firewallDeserializationDiagnostics
   */
  @Valid 
  @Schema(name = "firewall.deserialization.diagnostics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firewall.deserialization.diagnostics")
  public @Nullable ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
    return firewallDeserializationDiagnostics;
  }

  @JsonProperty("firewall.deserialization.diagnostics")
  public void setFirewallDeserializationDiagnostics(@Nullable ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties comAdobeCqDeserfwImplDeserializationFirewallImplProperties = (ComAdobeCqDeserfwImplDeserializationFirewallImplProperties) o;
    return Objects.equals(this.firewallDeserializationWhitelist, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationWhitelist) &&
        Objects.equals(this.firewallDeserializationBlacklist, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationBlacklist) &&
        Objects.equals(this.firewallDeserializationDiagnostics, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationDiagnostics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firewallDeserializationWhitelist, firewallDeserializationBlacklist, firewallDeserializationDiagnostics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties {\n");
    sb.append("    firewallDeserializationWhitelist: ").append(toIndentedString(firewallDeserializationWhitelist)).append("\n");
    sb.append("    firewallDeserializationBlacklist: ").append(toIndentedString(firewallDeserializationBlacklist)).append("\n");
    sb.append("    firewallDeserializationDiagnostics: ").append(toIndentedString(firewallDeserializationDiagnostics)).append("\n");
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

