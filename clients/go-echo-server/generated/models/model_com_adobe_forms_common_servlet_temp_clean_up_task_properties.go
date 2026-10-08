package models

type ComAdobeFormsCommonServletTempCleanUpTaskProperties struct {

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	DurationForTemporaryStorage ConfigNodePropertyString `json:"Duration for Temporary Storage,omitempty"`

	DurationForAnonymousStorage ConfigNodePropertyString `json:"Duration for Anonymous Storage,omitempty"`
}
