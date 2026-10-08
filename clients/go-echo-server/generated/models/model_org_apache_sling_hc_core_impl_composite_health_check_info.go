package models

type OrgApacheSlingHcCoreImplCompositeHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingHcCoreImplCompositeHealthCheckProperties `json:"properties,omitempty"`
}
