-module(openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info/0]).

-type openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties:openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties()
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
