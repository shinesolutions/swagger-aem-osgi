package models

type ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties struct {

	OauthProviderId ConfigNodePropertyString `json:"oauth.provider.id,omitempty"`

	OauthCloudConfigRoot ConfigNodePropertyString `json:"oauth.cloud.config.root,omitempty"`

	ProviderConfigRoot ConfigNodePropertyString `json:"provider.config.root,omitempty"`

	ProviderConfigCreateTagsEnabled ConfigNodePropertyBoolean `json:"provider.config.create.tags.enabled,omitempty"`

	ProviderConfigUserFolder ConfigNodePropertyDropDown `json:"provider.config.user.folder,omitempty"`

	ProviderConfigFacebookFetchFields ConfigNodePropertyBoolean `json:"provider.config.facebook.fetch.fields,omitempty"`

	ProviderConfigFacebookFields ConfigNodePropertyArray `json:"provider.config.facebook.fields,omitempty"`

	ProviderConfigRefreshUserdataEnabled ConfigNodePropertyBoolean `json:"provider.config.refresh.userdata.enabled,omitempty"`
}
