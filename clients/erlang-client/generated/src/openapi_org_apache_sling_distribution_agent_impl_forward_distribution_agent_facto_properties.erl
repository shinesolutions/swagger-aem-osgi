-module(openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'details' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'allowed_roots' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'queue_processing_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'packageImporter_endpoints' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'passiveQueues' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'priorityQueues' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'retry_strategy' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'retry_attempts' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'requestAuthorizationStrategy_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'transportSecretProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'packageBuilder_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'triggers_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'queue_provider' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'async_delivery' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'http_conn_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'name' := Name,
          'title' := Title,
          'details' := Details,
          'enabled' := Enabled,
          'serviceName' := ServiceName,
          'log_level' := LogLevel,
          'allowed_roots' := AllowedRoots,
          'queue_processing_enabled' := QueueProcessingEnabled,
          'packageImporter_endpoints' := PackageImporterEndpoints,
          'passiveQueues' := PassiveQueues,
          'priorityQueues' := PriorityQueues,
          'retry_strategy' := RetryStrategy,
          'retry_attempts' := RetryAttempts,
          'requestAuthorizationStrategy_target' := RequestAuthorizationStrategyTarget,
          'transportSecretProvider_target' := TransportSecretProviderTarget,
          'packageBuilder_target' := PackageBuilderTarget,
          'triggers_target' := TriggersTarget,
          'queue_provider' := QueueProvider,
          'async_delivery' := AsyncDelivery,
          'http_conn_timeout' := HttpConnTimeout
        }) ->
    #{ 'name' => Name,
       'title' => Title,
       'details' => Details,
       'enabled' => Enabled,
       'serviceName' => ServiceName,
       'log.level' => LogLevel,
       'allowed.roots' => AllowedRoots,
       'queue.processing.enabled' => QueueProcessingEnabled,
       'packageImporter.endpoints' => PackageImporterEndpoints,
       'passiveQueues' => PassiveQueues,
       'priorityQueues' => PriorityQueues,
       'retry.strategy' => RetryStrategy,
       'retry.attempts' => RetryAttempts,
       'requestAuthorizationStrategy.target' => RequestAuthorizationStrategyTarget,
       'transportSecretProvider.target' => TransportSecretProviderTarget,
       'packageBuilder.target' => PackageBuilderTarget,
       'triggers.target' => TriggersTarget,
       'queue.provider' => QueueProvider,
       'async.delivery' => AsyncDelivery,
       'http.conn.timeout' => HttpConnTimeout
     }.
