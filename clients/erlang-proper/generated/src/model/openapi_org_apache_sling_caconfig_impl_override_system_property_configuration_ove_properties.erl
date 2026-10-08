-module(openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties/0]).

-export([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties() ->
    openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties([]).

openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

