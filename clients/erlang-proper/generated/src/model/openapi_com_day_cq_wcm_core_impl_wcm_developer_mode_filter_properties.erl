-module(openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties() ::
  [ {'wcmdevmodefilter_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties() ->
    openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties([]).

openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties(Fields) ->
  Default = [ {'wcmdevmodefilter.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

