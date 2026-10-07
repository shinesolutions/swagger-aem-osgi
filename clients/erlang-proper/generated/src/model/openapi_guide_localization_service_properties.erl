-module(openapi_guide_localization_service_properties).

-include("openapi.hrl").

-export([openapi_guide_localization_service_properties/0]).

-export([openapi_guide_localization_service_properties/1]).

-export_type([openapi_guide_localization_service_properties/0]).

-type openapi_guide_localization_service_properties() ::
  [ {'supportedLocales', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'Localizable_Properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_guide_localization_service_properties() ->
    openapi_guide_localization_service_properties([]).

openapi_guide_localization_service_properties(Fields) ->
  Default = [ {'supportedLocales', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'Localizable Properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

