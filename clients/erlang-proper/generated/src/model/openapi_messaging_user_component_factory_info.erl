-module(openapi_messaging_user_component_factory_info).

-include("openapi.hrl").

-export([openapi_messaging_user_component_factory_info/0]).

-export([openapi_messaging_user_component_factory_info/1]).

-export_type([openapi_messaging_user_component_factory_info/0]).

-type openapi_messaging_user_component_factory_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_messaging_user_component_factory_properties:openapi_messaging_user_component_factory_properties() }
  ].


openapi_messaging_user_component_factory_info() ->
    openapi_messaging_user_component_factory_info([]).

openapi_messaging_user_component_factory_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_messaging_user_component_factory_properties:openapi_messaging_user_component_factory_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

