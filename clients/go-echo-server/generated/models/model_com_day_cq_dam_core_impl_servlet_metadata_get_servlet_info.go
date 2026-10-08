package models

type ComDayCqDamCoreImplServletMetadataGetServletInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqDamCoreImplServletMetadataGetServletProperties `json:"properties,omitempty"`
}
