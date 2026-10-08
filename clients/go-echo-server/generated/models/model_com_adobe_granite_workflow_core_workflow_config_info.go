package models

type ComAdobeGraniteWorkflowCoreWorkflowConfigInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeGraniteWorkflowCoreWorkflowConfigProperties `json:"properties,omitempty"`
}
