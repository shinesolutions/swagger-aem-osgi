package models

type ComAdobeCqAuditPurgePagesInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeCqAuditPurgePagesProperties `json:"properties,omitempty"`
}
