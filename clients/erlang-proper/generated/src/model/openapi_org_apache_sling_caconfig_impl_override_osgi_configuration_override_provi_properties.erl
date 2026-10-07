-module(openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties/0]).

-export([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties() ::
  [ {'description', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'overrides', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties() ->
    openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties([]).

openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties(Fields) ->
  Default = [ {'description', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'overrides', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

