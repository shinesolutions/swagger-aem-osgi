package models

type ComAdobeXmpWorkerFilesNcommXmpFilesNCommProperties struct {

	MaxConnections ConfigNodePropertyString `json:"maxConnections,omitempty"`

	MaxRequests ConfigNodePropertyString `json:"maxRequests,omitempty"`

	RequestTimeout ConfigNodePropertyString `json:"requestTimeout,omitempty"`

	LogDir ConfigNodePropertyString `json:"logDir,omitempty"`
}
