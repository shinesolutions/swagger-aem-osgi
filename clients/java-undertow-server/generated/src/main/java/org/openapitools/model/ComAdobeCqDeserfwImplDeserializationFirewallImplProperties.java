/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties   {
  
  private ConfigNodePropertyArray firewallDeserializationWhitelist;
  private ConfigNodePropertyArray firewallDeserializationBlacklist;
  private ConfigNodePropertyString firewallDeserializationDiagnostics;

  /**
   */
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.whitelist")
  public ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
    return firewallDeserializationWhitelist;
  }
  public void setFirewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
  }

  /**
   */
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.blacklist")
  public ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
    return firewallDeserializationBlacklist;
  }
  public void setFirewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
  }

  /**
   */
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.diagnostics")
  public ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
    return firewallDeserializationDiagnostics;
  }
  public void setFirewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
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
    return Objects.equals(firewallDeserializationWhitelist, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationWhitelist) &&
        Objects.equals(firewallDeserializationBlacklist, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationBlacklist) &&
        Objects.equals(firewallDeserializationDiagnostics, comAdobeCqDeserfwImplDeserializationFirewallImplProperties.firewallDeserializationDiagnostics);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

