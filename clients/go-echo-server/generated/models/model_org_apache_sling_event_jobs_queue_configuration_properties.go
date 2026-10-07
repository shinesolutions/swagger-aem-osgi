package models

type OrgApacheSlingEventJobsQueueConfigurationProperties struct {

	QueueName ConfigNodePropertyString `json:"queue.name,omitempty"`

	QueueTopics ConfigNodePropertyArray `json:"queue.topics,omitempty"`

	QueueType ConfigNodePropertyDropDown `json:"queue.type,omitempty"`

	QueuePriority ConfigNodePropertyDropDown `json:"queue.priority,omitempty"`

	QueueRetries ConfigNodePropertyInteger `json:"queue.retries,omitempty"`

	QueueRetrydelay ConfigNodePropertyInteger `json:"queue.retrydelay,omitempty"`

	QueueMaxparallel ConfigNodePropertyFloat `json:"queue.maxparallel,omitempty"`

	QueueKeepJobs ConfigNodePropertyBoolean `json:"queue.keepJobs,omitempty"`

	QueuePreferRunOnCreationInstance ConfigNodePropertyBoolean `json:"queue.preferRunOnCreationInstance,omitempty"`

	QueueThreadPoolSize ConfigNodePropertyInteger `json:"queue.threadPoolSize,omitempty"`

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`
}
