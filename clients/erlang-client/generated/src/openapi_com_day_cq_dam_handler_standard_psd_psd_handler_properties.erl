-module(openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties/0]).

-type openapi_com_day_cq_dam_handler_standard_psd_psd_handler_properties() ::
    #{ 'large_file_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'large_file_threshold' := LargeFileThreshold
        }) ->
    #{ 'large_file_threshold' => LargeFileThreshold
     }.
