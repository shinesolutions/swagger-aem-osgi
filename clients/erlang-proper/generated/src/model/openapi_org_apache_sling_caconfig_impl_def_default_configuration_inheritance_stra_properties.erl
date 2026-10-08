-module(openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties/0]).

-export([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'configPropertyInheritancePropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties() ->
    openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties([]).

openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'configPropertyInheritancePropertyNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

