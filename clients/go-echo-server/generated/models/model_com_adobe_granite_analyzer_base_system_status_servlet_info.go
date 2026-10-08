package models

type ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties `json:"properties,omitempty"`

	BundleLocation string `json:"bundle_location,omitempty"`

	ServiceLocation string `json:"service_location,omitempty"`
}
