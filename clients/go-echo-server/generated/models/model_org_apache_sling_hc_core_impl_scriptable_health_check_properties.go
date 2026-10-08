package models

type OrgApacheSlingHcCoreImplScriptableHealthCheckProperties struct {

	HcName ConfigNodePropertyString `json:"hc.name,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	HcMbeanName ConfigNodePropertyString `json:"hc.mbean.name,omitempty"`

	Expression ConfigNodePropertyString `json:"expression,omitempty"`

	LanguageExtension ConfigNodePropertyString `json:"language.extension,omitempty"`
}
