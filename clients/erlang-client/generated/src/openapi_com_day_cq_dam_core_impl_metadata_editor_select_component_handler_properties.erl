-module(openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties/0]).

-type openapi_com_day_cq_dam_core_impl_metadata_editor_select_component_handler_properties() ::
    #{ 'granitedata' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'granitedata' := Granitedata
        }) ->
    #{ 'granite:data' => Granitedata
     }.
