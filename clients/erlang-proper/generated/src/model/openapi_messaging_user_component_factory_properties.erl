-module(openapi_messaging_user_component_factory_properties).

-include("openapi.hrl").

-export([openapi_messaging_user_component_factory_properties/0]).

-export([openapi_messaging_user_component_factory_properties/1]).

-export_type([openapi_messaging_user_component_factory_properties/0]).

-type openapi_messaging_user_component_factory_properties() ::
  [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_messaging_user_component_factory_properties() ->
    openapi_messaging_user_component_factory_properties([]).

openapi_messaging_user_component_factory_properties(Fields) ->
  Default = [ {'priority', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

