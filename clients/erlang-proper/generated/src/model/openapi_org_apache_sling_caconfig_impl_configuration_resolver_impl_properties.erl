-module(openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties/0]).

-export([openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties() ::
  [ {'configBucketNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties() ->
    openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties([]).

openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties(Fields) ->
  Default = [ {'configBucketNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

