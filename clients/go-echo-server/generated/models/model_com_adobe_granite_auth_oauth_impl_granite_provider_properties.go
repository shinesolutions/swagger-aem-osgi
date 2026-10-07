package models

type ComAdobeGraniteAuthOauthImplGraniteProviderProperties struct {

	OauthProviderId ConfigNodePropertyString `json:"oauth.provider.id,omitempty"`

	OauthProviderGraniteAuthorizationUrl ConfigNodePropertyString `json:"oauth.provider.granite.authorization.url,omitempty"`

	OauthProviderGraniteTokenUrl ConfigNodePropertyString `json:"oauth.provider.granite.token.url,omitempty"`

	OauthProviderGraniteProfileUrl ConfigNodePropertyString `json:"oauth.provider.granite.profile.url,omitempty"`

	OauthProviderGraniteExtendedDetailsUrls ConfigNodePropertyString `json:"oauth.provider.granite.extended.details.urls,omitempty"`
}
