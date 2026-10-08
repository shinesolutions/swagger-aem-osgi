package models

type ComDayCqReplicationAuditReplicationEventListenerInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties ComDayCqReplicationAuditReplicationEventListenerProperties `json:"properties,omitempty"`

	BundleLocation string `json:"bundle_location,omitempty"`

	ServiceLocation string `json:"service_location,omitempty"`
}
