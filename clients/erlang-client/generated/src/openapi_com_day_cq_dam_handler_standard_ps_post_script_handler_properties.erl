-module(openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties/0]).

-type openapi_com_day_cq_dam_handler_standard_ps_post_script_handler_properties() ::
    #{ 'raster_annotation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'raster_annotation' := RasterAnnotation
        }) ->
    #{ 'raster.annotation' => RasterAnnotation
     }.
