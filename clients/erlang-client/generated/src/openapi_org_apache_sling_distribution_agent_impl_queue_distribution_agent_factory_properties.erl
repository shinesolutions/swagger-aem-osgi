-module(openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'details' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'allowed_roots' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'requestAuthorizationStrategy_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'queueProviderFactory_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'packageBuilder_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'triggers_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'priorityQueues' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'name' := Name,
          'title' := Title,
          'details' := Details,
          'enabled' := Enabled,
          'serviceName' := ServiceName,
          'log_level' := LogLevel,
          'allowed_roots' := AllowedRoots,
          'requestAuthorizationStrategy_target' := RequestAuthorizationStrategyTarget,
          'queueProviderFactory_target' := QueueProviderFactoryTarget,
          'packageBuilder_target' := PackageBuilderTarget,
          'triggers_target' := TriggersTarget,
          'priorityQueues' := PriorityQueues
        }) ->
    #{ 'name' => Name,
       'title' => Title,
       'details' => Details,
       'enabled' => Enabled,
       'serviceName' => ServiceName,
       'log.level' => LogLevel,
       'allowed.roots' => AllowedRoots,
       'requestAuthorizationStrategy.target' => RequestAuthorizationStrategyTarget,
       'queueProviderFactory.target' => QueueProviderFactoryTarget,
       'packageBuilder.target' => PackageBuilderTarget,
       'triggers.target' => TriggersTarget,
       'priorityQueues' => PriorityQueues
     }.
