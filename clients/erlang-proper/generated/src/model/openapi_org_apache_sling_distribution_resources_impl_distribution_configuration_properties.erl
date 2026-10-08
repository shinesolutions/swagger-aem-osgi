-module(openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties/0]).

-export([openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties/1]).

-export_type([openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties/0]).

-type openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties() ::
  [ {'provider_roots', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'kind', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties() ->
    openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties([]).

openapi_org_apache_sling_distribution_resources_impl_distribution_configuration_properties(Fields) ->
  Default = [ {'provider.roots', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'kind', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

