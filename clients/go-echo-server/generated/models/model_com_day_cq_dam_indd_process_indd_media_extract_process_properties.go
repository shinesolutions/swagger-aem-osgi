package models

type ComDayCqDamInddProcessInddMediaExtractProcessProperties struct {

	ProcessLabel ConfigNodePropertyString `json:"process.label,omitempty"`

	CqDamInddPagesRegex ConfigNodePropertyString `json:"cq.dam.indd.pages.regex,omitempty"`

	IdsJobDecoupled ConfigNodePropertyBoolean `json:"ids.job.decoupled,omitempty"`

	IdsJobWorkflowModel ConfigNodePropertyString `json:"ids.job.workflow.model,omitempty"`
}
