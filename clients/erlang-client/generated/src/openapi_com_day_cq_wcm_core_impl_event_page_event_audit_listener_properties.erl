-module(openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties() ::
    #{ 'configured' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'configured' := Configured
        }) ->
    #{ 'configured' => Configured
     }.
