-module(openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties() ::
    #{ 'threadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'delayTime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'workerSleepTime' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'threadPoolSize' := ThreadPoolSize,
          'delayTime' := DelayTime,
          'workerSleepTime' := WorkerSleepTime
        }) ->
    #{ 'threadPoolSize' => ThreadPoolSize,
       'delayTime' => DelayTime,
       'workerSleepTime' => WorkerSleepTime
     }.
