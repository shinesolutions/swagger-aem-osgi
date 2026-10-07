package models

type ComAdobeGraniteCsrfImplCsrfServletProperties struct {

	CsrfTokenExpiresIn ConfigNodePropertyInteger `json:"csrf.token.expires.in,omitempty"`

	SlingAuthRequirements ConfigNodePropertyString `json:"sling.auth.requirements,omitempty"`
}
