package models

type OrgApacheSlingI18nImplJcrResourceBundleProviderInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingI18nImplJcrResourceBundleProviderProperties `json:"properties,omitempty"`

	AdditionalPropertiesField string `json:"additionalProperties,omitempty"`

	BundleLocation string `json:"bundle_location,omitempty"`

	ServiceLocation string `json:"service_location,omitempty"`
}
