-module(openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties() ::
  [ {'versionmanager_createVersionOnActivation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'versionmanager_purgingEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'versionmanager_purgePaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'versionmanager_ivPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'versionmanager_maxAgeDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'versionmanager_maxNumberVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'versionmanager_minNumberVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_version_manager_impl_properties(Fields) ->
  Default = [ {'versionmanager.createVersionOnActivation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'versionmanager.purgingEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'versionmanager.purgePaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'versionmanager.ivPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'versionmanager.maxAgeDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'versionmanager.maxNumberVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'versionmanager.minNumberVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

