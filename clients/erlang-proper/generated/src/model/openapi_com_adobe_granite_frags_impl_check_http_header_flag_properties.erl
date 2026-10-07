-module(openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties/0]).

-export([openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties/1]).

-export_type([openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties/0]).

-type openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties() ::
  [ {'feature_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'feature_description', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'http_header_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'http_header_valuepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties() ->
    openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties([]).

openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties(Fields) ->
  Default = [ {'feature.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'feature.description', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'http.header.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'http.header.valuepattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

