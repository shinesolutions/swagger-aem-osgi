package models

type ComDayCqAuthImplCugCugSupportImplProperties struct {

	CugExemptedPrincipals ConfigNodePropertyArray `json:"cug.exempted.principals,omitempty"`

	CugEnabled ConfigNodePropertyBoolean `json:"cug.enabled,omitempty"`

	CugPrincipalsRegex ConfigNodePropertyString `json:"cug.principals.regex,omitempty"`

	CugPrincipalsReplacement ConfigNodePropertyString `json:"cug.principals.replacement,omitempty"`
}
