-module(openapi_config_node_property_drop_down).

-include("openapi.hrl").

-export([openapi_config_node_property_drop_down/0]).

-export([openapi_config_node_property_drop_down/1]).

-export_type([openapi_config_node_property_drop_down/0]).

-type openapi_config_node_property_drop_down() ::
  [ {'name', binary() }
  | {'optional', boolean() }
  | {'is_set', boolean() }
  | {'type', openapi_config_node_property_drop_down_type:openapi_config_node_property_drop_down_type() }
  | {'value', openapi_any_type:openapi_any_type() }
  | {'description', binary() }
  ].


openapi_config_node_property_drop_down() ->
    openapi_config_node_property_drop_down([]).

openapi_config_node_property_drop_down(Fields) ->
  Default = [ {'name', binary() }
            , {'optional', boolean() }
            , {'is_set', boolean() }
            , {'type', openapi_config_node_property_drop_down_type:openapi_config_node_property_drop_down_type() }
            , {'value', openapi_any_type:openapi_any_type() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

