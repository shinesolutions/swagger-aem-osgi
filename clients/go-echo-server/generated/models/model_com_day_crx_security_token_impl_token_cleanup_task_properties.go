package models

type ComDayCrxSecurityTokenImplTokenCleanupTaskProperties struct {

	EnableTokenCleanupTask ConfigNodePropertyBoolean `json:"enable.token.cleanup.task,omitempty"`

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	BatchSize ConfigNodePropertyInteger `json:"batch.size,omitempty"`
}
