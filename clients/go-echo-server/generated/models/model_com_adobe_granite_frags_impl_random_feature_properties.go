package models

type ComAdobeGraniteFragsImplRandomFeatureProperties struct {

	FeatureName ConfigNodePropertyString `json:"feature.name,omitempty"`

	FeatureDescription ConfigNodePropertyString `json:"feature.description,omitempty"`

	ActivePercentage ConfigNodePropertyString `json:"active.percentage,omitempty"`

	CookieName ConfigNodePropertyString `json:"cookie.name,omitempty"`

	CookieMaxAge ConfigNodePropertyInteger `json:"cookie.maxAge,omitempty"`
}
