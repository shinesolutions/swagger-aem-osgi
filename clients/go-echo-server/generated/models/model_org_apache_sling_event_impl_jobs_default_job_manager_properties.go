package models

type OrgApacheSlingEventImplJobsDefaultJobManagerProperties struct {

	QueuePriority ConfigNodePropertyDropDown `json:"queue.priority,omitempty"`

	QueueRetries ConfigNodePropertyInteger `json:"queue.retries,omitempty"`

	QueueRetrydelay ConfigNodePropertyInteger `json:"queue.retrydelay,omitempty"`

	QueueMaxparallel ConfigNodePropertyInteger `json:"queue.maxparallel,omitempty"`
}
