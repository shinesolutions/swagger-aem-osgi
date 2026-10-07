-module(openapi_com_adobe_granite_repository_service_user_configuration_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_service_user_configuration_properties/0]).

-export([openapi_com_adobe_granite_repository_service_user_configuration_properties/1]).

-export_type([openapi_com_adobe_granite_repository_service_user_configuration_properties/0]).

-type openapi_com_adobe_granite_repository_service_user_configuration_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'serviceusers_simpleSubjectPopulation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'serviceusers_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_repository_service_user_configuration_properties() ->
    openapi_com_adobe_granite_repository_service_user_configuration_properties([]).

openapi_com_adobe_granite_repository_service_user_configuration_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'serviceusers.simpleSubjectPopulation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'serviceusers.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

