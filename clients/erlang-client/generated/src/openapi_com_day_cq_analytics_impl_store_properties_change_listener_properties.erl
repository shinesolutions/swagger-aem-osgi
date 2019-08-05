-module(openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties/0]).

-type openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties() ::
    #{ 'cq_store_listener_additionalStorePaths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_store_listener_additionalStorePaths' := CqStoreListenerAdditionalStorePaths
        }) ->
    #{ 'cq.store.listener.additionalStorePaths' => CqStoreListenerAdditionalStorePaths
     }.
