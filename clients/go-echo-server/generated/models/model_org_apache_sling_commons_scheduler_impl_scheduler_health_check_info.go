package models

type OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties `json:"properties,omitempty"`
}
