package models

type ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties struct {

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	AgentName ConfigNodePropertyString `json:"agentName,omitempty"`

	DiffPath ConfigNodePropertyString `json:"diffPath,omitempty"`

	ObservedPath ConfigNodePropertyString `json:"observedPath,omitempty"`

	ServiceName ConfigNodePropertyString `json:"serviceName,omitempty"`

	PropertyNames ConfigNodePropertyString `json:"propertyNames,omitempty"`

	DistributionDelay ConfigNodePropertyInteger `json:"distributionDelay,omitempty"`

	ServiceUserTarget ConfigNodePropertyString `json:"serviceUser.target,omitempty"`
}
