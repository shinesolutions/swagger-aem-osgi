package models

type OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Endpoints ConfigNodePropertyArray `json:"endpoints,omitempty"`

	TransportSecretProviderTarget ConfigNodePropertyString `json:"transportSecretProvider.target,omitempty"`
}
