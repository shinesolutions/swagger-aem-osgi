-module(openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties/0]).

-export([openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties/1]).

-export_type([openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties/0]).

-type openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties() ::
  [ {'cug_exempted_principals', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cug_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cug_principals_regex', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cug_principals_replacement', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties() ->
    openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties([]).

openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties(Fields) ->
  Default = [ {'cug.exempted.principals', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cug.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cug.principals.regex', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cug.principals.replacement', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

