package models

type ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties struct {

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	JobPurgeThreshold ConfigNodePropertyInteger `json:"job.purge.threshold,omitempty"`

	JobPurgeMaxJobs ConfigNodePropertyInteger `json:"job.purge.max.jobs,omitempty"`
}
