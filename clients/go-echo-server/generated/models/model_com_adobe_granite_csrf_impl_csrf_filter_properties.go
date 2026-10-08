package models

type ComAdobeGraniteCsrfImplCsrfFilterProperties struct {

	FilterMethods ConfigNodePropertyArray `json:"filter.methods,omitempty"`

	FilterEnableSafeUserAgents ConfigNodePropertyBoolean `json:"filter.enable.safe.user.agents,omitempty"`

	FilterSafeUserAgents ConfigNodePropertyArray `json:"filter.safe.user.agents,omitempty"`

	FilterExcludedPaths ConfigNodePropertyArray `json:"filter.excluded.paths,omitempty"`
}
