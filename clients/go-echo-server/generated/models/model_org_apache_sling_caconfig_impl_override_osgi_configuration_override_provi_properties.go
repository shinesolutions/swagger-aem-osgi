package models

type OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties struct {

	Description ConfigNodePropertyString `json:"description,omitempty"`

	Overrides ConfigNodePropertyArray `json:"overrides,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`
}
