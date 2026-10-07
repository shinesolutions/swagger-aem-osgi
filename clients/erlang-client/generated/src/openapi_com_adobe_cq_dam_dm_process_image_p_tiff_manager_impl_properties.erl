-module(openapi_com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl_properties/0]).

-type openapi_com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl_properties() ::
    #{ 'maxMemory' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'maxMemory' := MaxMemory
        }) ->
    #{ 'maxMemory' => MaxMemory
     }.
