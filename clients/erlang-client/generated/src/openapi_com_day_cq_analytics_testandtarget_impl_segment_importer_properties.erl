-module(openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_segment_importer_properties() ::
    #{ 'cq_analytics_testandtarget_segmentimporter_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_analytics_testandtarget_segmentimporter_enabled' := CqAnalyticsTestandtargetSegmentimporterEnabled
        }) ->
    #{ 'cq.analytics.testandtarget.segmentimporter.enabled' => CqAnalyticsTestandtargetSegmentimporterEnabled
     }.
