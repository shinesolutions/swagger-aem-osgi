-module(openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties() ::
    #{ 'mimetype' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'mimetype' := Mimetype
        }) ->
    #{ 'mimetype' => Mimetype
     }.
