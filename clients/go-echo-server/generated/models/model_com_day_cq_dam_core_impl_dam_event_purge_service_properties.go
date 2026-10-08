package models

type ComDayCqDamCoreImplDamEventPurgeServiceProperties struct {

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	MaxSavedActivities ConfigNodePropertyInteger `json:"maxSavedActivities,omitempty"`

	SaveInterval ConfigNodePropertyInteger `json:"saveInterval,omitempty"`

	EnableActivityPurge ConfigNodePropertyBoolean `json:"enableActivityPurge,omitempty"`

	EventTypes ConfigNodePropertyDropDown `json:"eventTypes,omitempty"`
}
