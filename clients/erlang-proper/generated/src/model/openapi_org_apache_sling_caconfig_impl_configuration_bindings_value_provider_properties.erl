-module(openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties/0]).

-export([openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties() ->
    openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties([]).

openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

