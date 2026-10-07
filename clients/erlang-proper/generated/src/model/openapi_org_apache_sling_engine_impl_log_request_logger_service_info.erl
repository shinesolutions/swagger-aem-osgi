-module(openapi_org_apache_sling_engine_impl_log_request_logger_service_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_log_request_logger_service_info/0]).

-export([openapi_org_apache_sling_engine_impl_log_request_logger_service_info/1]).

-export_type([openapi_org_apache_sling_engine_impl_log_request_logger_service_info/0]).

-type openapi_org_apache_sling_engine_impl_log_request_logger_service_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_engine_impl_log_request_logger_service_properties:openapi_org_apache_sling_engine_impl_log_request_logger_service_properties() }
  ].


openapi_org_apache_sling_engine_impl_log_request_logger_service_info() ->
    openapi_org_apache_sling_engine_impl_log_request_logger_service_info([]).

openapi_org_apache_sling_engine_impl_log_request_logger_service_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_engine_impl_log_request_logger_service_properties:openapi_org_apache_sling_engine_impl_log_request_logger_service_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

