package models

type OrgApacheHttpProxyconfiguratorInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheHttpProxyconfiguratorProperties `json:"properties,omitempty"`
}
