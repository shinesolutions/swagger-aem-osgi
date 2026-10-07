package models

type OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties struct {

	HcName ConfigNodePropertyString `json:"hc.name,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	HcMbeanName ConfigNodePropertyString `json:"hc.mbean.name,omitempty"`
}
