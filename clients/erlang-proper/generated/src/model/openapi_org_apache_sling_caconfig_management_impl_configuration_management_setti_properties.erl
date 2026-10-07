-module(openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties/0]).

-export([openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties/0]).

-type openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties() ::
  [ {'ignorePropertyNameRegex', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'configCollectionPropertiesResourceNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties() ->
    openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties([]).

openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties(Fields) ->
  Default = [ {'ignorePropertyNameRegex', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'configCollectionPropertiesResourceNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

