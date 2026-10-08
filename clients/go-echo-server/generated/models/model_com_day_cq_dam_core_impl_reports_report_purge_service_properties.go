package models

type ComDayCqDamCoreImplReportsReportPurgeServiceProperties struct {

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	MaxSavedReports ConfigNodePropertyInteger `json:"maxSavedReports,omitempty"`

	TimeDuration ConfigNodePropertyInteger `json:"timeDuration,omitempty"`

	EnableReportPurge ConfigNodePropertyBoolean `json:"enableReportPurge,omitempty"`
}
