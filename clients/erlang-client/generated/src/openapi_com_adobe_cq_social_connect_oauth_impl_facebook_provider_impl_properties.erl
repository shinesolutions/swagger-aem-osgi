-module(openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties() ::
    #{ 'oauth_provider_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'oauth_cloud_config_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'provider_config_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'provider_config_create_tags_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'provider_config_user_folder' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'provider_config_facebook_fetch_fields' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'provider_config_facebook_fields' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'provider_config_refresh_userdata_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'oauth_provider_id' := OauthProviderId,
          'oauth_cloud_config_root' := OauthCloudConfigRoot,
          'provider_config_root' := ProviderConfigRoot,
          'provider_config_create_tags_enabled' := ProviderConfigCreateTagsEnabled,
          'provider_config_user_folder' := ProviderConfigUserFolder,
          'provider_config_facebook_fetch_fields' := ProviderConfigFacebookFetchFields,
          'provider_config_facebook_fields' := ProviderConfigFacebookFields,
          'provider_config_refresh_userdata_enabled' := ProviderConfigRefreshUserdataEnabled
        }) ->
    #{ 'oauth.provider.id' => OauthProviderId,
       'oauth.cloud.config.root' => OauthCloudConfigRoot,
       'provider.config.root' => ProviderConfigRoot,
       'provider.config.create.tags.enabled' => ProviderConfigCreateTagsEnabled,
       'provider.config.user.folder' => ProviderConfigUserFolder,
       'provider.config.facebook.fetch.fields' => ProviderConfigFacebookFetchFields,
       'provider.config.facebook.fields' => ProviderConfigFacebookFields,
       'provider.config.refresh.userdata.enabled' => ProviderConfigRefreshUserdataEnabled
     }.
