package models

type GuideLocalizationServiceInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties GuideLocalizationServiceProperties `json:"properties,omitempty"`
}
