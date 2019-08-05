-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties:openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties()
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
