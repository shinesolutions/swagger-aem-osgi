package models

type OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Endpoints ConfigNodePropertyArray `json:"endpoints,omitempty"`

	PullItems ConfigNodePropertyInteger `json:"pull.items,omitempty"`

	PackageBuilderTarget ConfigNodePropertyString `json:"packageBuilder.target,omitempty"`

	TransportSecretProviderTarget ConfigNodePropertyString `json:"transportSecretProvider.target,omitempty"`
}
