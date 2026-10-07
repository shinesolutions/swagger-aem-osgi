-module(openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info/0]).

-export([openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info/1]).

-export_type([openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info/0]).

-type openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties:openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties() }
  ].


openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info() ->
    openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info([]).

openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties:openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

