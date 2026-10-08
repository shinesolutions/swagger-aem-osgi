package models

type ComAdobeGraniteRepositoryImplCommitStatsConfigProperties struct {

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	IntervalSeconds ConfigNodePropertyInteger `json:"intervalSeconds,omitempty"`

	CommitsPerIntervalThreshold ConfigNodePropertyInteger `json:"commitsPerIntervalThreshold,omitempty"`

	MaxLocationLength ConfigNodePropertyInteger `json:"maxLocationLength,omitempty"`

	MaxDetailsShown ConfigNodePropertyInteger `json:"maxDetailsShown,omitempty"`

	MinDetailsPercentage ConfigNodePropertyInteger `json:"minDetailsPercentage,omitempty"`

	ThreadMatchers ConfigNodePropertyArray `json:"threadMatchers,omitempty"`

	MaxGreedyDepth ConfigNodePropertyInteger `json:"maxGreedyDepth,omitempty"`

	GreedyStackMatchers ConfigNodePropertyString `json:"greedyStackMatchers,omitempty"`

	StackFilters ConfigNodePropertyArray `json:"stackFilters,omitempty"`

	StackMatchers ConfigNodePropertyArray `json:"stackMatchers,omitempty"`

	StackCategorizers ConfigNodePropertyArray `json:"stackCategorizers,omitempty"`

	StackShorteners ConfigNodePropertyArray `json:"stackShorteners,omitempty"`
}
