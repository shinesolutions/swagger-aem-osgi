-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties/0]).

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties() ::
  [ {'facebook', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'twitter', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'provider_config_user_folder', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties() ->
    openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties([]).

openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_properties(Fields) ->
  Default = [ {'facebook', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'twitter', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'provider.config.user.folder', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

