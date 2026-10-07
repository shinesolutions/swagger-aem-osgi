package models

type ComAdobeCqDeserfwImplDeserializationFirewallImplProperties struct {

	FirewallDeserializationWhitelist ConfigNodePropertyArray `json:"firewall.deserialization.whitelist,omitempty"`

	FirewallDeserializationBlacklist ConfigNodePropertyArray `json:"firewall.deserialization.blacklist,omitempty"`

	FirewallDeserializationDiagnostics ConfigNodePropertyString `json:"firewall.deserialization.diagnostics,omitempty"`
}
