package models

type ComAdobeGraniteAuthOauthAccesstokenProviderProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	AuthTokenProviderTitle ConfigNodePropertyString `json:"auth.token.provider.title,omitempty"`

	AuthTokenProviderDefaultClaims ConfigNodePropertyArray `json:"auth.token.provider.default.claims,omitempty"`

	AuthTokenProviderEndpoint ConfigNodePropertyString `json:"auth.token.provider.endpoint,omitempty"`

	AuthAccessTokenRequest ConfigNodePropertyString `json:"auth.access.token.request,omitempty"`

	AuthTokenProviderKeypairAlias ConfigNodePropertyString `json:"auth.token.provider.keypair.alias,omitempty"`

	AuthTokenProviderConnTimeout ConfigNodePropertyInteger `json:"auth.token.provider.conn.timeout,omitempty"`

	AuthTokenProviderSoTimeout ConfigNodePropertyInteger `json:"auth.token.provider.so.timeout,omitempty"`

	AuthTokenProviderClientId ConfigNodePropertyString `json:"auth.token.provider.client.id,omitempty"`

	AuthTokenProviderScope ConfigNodePropertyString `json:"auth.token.provider.scope,omitempty"`

	AuthTokenProviderReuseAccessToken ConfigNodePropertyBoolean `json:"auth.token.provider.reuse.access.token,omitempty"`

	AuthTokenProviderRelaxedSsl ConfigNodePropertyBoolean `json:"auth.token.provider.relaxed.ssl,omitempty"`

	TokenRequestCustomizerType ConfigNodePropertyString `json:"token.request.customizer.type,omitempty"`

	AuthTokenValidatorType ConfigNodePropertyString `json:"auth.token.validator.type,omitempty"`
}
