-module(openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_repository_change_event_listener_properties() ::
    #{ 'paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'excludedPaths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'paths' := Paths,
          'excludedPaths' := ExcludedPaths
        }) ->
    #{ 'paths' => Paths,
       'excludedPaths' => ExcludedPaths
     }.
