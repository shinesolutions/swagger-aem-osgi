package models

type OrgApacheSlingEngineImplSlingMainServletProperties struct {

	SlingMaxCalls ConfigNodePropertyInteger `json:"sling.max.calls,omitempty"`

	SlingMaxInclusions ConfigNodePropertyInteger `json:"sling.max.inclusions,omitempty"`

	SlingTraceAllow ConfigNodePropertyBoolean `json:"sling.trace.allow,omitempty"`

	SlingMaxRecordRequests ConfigNodePropertyInteger `json:"sling.max.record.requests,omitempty"`

	SlingStorePatternRequests ConfigNodePropertyArray `json:"sling.store.pattern.requests,omitempty"`

	SlingServerinfo ConfigNodePropertyString `json:"sling.serverinfo,omitempty"`

	SlingAdditionalResponseHeaders ConfigNodePropertyArray `json:"sling.additional.response.headers,omitempty"`
}
