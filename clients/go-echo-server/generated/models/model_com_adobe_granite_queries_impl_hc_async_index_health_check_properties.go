package models

type ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties struct {

	IndexingCriticalThreshold ConfigNodePropertyInteger `json:"indexing.critical.threshold,omitempty"`

	IndexingWarnThreshold ConfigNodePropertyInteger `json:"indexing.warn.threshold,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`
}
