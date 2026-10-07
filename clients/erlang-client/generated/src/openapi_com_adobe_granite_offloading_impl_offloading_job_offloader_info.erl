-module(openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_info/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_properties:openapi_com_adobe_granite_offloading_impl_offloading_job_offloader_properties(),
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
