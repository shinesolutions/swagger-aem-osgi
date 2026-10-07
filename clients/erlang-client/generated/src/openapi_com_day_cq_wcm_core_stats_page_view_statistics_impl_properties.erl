-module(openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_stats_page_view_statistics_impl_properties() ::
    #{ 'pageviewstatistics_trackingurl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pageviewstatistics_trackingscript_enabled' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'pageviewstatistics_trackingurl' := PageviewstatisticsTrackingurl,
          'pageviewstatistics_trackingscript_enabled' := PageviewstatisticsTrackingscriptEnabled
        }) ->
    #{ 'pageviewstatistics.trackingurl' => PageviewstatisticsTrackingurl,
       'pageviewstatistics.trackingscript.enabled' => PageviewstatisticsTrackingscriptEnabled
     }.
