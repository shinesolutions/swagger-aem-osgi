-module(openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_info/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties:openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties(),
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
