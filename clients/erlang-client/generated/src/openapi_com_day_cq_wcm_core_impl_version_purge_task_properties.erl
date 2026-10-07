-module(openapi_com_day_cq_wcm_core_impl_version_purge_task_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_version_purge_task_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_version_purge_task_properties() ::
    #{ 'versionpurge_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'versionpurge_recursive' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'versionpurge_maxVersions' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'versionpurge_minVersions' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'versionpurge_maxAgeDays' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'versionpurge_paths' := VersionpurgePaths,
          'versionpurge_recursive' := VersionpurgeRecursive,
          'versionpurge_maxVersions' := VersionpurgeMaxVersions,
          'versionpurge_minVersions' := VersionpurgeMinVersions,
          'versionpurge_maxAgeDays' := VersionpurgeMaxAgeDays
        }) ->
    #{ 'versionpurge.paths' => VersionpurgePaths,
       'versionpurge.recursive' => VersionpurgeRecursive,
       'versionpurge.maxVersions' => VersionpurgeMaxVersions,
       'versionpurge.minVersions' => VersionpurgeMinVersions,
       'versionpurge.maxAgeDays' => VersionpurgeMaxAgeDays
     }.
