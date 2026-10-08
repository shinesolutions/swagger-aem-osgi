package models

type OrgApacheSlingServletsGetDefaultGetServletInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingServletsGetDefaultGetServletProperties `json:"properties,omitempty"`

	BundleLocation string `json:"bundle_location,omitempty"`

	ServiceLocation string `json:"service_location,omitempty"`
}
