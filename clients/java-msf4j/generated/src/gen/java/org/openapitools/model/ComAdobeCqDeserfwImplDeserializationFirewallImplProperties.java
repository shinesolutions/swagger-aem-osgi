package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties   {
  @JsonProperty("firewall.deserialization.whitelist")
  private ConfigNodePropertyArray firewallDeserializationWhitelist = null;

  @JsonProperty("firewall.deserialization.blacklist")
  private ConfigNodePropertyArray firewallDeserializationBlacklist = null;

  @JsonProperty("firewall.deserialization.diagnostics")
  private ConfigNodePropertyString firewallDeserializationDiagnostics = null;

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    return this;
  }

   /**
   * Get firewallDeserializationWhitelist
   * @return firewallDeserializationWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
    return firewallDeserializationWhitelist;
  }

  public void setFirewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    return this;
  }

   /**
   * Get firewallDeserializationBlacklist
   * @return firewallDeserializationBlacklist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
    return firewallDeserializationBlacklist;
  }

  public void setFirewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
  }

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    return this;
  }

   /**
   * Get firewallDeserializationDiagnostics
   * @return firewallDeserializationDiagnostics
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
    return firewallDeserializationDiagnostics;
  }

  public void setFirewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

