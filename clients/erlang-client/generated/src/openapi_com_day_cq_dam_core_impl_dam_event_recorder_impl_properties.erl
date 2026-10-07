-module(openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_dam_event_recorder_impl_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'event_queue_length' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'eventrecorder_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'eventrecorder_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'eventrecorder_eventtypes' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'event_filter' := EventFilter,
          'event_queue_length' := EventQueueLength,
          'eventrecorder_enabled' := EventrecorderEnabled,
          'eventrecorder_blacklist' := EventrecorderBlacklist,
          'eventrecorder_eventtypes' := EventrecorderEventtypes
        }) ->
    #{ 'event.filter' => EventFilter,
       'event.queue.length' => EventQueueLength,
       'eventrecorder.enabled' => EventrecorderEnabled,
       'eventrecorder.blacklist' => EventrecorderBlacklist,
       'eventrecorder.eventtypes' => EventrecorderEventtypes
     }.
