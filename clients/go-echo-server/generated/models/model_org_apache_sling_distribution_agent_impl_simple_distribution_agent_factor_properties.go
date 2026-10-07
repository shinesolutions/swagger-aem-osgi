package models

type OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Title ConfigNodePropertyString `json:"title,omitempty"`

	Details ConfigNodePropertyString `json:"details,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ServiceName ConfigNodePropertyString `json:"serviceName,omitempty"`

	LogLevel ConfigNodePropertyDropDown `json:"log.level,omitempty"`

	QueueProcessingEnabled ConfigNodePropertyBoolean `json:"queue.processing.enabled,omitempty"`

	PackageExporterTarget ConfigNodePropertyString `json:"packageExporter.target,omitempty"`

	PackageImporterTarget ConfigNodePropertyString `json:"packageImporter.target,omitempty"`

	RequestAuthorizationStrategyTarget ConfigNodePropertyString `json:"requestAuthorizationStrategy.target,omitempty"`

	TriggersTarget ConfigNodePropertyString `json:"triggers.target,omitempty"`
}
