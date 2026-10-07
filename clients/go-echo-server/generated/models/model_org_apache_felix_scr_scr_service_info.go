package models

type OrgApacheFelixScrScrServiceInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties OrgApacheFelixScrScrServiceProperties `json:"properties,omitempty"`
}
