package models

type ComAdobeGraniteRepositoryServiceUserConfigurationInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeGraniteRepositoryServiceUserConfigurationProperties `json:"properties,omitempty"`
}
