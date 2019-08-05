-module(openapi_com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_properties() ::
    #{ 'xmphandler_cq_formats' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'xmphandler_cq_formats' := XmphandlerCqFormats
        }) ->
    #{ 'xmphandler.cq.formats' => XmphandlerCqFormats
     }.
