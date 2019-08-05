package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray firewallDeserializationWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray firewallDeserializationBlacklist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString firewallDeserializationDiagnostics = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

