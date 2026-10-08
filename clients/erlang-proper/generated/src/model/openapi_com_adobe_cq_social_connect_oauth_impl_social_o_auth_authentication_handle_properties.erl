-module(openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties/0]).

-export([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties/1]).

-export_type([openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties/0]).

-type openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties() ::
  [ {'path', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties() ->
    openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties([]).

openapi_com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

