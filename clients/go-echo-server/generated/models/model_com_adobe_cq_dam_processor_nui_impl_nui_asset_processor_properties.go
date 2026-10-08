package models

type ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties struct {

	NuiEnabled ConfigNodePropertyBoolean `json:"nuiEnabled,omitempty"`

	NuiServiceUrl ConfigNodePropertyString `json:"nuiServiceUrl,omitempty"`

	NuiApiKey ConfigNodePropertyString `json:"nuiApiKey,omitempty"`
}
