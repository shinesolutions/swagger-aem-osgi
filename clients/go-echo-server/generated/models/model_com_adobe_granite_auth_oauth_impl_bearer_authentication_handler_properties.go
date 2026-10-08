package models

type ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties struct {

	Path ConfigNodePropertyString `json:"path,omitempty"`

	OauthClientIdsAllowed ConfigNodePropertyArray `json:"oauth.clientIds.allowed,omitempty"`

	AuthBearerSyncIms ConfigNodePropertyBoolean `json:"auth.bearer.sync.ims,omitempty"`

	AuthTokenRequestParameter ConfigNodePropertyString `json:"auth.tokenRequestParameter,omitempty"`

	OauthBearerConfigid ConfigNodePropertyString `json:"oauth.bearer.configid,omitempty"`

	OauthJwtSupport ConfigNodePropertyBoolean `json:"oauth.jwt.support,omitempty"`
}
