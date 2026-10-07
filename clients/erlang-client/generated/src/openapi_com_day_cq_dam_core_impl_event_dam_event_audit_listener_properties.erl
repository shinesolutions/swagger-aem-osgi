-module(openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties/0]).

-type openapi_com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'event_filter' := EventFilter,
          'enabled' := Enabled
        }) ->
    #{ 'event.filter' => EventFilter,
       'enabled' => Enabled
     }.
