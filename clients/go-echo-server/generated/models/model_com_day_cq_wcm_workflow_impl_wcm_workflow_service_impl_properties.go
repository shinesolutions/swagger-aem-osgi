package models

type ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties struct {

	EventFilter ConfigNodePropertyString `json:"event.filter,omitempty"`

	MinThreadPoolSize ConfigNodePropertyInteger `json:"minThreadPoolSize,omitempty"`

	MaxThreadPoolSize ConfigNodePropertyInteger `json:"maxThreadPoolSize,omitempty"`

	CqWcmWorkflowTerminateOnActivate ConfigNodePropertyBoolean `json:"cq.wcm.workflow.terminate.on.activate,omitempty"`

	CqWcmWorklfowTerminateExclusionList ConfigNodePropertyArray `json:"cq.wcm.worklfow.terminate.exclusion.list,omitempty"`
}
