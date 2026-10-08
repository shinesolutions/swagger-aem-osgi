package models

type OrgApacheSlingEventImplEventingThreadPoolInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingEventImplEventingThreadPoolProperties `json:"properties,omitempty"`
}
