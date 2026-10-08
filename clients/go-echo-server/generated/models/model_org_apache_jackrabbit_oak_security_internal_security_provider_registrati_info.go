package models

type OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties `json:"properties,omitempty"`

	BundleLocation string `json:"bundle_location,omitempty"`

	ServiceLocation string `json:"service_location,omitempty"`
}
