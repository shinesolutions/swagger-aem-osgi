-module(openapi_com_adobe_cq_social_sync_impl_publisher_sync_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_sync_impl_publisher_sync_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_sync_impl_publisher_sync_service_impl_properties() ::
    #{ 'activeRunModes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'activeRunModes' := ActiveRunModes
        }) ->
    #{ 'activeRunModes' => ActiveRunModes
     }.
