-module(openapi_config_node_property_float).

-include("openapi.hrl").

-export([openapi_config_node_property_float/0]).

-export([openapi_config_node_property_float/1]).

-export_type([openapi_config_node_property_float/0]).

-type openapi_config_node_property_float() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', integer() }
  | {'description', binary() }
  ].


openapi_config_node_property_float() ->
    openapi_config_node_property_float([]).

openapi_config_node_property_float(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', integer() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

