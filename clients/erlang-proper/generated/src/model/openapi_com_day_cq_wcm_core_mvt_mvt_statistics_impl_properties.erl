-module(openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties() ::
  [ {'mvtstatistics_trackingurl', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties() ->
    openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties([]).

openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties(Fields) ->
  Default = [ {'mvtstatistics.trackingurl', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

