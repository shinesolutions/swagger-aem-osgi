-module(openapi_org_apache_sling_jmx_provider_impl_jmx_resource_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jmx_provider_impl_jmx_resource_provider_properties/0]).

-type openapi_org_apache_sling_jmx_provider_impl_jmx_resource_provider_properties() ::
    #{ 'provider_roots' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'provider_roots' := ProviderRoots
        }) ->
    #{ 'provider.roots' => ProviderRoots
     }.
