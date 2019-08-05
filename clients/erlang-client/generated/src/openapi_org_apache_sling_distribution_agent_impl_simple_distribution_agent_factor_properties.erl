-module(openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'title' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'details' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'log_level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'queue_processing_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'packageExporter_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'packageImporter_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'requestAuthorizationStrategy_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'triggers_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'title' := Title,
          'details' := Details,
          'enabled' := Enabled,
          'serviceName' := ServiceName,
          'log_level' := LogLevel,
          'queue_processing_enabled' := QueueProcessingEnabled,
          'packageExporter_target' := PackageExporterTarget,
          'packageImporter_target' := PackageImporterTarget,
          'requestAuthorizationStrategy_target' := RequestAuthorizationStrategyTarget,
          'triggers_target' := TriggersTarget
        }) ->
    #{ 'name' => Name,
       'title' => Title,
       'details' => Details,
       'enabled' => Enabled,
       'serviceName' => ServiceName,
       'log.level' => LogLevel,
       'queue.processing.enabled' => QueueProcessingEnabled,
       'packageExporter.target' => PackageExporterTarget,
       'packageImporter.target' => PackageImporterTarget,
       'requestAuthorizationStrategy.target' => RequestAuthorizationStrategyTarget,
       'triggers.target' => TriggersTarget
     }.
