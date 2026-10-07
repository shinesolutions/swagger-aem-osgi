-module(openapi_com_adobe_granite_auth_oauth_impl_twitter_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_twitter_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_twitter_provider_impl_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId
     }.
