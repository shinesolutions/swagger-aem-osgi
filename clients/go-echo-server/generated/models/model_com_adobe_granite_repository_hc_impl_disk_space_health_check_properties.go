package models

type ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties struct {

	HcTags ConfigNodePropertyArray `json:"hc.tags,omitempty"`

	DiskSpaceWarnThreshold ConfigNodePropertyInteger `json:"disk.space.warn.threshold,omitempty"`

	DiskSpaceErrorThreshold ConfigNodePropertyInteger `json:"disk.space.error.threshold,omitempty"`
}
