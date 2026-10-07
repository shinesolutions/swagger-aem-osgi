-module(openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties:openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties()
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
