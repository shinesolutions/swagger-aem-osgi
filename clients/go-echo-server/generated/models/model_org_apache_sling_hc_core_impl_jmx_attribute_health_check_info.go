package models

type OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties `json:"properties,omitempty"`
}
