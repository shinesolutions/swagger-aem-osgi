package models

type OrgApacheSlingSecurityImplReferrerFilterProperties struct {

	AllowEmpty ConfigNodePropertyBoolean `json:"allow.empty,omitempty"`

	AllowHosts ConfigNodePropertyArray `json:"allow.hosts,omitempty"`

	AllowHostsRegexp ConfigNodePropertyArray `json:"allow.hosts.regexp,omitempty"`

	FilterMethods ConfigNodePropertyArray `json:"filter.methods,omitempty"`

	ExcludeAgentsRegexp ConfigNodePropertyArray `json:"exclude.agents.regexp,omitempty"`
}
