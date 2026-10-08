package models

type ComAdobeCqSocialUserImplTransportHttpToPublisherProperties struct {

	Enable ConfigNodePropertyBoolean `json:"enable,omitempty"`

	AgentConfiguration ConfigNodePropertyArray `json:"agent.configuration,omitempty"`

	ContextPath ConfigNodePropertyString `json:"context.path,omitempty"`

	DisabledCipherSuites ConfigNodePropertyArray `json:"disabled.cipher.suites,omitempty"`

	EnabledCipherSuites ConfigNodePropertyArray `json:"enabled.cipher.suites,omitempty"`
}
