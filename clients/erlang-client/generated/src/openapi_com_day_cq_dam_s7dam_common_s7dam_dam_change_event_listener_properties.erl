-module(openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_properties() ::
    #{ 'cq_dam_s7dam_damchangeeventlistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_s7dam_damchangeeventlistener_enabled' := CqDamS7damDamchangeeventlistenerEnabled
        }) ->
    #{ 'cq.dam.s7dam.damchangeeventlistener.enabled' => CqDamS7damDamchangeeventlistenerEnabled
     }.
