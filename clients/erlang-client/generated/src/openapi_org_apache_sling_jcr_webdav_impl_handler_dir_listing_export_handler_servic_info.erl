-module(openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties:openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties()
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
