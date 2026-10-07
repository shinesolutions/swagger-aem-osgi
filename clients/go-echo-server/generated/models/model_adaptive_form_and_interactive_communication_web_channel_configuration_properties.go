package models

type AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties struct {

	ShowPlaceholder ConfigNodePropertyBoolean `json:"showPlaceholder,omitempty"`

	MaximumCacheEntries ConfigNodePropertyInteger `json:"maximumCacheEntries,omitempty"`

	AfScriptingCompatversion ConfigNodePropertyDropDown `json:"af.scripting.compatversion,omitempty"`

	MakeFileNameUnique ConfigNodePropertyBoolean `json:"makeFileNameUnique,omitempty"`

	GeneratingCompliantData ConfigNodePropertyBoolean `json:"generatingCompliantData,omitempty"`
}
