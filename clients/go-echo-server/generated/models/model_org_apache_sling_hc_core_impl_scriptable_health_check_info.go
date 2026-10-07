package models

type OrgApacheSlingHcCoreImplScriptableHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingHcCoreImplScriptableHealthCheckProperties `json:"properties,omitempty"`
}
