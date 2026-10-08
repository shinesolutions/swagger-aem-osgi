package models

type ComAdobeCqHcContentPackagesHealthCheckInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeCqHcContentPackagesHealthCheckProperties `json:"properties,omitempty"`
}
