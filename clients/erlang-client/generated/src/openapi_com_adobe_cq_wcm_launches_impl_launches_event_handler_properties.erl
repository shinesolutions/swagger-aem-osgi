-module(openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties/0]).

-type openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties() ::
    #{ 'event_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'launches_eventhandler_threadpool_maxsize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'launches_eventhandler_threadpool_priority' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'launches_eventhandler_updatelastmodification' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'event_filter' := EventFilter,
          'launches_eventhandler_threadpool_maxsize' := LaunchesEventhandlerThreadpoolMaxsize,
          'launches_eventhandler_threadpool_priority' := LaunchesEventhandlerThreadpoolPriority,
          'launches_eventhandler_updatelastmodification' := LaunchesEventhandlerUpdatelastmodification
        }) ->
    #{ 'event.filter' => EventFilter,
       'launches.eventhandler.threadpool.maxsize' => LaunchesEventhandlerThreadpoolMaxsize,
       'launches.eventhandler.threadpool.priority' => LaunchesEventhandlerThreadpoolPriority,
       'launches.eventhandler.updatelastmodification' => LaunchesEventhandlerUpdatelastmodification
     }.
