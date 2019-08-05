-module(openapi_com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_cloud_config_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'provider_config_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'provider_config_user_folder' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'provider_config_twitter_enable_params' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'provider_config_twitter_params' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'provider_config_refresh_userdata_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId,
          'oauth_cloud_config_root' := OauthCloudConfigRoot,
          'provider_config_root' := ProviderConfigRoot,
          'provider_config_user_folder' := ProviderConfigUserFolder,
          'provider_config_twitter_enable_params' := ProviderConfigTwitterEnableParams,
          'provider_config_twitter_params' := ProviderConfigTwitterParams,
          'provider_config_refresh_userdata_enabled' := ProviderConfigRefreshUserdataEnabled
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId,
       'oauth.cloud.config.root' => OauthCloudConfigRoot,
       'provider.config.root' => ProviderConfigRoot,
       'provider.config.user.folder' => ProviderConfigUserFolder,
       'provider.config.twitter.enable.params' => ProviderConfigTwitterEnableParams,
       'provider.config.twitter.params' => ProviderConfigTwitterParams,
       'provider.config.refresh.userdata.enabled' => ProviderConfigRefreshUserdataEnabled
     }.
