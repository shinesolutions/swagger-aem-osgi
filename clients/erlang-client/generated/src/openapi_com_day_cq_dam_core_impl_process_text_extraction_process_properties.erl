-module(openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties/0]).

-type openapi_com_day_cq_dam_core_impl_process_text_extraction_process_properties() ::
    #{ 'mimeTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'maxExtract' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'mimeTypes' := MimeTypes,
          'maxExtract' := MaxExtract
        }) ->
    #{ 'mimeTypes' => MimeTypes,
       'maxExtract' => MaxExtract
     }.
