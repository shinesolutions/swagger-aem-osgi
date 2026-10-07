-module(openapi_com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties/0]).

-type openapi_com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties() ::
    #{ 'provider_roots' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'provider_roots' := ProviderRoots
        }) ->
    #{ 'provider.roots' => ProviderRoots
     }.
