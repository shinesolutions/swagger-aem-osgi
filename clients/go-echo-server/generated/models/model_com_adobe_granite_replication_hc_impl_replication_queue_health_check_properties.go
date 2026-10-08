package models

type ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties struct {

	NumberOfRetriesAllowed ConfigNodePropertyInteger `json:"number.of.retries.allowed,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`
}
