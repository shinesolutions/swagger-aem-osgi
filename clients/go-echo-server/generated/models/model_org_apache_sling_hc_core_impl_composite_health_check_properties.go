package models

type OrgApacheSlingHcCoreImplCompositeHealthCheckProperties struct {

	HcName ConfigNodePropertyString `json:"hc.name,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	HcMbeanName ConfigNodePropertyString `json:"hc.mbean.name,omitempty"`

	FilterTags ConfigNodePropertyArray `json:"filter.tags,omitempty"`

	FilterCombineTagsWithOr ConfigNodePropertyBoolean `json:"filter.combineTagsWithOr,omitempty"`
}
