package models

type OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Title ConfigNodePropertyString `json:"title,omitempty"`

	Details ConfigNodePropertyString `json:"details,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ServiceName ConfigNodePropertyString `json:"serviceName,omitempty"`

	LogLevel ConfigNodePropertyDropDown `json:"log.level,omitempty"`

	QueueProcessingEnabled ConfigNodePropertyBoolean `json:"queue.processing.enabled,omitempty"`

	PackageExporterEndpoints ConfigNodePropertyArray `json:"packageExporter.endpoints,omitempty"`

	PullItems ConfigNodePropertyInteger `json:"pull.items,omitempty"`

	HttpConnTimeout ConfigNodePropertyInteger `json:"http.conn.timeout,omitempty"`

	RequestAuthorizationStrategyTarget ConfigNodePropertyString `json:"requestAuthorizationStrategy.target,omitempty"`

	TransportSecretProviderTarget ConfigNodePropertyString `json:"transportSecretProvider.target,omitempty"`

	PackageBuilderTarget ConfigNodePropertyString `json:"packageBuilder.target,omitempty"`

	TriggersTarget ConfigNodePropertyString `json:"triggers.target,omitempty"`
}
