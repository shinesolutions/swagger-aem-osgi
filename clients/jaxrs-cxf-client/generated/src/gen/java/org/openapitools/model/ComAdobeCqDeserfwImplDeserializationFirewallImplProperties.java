package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray firewallDeserializationWhitelist;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray firewallDeserializationBlacklist;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString firewallDeserializationDiagnostics;
 /**
   * Get firewallDeserializationWhitelist
   * @return firewallDeserializationWhitelist
  **/
  @JsonProperty("firewall.deserialization.whitelist")
  public ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
    return firewallDeserializationWhitelist;
  }

  public void setFirewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    return this;
  }

 /**
   * Get firewallDeserializationBlacklist
   * @return firewallDeserializationBlacklist
  **/
  @JsonProperty("firewall.deserialization.blacklist")
  public ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
    return firewallDeserializationBlacklist;
  }

  public void setFirewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    return this;
  }

 /**
   * Get firewallDeserializationDiagnostics
   * @return firewallDeserializationDiagnostics
  **/
  @JsonProperty("firewall.deserialization.diagnostics")
  public ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
    return firewallDeserializationDiagnostics;
  }

  public void setFirewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

