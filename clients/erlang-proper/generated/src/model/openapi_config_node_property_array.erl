-module(openapi_config_node_property_array).

-include("openapi.hrl").

-export([openapi_config_node_property_array/0]).

-export([openapi_config_node_property_array/1]).

-export_type([openapi_config_node_property_array/0]).

-type openapi_config_node_property_array() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'values', list(binary()) }
  | {'description', binary() }
  ].


openapi_config_node_property_array() ->
    openapi_config_node_property_array([]).

openapi_config_node_property_array(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'values', list(binary()) }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

