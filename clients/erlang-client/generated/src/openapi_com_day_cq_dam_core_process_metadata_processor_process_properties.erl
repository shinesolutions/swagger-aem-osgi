-module(openapi_com_day_cq_dam_core_process_metadata_processor_process_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_process_metadata_processor_process_properties/0]).

-type openapi_com_day_cq_dam_core_process_metadata_processor_process_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_dam_enable_sha1' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_metadata_xssprotected_properties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'process_label' := ProcessLabel,
          'cq_dam_enable_sha1' := CqDamEnableSha1,
          'cq_dam_metadata_xssprotected_properties' := CqDamMetadataXssprotectedProperties
        }) ->
    #{ 'process.label' => ProcessLabel,
       'cq.dam.enable.sha1' => CqDamEnableSha1,
       'cq.dam.metadata.xssprotected.properties' => CqDamMetadataXssprotectedProperties
     }.
