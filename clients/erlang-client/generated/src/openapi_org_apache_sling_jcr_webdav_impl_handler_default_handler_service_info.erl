-module(openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_info/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties:openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties()
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
