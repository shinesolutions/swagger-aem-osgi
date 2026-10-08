package models

type ComDayCqDamCoreProcessExtractMetadataProcessInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqDamCoreProcessExtractMetadataProcessProperties `json:"properties,omitempty"`
}
