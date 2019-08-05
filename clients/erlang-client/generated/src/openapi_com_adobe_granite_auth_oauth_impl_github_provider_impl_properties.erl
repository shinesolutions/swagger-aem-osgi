-module(openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_oauth_impl_github_provider_impl_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_github_authorization_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_github_token_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_provider_github_profile_url' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId,
          'oauth_provider_github_authorization_url' := OauthProviderGithubAuthorizationUrl,
          'oauth_provider_github_token_url' := OauthProviderGithubTokenUrl,
          'oauth_provider_github_profile_url' := OauthProviderGithubProfileUrl
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId,
       'oauth.provider.github.authorization.url' => OauthProviderGithubAuthorizationUrl,
       'oauth.provider.github.token.url' => OauthProviderGithubTokenUrl,
       'oauth.provider.github.profile.url' => OauthProviderGithubProfileUrl
     }.
