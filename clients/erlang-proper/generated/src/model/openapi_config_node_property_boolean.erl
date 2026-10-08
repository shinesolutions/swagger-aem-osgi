-module(openapi_config_node_property_boolean).

-include("openapi.hrl").

-export([openapi_config_node_property_boolean/0]).

-export([openapi_config_node_property_boolean/1]).

-export_type([openapi_config_node_property_boolean/0]).

-type openapi_config_node_property_boolean() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', integer() }
  | {'value', boolean() }
  | {'description', binary() }
  ].


openapi_config_node_property_boolean() ->
    openapi_config_node_property_boolean([]).

openapi_config_node_property_boolean(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', integer() }
            , {'value', boolean() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

