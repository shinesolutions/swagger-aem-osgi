-module(openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_properties() ::
    #{ 'provider_root' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'provider_root' := ProviderRoot
        }) ->
    #{ 'provider.root' => ProviderRoot
     }.
