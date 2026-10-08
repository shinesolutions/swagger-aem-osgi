-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info/0]).

-export([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties() }
  ].


openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info() ->
    openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info([]).

openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

