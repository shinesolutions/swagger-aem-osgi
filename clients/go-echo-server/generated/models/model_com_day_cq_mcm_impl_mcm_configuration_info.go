package models

type ComDayCqMcmImplMcmConfigurationInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqMcmImplMcmConfigurationProperties `json:"properties,omitempty"`
}
