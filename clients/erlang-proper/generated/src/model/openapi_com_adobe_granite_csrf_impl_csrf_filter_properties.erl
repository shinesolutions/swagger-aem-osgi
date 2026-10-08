-module(openapi_com_adobe_granite_csrf_impl_csrf_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_csrf_impl_csrf_filter_properties/0]).

-export([openapi_com_adobe_granite_csrf_impl_csrf_filter_properties/1]).

-export_type([openapi_com_adobe_granite_csrf_impl_csrf_filter_properties/0]).

-type openapi_com_adobe_granite_csrf_impl_csrf_filter_properties() ::
  [ {'filter_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'filter_enable_safe_user_agents', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'filter_safe_user_agents', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'filter_excluded_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_csrf_impl_csrf_filter_properties() ->
    openapi_com_adobe_granite_csrf_impl_csrf_filter_properties([]).

openapi_com_adobe_granite_csrf_impl_csrf_filter_properties(Fields) ->
  Default = [ {'filter.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'filter.enable.safe.user.agents', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'filter.safe.user.agents', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'filter.excluded.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

