package models

type ComAdobeCqSocialSyncImplDiffChangesObserverProperties struct {

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	AgentName ConfigNodePropertyString `json:"agentName,omitempty"`

	DiffPath ConfigNodePropertyString `json:"diffPath,omitempty"`

	PropertyNames ConfigNodePropertyString `json:"propertyNames,omitempty"`
}
