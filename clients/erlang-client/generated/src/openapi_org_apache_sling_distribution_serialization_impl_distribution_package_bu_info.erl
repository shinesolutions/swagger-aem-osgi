-module(openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties:openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties()
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
