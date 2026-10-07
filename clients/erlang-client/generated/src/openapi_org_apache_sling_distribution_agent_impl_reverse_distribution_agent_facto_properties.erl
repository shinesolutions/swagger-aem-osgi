-module(openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'details' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'queue_processing_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'packageExporter_endpoints' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'pull_items' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'http_conn_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'requestAuthorizationStrategy_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'transportSecretProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'packageBuilder_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'triggers_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'title' := Title,
          'details' := Details,
          'enabled' := Enabled,
          'serviceName' := ServiceName,
          'log_level' := LogLevel,
          'queue_processing_enabled' := QueueProcessingEnabled,
          'packageExporter_endpoints' := PackageExporterEndpoints,
          'pull_items' := PullItems,
          'http_conn_timeout' := HttpConnTimeout,
          'requestAuthorizationStrategy_target' := RequestAuthorizationStrategyTarget,
          'transportSecretProvider_target' := TransportSecretProviderTarget,
          'packageBuilder_target' := PackageBuilderTarget,
          'triggers_target' := TriggersTarget
        }) ->
    #{ 'name' => Name,
       'title' => Title,
       'details' => Details,
       'enabled' => Enabled,
       'serviceName' => ServiceName,
       'log.level' => LogLevel,
       'queue.processing.enabled' => QueueProcessingEnabled,
       'packageExporter.endpoints' => PackageExporterEndpoints,
       'pull.items' => PullItems,
       'http.conn.timeout' => HttpConnTimeout,
       'requestAuthorizationStrategy.target' => RequestAuthorizationStrategyTarget,
       'transportSecretProvider.target' => TransportSecretProviderTarget,
       'packageBuilder.target' => PackageBuilderTarget,
       'triggers.target' => TriggersTarget
     }.
