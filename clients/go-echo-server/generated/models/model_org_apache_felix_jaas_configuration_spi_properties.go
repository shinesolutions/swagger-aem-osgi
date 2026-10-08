package models

type OrgApacheFelixJaasConfigurationSpiProperties struct {

	JaasDefaultRealmName ConfigNodePropertyString `json:"jaas.defaultRealmName,omitempty"`

	JaasConfigProviderName ConfigNodePropertyString `json:"jaas.configProviderName,omitempty"`

	JaasGlobalConfigPolicy ConfigNodePropertyDropDown `json:"jaas.globalConfigPolicy,omitempty"`
}
