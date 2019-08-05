-module(openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'importMode' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'aclHandling' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'package_roots' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'package_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'property_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'tempFsFolder' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'useBinaryReferences' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'autoSaveThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cleanupDelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'fileThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'MEGA_BYTES' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'useOffHeapMemory' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'digestAlgorithm' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'monitoringQueueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'pathsMapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'strictImport' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'name' := Name,
          'type' := Type,
          'importMode' := ImportMode,
          'aclHandling' := AclHandling,
          'package_roots' := PackageRoots,
          'package_filters' := PackageFilters,
          'property_filters' := PropertyFilters,
          'tempFsFolder' := TempFsFolder,
          'useBinaryReferences' := UseBinaryReferences,
          'autoSaveThreshold' := AutoSaveThreshold,
          'cleanupDelay' := CleanupDelay,
          'fileThreshold' := FileThreshold,
          'MEGA_BYTES' := MEGABYTES,
          'useOffHeapMemory' := UseOffHeapMemory,
          'digestAlgorithm' := DigestAlgorithm,
          'monitoringQueueSize' := MonitoringQueueSize,
          'pathsMapping' := PathsMapping,
          'strictImport' := StrictImport
        }) ->
    #{ 'name' => Name,
       'type' => Type,
       'importMode' => ImportMode,
       'aclHandling' => AclHandling,
       'package.roots' => PackageRoots,
       'package.filters' => PackageFilters,
       'property.filters' => PropertyFilters,
       'tempFsFolder' => TempFsFolder,
       'useBinaryReferences' => UseBinaryReferences,
       'autoSaveThreshold' => AutoSaveThreshold,
       'cleanupDelay' => CleanupDelay,
       'fileThreshold' => FileThreshold,
       'MEGA_BYTES' => MEGABYTES,
       'useOffHeapMemory' => UseOffHeapMemory,
       'digestAlgorithm' => DigestAlgorithm,
       'monitoringQueueSize' => MonitoringQueueSize,
       'pathsMapping' => PathsMapping,
       'strictImport' => StrictImport
     }.
