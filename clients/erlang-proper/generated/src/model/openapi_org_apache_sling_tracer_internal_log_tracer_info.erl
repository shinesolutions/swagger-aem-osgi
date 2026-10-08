-module(openapi_org_apache_sling_tracer_internal_log_tracer_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_tracer_internal_log_tracer_info/0]).

-export([openapi_org_apache_sling_tracer_internal_log_tracer_info/1]).

-export_type([openapi_org_apache_sling_tracer_internal_log_tracer_info/0]).

-type openapi_org_apache_sling_tracer_internal_log_tracer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_tracer_internal_log_tracer_properties:openapi_org_apache_sling_tracer_internal_log_tracer_properties() }
  ].


openapi_org_apache_sling_tracer_internal_log_tracer_info() ->
    openapi_org_apache_sling_tracer_internal_log_tracer_info([]).

openapi_org_apache_sling_tracer_internal_log_tracer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_tracer_internal_log_tracer_properties:openapi_org_apache_sling_tracer_internal_log_tracer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

