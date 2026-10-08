package models

type OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Title ConfigNodePropertyString `json:"title,omitempty"`

	Details ConfigNodePropertyString `json:"details,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ServiceName ConfigNodePropertyString `json:"serviceName,omitempty"`

	LogLevel ConfigNodePropertyDropDown `json:"log.level,omitempty"`

	AllowedRoots ConfigNodePropertyArray `json:"allowed.roots,omitempty"`

	RequestAuthorizationStrategyTarget ConfigNodePropertyString `json:"requestAuthorizationStrategy.target,omitempty"`

	QueueProviderFactoryTarget ConfigNodePropertyString `json:"queueProviderFactory.target,omitempty"`

	PackageBuilderTarget ConfigNodePropertyString `json:"packageBuilder.target,omitempty"`

	TriggersTarget ConfigNodePropertyString `json:"triggers.target,omitempty"`

	PriorityQueues ConfigNodePropertyArray `json:"priorityQueues,omitempty"`
}
