package models

type OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties struct {

	QueryLimitInMemory ConfigNodePropertyInteger `json:"queryLimitInMemory,omitempty"`

	QueryLimitReads ConfigNodePropertyInteger `json:"queryLimitReads,omitempty"`

	QueryFailTraversal ConfigNodePropertyBoolean `json:"queryFailTraversal,omitempty"`

	FastQuerySize ConfigNodePropertyBoolean `json:"fastQuerySize,omitempty"`
}
