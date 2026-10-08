package models

type ComDayCqStatisticsImplStatisticsServiceImplProperties struct {

	SchedulerPeriod ConfigNodePropertyInteger `json:"scheduler.period,omitempty"`

	SchedulerConcurrent ConfigNodePropertyBoolean `json:"scheduler.concurrent,omitempty"`

	Path ConfigNodePropertyString `json:"path,omitempty"`

	Workspace ConfigNodePropertyString `json:"workspace,omitempty"`

	KeywordsPath ConfigNodePropertyString `json:"keywordsPath,omitempty"`

	AsyncEntries ConfigNodePropertyBoolean `json:"asyncEntries,omitempty"`
}
