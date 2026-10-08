-module(openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties/0]).

-export([openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties/1]).

-export_type([openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties/0]).

-type openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties() ::
  [ {'log_stacktrace_onclose', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties() ->
    openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties([]).

openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties(Fields) ->
  Default = [ {'log.stacktrace.onclose', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

