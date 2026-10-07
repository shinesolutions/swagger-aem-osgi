package models

type ComAdobeCqHcContentPackagesHealthCheckProperties struct {

	HcName ConfigNodePropertyString `json:"hc.name,omitempty"`

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	HcMbeanName ConfigNodePropertyString `json:"hc.mbean.name,omitempty"`

	PackageNames ConfigNodePropertyArray `json:"package.names,omitempty"`
}
