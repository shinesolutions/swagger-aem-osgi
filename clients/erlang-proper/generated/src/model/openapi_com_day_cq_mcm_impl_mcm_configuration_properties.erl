-module(openapi_com_day_cq_mcm_impl_mcm_configuration_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mcm_impl_mcm_configuration_properties/0]).

-export([openapi_com_day_cq_mcm_impl_mcm_configuration_properties/1]).

-export_type([openapi_com_day_cq_mcm_impl_mcm_configuration_properties/0]).

-type openapi_com_day_cq_mcm_impl_mcm_configuration_properties() ::
  [ {'experience_indirection', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'touchpoint_indirection', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_mcm_impl_mcm_configuration_properties() ->
    openapi_com_day_cq_mcm_impl_mcm_configuration_properties([]).

openapi_com_day_cq_mcm_impl_mcm_configuration_properties(Fields) ->
  Default = [ {'experience.indirection', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'touchpoint.indirection', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

