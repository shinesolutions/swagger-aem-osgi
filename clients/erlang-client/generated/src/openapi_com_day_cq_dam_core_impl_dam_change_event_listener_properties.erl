-module(openapi_com_day_cq_dam_core_impl_dam_change_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_dam_change_event_listener_properties/0]).

-type openapi_com_day_cq_dam_core_impl_dam_change_event_listener_properties() ::
    #{ 'changeeventlistener_observed_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'changeeventlistener_observed_paths' := ChangeeventlistenerObservedPaths
        }) ->
    #{ 'changeeventlistener.observed.paths' => ChangeeventlistenerObservedPaths
     }.
