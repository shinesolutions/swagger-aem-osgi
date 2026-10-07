package models

type OrgApacheSlingTracerInternalLogTracerInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheSlingTracerInternalLogTracerProperties `json:"properties,omitempty"`
}
