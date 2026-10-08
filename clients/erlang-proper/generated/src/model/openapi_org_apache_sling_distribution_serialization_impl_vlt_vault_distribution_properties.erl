-module(openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties/0]).

-export([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'importMode', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'aclHandling', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'package_roots', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'package_filters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'property_filters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'tempFsFolder', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'useBinaryReferences', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'autoSaveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cleanupDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'fileThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'MEGA_BYTES', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'useOffHeapMemory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'digestAlgorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'monitoringQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'pathsMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'strictImport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties() ->
    openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties([]).

openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'importMode', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'aclHandling', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'package.roots', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'package.filters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'property.filters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'tempFsFolder', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'useBinaryReferences', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'autoSaveThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cleanupDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'fileThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'MEGA_BYTES', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'useOffHeapMemory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'digestAlgorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'monitoringQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'pathsMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'strictImport', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

