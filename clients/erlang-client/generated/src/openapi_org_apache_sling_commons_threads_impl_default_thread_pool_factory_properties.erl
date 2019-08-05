-module(openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties/0]).

-type openapi_org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'minPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxThreadAge' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'keepAliveTime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'blockPolicy' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'shutdownGraceful' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'daemon' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'shutdownWaitTime' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'priority' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'name' := Name,
          'minPoolSize' := MinPoolSize,
          'maxPoolSize' := MaxPoolSize,
          'queueSize' := QueueSize,
          'maxThreadAge' := MaxThreadAge,
          'keepAliveTime' := KeepAliveTime,
          'blockPolicy' := BlockPolicy,
          'shutdownGraceful' := ShutdownGraceful,
          'daemon' := Daemon,
          'shutdownWaitTime' := ShutdownWaitTime,
          'priority' := Priority
        }) ->
    #{ 'name' => Name,
       'minPoolSize' => MinPoolSize,
       'maxPoolSize' => MaxPoolSize,
       'queueSize' => QueueSize,
       'maxThreadAge' => MaxThreadAge,
       'keepAliveTime' => KeepAliveTime,
       'blockPolicy' => BlockPolicy,
       'shutdownGraceful' => ShutdownGraceful,
       'daemon' => Daemon,
       'shutdownWaitTime' => ShutdownWaitTime,
       'priority' => Priority
     }.
