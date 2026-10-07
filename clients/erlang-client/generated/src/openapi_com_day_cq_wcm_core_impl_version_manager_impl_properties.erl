-module(openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties() ::
    #{ 'versionmanager_createVersionOnActivation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'versionmanager_purgingEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'versionmanager_purgePaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'versionmanager_ivPaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'versionmanager_maxAgeDays' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'versionmanager_maxNumberVersions' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'versionmanager_minNumberVersions' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'versionmanager_createVersionOnActivation' := VersionmanagerCreateVersionOnActivation,
          'versionmanager_purgingEnabled' := VersionmanagerPurgingEnabled,
          'versionmanager_purgePaths' := VersionmanagerPurgePaths,
          'versionmanager_ivPaths' := VersionmanagerIvPaths,
          'versionmanager_maxAgeDays' := VersionmanagerMaxAgeDays,
          'versionmanager_maxNumberVersions' := VersionmanagerMaxNumberVersions,
          'versionmanager_minNumberVersions' := VersionmanagerMinNumberVersions
        }) ->
    #{ 'versionmanager.createVersionOnActivation' => VersionmanagerCreateVersionOnActivation,
       'versionmanager.purgingEnabled' => VersionmanagerPurgingEnabled,
       'versionmanager.purgePaths' => VersionmanagerPurgePaths,
       'versionmanager.ivPaths' => VersionmanagerIvPaths,
       'versionmanager.maxAgeDays' => VersionmanagerMaxAgeDays,
       'versionmanager.maxNumberVersions' => VersionmanagerMaxNumberVersions,
       'versionmanager.minNumberVersions' => VersionmanagerMinNumberVersions
     }.
