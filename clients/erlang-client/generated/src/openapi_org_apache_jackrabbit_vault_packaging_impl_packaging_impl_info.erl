-module(openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info/0]).

-type openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties:openapi_org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
