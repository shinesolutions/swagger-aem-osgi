-module(openapi_org_apache_sling_settings_impl_sling_settings_service_impl_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_settings_impl_sling_settings_service_impl_info/0]).

-type openapi_org_apache_sling_settings_impl_sling_settings_service_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties:openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties()
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
