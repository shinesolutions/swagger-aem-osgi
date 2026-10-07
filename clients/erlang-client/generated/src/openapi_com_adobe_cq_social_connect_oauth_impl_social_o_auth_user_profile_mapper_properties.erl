-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties() ::
    #{ 'facebook' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'twitter' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'provider_config_user_folder' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'facebook' := Facebook,
          'twitter' := Twitter,
          'provider_config_user_folder' := ProviderConfigUserFolder
        }) ->
    #{ 'facebook' => Facebook,
       'twitter' => Twitter,
       'provider.config.user.folder' => ProviderConfigUserFolder
     }.
