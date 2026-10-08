package models

type ComAdobeAemTransactionCoreImplTransactionRecorderInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeAemTransactionCoreImplTransactionRecorderProperties `json:"properties,omitempty"`
}
