-module(openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_info/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties:openapi_org_apache_sling_distribution_packaging_impl_importer_local_distributio_properties()
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
