package models

type OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties struct {

	HcName ConfigNodePropertyString `json:"hc.name,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	HcMbeanName ConfigNodePropertyString `json:"hc.mbean.name,omitempty"`

	MbeanName ConfigNodePropertyString `json:"mbean.name,omitempty"`

	AttributeName ConfigNodePropertyString `json:"attribute.name,omitempty"`

	AttributeValueConstraint ConfigNodePropertyString `json:"attribute.value.constraint,omitempty"`
}
