-module(openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_properties() ::
    #{ 'cq_dam_scene7_damchangeeventlistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_dam_scene7_damchangeeventlistener_observed_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_dam_scene7_damchangeeventlistener_enabled' := CqDamScene7DamchangeeventlistenerEnabled,
          'cq_dam_scene7_damchangeeventlistener_observed_paths' := CqDamScene7DamchangeeventlistenerObservedPaths
        }) ->
    #{ 'cq.dam.scene7.damchangeeventlistener.enabled' => CqDamScene7DamchangeeventlistenerEnabled,
       'cq.dam.scene7.damchangeeventlistener.observed.paths' => CqDamScene7DamchangeeventlistenerObservedPaths
     }.
