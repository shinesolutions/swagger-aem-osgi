package models

type ComAdobeGraniteWorkflowPurgeSchedulerProperties struct {

	ScheduledpurgeName ConfigNodePropertyString `json:"scheduledpurge.name,omitempty"`

	ScheduledpurgeWorkflowStatus ConfigNodePropertyDropDown `json:"scheduledpurge.workflowStatus,omitempty"`

	ScheduledpurgeModelIds ConfigNodePropertyArray `json:"scheduledpurge.modelIds,omitempty"`

	ScheduledpurgeDaysold ConfigNodePropertyInteger `json:"scheduledpurge.daysold,omitempty"`
}
