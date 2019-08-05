-module(openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties/0]).

-type openapi_com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties() ::
    #{ 'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'extract_pages' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'process_label' := ProcessLabel,
          'extract_pages' := ExtractPages
        }) ->
    #{ 'process.label' => ProcessLabel,
       'extract.pages' => ExtractPages
     }.
