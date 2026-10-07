-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties() ::
    #{ 'item_resource_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'item_resource_types' := ItemResourceTypes
        }) ->
    #{ 'item.resource.types' => ItemResourceTypes
     }.
