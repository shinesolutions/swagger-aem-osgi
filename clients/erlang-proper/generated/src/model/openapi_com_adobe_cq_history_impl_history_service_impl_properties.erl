-module(openapi_com_adobe_cq_history_impl_history_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_history_impl_history_service_impl_properties/0]).

-export([openapi_com_adobe_cq_history_impl_history_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_history_impl_history_service_impl_properties/0]).

-type openapi_com_adobe_cq_history_impl_history_service_impl_properties() ::
  [ {'history_service_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'history_service_pathFilter', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_history_impl_history_service_impl_properties() ->
    openapi_com_adobe_cq_history_impl_history_service_impl_properties([]).

openapi_com_adobe_cq_history_impl_history_service_impl_properties(Fields) ->
  Default = [ {'history.service.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'history.service.pathFilter', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

