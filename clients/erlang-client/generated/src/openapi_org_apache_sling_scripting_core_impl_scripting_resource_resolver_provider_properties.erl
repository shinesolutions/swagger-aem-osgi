-module(openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties/0]).

-type openapi_org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_properties() ::
    #{ 'log_stacktrace_onclose' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'log_stacktrace_onclose' := LogStacktraceOnclose
        }) ->
    #{ 'log.stacktrace.onclose' => LogStacktraceOnclose
     }.
