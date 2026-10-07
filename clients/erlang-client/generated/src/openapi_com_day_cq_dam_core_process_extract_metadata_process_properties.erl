-module(openapi_com_day_cq_dam_core_process_extract_metadata_process_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_process_extract_metadata_process_properties/0]).

-type openapi_com_day_cq_dam_core_process_extract_metadata_process_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_enable_sha1' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'process_label' := ProcessLabel,
          'cq_dam_enable_sha1' := CqDamEnableSha1
        }) ->
    #{ 'process.label' => ProcessLabel,
       'cq.dam.enable.sha1' => CqDamEnableSha1
     }.
