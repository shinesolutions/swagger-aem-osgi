package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqDeserfwImplDeserializationFirewallImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties   {
  private ConfigNodePropertyArray firewallDeserializationWhitelist;
  private ConfigNodePropertyArray firewallDeserializationBlacklist;
  private ConfigNodePropertyString firewallDeserializationDiagnostics;

  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties() {
  }

  /**
   **/
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.whitelist")
  @Valid public ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
    return firewallDeserializationWhitelist;
  }

  @JsonProperty("firewall.deserialization.whitelist")
  public void setFirewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
    this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
  }

  /**
   **/
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.blacklist")
  @Valid public ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
    return firewallDeserializationBlacklist;
  }

  @JsonProperty("firewall.deserialization.blacklist")
  public void setFirewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
    this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
  }

  /**
   **/
  public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties firewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
    this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firewall.deserialization.diagnostics")
  @Valid public ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
    return firewallDeserializationDiagnostics;
  }

  @JsonProperty("firewall.deserialization.diagnostics")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
