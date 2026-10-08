-module(openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties/0]).

-export([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'types', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties() ->
    openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties([]).

openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'types', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

