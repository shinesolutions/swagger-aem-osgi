-module(openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties/0]).

-export([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties/1]).

-export_type([openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties/0]).

-type openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties() ->
    openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties([]).

openapi_com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

