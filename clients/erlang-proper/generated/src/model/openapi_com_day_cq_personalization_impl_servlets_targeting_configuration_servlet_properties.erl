-module(openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties/0]).

-export([openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties/1]).

-export_type([openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties/0]).

-type openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties() ::
  [ {'forcelocation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties() ->
    openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties([]).

openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties(Fields) ->
  Default = [ {'forcelocation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

