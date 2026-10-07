-module(openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties() ::
  [ {'pageviewstatistics_trackingurl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pageviewstatistics_trackingscript_enabled', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties() ->
    openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties([]).

openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties(Fields) ->
  Default = [ {'pageviewstatistics.trackingurl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pageviewstatistics.trackingscript.enabled', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

