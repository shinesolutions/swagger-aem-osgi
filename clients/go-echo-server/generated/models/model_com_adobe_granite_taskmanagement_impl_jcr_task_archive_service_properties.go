package models

type ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties struct {

	ArchivingEnabled ConfigNodePropertyBoolean `json:"archiving.enabled,omitempty"`

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	ArchiveSinceDaysCompleted ConfigNodePropertyInteger `json:"archive.since.days.completed,omitempty"`
}
