-module(openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties/0]).

-export([openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties/0]).

-type openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'configRefResourceNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'configRefPropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties() ->
    openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties([]).

openapi_org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'configRefResourceNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'configRefPropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

