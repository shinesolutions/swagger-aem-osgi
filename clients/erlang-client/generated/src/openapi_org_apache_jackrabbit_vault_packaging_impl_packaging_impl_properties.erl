-module(openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties/0]).

-type openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties() ::
    #{ 'packageRoots' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'packageRoots' := PackageRoots
        }) ->
    #{ 'packageRoots' => PackageRoots
     }.
