-module(openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties/0]).

-export([openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties/1]).

-export_type([openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties/0]).

-type openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties() ::
  [ {'homePath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties() ->
    openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties([]).

openapi_org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties(Fields) ->
  Default = [ {'homePath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

