-module(openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties/0]).

-export([openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties() ::
  [ {'group', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ids', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties() ->
    openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties([]).

openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties(Fields) ->
  Default = [ {'group', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ids', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

