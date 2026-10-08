package models

type OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Endpoint ConfigNodePropertyString `json:"endpoint,omitempty"`

	TransportSecretProviderTarget ConfigNodePropertyString `json:"transportSecretProvider.target,omitempty"`
}
