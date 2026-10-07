-module(openapi_config_node_property_string).

-include("openapi.hrl").

-export([openapi_config_node_property_string/0]).

-export([openapi_config_node_property_string/1]).

-export_type([openapi_config_node_property_string/0]).

-type openapi_config_node_property_string() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', binary() }
  | {'description', binary() }
  ].


openapi_config_node_property_string() ->
    openapi_config_node_property_string([]).

openapi_config_node_property_string(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', binary() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

