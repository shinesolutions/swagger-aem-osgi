-module(openapi_com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_properties() ::
    #{ 'cq_dam_scene7_configurationeventlistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_scene7_configurationeventlistener_enabled' := CqDamScene7ConfigurationeventlistenerEnabled
        }) ->
    #{ 'cq.dam.scene7.configurationeventlistener.enabled' => CqDamScene7ConfigurationeventlistenerEnabled
     }.
