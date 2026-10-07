-module(openapi_org_apache_sling_engine_impl_log_request_logger_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_log_request_logger_info/0]).

-export([openapi_org_apache_sling_engine_impl_log_request_logger_info/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_info/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_engine_impl_log_request_logger_properties:openapi_org_apache_sling_engine_impl_log_request_logger_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_engine_impl_log_request_logger_info() ->
    openapi_org_apache_sling_engine_impl_log_request_logger_info([]).

openapi_org_apache_sling_engine_impl_log_request_logger_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_engine_impl_log_request_logger_properties:openapi_org_apache_sling_engine_impl_log_request_logger_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

