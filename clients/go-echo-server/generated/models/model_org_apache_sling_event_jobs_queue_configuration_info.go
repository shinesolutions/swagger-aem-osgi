package models

type OrgApacheSlingEventJobsQueueConfigurationInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingEventJobsQueueConfigurationProperties `json:"properties,omitempty"`
}
