package models

type ComAdobeCqAuditPurgeDamInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeCqAuditPurgeDamProperties `json:"properties,omitempty"`
}
