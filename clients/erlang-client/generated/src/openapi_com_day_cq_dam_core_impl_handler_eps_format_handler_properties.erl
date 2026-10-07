-module(openapi_com_day_cq_dam_core_impl_handler_eps_format_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_eps_format_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_handler_eps_format_handler_properties() ::
    #{ 'mimetype' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'mimetype' := Mimetype
        }) ->
    #{ 'mimetype' => Mimetype
     }.
