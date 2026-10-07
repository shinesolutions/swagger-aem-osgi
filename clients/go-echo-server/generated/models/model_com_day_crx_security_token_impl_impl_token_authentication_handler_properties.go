package models

type ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties struct {

	Path ConfigNodePropertyString `json:"path,omitempty"`

	TokenRequiredAttr ConfigNodePropertyDropDown `json:"token.required.attr,omitempty"`

	TokenAlternateUrl ConfigNodePropertyString `json:"token.alternate.url,omitempty"`

	TokenEncapsulated ConfigNodePropertyBoolean `json:"token.encapsulated,omitempty"`

	SkipTokenRefresh ConfigNodePropertyArray `json:"skip.token.refresh,omitempty"`
}
