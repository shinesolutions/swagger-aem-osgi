-module(openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties/0]).

-type openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties() ::
    #{ 'homePath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'homePath' := HomePath
        }) ->
    #{ 'homePath' => HomePath
     }.
