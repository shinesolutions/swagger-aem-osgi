-module(openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info).

-export([encode/1]).

-export_type([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info/0]).

-type openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties:openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties(),
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