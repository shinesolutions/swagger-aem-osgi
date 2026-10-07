package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties   {

    private ConfigNodePropertyArray firewallDeserializationWhitelist;
    private ConfigNodePropertyArray firewallDeserializationBlacklist;
    private ConfigNodePropertyString firewallDeserializationDiagnostics;

    /**
     * Default constructor.
     */
    public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.
     *
     * @param firewallDeserializationWhitelist firewallDeserializationWhitelist
     * @param firewallDeserializationBlacklist firewallDeserializationBlacklist
     * @param firewallDeserializationDiagnostics firewallDeserializationDiagnostics
     */
    public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(
        ConfigNodePropertyArray firewallDeserializationWhitelist, 
        ConfigNodePropertyArray firewallDeserializationBlacklist, 
        ConfigNodePropertyString firewallDeserializationDiagnostics
    ) {
        this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
        this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
        this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    }



    /**
     * Get firewallDeserializationWhitelist
     * @return firewallDeserializationWhitelist
     */
    public ConfigNodePropertyArray getFirewallDeserializationWhitelist() {
        return firewallDeserializationWhitelist;
    }

    public void setFirewallDeserializationWhitelist(ConfigNodePropertyArray firewallDeserializationWhitelist) {
        this.firewallDeserializationWhitelist = firewallDeserializationWhitelist;
    }

    /**
     * Get firewallDeserializationBlacklist
     * @return firewallDeserializationBlacklist
     */
    public ConfigNodePropertyArray getFirewallDeserializationBlacklist() {
        return firewallDeserializationBlacklist;
    }

    public void setFirewallDeserializationBlacklist(ConfigNodePropertyArray firewallDeserializationBlacklist) {
        this.firewallDeserializationBlacklist = firewallDeserializationBlacklist;
    }

    /**
     * Get firewallDeserializationDiagnostics
     * @return firewallDeserializationDiagnostics
     */
    public ConfigNodePropertyString getFirewallDeserializationDiagnostics() {
        return firewallDeserializationDiagnostics;
    }

    public void setFirewallDeserializationDiagnostics(ConfigNodePropertyString firewallDeserializationDiagnostics) {
        this.firewallDeserializationDiagnostics = firewallDeserializationDiagnostics;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

