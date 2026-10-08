package models

type ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties struct {

	RedirectEnabled ConfigNodePropertyBoolean `json:"redirect.enabled,omitempty"`

	RedirectStatsEnabled ConfigNodePropertyBoolean `json:"redirect.stats.enabled,omitempty"`

	RedirectExtensions ConfigNodePropertyArray `json:"redirect.extensions,omitempty"`

	RedirectPaths ConfigNodePropertyArray `json:"redirect.paths,omitempty"`
}
