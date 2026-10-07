-module(openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'process_label' := ProcessLabel
        }) ->
    #{ 'process.label' => ProcessLabel
     }.
