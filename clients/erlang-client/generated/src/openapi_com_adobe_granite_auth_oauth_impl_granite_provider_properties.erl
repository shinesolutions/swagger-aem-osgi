-module(openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_granite_provider_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_granite_authorization_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_granite_token_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_granite_profile_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_granite_extended_details_urls' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId,
          'oauth_provider_granite_authorization_url' := OauthProviderGraniteAuthorizationUrl,
          'oauth_provider_granite_token_url' := OauthProviderGraniteTokenUrl,
          'oauth_provider_granite_profile_url' := OauthProviderGraniteProfileUrl,
          'oauth_provider_granite_extended_details_urls' := OauthProviderGraniteExtendedDetailsUrls
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId,
       'oauth.provider.granite.authorization.url' => OauthProviderGraniteAuthorizationUrl,
       'oauth.provider.granite.token.url' => OauthProviderGraniteTokenUrl,
       'oauth.provider.granite.profile.url' => OauthProviderGraniteProfileUrl,
       'oauth.provider.granite.extended.details.urls' => OauthProviderGraniteExtendedDetailsUrls
     }.
