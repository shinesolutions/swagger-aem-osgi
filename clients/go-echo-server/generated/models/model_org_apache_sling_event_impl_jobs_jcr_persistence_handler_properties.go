package models

type OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties struct {

	JobConsumermanagerDisableDistribution ConfigNodePropertyBoolean `json:"job.consumermanager.disableDistribution,omitempty"`

	StartupDelay ConfigNodePropertyInteger `json:"startup.delay,omitempty"`

	CleanupPeriod ConfigNodePropertyInteger `json:"cleanup.period,omitempty"`
}
