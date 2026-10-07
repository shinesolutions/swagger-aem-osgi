-module(openapi_guide_localization_service_info).

-include("openapi.hrl").

-export([openapi_guide_localization_service_info/0]).

-export([openapi_guide_localization_service_info/1]).

-export_type([openapi_guide_localization_service_info/0]).

-type openapi_guide_localization_service_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_guide_localization_service_properties:openapi_guide_localization_service_properties() }
  ].


openapi_guide_localization_service_info() ->
    openapi_guide_localization_service_info([]).

openapi_guide_localization_service_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_guide_localization_service_properties:openapi_guide_localization_service_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

