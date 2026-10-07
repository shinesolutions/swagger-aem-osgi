-module(openapi_com_day_cq_reporting_impl_r_log_analyzer_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_reporting_impl_r_log_analyzer_info/0]).

-export([openapi_com_day_cq_reporting_impl_r_log_analyzer_info/1]).

-export_type([openapi_com_day_cq_reporting_impl_r_log_analyzer_info/0]).

-type openapi_com_day_cq_reporting_impl_r_log_analyzer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_reporting_impl_r_log_analyzer_properties:openapi_com_day_cq_reporting_impl_r_log_analyzer_properties() }
  ].


openapi_com_day_cq_reporting_impl_r_log_analyzer_info() ->
    openapi_com_day_cq_reporting_impl_r_log_analyzer_info([]).

openapi_com_day_cq_reporting_impl_r_log_analyzer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_reporting_impl_r_log_analyzer_properties:openapi_com_day_cq_reporting_impl_r_log_analyzer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

