package models

type ComAdobeOctopusNcommBootstrapProperties struct {

	MaxConnections ConfigNodePropertyInteger `json:"maxConnections,omitempty"`

	MaxRequests ConfigNodePropertyInteger `json:"maxRequests,omitempty"`

	RequestTimeout ConfigNodePropertyInteger `json:"requestTimeout,omitempty"`

	RequestRetries ConfigNodePropertyInteger `json:"requestRetries,omitempty"`

	LaunchTimeout ConfigNodePropertyInteger `json:"launchTimeout,omitempty"`
}
