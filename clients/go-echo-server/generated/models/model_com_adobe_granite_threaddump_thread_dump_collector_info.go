package models

type ComAdobeGraniteThreaddumpThreadDumpCollectorInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeGraniteThreaddumpThreadDumpCollectorProperties `json:"properties,omitempty"`
}
