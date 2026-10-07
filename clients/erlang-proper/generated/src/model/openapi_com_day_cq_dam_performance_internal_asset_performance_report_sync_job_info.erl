-module(openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info/0]).

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info/1]).

-export_type([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info/0]).

-type openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties:openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties() }
  ].


openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info() ->
    openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info([]).

openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties:openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

