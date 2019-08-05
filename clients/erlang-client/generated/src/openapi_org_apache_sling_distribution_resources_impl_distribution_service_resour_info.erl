-module(openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info/0]).

-type openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties:openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties()
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
