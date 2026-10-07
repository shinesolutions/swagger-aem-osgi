-module(openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties/0]).

-export([openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties/0]).

-type openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'configPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'fallbackPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'configCollectionInheritancePropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties() ->
    openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties([]).

openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'configPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'fallbackPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'configCollectionInheritancePropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

