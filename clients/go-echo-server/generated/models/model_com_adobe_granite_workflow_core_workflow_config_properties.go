package models

type ComAdobeGraniteWorkflowCoreWorkflowConfigProperties struct {

	CqWorkflowConfigWorkflowPackagesRootPath ConfigNodePropertyArray `json:"cq.workflow.config.workflow.packages.root.path,omitempty"`

	CqWorkflowConfigWorkflowProcessLegacyMode ConfigNodePropertyBoolean `json:"cq.workflow.config.workflow.process.legacy.mode,omitempty"`

	CqWorkflowConfigAllowLocking ConfigNodePropertyBoolean `json:"cq.workflow.config.allow.locking,omitempty"`
}
