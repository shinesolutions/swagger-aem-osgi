package models

type ComAdobeGraniteWorkflowCoreJobJobHandlerProperties struct {

	JobTopics ConfigNodePropertyArray `json:"job.topics,omitempty"`

	AllowSelfProcessTermination ConfigNodePropertyBoolean `json:"allow.self.process.termination,omitempty"`
}
