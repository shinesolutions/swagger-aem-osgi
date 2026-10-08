-module(openapi_com_adobe_granite_compatrouter_impl_routing_config_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_compatrouter_impl_routing_config_properties/0]).

-export([openapi_com_adobe_granite_compatrouter_impl_routing_config_properties/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_routing_config_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_routing_config_properties() ::
  [ {'id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'compatPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'newPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_compatrouter_impl_routing_config_properties() ->
    openapi_com_adobe_granite_compatrouter_impl_routing_config_properties([]).

openapi_com_adobe_granite_compatrouter_impl_routing_config_properties(Fields) ->
  Default = [ {'id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'compatPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'newPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

