-module(openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'format_target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'tempFsFolder' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fileThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'memoryUnit' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'useOffHeapMemory' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'digestAlgorithm' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'monitoringQueueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cleanupDelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'package_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'property_filters' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'name' := Name,
          'type' := Type,
          'format_target' := FormatTarget,
          'tempFsFolder' := TempFsFolder,
          'fileThreshold' := FileThreshold,
          'memoryUnit' := MemoryUnit,
          'useOffHeapMemory' := UseOffHeapMemory,
          'digestAlgorithm' := DigestAlgorithm,
          'monitoringQueueSize' := MonitoringQueueSize,
          'cleanupDelay' := CleanupDelay,
          'package_filters' := PackageFilters,
          'property_filters' := PropertyFilters
        }) ->
    #{ 'name' => Name,
       'type' => Type,
       'format.target' => FormatTarget,
       'tempFsFolder' => TempFsFolder,
       'fileThreshold' => FileThreshold,
       'memoryUnit' => MemoryUnit,
       'useOffHeapMemory' => UseOffHeapMemory,
       'digestAlgorithm' => DigestAlgorithm,
       'monitoringQueueSize' => MonitoringQueueSize,
       'cleanupDelay' => CleanupDelay,
       'package.filters' => PackageFilters,
       'property.filters' => PropertyFilters
     }.
