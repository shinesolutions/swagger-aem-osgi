-module(openapi_com_day_cq_wcm_core_impl_version_purge_task_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_version_purge_task_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_version_purge_task_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_version_purge_task_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_version_purge_task_properties() ::
  [ {'versionpurge_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'versionpurge_recursive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'versionpurge_maxVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'versionpurge_minVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'versionpurge_maxAgeDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_wcm_core_impl_version_purge_task_properties() ->
    openapi_com_day_cq_wcm_core_impl_version_purge_task_properties([]).

openapi_com_day_cq_wcm_core_impl_version_purge_task_properties(Fields) ->
  Default = [ {'versionpurge.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'versionpurge.recursive', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'versionpurge.maxVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'versionpurge.minVersions', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'versionpurge.maxAgeDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

