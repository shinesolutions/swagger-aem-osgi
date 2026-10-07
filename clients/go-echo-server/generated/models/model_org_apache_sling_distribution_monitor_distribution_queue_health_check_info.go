package models

type OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties `json:"properties,omitempty"`
}
