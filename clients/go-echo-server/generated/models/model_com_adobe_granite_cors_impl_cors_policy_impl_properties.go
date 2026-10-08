package models

type ComAdobeGraniteCorsImplCorsPolicyImplProperties struct {

	Alloworigin ConfigNodePropertyArray `json:"alloworigin,omitempty"`

	Alloworiginregexp ConfigNodePropertyArray `json:"alloworiginregexp,omitempty"`

	Allowedpaths ConfigNodePropertyArray `json:"allowedpaths,omitempty"`

	Exposedheaders ConfigNodePropertyArray `json:"exposedheaders,omitempty"`

	Maxage ConfigNodePropertyInteger `json:"maxage,omitempty"`

	Supportedheaders ConfigNodePropertyArray `json:"supportedheaders,omitempty"`

	Supportedmethods ConfigNodePropertyArray `json:"supportedmethods,omitempty"`

	Supportscredentials ConfigNodePropertyBoolean `json:"supportscredentials,omitempty"`
}
