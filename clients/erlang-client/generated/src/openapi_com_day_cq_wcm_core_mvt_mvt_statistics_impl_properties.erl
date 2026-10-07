-module(openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties() ::
    #{ 'mvtstatistics_trackingurl' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'mvtstatistics_trackingurl' := MvtstatisticsTrackingurl
        }) ->
    #{ 'mvtstatistics.trackingurl' => MvtstatisticsTrackingurl
     }.
