package models

type ComAdobeCqProjectsPurgeSchedulerProperties struct {

	ScheduledpurgeName ConfigNodePropertyString `json:"scheduledpurge.name,omitempty"`

	ScheduledpurgePurgeActive ConfigNodePropertyBoolean `json:"scheduledpurge.purgeActive,omitempty"`

	ScheduledpurgeTemplates ConfigNodePropertyArray `json:"scheduledpurge.templates,omitempty"`

	ScheduledpurgePurgeGroups ConfigNodePropertyBoolean `json:"scheduledpurge.purgeGroups,omitempty"`

	ScheduledpurgePurgeAssets ConfigNodePropertyBoolean `json:"scheduledpurge.purgeAssets,omitempty"`

	ScheduledpurgeTerminateRunningWorkflows ConfigNodePropertyBoolean `json:"scheduledpurge.terminateRunningWorkflows,omitempty"`

	ScheduledpurgeDaysold ConfigNodePropertyInteger `json:"scheduledpurge.daysold,omitempty"`

	ScheduledpurgeSaveThreshold ConfigNodePropertyInteger `json:"scheduledpurge.saveThreshold,omitempty"`
}
