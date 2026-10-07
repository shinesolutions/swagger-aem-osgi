package models

type OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Path ConfigNodePropertyString `json:"path,omitempty"`

	IgnoredPathsPatterns ConfigNodePropertyArray `json:"ignoredPathsPatterns,omitempty"`

	ServiceName ConfigNodePropertyString `json:"serviceName,omitempty"`

	Deep ConfigNodePropertyBoolean `json:"deep,omitempty"`
}
