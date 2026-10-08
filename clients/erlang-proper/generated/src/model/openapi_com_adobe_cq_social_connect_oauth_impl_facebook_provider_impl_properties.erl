-module(openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties/0]).

-export([openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties() ::
  [ {'oauth_provider_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'oauth_cloud_config_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'provider_config_root', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'provider_config_create_tags_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'provider_config_user_folder', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'provider_config_facebook_fetch_fields', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'provider_config_facebook_fields', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'provider_config_refresh_userdata_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties() ->
    openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties([]).

openapi_com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_properties(Fields) ->
  Default = [ {'oauth.provider.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'oauth.cloud.config.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'provider.config.root', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'provider.config.create.tags.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'provider.config.user.folder', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'provider.config.facebook.fetch.fields', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'provider.config.facebook.fields', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'provider.config.refresh.userdata.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

