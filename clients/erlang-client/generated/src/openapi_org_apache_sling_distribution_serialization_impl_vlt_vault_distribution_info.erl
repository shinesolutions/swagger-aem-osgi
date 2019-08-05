-module(openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties:openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties()
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
