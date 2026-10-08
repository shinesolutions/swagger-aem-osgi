package models

type ComAdobeGraniteOptoutImplOptOutServiceImplProperties struct {

	OptoutCookies ConfigNodePropertyArray `json:"optout.cookies,omitempty"`

	OptoutHeaders ConfigNodePropertyArray `json:"optout.headers,omitempty"`

	OptoutWhitelistCookies ConfigNodePropertyArray `json:"optout.whitelist.cookies,omitempty"`
}
