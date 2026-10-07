-module(openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties() ::
  [ {'filter_order', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'filter_scope', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties() ->
    openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties([]).

openapi_com_day_cq_wcm_core_impl_warp_time_warp_filter_properties(Fields) ->
  Default = [ {'filter.order', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'filter.scope', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

