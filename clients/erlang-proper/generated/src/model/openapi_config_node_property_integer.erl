-module(openapi_config_node_property_integer).

-include("openapi.hrl").

-export([openapi_config_node_property_integer/0]).

-export([openapi_config_node_property_integer/1]).

-export_type([openapi_config_node_property_integer/0]).

-type openapi_config_node_property_integer() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', integer() }
  | {'description', binary() }
  ].


openapi_config_node_property_integer() ->
    openapi_config_node_property_integer([]).

openapi_config_node_property_integer(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', integer() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

