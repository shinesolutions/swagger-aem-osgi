package models

type ComAdobeGraniteWorkflowPurgeSchedulerInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeGraniteWorkflowPurgeSchedulerProperties `json:"properties,omitempty"`
}
