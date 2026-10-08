-module(openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties/0]).

-export([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'format_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tempFsFolder', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fileThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'memoryUnit', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'useOffHeapMemory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'digestAlgorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'monitoringQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cleanupDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'package_filters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'property_filters', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties() ->
    openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties([]).

openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'format.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tempFsFolder', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fileThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'memoryUnit', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'useOffHeapMemory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'digestAlgorithm', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'monitoringQueueSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cleanupDelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'package.filters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'property.filters', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

