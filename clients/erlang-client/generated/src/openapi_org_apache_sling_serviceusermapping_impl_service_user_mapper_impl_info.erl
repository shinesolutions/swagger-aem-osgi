-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_info/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties:openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties(),
       'bundle_location' => binary(),
       'service_location' => binary()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties,
          'bundle_location' := BundleLocation,
          'service_location' := ServiceLocation
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties,
       'bundle_location' => BundleLocation,
       'service_location' => ServiceLocation
     }.
