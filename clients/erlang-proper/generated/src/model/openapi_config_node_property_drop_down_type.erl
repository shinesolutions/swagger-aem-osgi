-module(openapi_config_node_property_drop_down_type).

-include("openapi.hrl").

-export([openapi_config_node_property_drop_down_type/0]).

-export([openapi_config_node_property_drop_down_type/1]).

-export_type([openapi_config_node_property_drop_down_type/0]).

-type openapi_config_node_property_drop_down_type() ::
  [ {'labels', openapi_any_type:openapi_any_type() }
  | {'values', openapi_any_type:openapi_any_type() }
  ].


openapi_config_node_property_drop_down_type() ->
    openapi_config_node_property_drop_down_type([]).

openapi_config_node_property_drop_down_type(Fields) ->
  Default = [ {'labels', openapi_any_type:openapi_any_type() }
            , {'values', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

