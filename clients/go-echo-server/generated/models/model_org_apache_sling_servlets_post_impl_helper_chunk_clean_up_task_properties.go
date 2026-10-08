package models

type OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties struct {

	SchedulerExpression ConfigNodePropertyString `json:"scheduler.expression,omitempty"`

	SchedulerConcurrent ConfigNodePropertyBoolean `json:"scheduler.concurrent,omitempty"`

	ChunkCleanupAge ConfigNodePropertyInteger `json:"chunk.cleanup.age,omitempty"`
}
